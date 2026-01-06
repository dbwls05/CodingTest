class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int i;
        for(i=0; money>=5500; i++) {
            money-=5500;
            
        }
        answer[0] = i;
        answer[1] = money;
        return answer;
    }
}