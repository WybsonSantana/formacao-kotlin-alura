package list

data class PrateleiraDeLivros(
    val genero: String,
    val livros: MutableList<Livro?>
) {

    fun organizarPorAutor(): MutableList<Livro?> {
        this.livros.sortBy { it?.autor }
        return this.livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro?> {
        this.livros.sortBy { it?.anoPublicacao }
        return this.livros
    }
}