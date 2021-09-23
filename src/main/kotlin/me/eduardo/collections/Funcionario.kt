package me.eduardo.collections

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