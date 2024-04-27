import java.util.*

// Definição da classe Tarefa com seus atributos
data class Tarefa(val titulo: String, val descricao: String, val dataVencimento: Date, val prioridade: Prioridade)

// Enumeração para representar as prioridades das tarefas
enum class Prioridade { BAIXA, MEDIA, ALTA }

// Classe responsável por gerenciar as tarefas
class GerenciadorDeTarefas {
    // Lista mutável para armazenar as tarefas
    private val listaDeTarefas = mutableListOf<Tarefa>()

    // Método para adicionar uma tarefa à lista
    fun adicionar(tarefa: Tarefa) = listaDeTarefas.add(tarefa)

    // Método para remover uma tarefa da lista com base no título
    fun remover(titulo: String) = listaDeTarefas.removeIf { it.titulo == titulo }

    // Método para buscar uma tarefa na lista com base no título
    fun buscar(titulo: String) = listaDeTarefas.find { it.titulo == titulo }

    // Método para marcar uma tarefa como concluída com base no título
    fun marcarConcluida(titulo: String) = buscar(titulo)?.let {
        listaDeTarefas.remove(it) // Remove a tarefa da lista
        println("Tarefa marcada como concluída: $titulo") // Mensagem de confirmação
    } ?: println("Tarefa não encontrada: $titulo") // Mensagem de erro se a tarefa não for encontrada

    // Método para listar as tarefas ordenadas por data de vencimento
    fun listarPorDataVencimento() = listaDeTarefas.sortedBy { it.dataVencimento }.forEach { println("${it.titulo} - ${it.dataVencimento}") }
}

// Função principal
fun main() {
    // Instância do gerenciador de tarefas
    val gerenciador = GerenciadorDeTarefas()

    // Adiciona algumas tarefas para demonstração
    with(gerenciador) {
        adicionar(Tarefa("Estudar Kotlin", "Estudar a linguagem Kotlin", Date(), Prioridade.ALTA))
        adicionar(Tarefa("Fazer compras", "Ir ao supermercado", Date(), Prioridade.MEDIA))

        // Lista as tarefas antes de marcar uma como concluída
        listarPorDataVencimento()

        // Marca uma tarefa como concluída
        marcarConcluida("Fazer compras")

        // Lista as tarefas após marcar uma como concluída
        listarPorDataVencimento()
    }
}
