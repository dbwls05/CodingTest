function solution(num_list) {
    
    if(num_list.length>=11) {
        var answer = 0;
        for(n of num_list) {
            answer += n;
        }
    }else {
    answer =1
       for(n of num_list) {
            answer *= n;
        }
    }
    return answer;
}