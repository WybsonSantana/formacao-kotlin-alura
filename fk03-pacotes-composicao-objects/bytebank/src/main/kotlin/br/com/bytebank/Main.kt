package br.com.bytebank

import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.totalContas
import br.com.bytebank.teste.*

fun main() {
    testaContasDiferentes()

    val clienteTentano = Cliente(
        nome = "Tentano da Sorte",
        cpf = "779.508.689-61",
        email = "tentanodasorte@mail.com",
        senha = 7777
    )

    val contaCorrenteTentano = ContaCorrente(
numeroConta = "2001",
        titular = clienteTentano
    )

    val contaPoupancaTentano = ContaPoupanca(
        numeroConta = "2002",
        titular = clienteTentano
    )

    println("\nNúmero de contas criadas: $totalContas")

}