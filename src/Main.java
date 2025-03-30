import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Buscar tarefa por palavra-chave");
            System.out.println("4 - Listar tarefas ordenadas por titulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descricao: ");
                    String descricao = sc.nextLine();
                    gerenciador.adicionarTarefa(titulo, descricao);
                    break;
                case 2:
                    List<String> tarefas = gerenciador.listarTarefas();
                    System.out.println("\nTarefas:");
                    tarefas.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Palavra-chave: ");
                    String palavra = sc.nextLine();
                    List<Tarefa> encontradas = gerenciador.buscarTarefas(palavra);
                    System.out.println("\nEncontradas:");
                    encontradas.forEach(System.out::println);
                    break;
                case 4:
                    List<Tarefa> ordenadas = gerenciador.ordenarTarefasPorTitulo();
                    System.out.println("\nTarefas Ordenadas:");
                    ordenadas.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        sc.close();
    }
}
