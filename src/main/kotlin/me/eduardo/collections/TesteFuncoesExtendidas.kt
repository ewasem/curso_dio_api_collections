package me.eduardo.collections

fun main() {
    val salarios = arrayOf(2000.0.toBigDecimal(), 1500.0.toBigDecimal(), 2750.0.toBigDecimal(), 1325.0.toBigDecimal())


    println(salarios.somatoria())
    println(salarios.media())
}