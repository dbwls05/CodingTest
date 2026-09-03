function solution(num_str) {
    var answer = 0;
    for(let n of num_str) {
        answer += parseInt(n)
    }
    
    return answer;
}