<h1 align="center">💼 Gestão de Vagas API</h1>
<p align="center">
  API backend desenvolvida com Spring Boot para estudo de cadastro e gerenciamento de candidatos
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk" alt="Java 25"/>
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.4-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 4.0.4"/>
  <img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring" alt="Spring Data JPA"/>
  <img src="https://img.shields.io/badge/Validation-0A7E07?style=for-the-badge" alt="Validation"/>
  <img src="https://img.shields.io/badge/H2-09476B?style=for-the-badge" alt="H2 Database"/>
  <img src="https://img.shields.io/badge/Lombok-CC0000?style=for-the-badge" alt="Lombok"/>
</p>

---

## 📌 Sobre o projeto

A **Gestão de Vagas API** foi desenvolvida como projeto de estudo para consolidar conceitos centrais do desenvolvimento backend com Java e Spring Boot.

O foco está na construção de uma API clara e organizada, com **boas práticas básicas de arquitetura**, **persistência**, **validação** e **tratamento centralizado de exceções**.

---

## ✅ O que o projeto cobre hoje

- Cadastro de candidatos
- Listagem de candidatos
- Atualização de dados de candidatos
- Validação de entrada com Bean Validation
- Tratamento global de exceções

---

## 🧱 Stack utilizada

- **Java 25**
- **Spring Boot 4.0.4**
- **Spring Data JPA**
- **Spring Validation**
- **H2 Database**
- **Lombok**

---

## 🏛️ Arquitetura

A aplicação está organizada com separação de responsabilidades entre:
- `controller`
- `service`
- `repository`
- `entity`

Essa estrutura ajuda a manter o projeto mais legível, modular e fácil de evoluir.

---

## ⚙️ Configuração atual

A configuração padrão do projeto está preparada para rodar localmente com **H2 em memória**.

### Principais pontos
- banco H2 em memória
- `ddl-auto=create-drop`
- `spring.h2.console.enabled=true`

---

## ▶️ Como executar

```bash
git clone https://github.com/vineog23-boop/gestao-vagas.git
cd gestao-vagas
mvn clean install
mvn spring-boot:run
```

**Acesso local**
- Aplicação: http://localhost:8080
- Console H2: http://localhost:8080/h2-console

---

## 📚 Aprendizados aplicados

- Construção de API REST com Spring MVC
- Persistência com Spring Data JPA
- Validação com `@Valid`
- Tratamento de exceções com `@ControllerAdvice`
- Respostas HTTP mais explícitas com `ResponseEntity`

---

## 🚧 Status

Projeto acadêmico e de estudo em evolução.

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte da formação em Java backend.
