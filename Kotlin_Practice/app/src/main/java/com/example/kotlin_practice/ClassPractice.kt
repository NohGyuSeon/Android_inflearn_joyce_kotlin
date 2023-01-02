package com.example.kotlin_practice

class ClassPractice {

}

open class Human (val name : String = "Anonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMYYYYY~~~~")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human() {

    override fun singASong() {
        super.singASong()
        println("라라랄")
        println("my name is :${name}")
    }

}

fun main() {
//    val human = Human("NGS")
//
//    val stranger = Human()
//
//    human.eatingCake()

//    val mom = Human("Jueun", 59)

//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}
