function solution(myString, pat) {
    var answer = 0;
    let str = myString.toLowerCase();
    let pat2 = pat.toLowerCase()
    answer = str.includes(pat2) ? 1 : 0
    return answer;
}