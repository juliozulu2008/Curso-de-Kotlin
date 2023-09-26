package `01_logica_com_Kotlin`

fun main() {
    val nome: String = "Julião" // Variável imutável
    // nome = "OutroNome" // Isso geraria um erro, pois nome é imutável
    println("Nome: $nome")
    muta()
}

fun muta() {
    var contador: Int = 0 // Variável mutável
    contador = 1 // É permitido alterar o valor de contador
    println("Contador: $contador")
}
