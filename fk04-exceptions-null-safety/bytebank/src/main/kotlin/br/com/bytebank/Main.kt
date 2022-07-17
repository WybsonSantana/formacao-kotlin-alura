package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    var endereco: Endereco? = Endereco(
        logradouro = "Rua 1",
        complemento = "Casa 2"
    )

    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("O campo complemento não pode ser vazio.")

        println(tamanhoComplemento)
    }

    testaSafeCast(17)
    testaSafeCast("")

}

fun testaSafeCast(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}