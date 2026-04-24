# Atividade Prática: Pilares da POO em Java ☕

Este repositório contém a resolução de uma atividade acadêmica focada na implementação dos pilares da Programação Orientada a Objetos (POO). O projeto simula um sistema básico de gestão acadêmica com classes para Pessoas, Alunos e Professores.

## 🚀 Tecnologias Utilizadas
* **Java 26** (OpenJDK)
* **IntelliJ IDEA**
* **Git/GitHub** para versionamento

## 🧠 Conceitos Aplicados
A atividade foi dividida em etapas para demonstrar cada conceito fundamental:

1. **Encapsulamento:** Uso de atributos privados (`private`) e métodos de acesso (`Getters` e `Setters`) para proteção de dados.
2. **Herança:** A classe `Pessoa` serve como superclasse, enquanto `Aluno` e `Professor` herdam suas características básicas via `extends`.
3. **Polimorfismo:** Sobrescrita do método `apresentar()` com a anotação `@Override`, permitindo comportamentos diferentes para cada tipo de objeto.
4. **Abstração:** Transformação da classe `Pessoa` em uma classe abstrata (`abstract`), servindo apenas como modelo e impedindo instâncias genéricas.

## 📁 Estrutura do Código
* `Pessoa.java`: Classe abstrata base.
* `Aluno.java`: Especialização para alunos (com matrícula e curso).
* `Professor.java`: Especialização para professores (com ID e disciplina).
* `Main.java`: Classe principal para execução e teste dos objetos.

## 💻 Como Rodar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/babizera/AtvPoo.git](https://github.com/babizera/AtvPoo.git)
