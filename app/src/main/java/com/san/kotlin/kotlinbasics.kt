package com.san.kotlin


//fun main(){
//    val kb=kotlinbasics() //create object of kotlinbasics
//    println("the integer is : " +kb.s)        // use obj multiple places
//   // println("the integer is : " +kotlinbasics().s)//we use single class where dont need to create object
//    println("the sum is : " +kotlinbasics().Add(3,4))
//}
//class kotlinbasics() {
//    var s=10
//    fun Add(a:Int ,b:Int) : Int {
//      return a+b
//    }
//}

fun main(){

    val name:String? ="john"      // '?' is used to safe nullpointexception
    name?.let {
        println("my name is " + name)
        println("length of my name is " + name.length)

    }

}