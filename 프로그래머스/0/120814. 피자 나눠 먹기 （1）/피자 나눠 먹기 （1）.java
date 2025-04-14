class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i <= 100; i++){ //i를 1로 초기화, 실행문 실행 후 변수 변경 
            if(n <= 7*i) {            //i <=100이 참이면 실행
                answer = i;
                return answer;
            }
        }
         return answer;
    }
}