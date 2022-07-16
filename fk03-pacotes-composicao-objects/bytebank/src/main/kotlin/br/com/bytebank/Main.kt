package br.com.bytebank

fun main() {
    println()
    println(17)
    println(1.6)
    println(true)
    println("Kotlin")
    println('K')

    imprimir("")
    imprimir(17)
    imprimir(1.6)
    imprimir(true)
    imprimir("Kotlin")
    imprimir('K')
}

fun imprimir(any: Any) = println(any)