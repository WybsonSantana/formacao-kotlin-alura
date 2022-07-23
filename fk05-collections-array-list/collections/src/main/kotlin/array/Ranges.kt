package array

fun main() {
    val numeros: IntRange = 1..10
    for (i in numeros) {
        print("$i ")
    }
    println()

    for (i in 1..100) {
        if (i % 2 == 0)
            print("$i ")
    }
    println()

    val numerosPares: IntProgression = 0..100 step 2
    numerosPares.forEach { print("$it ") }
    println()

    val numerosParesReverso: IntProgression = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val salarios: DoubleArray = doubleArrayOf(1500.55, 9100.0, 2990.99, 8500.0, 10000.0)
    val pisoSalarial = 1500.0
    val tetoSalarial = 4500.0
    var contador = 0
    for (salario in salarios) {
        if (salario in pisoSalarial..tetoSalarial)
            contador++
    }
    println("Quantidade de salários entre R$ %.2f e R$ %.2f: $contador".format(pisoSalarial, tetoSalarial))

    val alfabeto: CharRange = 'a'..'z'
    alfabeto.forEach { print("$it ") }
    println()
    val caractere = 'k'
    if (caractere in alfabeto)
        println("O caractere '$caractere' está contido em $alfabeto ")
}