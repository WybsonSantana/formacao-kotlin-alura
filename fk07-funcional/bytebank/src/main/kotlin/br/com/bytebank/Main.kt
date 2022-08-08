package br.com.bytebank

fun main() {
    val minhaFuncao = ::teste
    println(minhaFuncao)

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }
}

fun teste() {
    println("Executa teste")
}