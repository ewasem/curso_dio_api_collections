package me.eduardo.collections

fun main() {

    val salarios = doubleArrayOf(1000.00, 2500.00, 750.00, 500.00, 3250.50)

    salarios.forEach { println(it) }

    println("---------------")
    println("Maior salário é: ${salarios.maxOrNull()}")
    println("Menor salário é: ${salarios.minOrNull()}")
    println("Salário médio é: ${salarios.average()}")

    val salarioMaiorQue2000 = salarios.filter { it > 2000.00 }

    println("---------------")
    println("Salários maiores que 2000")
    salarioMaiorQue2000.forEach { println(it) }
}