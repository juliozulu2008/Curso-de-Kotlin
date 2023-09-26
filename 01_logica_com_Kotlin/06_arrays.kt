package `01_logica_com_Kotlin`

fun main() {
    // Criar um array de inteiros com valores iniciais
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // Acessar elementos do array por índice
    val primeiroNumero = numeros[0]
    val segundoNumero = numeros[1]

    // Modificar elementos do array
    numeros[3] = 10

    // Tamanho do array
    val tamanho = numeros.size

    // Iterar através do array
    for (numero in numeros) {
        println(numero)
    }
    array()
    array1()

}
fun array() {
    // Criar um array de strings
    val frutas = arrayOf("Maçã", "Banana", "Laranja")

    // Acessar elementos do array por índice
    val primeiraFruta = frutas[0]

    // Tamanho do array
    val tamanho = frutas.size

    // Iterar através do array
    for (fruta in frutas) {
        println(fruta)
    }
}
fun array1() {
    // Criar uma lista mutável de inteiros
    val numerosMutaveis = mutableListOf(1, 2, 3)

    // Adicionar elementos
    numerosMutaveis.add(4)

    // Remover elementos
    numerosMutaveis.removeAt(0)

    // Tamanho da lista mutável
    val tamanho = numerosMutaveis.size

    // Iterar através da lista mutável
    for (numero in numerosMutaveis) {
        println(numero)
    }
}
