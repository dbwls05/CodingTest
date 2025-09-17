class Solution {
    public int[] solution(int n) {
        int t= (n+1)/2;
        
        int[] answer = new int[t];
        for(int i=0; i<answer.length; i++){
            if(i+1%2!=0){
                answer[i] = 2*i+1;
            }
        }
        return answer;
    }
}