function solution(num_list) {
    var answer = num_list;
    if(num_list.at(-2) < num_list.at(-1)) {
        answer.push(num_list.at(-1)-num_list.at(-2))
    }
    else if(num_list.at(-2) >= num_list.at(-1)) {
        answer.push(num_list.at(-1) *2)
    }
    return answer;
}