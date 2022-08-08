package br.com.bytebank

fun main() {
    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }

    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anônima")
    }

    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste
    println(minhaFuncao)
}

fun testaTipoFuncaoClasse() {
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