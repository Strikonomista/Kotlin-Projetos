// Definição da classe abstrata Animal com atributos nome, idade e som
abstract class Animal(val nome: String, val idade: Int, val som: String) {
    // Método abstrato fazerSom a ser implementado pelas classes derivadas
    abstract fun fazerSom(): String
}
