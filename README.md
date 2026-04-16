# Gestão de Vagas API

API backend desenvolvida com Spring Boot para estudo de cadastro e gerenciamento de candidatos.

## Objetivo do projeto

Este projeto foi construído para praticar conceitos centrais do ecossistema Java backend, com foco em:

- criação de APIs REST
- organização em camadas
- validação de dados
- persistência com JPA
- tratamento centralizado de exceções

## Stack

<p align="left">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk" alt="Java 25"/>
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.4-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 4.0.4"/>
  <img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring" alt="Spring Data JPA"/>
  <img src="https://img.shields.io/badge/Spring_Validation-darkgreen?style=for-the-badge&logo=spring" alt="Spring Validation"/>
  <img src="https://img.shields.io/badge/H2-lightblue?style=for-the-badge&logo=h2" alt="H2 Database"/>
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL dependency"/>
  <img src="https://img.shields.io/badge/Lombok-red?style=for-the-badge" alt="Lombok"/>
</p>

## O que o projeto cobre hoje

- cadastro de candidatos
- listagem de candidatos
- atualização de dados de candidatos
- validação de entrada com Bean Validation
- tratamento global de exceções

## Estrutura

A aplicação está organizada com separação de responsabilidades entre controller, service, repository e entidade principal do módulo de candidatos.

## Configuração atual

A configuração padrão do projeto está preparada para rodar localmente com **H2 em memória**.

Principais pontos:

- banco local H2 em memória
- `ddl-auto=create-drop`
- `spring.h2.console.enabled=true`
- console disponível em `/h2-console`

## Como executar

```bash
git clone https://github.com/vineog23-boop/gestao-vagas.git
cd gestao-vagas
mvn clean install
mvn spring-boot:run
```

A aplicação sobe por padrão em:

```
http://localhost:8080
```

Console H2:

```
http://localhost:8080/h2-console
```

## Aprendizados aplicados

- construção de API REST com Spring MVC
- persistência com Spring Data JPA
- validação com `@Valid`
- tratamento de exceções com `@ControllerAdvice`
- uso de `ResponseEntity` para respostas HTTP mais explícitas

## Status

Projeto acadêmico / de estudo em evolução.

## Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte da formação em Java backend.
