package com.san.kotlin

fun main(){
    var objb = B()
    println(objb.Add(5,6))   // ADD method of parent class approaching different work by overriding
    println(objb.name)

    val obj=overriding()         //parent class object creating
    println(obj.name)
    println(obj.Add(6 ,9))
}
 open class overriding {
   open var name : String = "dev"
    open fun Add (a:Int,b:Int): Int {

        return a+b
    }
}
class B : overriding(){
    override  var name:String="john"
    override fun Add(a: Int, b: Int):Int {
        val sum=super.Add(a, b)
        val sqr =sum * sum
        return sqr
    }
}