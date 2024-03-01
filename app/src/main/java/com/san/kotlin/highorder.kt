package com.san.kotlin
fun main(){
highorder({ printme() })             //we can call function
    highorder(anotherfuc)
}
fun printme(){
    println("i am printed")
}
val anotherfuc={                    //we create function and define in a variable
    println("i am another func")
}


fun highorder(func :()->Unit) {    //when dont return anything we got unit value
func()
}