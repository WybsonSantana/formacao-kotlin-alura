fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    // banco.nomes.add("Fulano")
    banco.salvar("Fulano")
    println(banco.nomes)
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

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