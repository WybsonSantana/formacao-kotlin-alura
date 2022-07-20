package array

fun main() {
    val reajuste: Double = 0.1

    // Cálculo do reajuste de salário utilizando o for
    val salarios1: DoubleArray = doubleArrayOf(1500.50, 2500.0, 5000.0, 10000.0)
    for (indice in salarios1.indices) {
        salarios1[indice] += salarios1[indice] * reajuste
    }
    println(salarios1.contentToString())

    // Cálculo do reajuste de salário utilizando o forEachIndexed
    val salarios2: DoubleArray = doubleArrayOf(1500.50, 2500.0, 5000.0, 10000.0)
    salarios2.forEachIndexed { indice, salario ->
        salarios2[indice] += salarios2[indice] * reajuste
    }
    println(salarios2.contentToString())
}