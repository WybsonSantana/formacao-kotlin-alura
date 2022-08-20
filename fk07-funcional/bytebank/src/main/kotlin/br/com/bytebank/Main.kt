package br.com.bytebank

import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun main() {
    testaWith()
    testaRun()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")
    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Fulano de Tal",
            email = "fulanodetal@mail.com",
            cpf = "123.456.890-09",
            senha = 1234
        ),
        numeroConta = "1001"
    )

    contaPoupanca.run {
        depositar(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento anual: $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua sem Saída"
        complemento = "Apto"
        numero = "7"
        bairro = "Recanto da JVM"
        cidade = "São Paulo"
        estado = "SP"
        cep = "01152-229"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}