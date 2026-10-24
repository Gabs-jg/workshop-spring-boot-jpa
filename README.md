# Workshop Spring Boot & JPA / Hibernate

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![JPA / Hibernate](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)](https://hibernate.org/)
[![Database](https://img.shields.io/badge/Database-H2%20%7C%20PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)

Projeto prático desenvolvido para consolidar conceitos de desenvolvimento backend moderno com Java e o ecossistema Spring Boot, com foco na construção de uma API RESTful robusta, mapeamento objeto-relacional (ORM) e arquitetura de software em camadas.

---

## Objetivos do Projeto

- Compreensão e implementação dos conceitos fundamentais de **Web Services RESTful**.
- Mapeamento Objeto-Relacional avançado com **JPA (Java Persistence API)** e **Hibernate**.
- Modelagem de domínio com associações complexas (`1..*`, `*..*`, `1..1`).
- Estruturação em camadas desacopladas (**Controller**, **Service**, **Repository**).
- Tratamento customizado de exceções com respostas padronizadas via `@ControllerAdvice`.
- Carga e instanciação de dados de teste (Database Seeding) com perfil de teste.

---

## Arquitetura em Camadas

O sistema adota uma arquitetura clássica e desacoplada:

```text
               ┌────────────────────────┐
               │    Client / Frontend   │
               └───────────┬────────────┘
                           │  HTTP Requests (JSON)
                           ▼
               ┌────────────────────────┐
               │    Resource Layer      │  (@RestController)
               └───────────┬────────────┘
                           │  Data Transfer / DTOs
                           ▼
               ┌────────────────────────┐
               │     Service Layer      │  (@Service - Regras de negócio)
               └───────────┬────────────┘
                           │  Entity Calls
                           ▼
               ┌────────────────────────┐
               │    Data Access Layer   │  (@Repository - Spring Data JPA)
               └───────────┬────────────┘
                           │  SQL / Queries
                           ▼
               ┌────────────────────────┐
               │        Database        │  (H2 / PostgreSQL / MySQL)
               └────────────────────────┘
```
## Modelo de Domínio
- O domínio aborda as operações de um e-commerce:
- User: Gerenciamento de clientes.
- Order: Pedidos realizados pelo usuário, com status de pedido (OrderStatus).
- OrderItem: Itens associados a um pedido com quantidade e preço histórico.
- Product: Produtos cadastrados no catálogo.
- Category: Categorias associadas a produtos (relação N-para-N).
- Payment: Pagamento vinculado ao pedido (relação 1-para-1).

 ## Tecnologias Utilizadas
- Linguagem: Java 17+
- Framework: Spring Boot 3
- Persistência de Dados: Spring Data JPA / Hibernate
- Segurança & Validação: Bean Validation
- Bancos de Dados: H2 Database (em memória para testes) e PostgreSQL/MySQL (para produção)
- Gerenciador de Dependências: Maven

## Principais Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca um usuário por ID |
| `POST` | `/users` | Cadastra um novo usuário |
| `PUT` | `/users/{id}` | Atualiza os dados de um usuário |
| `DELETE` | `/users/{id}` | Remove um usuário |
| `GET` | `/orders` | Lista todos os pedidos |
| `GET` | `/orders/{id}` | Busca um pedido por ID |
| `GET` | `/categories` | Lista as categorias |
| `GET` | `/products` | Lista os produtos |

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK 17 ou superior instalado
* Maven instalado (ou utilize o `./mvnw` incluso no repositório)
* Git configurado

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Gabs-jg/workshop-spring-boot-jpa.git
   cd workshop-spring-boot-jpa
   ```
2. **Compile e baixe as dependências:**
   ```bash
   ./mvnw clean install
   ```
3. **Inicie a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```
4. **Acesse a API:**
- A aplicação estará disponível em: http://localhost:8080
- O console do banco H2 (perfil de teste) pode ser acessado em: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (deixe em branco)
