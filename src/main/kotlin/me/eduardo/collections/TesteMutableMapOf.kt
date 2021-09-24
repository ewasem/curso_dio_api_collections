package me.eduardo.collections

fun main() {
    val joao = Funcionario("João", 1500.00, "CLT")
    val carlos = Funcionario("Carlos", 2500.00, "PJ")
    val maria = Funcionario("Maria", 3250.00, "PJ")
    val ana = Funcionario("Ana", 1230.25, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(carlos.nome, carlos)
    repositorio.create(maria.nome, maria)
    repositorio.create(ana.nome, ana)

    println(repositorio.findById(joao.nome))
    println("--------------------------")
    repositorio.findAll().forEach { println(it) }

    repositorio.remove(maria.nome)
    println("--------------------------")
    repositorio.findAll().forEach { println(it) }

}