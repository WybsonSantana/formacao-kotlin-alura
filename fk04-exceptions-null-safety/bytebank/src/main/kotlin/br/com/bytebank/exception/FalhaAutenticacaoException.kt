package br.com.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha de autenticação"
) : Exception(mensagem)