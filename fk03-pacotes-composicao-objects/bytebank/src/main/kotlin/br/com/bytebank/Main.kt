package br.com.bytebank

import br.com.bytebank.modelo.*
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

    println("\nNúmero de contas criadas: $totalContas\n")

    val kotano = object : Autenticavel {
        val nome: String = "Kotano Pano"
        val cpf: String = "305.711.404-08"
        val email: String = "kotanopano@mail.com.br"
        val senha: Int = 1326

        override fun autenticar(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.logar(kotano, 1326)

    println("Nome do cliente: ${kotano.nome}")
    println("CPF: ${kotano.cpf}")
    println("E-mail: ${kotano.email}")
}