package br.com.bytebank.exception

class SaldoInsuficienteException(
mensagem: String = "Saldo insuficiente",
) : Exception(mensagem)