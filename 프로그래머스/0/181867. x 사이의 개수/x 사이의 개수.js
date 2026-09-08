function solution(myString) {
    var answer = [];
    let arr = myString.split('x')
    for(let s of arr) {
        answer.push(s.length)
    }
    return answer;
}