// Definição da classe Cachorro que herda de Animal e recebe nome e idade no construtor
class cachorro (nome: String, idade: Int) : Animal(nome, idade, "au au") {
    // Implementação do método fazerSom para o Cachorro
    override fun fazerSom(): String {
        return "O cachorro $nome faz $som"
    }
}
