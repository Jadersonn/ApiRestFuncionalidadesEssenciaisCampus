package com.ifms.projeto.repositories;

import com.ifms.projeto.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
