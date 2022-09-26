package com.example.kotlinadvancedfunction

fun main(){

    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)

    val allCheck = myNumberList.all { it > 5 }
    println(allCheck)

    val AnyCheck = myNumberList.any { it > 5 }
    println(AnyCheck)

    val totalCount = myNumberList.count { it > 5 }
    println(totalCount)

    val findNum = myNumberList.find { it > 5 }
    println(findNum)

    val findLast = myNumberList.findLast { it > 5 }
    println(findLast)


    val myPredicate = {num:Int -> num > 5}
    val allcheckWithPredicate = myNumberList.all(myPredicate)
    println(allcheckWithPredicate)

    val anycheckWithPredicate = myNumberList.any(myPredicate)
    println(anycheckWithPredicate)

}