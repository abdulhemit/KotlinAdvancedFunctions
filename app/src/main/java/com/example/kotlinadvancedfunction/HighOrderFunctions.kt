package com.example.kotlinadvancedfunction

fun main(){

    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)


    // filter:
    /*
    val smallNumber = myNumberList.filter { it < 6 }
    for (num in smallNumber){
        println(num)
    }
     */

    //Map:
    /*
    val squaredNumber = myNumberList.map { it * it }
    for (num in squaredNumber){
        println(num)
    }
     */

    /*
    val filterAndMapCombined = myNumberList.filter { it < 6 }
        .map { it * it }
    for (num in filterAndMapCombined){
        println(num)
    }
     */

    val musicians = listOf<Musician>(
        Musician("James",60,"Guiter"),
        Musician("Lars",55,"Drum"),
        Musician("Kirk",50,"Guiter")
    )

    val filterMusician = musicians.filter { musician -> musician.Age < 60 }
        .map { musician -> musician.name}

    for (element in filterMusician){
        println(element)
    }



}

data class Musician (val name:String,val Age:Int,val instrument:String)