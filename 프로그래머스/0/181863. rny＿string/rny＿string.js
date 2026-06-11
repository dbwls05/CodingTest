function solution(rny_string) {
    let idx = rny_string.indexOf('m')
    if (idx===-1) {
        return rny_string
    }
    return rny_string.replaceAll('m','rn')
}