package org.hariom.practicleexam.codingpractice

// Find prime number or not
// If number dived by 2 then it's prime number
fun main() {

    // No negative value allow
    // Greater than 0
    val number = -4
    println("number $number is prime? ${isPrime(number)}")
}

fun isPrime(number : Int) : Boolean{

    var result = true
    if(number<0){
        return  false
    }

    for (value in 2 until  number){

        if(number % value == 0){
            result = false
            break
        }
    }

    return  result

}