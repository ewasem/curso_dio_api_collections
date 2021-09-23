package me.eduardo.collections

fun main() {
    val joao = Funcionario("João", 1500.00, "CLT")
    val carlos = Funcionario("Carlos", 2500.00, "PJ")
    val maria = Funcionario("Maria", 3250.00, "PJ")
    val ana = Funcionario("Ana", 1230.25, "CLT")

    val funcionarios1 = setOf(joao, ana)
    val funcionarios2 = setOf(carlos, maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("----------------------")

    val funcionarios3 = setOf(carlos, ana)
    val resultUnion1 = funcionarios3.subtract(funcionarios2)
    resultUnion1.forEach { println(it) }

    println("----------------------")


    val resultUnion2 = funcionarios3.intersect(funcionarios2)
    resultUnion2.forEach { println(it) }
}