package array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0", "20000.0")
    println(salarios.contentToString())

    val reajuste = "0.1".toBigDecimal()
    val salariosComReajuste: Array<BigDecimal> = salarios
        .map { salario -> calculaReajusteSalarial(salario, reajuste) }
        .toTypedArray()

    println("Salários com reajuste: ${salariosComReajuste.contentToString()}")

    val gastoInicial = salariosComReajuste.somatoria()
    println("Gasto inicial: $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComReajuste.fold(gastoInicial) { acumulador, salario ->
        acumulador.plus(salario.times(meses)).setScale(2, RoundingMode.UP)
    }
    
    println("Gasto total: $gastoTotal")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun calculaReajusteSalarial(salario: BigDecimal, reajuste: BigDecimal): BigDecimal {
    return if (salario < "5000.0".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        salario.plus(salario.times(reajuste)).setScale(2, RoundingMode.UP)
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}