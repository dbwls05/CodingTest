function solution(a, b) {
    let plus = +(""+a+b);
    let mul = 2*a*b;
    if(plus>mul) {
        return plus
    } else if (plus<mul) {
        return mul;
    }
    else {
        return plus;
    }

}