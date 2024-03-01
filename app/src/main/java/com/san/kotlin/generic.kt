package com.san.kotlin
fun main(){
    val genob=generic(11 )
}

class generic<T> (value: T){

    init{
     println("value is " +value)
      Add<String>("sany")
        Add<T>(value)
    }
}
fun <T> Add(String: T){
    println("my name is " +String)
}