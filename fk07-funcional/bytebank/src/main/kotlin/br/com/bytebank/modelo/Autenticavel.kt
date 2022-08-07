package br.com.bytebank.modelo

interface Autenticavel {

    fun autenticar(senha: Int): Boolean

}