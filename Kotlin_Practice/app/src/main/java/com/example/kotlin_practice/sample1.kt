package com.example.kotlin_practice

fun main() {
    helloWorld()

    println(add(4, 5))

    checkNum(1)

    // 3. String Template

    val name = "NGS"
    val lastName = "Noh"
    println("my name is ${name + lastName}I'm 24")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")

    forAndWhile()

    nullcheck()

    ignoreNulls("ngs")
}

// 4. 조건식

fun MaxBy(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}

// 1. 함수

fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
// val = value

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "NGS"

}

// Expression vs Statement

// 5. Array and List

// Array

// List 1. List.2 MutableList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

// 6. For / While

fun forAndWhile() {

    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name :String in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    print(sum)

    var index = 0
    while(index < 10) {
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck() {
    // NPE : Null Pointer Exception

    var name = "NGS"

    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:

    val lastName : String? = "Noh"
    val fullName = name + " " + (lastName?: "NO lastName")

    println(fullName)
}

// !!

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upper : String = mNotNull.toUpperCase()

    val email : String? = "kusun1020@gmail.com"
    email?.let {
        println("my email is ${email}\nand upper is ${upper}")
    }

}
