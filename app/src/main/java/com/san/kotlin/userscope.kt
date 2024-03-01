package com.san.kotlin

fun main (){
    val userob=userscope().apply {

        name="sany"        //within apply scope func we dont need to write userob.name....it is this type
        age=30
        println("my name is : "+name)
    }

    println("my age is : "+userob.age)

 userob.also {
     it.name="pranoy"
     println("the name has changed")
 }
    println("new name is : " +userob.name)
}

class userscope {
    var name:String=""
    var age:Int=0
}