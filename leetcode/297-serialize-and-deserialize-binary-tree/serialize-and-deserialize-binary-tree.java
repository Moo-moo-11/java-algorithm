/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        StringBuilder sb = new StringBuilder();

        sb.append(String.valueOf("[" + root.val));

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
                sb.append("," + node.left.val);
            } else {
                sb.append(",null");
            }

            if (node.right != null) {
                queue.add(node.right);
                sb.append("," + node.right.val);
            } else {
                sb.append(",null");
            }
        }

        sb.append("]");

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }

        String[] nodes = data.substring(1,data.length() - 1).split(",");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int index = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!nodes[index].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.left);
            }

            index++;

            if (!nodes[index].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.add(node.right);
            }

            index++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));