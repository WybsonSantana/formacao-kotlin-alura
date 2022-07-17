package br.com.bytebank.teste

import br.com.bytebank.exception.SaldoInsuficienteException
import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val contaFulano = ContaCorrente(
        numeroConta = "1000",
        titular = Cliente(
            nome = "Fulano de Tal",
            cpf = "123.456.789-09",
            email = "fulanodetal@bytebank.com.br",
            senha = 1234
        )
    )
    contaFulano.depositar(300.0)

    val contaBeltrano = ContaPoupanca(
        numeroConta = "1001",
        titular = Cliente(
            nome = "Beltrano da Silva",
            cpf = "930.133.220-55",
            email = "beltranodasilva@bytebank.com.br",
            senha = 2749
        )
    )
    contaBeltrano.depositar(200.0)

    contaFulano.depositar(-250.0)
    contaBeltrano.depositar(400.0)

    try {
        contaFulano.sacar(50.0)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha no saque: saldo insuficiente!\n")
        ex.printStackTrace()
    }

    try {
        contaBeltrano.sacar(700.0)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha no saque: saldo insuficiente!\n")
        ex.printStackTrace()
    }

    try {
        contaFulano.transferir(150.0, contaBeltrano)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha na transferência: saldo insuficiente!")
        ex.printStackTrace()
    }

    try {
        contaBeltrano.transferir(450.0, contaFulano)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha na transferência: saldo insuficiente!")
        ex.printStackTrace()
    }
}