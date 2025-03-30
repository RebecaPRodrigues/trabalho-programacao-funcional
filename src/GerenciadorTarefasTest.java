import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorTarefasTest {

    private GerenciadorTarefas gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa("Estudar", "Matemática");
        gerenciador.adicionarTarefa("Comprar pão", "Padaria");
    }

    @Test
    public void testListarTarefas() {
        List<String> tarefas = gerenciador.listarTarefas();
        assertEquals(2, tarefas.size());
    }

    @Test
    public void testBuscarTarefas() {
        List<Tarefa> resultado = gerenciador.buscarTarefas("pão");
        assertEquals(1, resultado.size());
        assertEquals("Comprar pão", resultado.get(0).titulo);
    }

    @Test
    public void testOrdenarTarefas() {
        List<Tarefa> ordenadas = gerenciador.ordenarTarefasPorTitulo();
        assertEquals("Comprar pão", ordenadas.get(0).titulo);
    }
}
