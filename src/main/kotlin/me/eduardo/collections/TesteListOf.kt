package me.eduardo.collections

fun main() {
    val joao = Funcionario("João", 1500.00, "CLT")
    val carlos = Funcionario("Carlos", 2500.00, "PJ")
    val maria = Funcionario("Maria", 3250.00, "PJ")
    val ana = Funcionario("Ana", 1230.25, "CLT")

    val funcionarios = listOf(joao, carlos, maria, ana)

    funcionarios.forEach { println(it) }

    println("-----------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-----------")
    funcionarios.sortedBy { it.nome }.forEach { println(it) }

    println("-----------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-----------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString() =
        """
            Nome:       $nome
            Salário:    $salario
        """.trimIndent()

}