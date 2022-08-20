package br.com.bytebank.teste

import br.com.bytebank.modelo.Autenticavel
import br.com.bytebank.modelo.SistemaInterno

fun testaHOF() {
    somar(11, 17, resultado = { valor ->
        println(valor)
    })

    somarReceiver(8, 17, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234

        override fun autenticar(senha: Int) = this.senha == senha
    }


    val sistemaInterno = SistemaInterno()

    sistemaInterno.logar(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })

    sistemaInterno.logarReceiver(autenticavel, 1234, autenticado = {
        realizarPagamento()
    })
}

fun somar(x: Int, y: Int, resultado: (Int) -> Unit) {
    println("Antes de somar")
    resultado(x + y)
    println("Após somar")
}

fun somarReceiver(x: Int, y: Int, resultado: Int.() -> Unit) {
    println("Antes de somar")
    val total = x + y
    total.resultado()
    println("Após somar")

}