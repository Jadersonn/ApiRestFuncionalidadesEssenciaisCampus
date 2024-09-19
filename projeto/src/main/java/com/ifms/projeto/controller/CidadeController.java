package com.ifms.projeto.controller;

import com.ifms.projeto.models.Cidade;
import com.ifms.projeto.repositories.CidadeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;

    @PostMapping
    public ResponseEntity<Cidade> criarCidade(@RequestBody @Valid Cidade cidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cidadeRepository.save(cidade));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> obterCidade(@PathVariable Integer id) { // Alterado para Integer
        return cidadeRepository.findById(id)
                .map(cidade -> ResponseEntity.ok().body(cidade))
                .orElse(ResponseEntity.notFound().build());
    }
}
