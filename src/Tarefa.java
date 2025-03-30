public class Tarefa {
    String titulo;
    String descricao;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return titulo + " - " + descricao;
    }
}
