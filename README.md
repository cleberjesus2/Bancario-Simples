# 🏦 Bancario Simples

Este repositório foi criado com o objetivo de reforçar e praticar conceitos de Programação Orientada a Objetos (POO) e o uso de Exceções no Java. A ideia é trabalhar com exceções personalizadas, `try-catch` para tratamento de erros e o uso de `throws` para declarar que um método pode lançar exceções.

## Funcionalidades

O sistema simula uma conta bancária simples, com as seguintes funcionalidades:

- **Conta Corrente**
- **Conta Poupança**
  
Possui os seguintes métodos principais:

- **Saque**: Permite que o usuário faça saques de sua conta.
- **Depósito**: Permite que o usuário faça depósitos em sua conta.

## Exceções

O projeto implementa uma exceção personalizada chamada **SaldoIncorretoException**, que é lançada quando o saldo da conta não é suficiente para realizar um saque ou quando um valor inválido (como negativo) é inserido em um depósito.

### Exceção Personalizada

A exceção **SaldoIncorretoException** é usada para:

- **Saque**: Caso o usuário tente sacar mais do que o saldo disponível.
- **Depósito**: Caso o usuário insira um valor negativo no depósito.

