# 🧨 Campo Minado Swing

Um projeto em **Java** que implementa o clássico jogo **Campo Minado**, utilizando **Swing** para a construção da interface gráfica.

Este projeto foi desenvolvido com o objetivo de praticar conceitos de:

* Programação Orientada a Objetos (POO)
* Manipulação de eventos
* Interfaces gráficas com Java Swing
* Estruturação de projetos Java
* Organização em pacotes

---

## 🎮 Sobre o Jogo

O **Campo Minado** é um jogo de lógica onde o objetivo é revelar todas as células do tabuleiro que **não contêm minas**, sem clicar em nenhuma delas.

Cada célula revela:

* 💣 Uma mina (fim de jogo)
* 🔢 Um número indicando quantas minas existem ao redor
* ⬜ Uma área vazia que pode abrir outras automaticamente

---

## 🚀 Funcionalidades

* ✔️ Geração aleatória de minas
* ✔️ Interface gráfica construída com `JFrame` e `JButton`
* ✔️ Contagem automática de minas adjacentes
* ✔️ Sistema de vitória e derrota
* ✔️ Abertura recursiva de células vazias
* ✔️ Estrutura organizada em pacotes

---

## 📂 Estrutura do Projeto

```
Campo-Minado-Swing
 ┣ 📂src
 ┃ ┗ 📂br/com/cod3r/cm
 ┣ 📜.gitignore
 ┗ 📜campo-minado-swing.iml
```

* `src/br/com/cod3r/cm` → Código-fonte do jogo
* `.iml` e `.idea` → Arquivos da IDE (IntelliJ)

---

## 💻 Como Executar

### 🔁 Clonar o repositório

```bash
git clone https://github.com/Caua-Andrade/Campo-Minado-Swing.git
cd Campo-Minado-Swing
```

### ▶️ Executar pela IDE

1. Abra o projeto na sua IDE (IntelliJ, Eclipse, VS Code com Java).
2. Localize a classe principal.
3. Execute o método `main`.

---

### ▶️ Executar pelo terminal

```bash
javac -d bin src/br/com/cod3r/cm/*.java
java -cp bin br.com.cod3r.cm.NomeDaClassePrincipal
```

> Substitua `NomeDaClassePrincipal` pela classe que contém o método `main`.

---

## 🛠️ Tecnologias Utilizadas

* ☕ **Java**
* 🖼️ **Java Swing**
* 🧠 Programação Orientada a Objetos
* 🗂️ Git & GitHub

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, como prática de:

* Estruturação de aplicações desktop em Java
* Separação entre lógica e interface
* Manipulação de eventos e listeners
* Modelagem de regras de negócio

---

## 🙌 Autor

Desenvolvido por **Cauã Andrade** 🚀
