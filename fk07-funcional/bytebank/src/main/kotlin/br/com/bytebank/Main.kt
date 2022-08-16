package br.com.bytebank

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()

    val minhaFuncaoLambda = { x: Int, y: Int ->
        x + y
    }
    println(minhaFuncaoLambda(11, 19))

    val minhaFuncaoAnonima = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(minhaFuncaoAnonima(8, 11))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::somar
    println(minhaFuncao(8, 19))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Somar()
    println(minhaFuncaoClasse(11, 17))
}

class Somar : (Int, Int) -> Int {
    override fun invoke(x: Int, y: Int): Int = x + y
}

fun somar(x: Int, y: Int): Int = x + y