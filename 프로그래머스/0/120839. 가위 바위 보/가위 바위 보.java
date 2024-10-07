class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for (String str: rsp.split("")) {
            if (str.equals("2")) {
                sb.append("0");
            } else if (str.equals("0")) {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }
        
        return sb.toString();
    }
}