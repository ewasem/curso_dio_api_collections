package me.eduardo.collections

fun main() {
    val values = intArrayOf(5,8,3,1,7,6)
    values.forEach { println(it) }

    println("-------------------")

    values.sort()

    values.forEach { println(it) }

}