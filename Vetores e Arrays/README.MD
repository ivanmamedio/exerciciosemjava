# Exemplos de Vetores (Arrays) e Strings

Este repositório contém uma coleção de exemplos práticos em Java (ou linguagem de sua preferência) que demonstram operações fundamentais com arrays e strings. Os exemplos abordam desde a manipulação básica de arrays unidimensionais até conceitos como busca, ordenação, matrizes e processamento de strings.

## Estrutura dos Exemplos

Cada exemplo está implementado em um arquivo separado, com comentários explicativos no código. Abaixo está a lista dos exercícios e uma breve descrição de cada um.

---

### 1. Preenchendo um array
Cria um array de 10 inteiros, preenche-o com os números de 1 a 10 e imprime todos os elementos.

**Conceitos:** inicialização de array, laço de repetição.

---

### 2. Maior e menor em array
Lê 5 números fornecidos pelo usuário, armazena-os em um array e exibe o maior e o menor valor.

**Conceitos:** entrada de dados, comparação de elementos, busca linear.

---

### 3. Média de um array
Calcula a média dos valores de um array de 10 doubles (os valores podem ser definidos no código ou lidos do usuário) e exibe o resultado.

**Conceitos:** soma de elementos, cálculo de média, uso de `double`.

---

### 4. Procurando um elemento
Lê 10 números e os armazena em um array. Em seguida, lê um número e verifica se ele está presente no array, exibindo todas as posições onde ocorre.

**Conceitos:** busca linear, múltiplas ocorrências, laços aninhados.

---

### 5. Invertendo um array
Inverte a ordem dos elementos de um array. Pode ser feito com ou sem o uso de um array auxiliar.

**Conceitos:** troca de elementos, manipulação de índices.

---

### 6. Soma de matriz 2x2
Cria duas matrizes de tamanho 2x2, soma cada elemento correspondente e exibe a matriz resultante.

**Conceitos:** matrizes (arrays bidimensionais), laços aninhados.

---

### 7. Contando vogais
Lê uma frase e conta quantas vogais (a, e, i, o, u) ela contém. O programa desconsidera acentos e diferenciação entre maiúsculas/minúsculas.

**Conceitos:** manipulação de strings, iteração sobre caracteres, condicionais.

---

### 8. Palíndromo
Verifica se uma palavra ou frase (sem espaços) é um palíndromo, ou seja, se pode ser lida da mesma forma de trás para frente (ex.: "arara", "osso").

**Conceitos:** reversão de string, comparação de caracteres.

---

### 9. Substituição de caracteres
Lê uma string, uma letra a ser substituída e uma letra substituta, e exibe a nova string com todas as ocorrências substituídas.

**Conceitos:** manipulação de strings, método `replace` (ou iteração manual).

---

### 10. Números pares em array
Preenche um array com 20 números aleatórios (gerados com `Math.random()` ou similar) e exibe apenas os valores pares.

**Conceitos:** geração de números aleatórios, operador módulo (`%`).

---

### 11. Ordenação simples (Bubble Sort)
Ordena um array de 10 números em ordem crescente utilizando o algoritmo da bolha (bubble sort).

**Conceitos:** ordenação, trocas sucessivas, laços aninhados.

---

## Como Executar

Os exemplos foram escritos em Java, mas podem ser adaptados facilmente para outras linguagens. Para compilar e executar cada arquivo Java separadamente:

```bash
javac NomeDoArquivo.java
java NomeDoArquivo
