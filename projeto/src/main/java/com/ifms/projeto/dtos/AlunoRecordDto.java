package com.ifms.projeto.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

public record AlunoRecordDto(
        @NotBlank String nome,
        Date dtConclusao,
        Date dtIngresso,
        Integer idCidade,
        Integer idSexo,
        Integer idSituacao,
        Integer idCampus
) {
}



