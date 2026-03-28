package br.com.rocketseat.gestao_vagas.modules.candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;



@Data
@Entity (name = "candidate") // diz ao hibernate ( implementacao do JPA)  para criar uma tabela chaamada candidate
public class CandidateEntity {

@Id
@GeneratedValue(strategy = GenerationType.UUID) // gera o valor de forma automatica
 private UUID id; // marca o campo como chave primaria



private String name;
private String username;
private String email;
private String password;
private String description;
private String curriculum;



}
