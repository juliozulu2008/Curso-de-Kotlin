package `01_logica_com_Kotlin`

fun main() {
    val numero1 = 10
    val numero2 = 5

    // Adição
    val soma = numero1 + numero2
    println("Soma: $soma") // Resultado: 15

    // Subtração
    val subtracao = numero1 - numero2
    println("Subtração: $subtracao") // Resultado: 5

    // Multiplicação
    val multiplicacao = numero1 * numero2
    println("Multiplicação: $multiplicacao") // Resultado: 50

    // Divisão
    val divisao = numero1 / numero2
    println("Divisão: $divisao") // Resultado: 2 (Kotlin faz a divisão inteira por padrão)

    // Módulo (resto da divisão)
    val modulo = numero1 % numero2
    println("Módulo: $modulo") // Resultado: 0
}
