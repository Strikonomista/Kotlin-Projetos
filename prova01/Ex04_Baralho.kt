class Baralho {
    // Lista de naipes do baralho
    private val naipes = listOf("♠️", "♥️", "♦️", "♣️")
    // Lista de valores das cartas do baralho
    private val valores = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    // Lista de todas as cartas do baralho, inicialmente não embaralhadas
    private var cartas = naipes.flatMap { naipe ->
        valores.map { valor ->
            Cartas(naipe, valor)
        }
    }.toMutableList()
    // Função para embaralhar as cartas do baralho
    fun embaralhar() {
        cartas.shuffle()
    }
    // Função para distribuir uma carta do baralho
    fun distribuir(): Cartas {
        return cartas.removeAt(0)
    }
}
