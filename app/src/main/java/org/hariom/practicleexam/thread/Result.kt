package org.hariom.practicleexam.thread

fun main() {

//    var list = mutableListOf(1, 2, 1, 2)
    var list = mutableListOf(1, 2, 3, 4, 5, 3, 5, 6)

//    var list = mutableListOf(1, 3, 2, 1)
//    var list = mutableListOf(10, 1, 2, 3, 4, 5)
    println("sequence is incredible? "+solution(list))
}

fun solution(sequence: MutableList<Int>): Boolean {
    var count = 0
    var previousValue: Int? = null

    for ((index, value) in sequence.withIndex()) {

        if (previousValue == null) {
            previousValue = value

        } else {

            if (previousValue < value) {
                // 1 < 2 ,  2 < 3
                println("true part")
            } else {
                count++
                println("false part  count : $count")
            }
            previousValue = value
        }

    }

    if (count > 1) {
        return false
    }

    return true

}