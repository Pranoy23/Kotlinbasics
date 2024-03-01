package com.san.kotlin

fun main(){
    val audiob=Audi()
    audiob.interior(120120)

}

open class car {
   fun pressbrake():String{
       println("stop the car")
       return "brake pressed"
   }
    fun acclarator(speed:Int):String{
        println("increase car speed up to " +speed)
        return "car is now 50km/hr"
    }
}
class Audi:car(){
    var chasisno=1010
    fun interior(chasisno:Int){
        println("chasis no is" +chasisno) //will be print chasis no 120120
        println("chasis no is :" +this.chasisno ) //will be print 1010
    }
    init {                                             //super class  call from subclass
        println("step 1 : " +super.pressbrake())
        println("step 2 : " +super.acclarator(50))
    }
}