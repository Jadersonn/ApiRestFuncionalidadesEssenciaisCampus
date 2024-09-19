package com.ifms.projeto.controller;

import com.ifms.projeto.models.Campus;
import com.ifms.projeto.repositories.CampusRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campus")
public class CampusController {

    @Autowired
    private CampusRepository campusRepository;

    @PostMapping
    public ResponseEntity<Campus> criarCampus(@RequestBody @Valid Campus campus) {
        return ResponseEntity.status(HttpStatus.CREATED).body(campusRepository.save(campus));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campus> obterCampus(@PathVariable Integer id) { // Alterado para Integer
        return campusRepository.findById(id)
                .map(campus -> ResponseEntity.ok().body(campus))
                .orElse(ResponseEntity.notFound().build());
    }
}
