# Laços de Repetição em Java

Estruturas usadas para executar um bloco de código repetidamente enquanto uma condição for verdadeira.

## `for` – quando se sabe o número de iterações
```java
for (inicialização; condição; incremento) {
    // código repetido
}
// Exemplo:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

## `while` – repete enquanto condição for verdadeira (testa antes)
```java
while (condição) {
    // código repetido
}
// Exemplo:
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

## `do-while` – executa pelo menos uma vez (testa depois)
```java
do {
    // código repetido
} while (condição);
// Exemplo:
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

## Escolha o laço conforme a necessidade:
- **`for`**: número definido de repetições.
- **`while`**: número indefinido, condição verificada antes.
- **`do-while`**: precisa executar ao menos uma vez.

## Controle de fluxo:
- `break` – sai imediatamente do laço.
- `continue` – pula para a próxima iteração.
