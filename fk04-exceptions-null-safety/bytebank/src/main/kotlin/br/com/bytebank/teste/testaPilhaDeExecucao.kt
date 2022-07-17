package br.com.bytebank.teste

import br.com.bytebank.modelo.Endereco

fun testaPilhaDeExecucao() {
    println("Início main()")
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
        throw ClassCastException()
    }
    println("Fim funcao2()")
}