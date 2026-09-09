function solution(number) {
    var answer = 0;
    let sum =0;
    for(let n of number) {
        sum+= +n;
    }
    answer = sum%9
    return answer;
}