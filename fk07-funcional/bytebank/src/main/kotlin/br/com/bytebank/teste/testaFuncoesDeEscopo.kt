package br.com.bytebank.teste

import br.com.bytebank.modelo.Endereco

fun testaFuncoesDeEscopo() {
    val endereco1 = Endereco(
        logradouro = "Rua sem Saída",
        numero = "17"
    )

    val enderecoEmMaiusculo = "${endereco1.logradouro}, ${endereco1.numero}".uppercase()
    println(enderecoEmMaiusculo)

    run {
        println("Execução do run sem extensão")
    }

    val endereco2 = Endereco()
        .also {
            println("Criando um endereço")
        }
        .apply {
            logradouro = "Rua sem Saída"
            numero = "8"
        }

    with(endereco2) {
        "$logradouro, $numero".uppercase()
    }.let { enderecoEmMaisculo ->
        println(enderecoEmMaisculo)
    }

    listOf<Endereco>(
        Endereco(complemento = "Casa"),
        Endereco(complemento = "Apto."),
        Endereco()
    ).filter(predicate = { endereco ->
        endereco.complemento.isNotEmpty()
    }).let(block = (::println))

}