package com.san.kotlin

public class Myclass{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")
            //array
//            var arrNo=ArrayList<Int>()
//            arrNo.add(1)
//            arrNo.add(2)
//            arrNo.add(3)
//            arrNo.add(4)
//            arrNo.add(5)
//            for (i in arrNo){
//                println("$i")
//            }

            //Example: Different Ways to Iterate Through a Range



            print("for (i in 5 downTo 1) print(i) = ")
            for (i in 5 downTo 1) print(i)

            println()

            print("for (i in 1..5 step 2) print(i) = ")
            for (i in 1..5 step 2) print(i)

            println()

            print("for (i in 5 downTo 1 step 2) print(i) = ")
            for (i in 5 downTo 1 step 2) print(i)

            println()
            var (a,b)=Pair("A",34)     //1 variable instance 2 values store

            print("$a,$b")
       println()

            val(x,y,z)=Triple("hello","sany",1)
          print("$x,$z,$y")
        }
    }


}