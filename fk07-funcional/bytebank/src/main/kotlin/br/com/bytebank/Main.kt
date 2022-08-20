package br.com.bytebank

import br.com.bytebank.modelo.Autenticavel
import br.com.bytebank.modelo.Endereco
import br.com.bytebank.modelo.SistemaInterno

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
    ).filter(predicate = { endereco ->
        endereco.complemento.isNotEmpty()
    }).let(block = (::println))

    somar(11, 17, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234

        override fun autenticar(senha: Int) = this.senha == senha
    }

    SistemaInterno().logar(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun somar(x: Int, y: Int, resultado: (Int) -> Unit) {
    println("Antes de somar")
    resultado(x + y)
    println("Após somar")
}