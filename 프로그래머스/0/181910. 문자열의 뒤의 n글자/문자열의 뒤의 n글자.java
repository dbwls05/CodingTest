class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int t = my_string.length() - n; t<my_string.length(); t++) {
            answer+=my_string.charAt(t);
        }
        return answer;
    }
}