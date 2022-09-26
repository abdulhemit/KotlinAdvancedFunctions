package com.example.kotlinadvancedfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val atil = Person("atil",19)
        val erdem = Person("erdem",23)
        val halil = Person("halil",27)
        val murat = Person("murat",17)

        val people = listOf<Person>(atil,erdem,halil,murat)

        people.filter { it.age > 18 }.also {
            for (person in it){
                println(person.name)
            }
        }

    }






}

data class Person(val name:String,val age:Int)