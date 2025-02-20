CRUD de Produtos

Este projeto é uma API RESTful para gerenciamento de produtos, implementando operações básicas de CRUD (Create, Read, Update, Delete). Foi desenvolvido como parte de um estudo/prática de desenvolvimento backend.

Funcionalidades

- Criar um produto: Cadastra um novo produto no sistema.
- Listar todos os produtos: Retorna uma lista de todos os produtos cadastrados.
- Buscar produto por ID: Retorna os detalhes de um produto específico.
- Excluir um produto por ID: Remove um produto do sistema.

Tecnologias Utilizadas

- Linguagem: Java
- Framework: Spring Boot
- Banco de Dados: H2 (em memória) 
- Ferramentas: Maven, Postman
- Outras Dependências: Spring Data JPA, Spring Web

Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- Java JDK 17 ou superior
- Maven
- Um IDE de sua preferência (IntelliJ, Eclipse, VS Code)
- Postman ou outra ferramenta para testar a API

Como Executar o Projeto

Endpoints da API
Abaixo estão os endpoints disponíveis:

GET /produtos: Retorna todos os produtos.
GET /produtos/{id}: Retorna um produto específico pelo ID.
POST /produtos: Cria um novo produto.
DELETE /produtos/{id}: Deleta um produto por ID.


json para adicionar um produto.

{
  "nome": "Produto Exemplo",
  "quantidade": 12,
  "preco": 199.99
}

Proximos passos:
* Tratamento de exceções.
* Segurança

