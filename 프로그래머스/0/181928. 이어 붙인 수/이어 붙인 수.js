function solution(num_list) {
    var answer = 0;
    let even =0;
    let odd=0;
    for(let i=0; i<num_list.length; i++) {
        if(num_list[i]%2 == 0) {
            even += num_list[i].toString()
        }else {
            odd += num_list[i].toString()
        }
    }
    answer = (+even) + (+odd)
    return answer;
}