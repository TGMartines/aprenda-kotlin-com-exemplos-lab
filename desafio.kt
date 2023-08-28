// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val matriculados = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        matriculados.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na formação $nome")
    }

    fun exibirMatriculados() {
        println("Alunos matriculados na formação $nome: ")
        matriculados.forEach { aluno ->
            println("Aluno: ${aluno.nome}")
        }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Lógica de Programação", 50)
    val conteudo2 = ConteudoEducacional("Introdução ao Kotlin", 70)

    val formacaoInKotlin = Formacao("Iniciando em Desenvolvimento com Kotlin", Nivel.BASICO, listOf(conteudo1, conteudo2))

    val usuario1 = Usuario("Thiago")
    val usuario2 = Usuario("Pedro")

    listOf(formacaoInKotlin.matricular(usuario1), formacaoInKotlin.matricular(usuario2))

    formacaoInKotlin.exibirMatriculados()
}
