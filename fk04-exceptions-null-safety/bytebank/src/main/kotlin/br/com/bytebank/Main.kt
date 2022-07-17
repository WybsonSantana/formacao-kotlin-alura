package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    println("Início main()")
    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (ex: NumberFormatException) {
        println("Problema ao converter a entrada")
        ex.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }

    funcao1()
    println("Fim main()")
}

fun funcao1() {
    println("Início funcao1()")
    try {
        funcao2()
    } catch (ex: ClassCastException) {
        ex.printStackTrace()
        println("ClassCastException capturada")
    }
    println("Fim funcao1()")
}

fun funcao2() {
    println("Início funcao2()")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("Fim funcao2()")
}