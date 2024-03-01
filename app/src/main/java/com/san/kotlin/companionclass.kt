package com.san.kotlin

fun main(){
    val ob=companionclass()                //create obj of companionclass
    println("first no is :" +ob.firstno)                      //without obj we do not call commpanion class
    println("first no is :" +companionclass().Add(7,8))  //i can write ob.Add()

    println("second no is :" +companionclass.secondno)                //in (static) companion obj method call by class name
    println("second no is :" +companionclass.Product(4,8))     //


    //to inherit companion class we need to create object of inherit class
    var obj=inherit()

    println( "inherit parent class (companionclass) "+obj.firstno)

}

open class companionclass {      //to inherit parent class we need to open keyword before class
    var firstno=10
    fun Add(a:Int ,b:Int):Int{
        return a+b
    }
     companion object{               //use as a static block, don need create object
         var secondno=20
         fun Product(a:Int,b:Int):Int{
             return a*b
         }
     }
}
class inherit : companionclass(){ //inherit companionclass

}