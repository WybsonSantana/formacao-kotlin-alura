package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "Rua 1")
    val logradouroNovo: String? = endereco?.logradouro

    endereco?.let {
        println(it.logradouro.length)
    }
}