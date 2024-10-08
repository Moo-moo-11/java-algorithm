class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (String str : dic) {
            if (str.length() != spell.length) {
                continue;
            }
            
            boolean isLegit = true;
            
            for (String alphabet: spell) {
                if (!str.contains(alphabet)) {
                    isLegit = false;
                    break;
                }
            }
            
            if (isLegit) {
                return 1;
            }
            
        }
        
        return 2;
    }
}