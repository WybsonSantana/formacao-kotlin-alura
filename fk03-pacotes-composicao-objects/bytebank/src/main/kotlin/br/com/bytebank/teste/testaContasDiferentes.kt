package br.com.bytebank.teste

import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val contaCorrente = ContaCorrente(
        titular = "Fulano de Tal",
        numeroConta = "1000"
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Beltrano da Silva",
        numeroConta = "1001"
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    contaCorrente.transferir(99.0, contaPoupanca)
    contaPoupanca.transferir(1000.0, contaCorrente)
}