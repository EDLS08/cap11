# Sistema de Gerenciamento de Alunos

Aplicação simples de console em Java para cadastrar, organizar, classificar e consultar alunos utilizando o Collections Framework.

## Visão geral

Cada aluno possui três atributos:

- Nome
- Nota
- Matrícula

A aplicação começa com dez alunos de exemplo e demonstra diferentes maneiras de organizar e consultar esses dados.

## Estruturas e conceitos utilizados

| Estrutura | Função |
|---|---|
| `HashMap<Integer, Aluno>` | Armazena alunos utilizando a matrícula como chave |
| `TreeMap<Integer, Aluno>` | Exibe os alunos ordenados pela matrícula |
| `TreeSet<String>` | Armazena nomes únicos em ordem alfabética |
| `ArrayList<Aluno>` | Cria uma lista que pode ser ordenada por nota |
| `Comparator` | Ordena os alunos da maior nota para a menor |

O projeto também utiliza generics, construtores, encapsulamento, laço for-each, `Map.Entry`, referências a métodos e busca em mapas com `get()`.

## Estrutura do projeto

```text
cap11/
├── src/
│   ├── Aluno.java
│   └── Main.java
├── .gitignore
├── README.md
└── README-pt-br.md
```

## Requisitos

- Java Development Kit (JDK) 8 ou superior

## Como executar

Na pasta raiz do projeto:

```bash
javac -d out src/*.java
java -cp out Main
```

O programa exibe os alunos por matrícula, lista os nomes em ordem alfabética, apresenta um ranking por nota e solicita uma matrícula para realizar uma busca.

## Objetivo de aprendizagem

O principal objetivo é compreender que cada coleção possui uma finalidade diferente e que podemos combinar várias estruturas para resolver problemas de organização e consulta de dados.
