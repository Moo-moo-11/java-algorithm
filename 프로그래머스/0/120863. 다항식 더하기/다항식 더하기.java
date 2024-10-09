class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int numb = 0;
        
        
        for (String nomial: polynomial.split(" ")) {
            if (nomial.contains("x")) {
                if (nomial.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(nomial.replace("x",""));
                }
            } else if (nomial.equals("+")){
                continue;
            } else {
                numb += Integer.parseInt(nomial);
            }
        }
        
        String answer;
        
        if (x == 0 && numb == 0) {
            answer = "" + 0;
        } else if (x == 0) {
            answer = String.valueOf(numb);
        } else if (numb == 0) {
            if (x == 1) {
                answer = "x";
            } else {
                answer = x + "x";
            }
        } else {
            if (x == 1) {
                answer = "x + " + numb;
            } else {
                answer = x + "x + " + numb;
            }
        }
        
        return answer;
    }
}