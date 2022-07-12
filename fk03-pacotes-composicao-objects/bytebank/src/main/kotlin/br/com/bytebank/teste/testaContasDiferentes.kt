package br.com.bytebank.teste

import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val contaCorrente = ContaCorrente(
        numeroConta = "1000",
        titular = Cliente(
            nome = "Fulano de Tal",
            cpf = "123.456.789-09",
            email = "fulanodetal@bytebank.com.br",
            senha = 1234
        )
    )

    val contaPoupanca = ContaPoupanca(
        numeroConta = "1001",
        titular = Cliente(
            nome = "Beltrano da Silva",
            cpf = "930.133.220-55",
            email = "beltranodasilva@bytebank.com.br",
            senha = 2749
        )
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    contaCorrente.transferir(99.0, contaPoupanca)
    contaPoupanca.transferir(1000.0, contaCorrente)
}