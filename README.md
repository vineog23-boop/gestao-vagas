# 💼 Gestão de Vagas

## 📌 O que o projeto faz

O **Gestão de Vagas** é uma API REST backend desenvolvida para gerenciamento de candidatos em uma plataforma de vagas de emprego.

A aplicação permite:

- Cadastro de candidatos com dados completos (nome, username, e-mail, senha, descrição, currículo)
- Listagem de todos os candidatos cadastrados
- Atualização de dados de um candidato por ID
- Validação de entrada via Bean Validation (`@Valid`)
- Tratamento centralizado de exceções com `@ControllerAdvice`

---

## 🚀 Tecnologias utilizadas

<p align="left">
<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/Spring_Boot-4.x-brightgreen?style=for-the-badge&logo=springboot"/>
<img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/Spring_Validation-darkgreen?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>
<img src="https://img.shields.io/badge/H2_Database-lightblue?style=for-the-badge&logo=h2"/>
<img src="https://img.shields.io/badge/Lombok-red?style=for-the-badge"/>
<img src="https://img.shields.io/badge/DevTools-yellow?style=for-the-badge&logo=spring"/>
</p>

---

## ⚙️ Como instalar e rodar localmente

### 🔧 Pré-requisitos

- Java 21
- Maven
- PostgreSQL (ou H2 para ambiente de dev)

---

### 💻 Rodando localmente

```bash
git clone https://github.com/vineog23-boop/gestao-vagas.git
cd gestao-vagas
mvn clean install
mvn spring-boot:run
```

Acesse:

- API: `http://localhost:8080`
- H2 Console (dev): `http://localhost:8080/h2-console`

---

## 📡 Endpoints disponíveis

| Método | Endpoint         | Descrição                        |
|--------|------------------|----------------------------------|
| POST   | `/candidate`     | Cadastra um novo candidato       |
| GET    | `/candidate`     | Lista todos os candidatos        |
| PUT    | `/candidate/{id}`| Atualiza dados de um candidato   |

---

## 📂 Estrutura do projeto

```
src/
 ├── exeptions/
 │    └── ExeptionHandlerController.java
 └── modules/
      └── candidate/
           ├── CandidateEntity.java
           ├── controller/
           │    └── CandidateController.java
           ├── repository/
           │    └── CandidateRepository.java
           └── service/
                └── CandidateService.java
```

---

## 🧠 Conceitos aplicados

### 🔸 Arquitetura em módulos
- Organização por domínio (`candidate`) com separação em Controller, Service e Repository

### 🔸 Spring Data JPA
- Persistência com `@Entity`, `JpaRepository` e geração de UUID automático

### 🔸 Bean Validation
- Validação de entrada com `@Valid` e `@ControllerAdvice` para tratamento de erros

### 🔸 Injeção de Dependência via construtor
- Seguindo boas práticas do Spring IoC com constructor injection

### 🔸 RESTful com ResponseEntity
- Controle explícito de status HTTP (`201 CREATED`, `200 OK`)

---

## 👨‍💻 Autor 

Projeto desenvolvido por **Vinícius Gonçalves** como parte dos estudos em **Java Backend** — FIAP Pós-Tech 🚀
