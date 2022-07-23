package array

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    println("Idades: ${idades.contentToString()}")
    println("Maior idade: ${idades.maxOrNull()}")
    println("Menor idade: ${idades.minOrNull()}")
    println("Média entre as idades: ${idades.average()}")
    println("Todos são maiores de idade? ${idades.all { it >= 18 }}")
    println("Existe algum menor de idade? ${idades.any { it < 18 }}")
    println("Menores de idade: ${idades.filter { it < 18 }.toIntArray().contentToString()}")
    println("Maiores de idade: ${idades.filter { it >= 18 }.toIntArray().contentToString()}")
    println("Existe alguém com 10 anos de idade? ${idades.contains(10)}")
    println("Idade encontrada: ${idades.find { it == 12 }}")
}