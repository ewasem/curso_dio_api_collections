package me.eduardo.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Marcos", 1000.00)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to 1250.00,
        "Maria" to 2000.00,
        "Ana" to 1850.00
        )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}
}