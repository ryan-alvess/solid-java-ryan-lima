# Princípios SOLID com Java e JUnit

Projeto acadêmico da disciplina **Arquitetura e Projeto de Software** do Centro Universitário UNIBRAS. O projeto usa Java 17, Maven e JUnit 5. Cada seção apresenta uma implementação que viola o princípio e uma solução refatorada.

## Como executar

```bash
mvn test
```

## S — Single Responsibility Principle

Uma classe deve ter apenas um motivo para mudar. `FuncionarioTudoEmUm` mistura dados, cálculo e persistência. A solução separa o modelo (`Funcionario`), o cálculo (`CalculadoraSalario`) e o serviço que os coordena.

## O — Open/Closed Principle

Entidades devem estar abertas para extensão e fechadas para modificação. `CalculadoraDescontoCondicional` exige alterações para cada novo tipo. `CalculadoraDesconto` permite incluir novas estratégias, como `DescontoVip` e `DescontoEstudante`, por polimorfismo.

## L — Liskov Substitution Principle

Um subtipo deve poder substituir seu tipo base sem quebrar o contrato. `ContaBancariaInvalida` viola a expectativa de que uma conta bancária aceite depósitos. `ContaCorrente` e `ContaInvestimento` implementam o contrato de forma válida.

## I — Interface Segregation Principle

Uma classe não deve depender de métodos que não utiliza. `TrabalhadorTudoEmUm` força robôs a implementar `comer`. As interfaces `Trabalhador` e `Alimentavel` são pequenas e específicas; `Robo` depende somente de `Trabalhador`.

## D — Dependency Inversion Principle

Módulos de alto nível devem depender de abstrações. `PedidoServiceAcoplado` instancia diretamente `EmailNotificador`. `PedidoService` recebe a abstração `Notificador` por injeção de dependência, permitindo produção, testes e novas implementações.

## Estrutura

- `src/main/java`: exemplos de violações e implementações refatoradas.
- `src/test/java`: testes unitários JUnit 5 para os cinco princípios.
- `pom.xml`: configuração Maven e dependências.

## Referências

- ANICHE, Maurício. *Desbravando o SOLID: princípios da programação orientada a objetos*. Casa do Código, 2016. https://www.casadocodigo.com.br/products/livro-desbravando-solid
- SOARES, Rodrigo. *Orientação a Objetos e SOLID para Microsserviços*. Casa do Código. https://www.casadocodigo.com.br/products/livro-oo-solid
- CASA DO CÓDIGO. *TDD: Test-Driven Development na prática*. https://www.casadocodigo.com.br/products/livro-tdd
- MARTIN, Robert C. *Clean Code*. Prentice Hall, 2008.
- MARTIN, Robert C. *Clean Architecture*. Prentice Hall, 2017.
- DESCHAMPS, Filipe. *SOLID is EASY with These Illustrations*. YouTube, 2020. https://www.youtube.com/watch?v=6SfrO3D4dHM
