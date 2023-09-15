# Sistema API REST com Spring Boot

## Descrição

Este é um projeto simples de Sistema API REST desenvolvido com o framework Spring Boot, seguindo o padrão MVC. O sistema utiliza um banco de dados em memória (H2) que contém duas tabelas: Pessoas e Departamentos. Essas tabelas estão relacionadas entre si, permitindo a realização das operações de CRIAR, LER, ATUALIZAR e DELETAR registros.

## Requisitos

Antes de executar este projeto, certifique-se de que você tenha o seguinte instalado em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) 8 ou superior
- Maven
- IDE de sua escolha (recomendado: IntelliJ IDEA ou Eclipse)
- Postman ou outra ferramenta similar para testar as APIs

## Configuração do Banco de Dados

O banco de dados utilizado neste projeto é o H2, que é um banco de dados em memória. Isso significa que não é necessário configurar nenhum banco de dados externo. O H2 será iniciado automaticamente quando você executar a aplicação.

## Executando o Projeto

Para executar o projeto, siga os passos abaixo:

1. Clone este repositório para o seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/lucasramosb/CRUD_Java-SpringBoot.git

2. Abra o projeto em sua IDE
3. Execute a classe principal Application.java para iniciar o servidor Spring Boot.
4. O servidor estará disponível em http://localhost:8080.

## Endpoints da API

A seguir estão os endpoints disponíveis na API:

### Listar Pessoas

- **Método:** GET
- **URL:** `http://localhost:8080/users`
  
### Criar Pessoa

- **Método:** POST
- **URL:** `http://localhost:8080/users`
- **Corpo da solicitação (JSON):**
  ```json
  {
    "name": "Nome da pessoa",
    "email": "email da pessoa",
    "department": {
        "id": 2
    }
  }
### Atualizar Pessoa
- **Método:** PUT
- **URL:** `http://localhost:8080/user/{id}`
- **Corpo da solicitação (JSON):**
  ```json
  {
    "name": "Nome da pessoa",
    "email": "email da pessoa",
    "department": {
        "id": 2
    }
  }
### Deletar Pessoa
- **Método:** DELETE
- **URL:** `http://localhost:8080/user/{id}`
