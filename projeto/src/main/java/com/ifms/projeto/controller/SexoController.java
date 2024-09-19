package com.ifms.projeto.controller;

import com.ifms.projeto.models.Sexo;
import com.ifms.projeto.repositories.SexoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sexos")
public class SexoController {

    @Autowired
    private SexoRepository sexoRepository;

    @PostMapping
    public ResponseEntity<Sexo> criarSexo(@RequestBody @Valid Sexo sexo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sexoRepository.save(sexo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sexo> obterSexo(@PathVariable Integer id) { // Alterado para Integer
        return sexoRepository.findById(id)
                .map(sexo -> ResponseEntity.ok().body(sexo))
                .orElse(ResponseEntity.notFound().build());
    }
}
