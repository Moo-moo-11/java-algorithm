class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for (String[] db_id_pw: db) {
            if (db_id_pw[0].equals(id_pw[0]) && db_id_pw[1].equals(id_pw[1])) {
                return "login";
            }
            
            if (db_id_pw[0].equals(id_pw[0]) && !db_id_pw[1].equals(id_pw[1])) {
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}