package br.com.bytebank.teste

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { x: Int, y: Int ->
        x + y
    }
    println(minhaFuncaoLambda(11, 19))

    val calcularBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calcularBonificacao(1000.0))
    println(calcularBonificacao(2000.0))
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(minhaFuncaoAnonima(8, 11))

    val calcularBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calcularBonificacaoAnonima(500.0))
    println(calcularBonificacaoAnonima(3000.0))
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