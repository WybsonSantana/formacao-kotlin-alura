package br.com.bytebank.teste

import br.com.bytebank.exception.FalhaAutenticacaoException
import br.com.bytebank.exception.SaldoInsuficienteException
import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val contaCorrente = ContaCorrente(
        numeroConta = "1000",
        titular = Cliente(
            nome = "Fulano de Tal",
            cpf = "123.456.789-09",
            email = "fulanodetal@bytebank.com.br",
            senha = 1234,
            endereco = Endereco(
                logradouro = "Rua Boa Vista",
                numero = "494",
                bairro = "Residencial Paraíso",
                cidade = "São Luís",
                estado = "MA",
                cep = "65081-806"
            )
        )
    )

    println(
        """
        Dados da conta:
        
        Agência: ${contaCorrente.agencia}
        Número da conta: ${contaCorrente.numeroConta}
        Tipo da conta: ${contaCorrente.tipoDaConta}
        Titular: ${contaCorrente.titular.nome}
        CPF: ${contaCorrente.titular.cpf}
        E-mail: ${contaCorrente.titular.email}
        
        Endereço:
        
        Logradouro: ${contaCorrente.titular.endereco.logradouro}
        Complemento: ${contaCorrente.titular.endereco.complemento}
        Número: ${contaCorrente.titular.endereco.numero}
        Bairro: ${contaCorrente.titular.endereco.bairro}
        Estado: ${contaCorrente.titular.endereco.estado}
        CEP: ${contaCorrente.titular.endereco.cep}
        
    """.trimIndent()
    )

    val contaPoupanca = ContaPoupanca(
        numeroConta = "1001",
        titular = Cliente(
            nome = "Beltrano da Silva",
            cpf = "930.133.220-55",
            email = "beltranodasilva@bytebank.com.br",
            senha = 2749,
            endereco = Endereco(
                logradouro = "Rua Nossa Senhora do Carmo",
                numero = "800",
                bairro = "Fragoso",
                cidade = "Olinda",
                estado = "PE",
                cep = "53060-486"
            )
        )
    )

    println(
        """
        Dados da conta:
        
        Agência: ${contaPoupanca.agencia}
        Número da conta: ${contaPoupanca.numeroConta}
        Tipo da conta: ${contaPoupanca.tipoDaConta}
        Titular: ${contaPoupanca.titular.nome}
        CPF: ${contaPoupanca.titular.cpf}
        E-mail: ${contaPoupanca.titular.email}
        
        Endereço:
        
        Logradouro: ${contaPoupanca.titular.endereco.logradouro}
        Complemento: ${contaPoupanca.titular.endereco.complemento}
        Número: ${contaPoupanca.titular.endereco.numero}
        Bairro: ${contaPoupanca.titular.endereco.bairro}
        Estado: ${contaPoupanca.titular.endereco.estado}
        CEP: ${contaPoupanca.titular.endereco.cep}
        
    """.trimIndent()
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    try {
        contaCorrente.sacar(100.0, 1234)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha no saque: saldo insuficeente!\n")
        ex.printStackTrace()
    } catch (ex: FalhaAutenticacaoException) {
        println("Falha de Autenticação!\n")
        ex.printStackTrace()
    } catch (ex: Exception) {
        println("Ops! Algo deu errado.\n")
        ex.printStackTrace()
    }

    try {
        contaPoupanca.sacar(100.0, 2740)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha no saque: saldo insuficeente!\n")
        ex.printStackTrace()
    } catch (ex: FalhaAutenticacaoException) {
        println("Falha de Autenticação!\n")
        ex.printStackTrace()
    } catch (ex: Exception) {
        println("Ops! Algo deu errado.\n")
        ex.printStackTrace()
    }

    try {
        contaCorrente.transferir(99.0, contaPoupanca, 1235)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha na transferência: saldo insuficeente!\n")
        ex.printStackTrace()
    } catch (ex: FalhaAutenticacaoException) {
        println("Falha de Autenticação!\n")
        ex.printStackTrace()
    } catch (ex: Exception) {
        println("Ops! Algo deu errado.\n")
        ex.printStackTrace()
    }

    try {
        contaPoupanca.transferir(500.0, contaCorrente, 2749)
    } catch (ex: SaldoInsuficienteException) {
        println("Falha na transferência: saldo insuficiente!\n")
        ex.printStackTrace()
    } catch (ex: FalhaAutenticacaoException) {
        println("Falha de autenticação!\n")
        ex.printStackTrace()
    } catch (ex: Exception) {
        println("Ops! Algo deu errado.\n")
        ex.printStackTrace()
    }
}