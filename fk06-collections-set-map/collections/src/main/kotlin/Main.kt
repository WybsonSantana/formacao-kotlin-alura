fun main() {
    val banco = BancoDeNomes()
    // banco.nomes.add("Fulano")
    banco.salvar("Fulano")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

    fun salvar(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: List<String> = listOf("Fulano", "Beltrano", "Ciclano", "Mengano", "Zotano")

    for (nome in nomes) {
        println(nome)
    }

    println(nomes)
    println("Contém o nome \"Fulano\"? ${nomes.contains("Fulano")}")
    println("Tamanho da coleção: ${nomes.size}")
}