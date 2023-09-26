fun main() {
    // Inteiro
    val idade: Int = 25

    // Flutuante e Duplo
    val altura: Float = 1.75f
    val preco: Double = 99.99

    // Caractere
    val letra: Char = 'A'

    // Booleano
    val temPermissao: Boolean = true

    // Cadeia de Caracteres (String)
    val nome: String = "Julião"

    // Array
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Lista
    val frutas: List<String> = listOf("Maçã", "Banana", "Laranja")

    // Conjunto
    val numerosUnicos: Set<Int> = setOf(1, 2, 3, 4, 5)

    // Mapa
    val idadePorNome: Map<String, Int> = mapOf("Alice" to 28, "Bob" to 32, "Carol" to 25)

    // Tipo Nulo (Nullable)
    val nomeNulo: String? = null

    // Tipo Any (Qualquer)
    val qualquerCoisa: Any = "Isso pode ser qualquer coisa"

    // Exibindo os valores
    println("Idade: $idade")
    println("Altura: $altura")
    println("Preço: $preco")
    println("Letra: $letra")
    println("Tem Permissão: $temPermissao")
    println("Nome: $nome")
    println("Números: ${numeros.joinToString()}")
    println("Frutas: ${frutas.joinToString()}")
    println("Números Únicos: ${numerosUnicos.joinToString()}")
    println("Idade por Nome: $idadePorNome")
    println("Nome Nulo: $nomeNulo")
    println("Qualquer Coisa: $qualquerCoisa")
}
