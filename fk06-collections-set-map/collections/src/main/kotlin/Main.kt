fun main() {
val assistiramCursoJava = listOf("Fulano", "Beltrano", "Ciclano")
val assistiramCursoKotlin= listOf("Fulano", "Mengano", "Zotano")
    val assistiramAmbosCursos = assistiramCursoJava + assistiramCursoKotlin
    println(assistiramAmbosCursos.distinct())
}