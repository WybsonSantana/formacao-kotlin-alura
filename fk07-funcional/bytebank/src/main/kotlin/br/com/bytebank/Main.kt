package br.com.bytebank

import br.com.bytebank.modelo.Endereco

fun main() {
    testaWith()

}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua sem Saída"
        complemento = "Apto"
        numero = "7"
        bairro = "Recanto da JVM"
        cidade = "São Paulo"
        estado = "SP"
        cep = "01152-229"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}