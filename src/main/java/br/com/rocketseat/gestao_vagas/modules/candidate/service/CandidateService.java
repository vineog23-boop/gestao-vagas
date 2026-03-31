package br.com.rocketseat.gestao_vagas.modules.candidate.service;


import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rocketseat.gestao_vagas.modules.candidate.repository.CandidateRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.List;



@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;


   public CandidateService(CandidateRepository candidateRepository){  //injeta o Repositorio dentro da camada de Servicos
       this.candidateRepository = candidateRepository;
   }


    public CandidateEntity create(CandidateEntity candidateEntity){                   //Método CREATE
        return candidateRepository.save(candidateEntity);

    }

    public List<CandidateEntity> listarTodos(){                                        // Método READ, variacao de pegar todos elementos
       return candidateRepository.findAll();
    }

    public CandidateEntity update (UUID id, CandidateEntity candidateEntity){           // Método UPDATE
        CandidateEntity candidate = candidateRepository.findById(id).get();
        candidate.setName(candidateEntity.getName());
        return candidateRepository.save(candidate);
   };



}
