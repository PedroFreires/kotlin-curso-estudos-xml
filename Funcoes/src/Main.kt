
fun main(args: Array<String>) {
    nomeCompleto(nome="jao", sobrenome="botijao")

    soma(num1 = 10, num2 = 20)

    val resultado = dividir(num1 = 50, num2 = 5)
    println("Resultado /: $resultado")
}

fun nomeCompleto(nome: String, sobrenome: String) {
    println("$nome $sobrenome")
}

fun soma(num1: Int, num2: Int) {
    println("Resultado +: ${num1 + num2}" )
}

fun dividir(num1: Int, num2: Int) = num1 / num2 /*: Int {
    return num1 / num2
}
        */