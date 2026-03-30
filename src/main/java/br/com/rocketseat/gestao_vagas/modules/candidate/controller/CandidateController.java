package br.com.rocketseat.gestao_vagas.modules.candidate.controller;

import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rocketseat.gestao_vagas.modules.candidate.repository.CandidateRepository;
import br.com.rocketseat.gestao_vagas.modules.candidate.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping( "/candidate")

public class CandidateController {

    private final CandidateRepository candidateRepository;
    CandidateService candidateService;

     CandidateController(CandidateService candidateService, CandidateRepository candidateRepository) {
        this.candidateService = candidateService;
         this.candidateRepository = candidateRepository;
     }


    @PostMapping("")
    CandidateEntity create (@Valid  @RequestBody CandidateEntity candidateEntity){
        return candidateService.create(candidateEntity);


    }


}
