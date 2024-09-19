package com.ifms.projeto.controller;

import com.ifms.projeto.models.Situacao;
import com.ifms.projeto.repositories.SituacaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/situacoes")
public class SituacaoController {

    @Autowired
    private SituacaoRepository situacaoRepository;

    @PostMapping
    public ResponseEntity<Situacao> criarSituacao(@RequestBody @Valid Situacao situacao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(situacaoRepository.save(situacao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Situacao> obterSituacao(@PathVariable Integer id) { // Alterado para Integer
        return situacaoRepository.findById(id)
                .map(situacao -> ResponseEntity.ok().body(situacao))
                .orElse(ResponseEntity.notFound().build());
    }
}
