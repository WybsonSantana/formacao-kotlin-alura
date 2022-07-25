fun main() {
    val nomes: List<String> = listOf("Fulano", "Beltrano", "Ciclano", "Mengano", "Zotano")

    for (nome in nomes) {
        println(nome)
    }

    println(nomes)
    println("Contém o nome \"Fulano\"? ${nomes.contains("Fulano")}")
    println("Tamanho da coleção: ${nomes.size}")
}