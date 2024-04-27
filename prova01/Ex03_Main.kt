// Função principal
fun main() {
    // Criação de instâncias de Cachorro, Gato e Passaro
    val cachorro = cachorro("Rex", 3)
    val gato = gato("Frajola", 2)
    val passaro = passaro("Piu", 1)

    // Criação de uma lista contendo os animais
    val animais = listOf(cachorro, gato, passaro)

    // Iteração sobre a lista de animais e impressão do som de cada um
    for (animal in animais) {
        println(animal.fazerSom())
    }
}