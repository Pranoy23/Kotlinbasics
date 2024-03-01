package com.san.kotlin

fun main(){

    for (day in edays.values()){
        if (day.holiday)
            println(""+day +" is a holiday")
    }
 println("direction is :" +direction.EAST)
}

enum class edays(val holiday:Boolean =false) {
    Sunday(true),
    Monday,
    Tuesday,
    Wednesday,
    Thrusday,
    Friday,
    Satday(true)

}
enum class direction{
    EAST,WEST ,NORTH,SOUTH
}
