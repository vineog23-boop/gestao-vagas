package br.com.rocketseat.gestao_vagas.modules.candidate.service;

import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rocketseat.gestao_vagas.modules.candidate.repository.CandidateRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

   private final CandidateRepository candidateRepository;
   public CandidateService(CandidateRepository candidateRepository){
       this.candidateRepository = candidateRepository;
   }


    public CandidateEntity create(CandidateEntity candidato){
        return candidateRepository.save(candidato);

    }
}
