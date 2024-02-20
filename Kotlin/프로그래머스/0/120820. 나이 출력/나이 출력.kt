class Solution {
    fun solution(age: Int): Int {
        var answer: Int = 2022 - age + 1
        if(age < 0 || 120 < age){
            throw IllegalArgumentException("올바르지 못한 입력을 받았습니다.") 
        }
        return answer
    }
}