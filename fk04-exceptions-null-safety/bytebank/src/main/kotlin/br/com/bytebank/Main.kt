package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!

    enderecoNaoNulo.logradouro
}