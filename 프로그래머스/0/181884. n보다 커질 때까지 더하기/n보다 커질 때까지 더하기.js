function solution(numbers, n) {
    var answer = 0;
    for(let num of numbers) {
        if(answer>n) return answer
        answer += num
    }
    return answer;
}