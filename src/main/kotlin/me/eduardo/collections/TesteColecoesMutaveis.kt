package me.eduardo.collections

fun main() {
    val joao = Funcionario("João", 1500.00, "CLT")
    val carlos = Funcionario("Carlos", 2500.00, "PJ")
    val maria = Funcionario("Maria", 3250.00, "PJ")
    val ana = Funcionario("Ana", 1230.25, "CLT")


    println("----------LIST-----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    funcionarios.add(carlos)

    println("-------------------------")
    funcionarios.forEach { println(it) }

    funcionarios.remove(maria)

    println("-------------------------")
    funcionarios.forEach { println(it) }

    println("----------SET------------")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }


    println("-------------------------")

    funcionarioSet.add(carlos)
    funcionarioSet.add(ana)
    funcionarioSet.forEach { println(it) }
    funcionarioSet.add(carlos)

    funcionarioSet.forEach { println(it) }
    println(funcionarioSet.count())
}