package com.ifms.projeto.controller;

import com.ifms.projeto.repositories.AlunoRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.projeto.dtos.AlunoRecordDto;
import com.ifms.projeto.models.*;
import com.ifms.projeto.repositories.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;

@RestController
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;
    @Autowired
    CidadeRepository cidadeRepository;
    @Autowired
    SexoRepository sexoRepository;
    @Autowired
    SituacaoRepository situacaoRepository;
    @Autowired
    CampusRepository campusRepository;

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody @Valid AlunoRecordDto alunoRecordDto) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoRecordDto.nome());
        aluno.setDtConclusao(alunoRecordDto.dtConclusao());
        aluno.setDtIngresso(alunoRecordDto.dtIngresso());

        // Optional Cidade
        if (alunoRecordDto.idCidade() != null) {
            Cidade cidade = cidadeRepository.findById(alunoRecordDto.idCidade())
                    .orElseThrow(() -> new IllegalArgumentException("Cidade não encontrada"));
            aluno.setCidade(cidade);
        }

        // Optional Sexo
        if (alunoRecordDto.idSexo() != null) {
            Sexo sexo = sexoRepository.findById(alunoRecordDto.idSexo())
                    .orElseThrow(() -> new IllegalArgumentException("Sexo não encontrado"));
            aluno.setSexo(sexo);
        }

        // Optional Situacao
        if (alunoRecordDto.idSituacao() != null) {
            Situacao situacao = situacaoRepository.findById(alunoRecordDto.idSituacao())
                    .orElseThrow(() -> new IllegalArgumentException("Situação não encontrada"));
            aluno.setSituacao(situacao);
        }

        // Optional Campus
        if (alunoRecordDto.idCampus() != null) {
            Campus campus = campusRepository.findById(alunoRecordDto.idCampus())
                    .orElseThrow(() -> new IllegalArgumentException("Campus não encontrado"));
            aluno.setCampus(campus);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(aluno));
    }
}

