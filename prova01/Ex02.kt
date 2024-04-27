fun main() {
    // Imprime uma mensagem solicitando ao usuário que insira um número inteiro positivo
    println("Digite um número inteiro positivo:")
    // Lê a entrada do usuário como uma string, converte para um inteiro ou usa 0 se não for possível converter
    val n = readLine()?.toInt() ?: 0

    // Inicializa a variável soma como 0.0 para armazenar a soma das frações
    var soma = 0.0
    // Loop que itera de 1 até o número inserido pelo usuário (inclusive)
    for (i in 1..n) {
        // Para cada valor de i, calcula a fração i / (n - i + 1) e adiciona à variável soma
        soma += i.toDouble() / (n - i + 1)
    }

    // Imprime o valor calculado da soma das frações
    println("O valor da soma é: $soma")
}
