package br.com.rocketseat.gestao_vagas.modules.candidate.Controller;

import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping( "/candidate")

public class CandidateController {

    @PostMapping("")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        System.out.println("x:Candidato");
        System.out.println(candidateEntity);
        

    }


}
