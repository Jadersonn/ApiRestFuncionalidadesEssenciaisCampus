package com.ifms.projeto.repositories;

import com.ifms.projeto.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
