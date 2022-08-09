package br.com.bytebank

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
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