package br.com.bytebank.teste

import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val x = 10
    var y = x
    y++
    println("X = $x\nY = $y\n")

    val contaFulano = ContaPoupanca(
        numeroConta = "1000",
        titular = Cliente(
            nome = "Fulano de Tal",
            cpf = "123.456.789-09",
            email = "fulanodetal@bytebank.com.br",
            senha = 1234
        )
    )

    println("Titular da conta Fulano: ${contaFulano.titular.nome}\n")

    val contaBeltrano = ContaPoupanca(
        numeroConta = "1001",
        titular = Cliente(
            nome = "Beltrano da Silva",
            cpf = "930.133.220-55",
            email = "beltranodasilva@bytebank.com.br",
            senha = 2749
        )
    )

    println("Titular da conta Beltrano: ${contaBeltrano.titular.nome}\n")

    println(contaFulano)
    println(contaBeltrano)
}