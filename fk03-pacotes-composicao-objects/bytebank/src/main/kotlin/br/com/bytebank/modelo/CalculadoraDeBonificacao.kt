package br.com.bytebank.modelo

class CalculadoraDeBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        funcionario as Funcionario
        this.total += funcionario.bonificacao()
    }
}
