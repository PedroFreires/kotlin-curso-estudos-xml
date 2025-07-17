
fun main() {

    val num1 = 30
    val num2 = 20



    val resultado = operacao(num1, num2)
    print(resultado)
}

fun operacao(num1: Int, num2: Int): String {
    return if(num1 == num2){
        "30 igual 20"
    } else if(num1 < num2) {
        "30 menor 20"
    } else {
        "30 maior 20"
    }
}