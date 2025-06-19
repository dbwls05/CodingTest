class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length+n-1)/n];
        int cnt=0;
        for(int i=0; i<num_list.length; i++){
            if(cnt>=num_list.length)
                break;
            answer[i] = num_list[cnt];
            cnt+=n;
            
        }
        return answer;
    }
}