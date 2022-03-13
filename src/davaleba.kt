package com.zetcode

fun work2() {
    val numbers = arrayOf(0, 23, 6, 11, 94)
    val answer = average(numbers)
    println("answer is: $answer")
}
fun average (numbers: Array<Int>): Int{
    var summery: Array<Int> = emptyArray()
    for(i in numbers) {
        if(numbers.indexOf(i) % 2 == 0 && numbers.indexOf(i) != 0) {
            summery += i
        }
    }
    val answer = summery.average().toInt()
    return answer
}

