# Projeto: Web Services com Spring Boot e JPA / Hibernate

Este projeto é uma aplicação web back-end desenvolvida durante o curso do Prof. Nelio Alves (DevSuperior). O objetivo é construir uma API RESTful utilizando Java com Spring Boot, JPA e Hibernate, abordando conceitos como CRUD, relacionamento entre entidades, tratamento de exceções, e perfis de configuração.

##  Objetivos

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: `resource`, `service`, `repository`
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados com dados de exemplo
- Realizar operações CRUD (Create, Retrieve, Update, Delete)
- Implementar tratamento de exceções personalizado

##   Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **JPA / Hibernate**
- **Banco de Dados H2**
- **PostgreSQL**
- **Maven**
- **Heroku**
- **Postman**

##  Funcionalidades

- Cadastro de usuários
- Cadastro de pedidos (*Orders*)
- Associação entre pedidos e produtos
- Cadastro de categorias e produtos
- Cálculo de subtotal e total do pedido
- Pagamento associado ao pedido
- Tratamento de exceções personalizado

##  Camadas do Projeto

- **Entity** – Modelos de domínio
- **Repository** – Comunicação com o banco de dados via JPA
- **Service** – Regras de negócio
- **Resource (Controller)** – Endpoints da API

##  Banco de Dados

- H2 em memória para testes
- PostgreSQL local ou Heroku para produção
