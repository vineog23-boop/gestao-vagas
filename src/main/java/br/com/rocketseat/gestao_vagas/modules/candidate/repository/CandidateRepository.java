package br.com.rocketseat.gestao_vagas.modules.candidate.repository;

import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.UUID;
import java.util.function.Supplier;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

}
