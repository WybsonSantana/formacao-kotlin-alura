package array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0", "20000.0")
    println(salarios.contentToString())

    val reajuste = "0.1".toBigDecimal()
    val salariosComReajuste: Array<BigDecimal> = salarios.map { salario ->
        if (salario < "5000.0".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            salario.plus(salario.times(reajuste)).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    println("Salários com reajuste: ${salariosComReajuste.contentToString()}")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}