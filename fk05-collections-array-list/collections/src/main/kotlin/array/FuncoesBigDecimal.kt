package array

import java.math.BigDecimal
import java.math.RoundingMode

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

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}