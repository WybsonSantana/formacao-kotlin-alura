package br.com.bytebank

import br.com.bytebank.modelo.Endereco
import java.lang.*

fun main() {
    val endereco1 = Endereco(
        logradouro = "Quadra QR 614 Conjunto 10",
        numero = "902",
        bairro = "Samambaia Norte",
        cidade = "Brasília",
        estado = "DF",
        cep = "72322-710"
    )

    val endereco2 = Endereco(
        logradouro = "Rua Maria Aleutéria da Silva",
        numero = "686",
        bairro = "Potecas",
        cidade = "São José",
        estado = "SC",
        cep = "88119-264"
    )

    println(endereco1.equals(endereco1))
    println(endereco1.equals(endereco2))
    println()
    println(endereco1.hashCode())
    println(endereco2.hashCode())
    println()
    println(endereco1)
    println(endereco2)

println("${endereco1::class.java}@${Integer.toHexString(endereco1.hashCode())}")
println("${endereco2::class.java}@${Integer.toHexString(endereco2.hashCode())}")
}
