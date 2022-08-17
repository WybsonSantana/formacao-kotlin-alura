package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    val endereco1 = Endereco(
        logradouro = "Rua sem Saída",
        numero = "17"
    )

    val enderecoEmMaiusculo = "${endereco1.logradouro}, ${endereco1.numero}".uppercase()
    println(enderecoEmMaiusculo)

    val endereco2 = Endereco(
        logradouro = "Rua sem Saída",
        numero = "19"
    ).let { endereco2 ->
        "${endereco2.logradouro}, ${endereco2.numero}".uppercase()
    }.let(::println)

    listOf<Endereco>(
        Endereco(complemento = "Casa"),
        Endereco(complemento = "Apto."),
        Endereco()
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)
}