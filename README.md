# ByteBank – Sistema Bancário em Java

Projeto desenvolvido em Java com o objetivo de praticar e consolidar os principais conceitos da **Programação Orientada a Objetos**, através da simulação de um sistema bancário simples.

Este projeto faz parte do meu processo de aprendizagem no curso de **Análise e Desenvolvimento de Sistemas** e foca na construção de uma base sólida em arquitetura de software e regras de negócio bancárias.

## Tecnologias
- Java 17+
- Orientação a Objetos (Abstração, Encapsulamento, Herança, Polimorfismo)
- MySQL (Script de base de dados incluído)
- IntelliJ IDEA

## Funcionalidades
- Criação e gestão de contas bancárias (Conta Corrente e Conta Poupança).
- Transferências entre contas com validação de saldo.
- Saques com aplicação de taxas personalizadas (Polimorfismo).
- Criação de tabelas e inserção de clientes via scripts SQL.

## Como executar o projeto

### Pré-requisitos
- Java 17 ou superior
- Uma IDE de tua preferência (IntelliJ IDEA, Eclipse, VS Code)
- MySQL (Opcional, caso queiras correr o script da base de dados)

### Passos
```bash
git clone [https://github.com/Davi-Silva-Developer/bytebank-sistema-bancario-java.git](https://github.com/Davi-Silva-Developer/bytebank-sistema-bancario-java.git)
Abre o projeto na tua IDE.

(Opcional) Executa o script src/database.sql no teu ambiente MySQL para criar as tabelas.

Localiza e executa a classe Main dentro do pacote bytebank.

Exemplo de Execução
Ao executar a classe principal, o sistema realiza os testes e imprime as seguintes operações na consola:

Plaintext
Temos mais um novo cliente!! Seja bem vindo Davi
Construindo conta de numero 1
Deposito do valor: 100.0 O saldo atual é de: 100.0
--- TESTE DE SAQUE ---
Saldo CC (Davi): 89.80
Próximas Melhorias Planeadas
[ ] Adicionar persistência de dados real com JPA/Hibernate.

[ ] Criar um menu interativo na consola utilizando Scanner.

[ ] Evoluir a arquitetura do projeto para uma API REST com Spring Boot.

Autor
Davi Silva LinkedIn: https://www.linkedin.com/in/davi-silva-dev

GitHub: https://github.com/Davi-Silva-Developer
