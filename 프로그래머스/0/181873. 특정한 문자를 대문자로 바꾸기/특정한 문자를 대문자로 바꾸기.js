function solution(my_string, alp) {
    var answer = my_string;
    if(my_string.indexOf(alp)!=-1) {
        answer = my_string.replaceAll(alp,alp.toUpperCase())
    }
    return answer;
}