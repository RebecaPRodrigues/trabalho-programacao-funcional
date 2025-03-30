import java.util.*;
import java.util.stream.Collectors;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo, String descricao) {
        tarefas.add(new Tarefa(titulo, descricao));
        System.out.println("Tarefa '" + titulo + "' adicionada.");
    }

    public List<String> listarTarefas() {
        return tarefas.stream()
            .map(t -> t.titulo + " - " + t.descricao)
            .collect(Collectors.toList());
    }

    public List<Tarefa> buscarTarefas(String palavra) {
        return tarefas.stream()
            .filter(t -> t.titulo.toLowerCase().contains(palavra.toLowerCase()))
            .collect(Collectors.toList());
    }

    public List<Tarefa> ordenarTarefasPorTitulo() {
        return tarefas.stream()
            .sorted(Comparator.comparing(t -> t.titulo))
            .collect(Collectors.toList());
    }
}
