package `01_logica_com_Kotlin`

fun saudacao(nome: String): String {
    return "Olá, $nome!"
}

fun somar(a: Int, b: Int): Int {
    return a + b
}
fun criarMensagem(nome: String, saudacao: String = "Olá") {
    println("$saudacao, $nome!")
}
fun obterNomeEIdade(): Pair<String, Int> {
    return Pair("Julião", 30)
}
fun main() {
    val nomePessoa = "Julião"
    val mensagem = saudacao(nomePessoa)
    println(mensagem)
    val resultado = somar(5, 3)
    println("Resultado da soma: $resultado")
    criarMensagem("Julião")
    val (nome, idade) = obterNomeEIdade()
    println("Nome: $nome, Idade: $idade")
}
