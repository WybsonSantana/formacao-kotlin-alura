package list

fun main() {
    listaLivrosComNulos.exibirLista()

    listaLivrosComNulos
        .filterNotNull()
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro?>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}