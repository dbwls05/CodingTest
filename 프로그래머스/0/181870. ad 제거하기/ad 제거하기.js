function solution(strArr) {
    var answer = [];
    let func = strArr.map((str) => {
        if(str.indexOf("ad")==-1) answer.push(str)
    })
    return answer;
}