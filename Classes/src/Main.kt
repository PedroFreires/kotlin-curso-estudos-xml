fun main() {

    val joao = Usuario("Joao Almeida", 1.80f)

    val bruno = Usuario(nome = "Bruno Silva", altura = 1.72f)

    println(joao.info()) //Usuario public podemos usar joao.nome diretamente
    println(bruno.info())//Usuario public podemos usar bruno.nome diretamente

}

class Usuario(nome: String, altura: Float) {
    /*public val nome: String = nome
    public val altura: Float = altura*/

    private val nome: String = nome
    private val altura: Float = altura

    fun info(): String {
        return "Usuario: $nome Altura: $altura"
    }
}