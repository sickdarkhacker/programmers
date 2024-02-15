class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(!(0<= num1 || num1 <= 100))
              throw IllegalArgumentException("num1이 0~100사이의 숫자가 아닙니다.")
        else if(!(0<= num2 || num2 <= 100))
              throw IllegalArgumentException("num2가 0~100사이의 숫자가 아닙니다.")

        answer = num1 * num2
        return answer
    }
}