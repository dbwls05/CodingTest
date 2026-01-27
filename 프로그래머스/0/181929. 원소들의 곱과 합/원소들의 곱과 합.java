class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int ps =0;
        
        for(int i=0; i<num_list.length; i++) {
            mul *= num_list[i];
            ps += num_list[i];
        }
        ps = ps*ps;
        
        if(mul<ps) answer =1;
        else if(mul>ps) answer = 0;
        return answer;
    }
}