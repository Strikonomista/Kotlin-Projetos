// Ex04_Jogador.kt

class Jogador {
    // Lista de cartas na mão do jogador
    private val cartas = mutableListOf<Cartas>()
    // Lista de cartas na mão do jogador
    val cartasNaMao = mutableListOf<Cartas>()

    fun receberCartas(cartas: Cartas) {
        cartasNaMao.add(cartas)
    }
    // Função para verificar se o jogador possui um par de cartas
    fun temPar(): Boolean {
        // Extrai os valores das cartas
        val valores = cartas.map { it.valor }
        // Agrupa os valores e verifica se algum grupo tem tamanho 2
        return valores.groupBy { it }.any { it.value.size == 2 }
    }
    // Função para verificar se o jogador possui uma trinca de cartas
    fun temTrinca(): Boolean {
        val valores = cartas.map { it.valor }
        return valores.groupBy { it }.any { it.value.size == 3 }
    }
    // Função para verificar se o jogador possui uma trinca de cartas
    fun temFullHouse(): Boolean {
        val valores = cartas.map { it.valor }
        return valores.groupBy { it }.any { it.value.size == 3 } && valores.groupBy { it }.any { it.value.size == 2 }
    }
    // Função para verificar se o jogador possui um flush de cartas
    fun temFlush(): Boolean {
        val naipes = cartas.map { it.naipe }
        // Verifica se todos os naipes são iguais ao primeiro naipe
        return naipes.all { it == naipes[0] }
    }
}
