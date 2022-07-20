package array

fun main() {
    // Calculando a maior idade
    // Utilizando if aninhado
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdadeIf = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println("Maior idade if: $maiorIdadeIf\n")

    // Utilizando IntArray
    val idadesIntArray = IntArray(4)
    idadesIntArray[0] = 25
    idadesIntArray[1] = 19
    idadesIntArray[2] = 33
    idadesIntArray[3] = 50

    val maiorIdadeIntArray =
        if (idadesIntArray[0] > idadesIntArray[1] && idadesIntArray[0] > idadesIntArray[2] && idadesIntArray[0] > idadesIntArray[3]) {
            idadesIntArray[0]
        } else if (idadesIntArray[1] > idadesIntArray[2] && idadesIntArray[1] > idadesIntArray[3]) {
            idadesIntArray[1]
        } else if (idadesIntArray[2] > idadesIntArray[3]) {
            idadesIntArray[2]
        } else {
            idadesIntArray[3]
        }

    println("Maior idade IntArray: $maiorIdadeIntArray\n")

    // Utilizando IntArrayOf
    val idadesIntArrayOf: IntArray = intArrayOf(25, 19, 61, 20)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idadesIntArrayOf) {
        if (idade > maiorIdade)
            maiorIdade = idade
    }

    println("Maior idade intArrayOf: $maiorIdade\n")

    var menorIdade = Int.MAX_VALUE
    idadesIntArrayOf.forEach { idade ->
        if (idade < menorIdade)
            menorIdade = idade
    }

    println("Menor idade intArrayOf: $menorIdade")
}