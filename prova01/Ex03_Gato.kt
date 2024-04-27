class gato (nome: String, idade: Int) : Animal(nome, idade, "miau") {
    // Implementação do método fazerSom para o Gato
    override fun fazerSom(): String {
        return "O gato $nome faz $som"
    }
}