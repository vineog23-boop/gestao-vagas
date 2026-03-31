package br.com.rocketseat.gestao_vagas.modules.candidate.controller;

import br.com.rocketseat.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.rocketseat.gestao_vagas.modules.candidate.repository.CandidateRepository;
import br.com.rocketseat.gestao_vagas.modules.candidate.service.CandidateService;
import jakarta.validation.Valid;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping( "/candidate")

public class CandidateController {
   private final CandidateService candidateService;

   public CandidateController(CandidateService candidateService){
       this.candidateService = candidateService;
   }

    @PostMapping("")
    ResponseEntity<CandidateEntity>create(@Valid @RequestBody CandidateEntity candidateEntity){
        var candidatoSalvo = candidateService.create(candidateEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(candidatoSalvo );
    }

@GetMapping("")
    ResponseEntity <List<CandidateEntity>> listarTodos(){
       var candidatosNaLista = candidateService.listarTodos();
       return ResponseEntity.ok(candidatosNaLista);
}

@PutMapping("/{id}")
    public ResponseEntity<CandidateEntity> update(@PathVariable UUID id, @RequestBody CandidateEntity candidateEntity) {
    var result = candidateService.update( id, candidateEntity);
    return ResponseEntity.ok(result);

    }



}
