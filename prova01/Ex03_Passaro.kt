class passaro (nome: String, idade: Int) : Animal(nome, idade, "piu piu") {
    // Implementação do método fazerSom para o Passaro
    override fun fazerSom(): String {
        return "O pássaro $nome faz $som"
    }
}
