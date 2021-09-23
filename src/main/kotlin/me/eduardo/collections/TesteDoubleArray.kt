package me.eduardo.collections

fun main(){
    val salarios = DoubleArray(7)
    salarios[0] = 1000.00
    salarios[1] = 2000.00
    salarios[2] = 3000.00
    salarios[3] = 500.00
    salarios[4] = 1500.00
    salarios[5] = 2500.00
    salarios[6] = 1000.00



    salarios.sort()

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }


}