# Gerenciador de Tarefas Funcional (Java 8)

Projeto criado para a disciplina de Programação Funcional, utilizando **Java 8** e conceitos como:
- Funções lambda
- Funções de alta ordem
- Stream API
- Closure (via contexto de lambdas)

## 🚀 Como executar

### 1. Compilar

No terminal, dentro da pasta do projeto, execute:

```
javac -cp "lib/junit.jar" -d bin src/*.java
```

### 2. Executar

```
java -cp bin Main
```

Você verá um menu no terminal com as opções para adicionar, listar, buscar e ordenar tarefas.

---

## 🧪 Como rodar os testes (JUnit 5)

```
java -jar lib/junit.jar -cp bin --scan-classpath
```

Todos os testes automatizados estão na classe `GerenciadorTarefasTest`.

---

## 👥 Equipe

- Rebeca Pereira Rodrigues – Matrícula: 2313641 – Implementação
- Lucas Willamy Soares Lessa – Matrícula: 2313665 – Documentação e testes
- Ana Clara Cordeiro Gonzalez de Moura – Matrícula: 2313610 – Revisão do código
