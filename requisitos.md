# Documento de Requisitos

**Equipe:**
- Rebeca Pereira Rodrigues – Matrícula: 2313641 – Responsável pela implementação
- Lucas Willamy Soares Lessa – Matrícula: 2313665 – Responsável pela documentação e testes
- Ana Clara Cordeiro Gonzalez de Moura – Matrícula: 2313610 – Responsável pela revisão de código e estrutura funcional

---

## Requisitos Funcionais

1. O sistema deve permitir adicionar uma tarefa.
2. O sistema deve permitir listar todas as tarefas.
3. O sistema deve permitir buscar tarefas por palavra-chave.
4. O sistema deve permitir ordenar as tarefas por título.

## Requisitos Não Funcionais

1. O sistema deve ser implementado usando Java 8.
2. O sistema deve utilizar conceitos de programação funcional.
3. O sistema deve ser simples, de fácil execução e conter testes básicos.
4. O código deve ser compilável com `javac`.

---

## Mapeamento dos Requisitos

| Requisito | Função Implementada                  |
|----------|--------------------------------------|
| RF1      | `adicionarTarefa`                    |
| RF2      | `listarTarefas`                      |
| RF3      | `buscarTarefas`                      |
| RF4      | `ordenarTarefasPorTitulo`            |

---

## Uso de Conceitos de Programação Funcional

- **Função Lambda:** usada em `filter`, `map` e `sorted`.
- **List Comprehension (equivalente em Java):** uso de `map` + `Collectors.toList()`.
- **Closure:** as lambdas Java capturam o contexto da variável `tarefas`, mantendo acesso ao estado.
- **Função de Alta Ordem:** uso das funções `filter`, `map`, `sorted` que recebem outras funções como argumento.

---

## Observações

- A equipe optou por desenvolver o projeto em **Java 8**, com foco em clareza e uso explícito de conceitos funcionais.
- O código foi revisado por todos os membros para garantir fidelidade aos requisitos e boas práticas.
---

## Testes Automatizados

Para garantir o correto funcionamento das funcionalidades implementadas, foi criada a classe `GerenciadorTarefasTest`, utilizando o framework **JUnit 5**.

### Funcionalidades testadas:

- **Listar tarefas**: garante que o número de tarefas adicionadas corresponde ao esperado.
- **Buscar tarefas**: verifica se a busca retorna o item correto de acordo com a palavra-chave.
- **Ordenar tarefas**: valida que as tarefas estão ordenadas corretamente por título.

Todos os testes foram executados e aprovados com sucesso utilizando o comando:

```bash
java -jar lib/junit.jar -cp bin --scan-classpath
```
> *Nota:* A classe de testes `GerenciadorTarefasTest` foi desenvolvida com o auxílio do ChatGPT, utilizado como ferramenta de apoio para entender a sintaxe e estrutura dos testes automatizados com JUnit 5. A lógica dos testes foi validada e adaptada pelos integrantes da equipe.
