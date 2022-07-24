package list

data class PrateleiraDeLivros(
    val genero: String,
    val livros: List<Livro?>
) {

    fun organizarPorAutor(): List<Livro?> {
        return this.livros.sortedBy { it?.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro?> {
        return this.livros.sortedBy { it?.anoPublicacao }
    }
}