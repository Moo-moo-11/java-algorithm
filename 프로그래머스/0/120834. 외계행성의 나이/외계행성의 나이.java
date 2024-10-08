class Solution {
    public String solution(int age) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j'};
        StringBuilder sb = new StringBuilder();
        
        for (String numb: Integer.toString(age).split("")) {
            sb.append(alphabet[Integer.parseInt(numb)]);
        }
        
        return sb.toString();
    }
}