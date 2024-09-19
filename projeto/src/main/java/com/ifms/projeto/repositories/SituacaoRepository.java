package com.ifms.projeto.repositories;

import com.ifms.projeto.models.Situacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SituacaoRepository extends JpaRepository<Situacao, Integer> {
}
