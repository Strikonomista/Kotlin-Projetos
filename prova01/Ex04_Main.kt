// Ex04_Main.kt
fun main() {
    val baralho = Baralho() // Cria um novo baralho
    baralho.embaralhar() // Embaralha as cartas do baralho

    val jogador = Jogador() // Cria um novo jogador
    repeat(5) { // Distribui 5 cartas para o jogador
        jogador.receberCartas(baralho.distribuir())
    }

    println("Cartas do jogador:") // Imprime as cartas do jogador
    jogador.cartasNaMao.forEach { println("${it.valor}${it.naipe}") }

    println("Combinações vencedoras:") // Verifica as combinações vencedoras
    println("Par: ${jogador.temPar()}") // Verifica se o jogador possui um par de cartas
    println("Trinca: ${jogador.temTrinca()}") // Verifica se o jogador possui uma trinca de cartas
    println("Full House: ${jogador.temFullHouse()}") // Verifica se o jogador possui um Full House
    println("Flush: ${jogador.temFlush()}") // Verifica se o jogador possui um Flush
}