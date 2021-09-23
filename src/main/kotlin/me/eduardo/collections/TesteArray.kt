package me.eduardo.collections

fun main() {
    val values = IntArray(5)
    values[0] = 7
    values[1] = 2
    values[2] = 6
    values[3] = 5
    values[4] = 1

    for (valor in values) {
        //println(valor)
    }

    values.forEach {println(it)}

    println("---------------------------------")

    values.sort()
    values.forEach {println(it)}

}