package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    println("Início main()")
    funcao1()
    println("Fim main()")
}

fun funcao1() {
    println("Início funcao1()")
    funcao2()
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