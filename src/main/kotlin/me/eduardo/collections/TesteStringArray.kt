package me.eduardo.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Marcos"

    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Marcos", "Ana")
    nomes2.forEach { println(it) }
    nomes2.sort()
    nomes2.forEach { println(it) }
}