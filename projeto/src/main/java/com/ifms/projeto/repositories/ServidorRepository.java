package com.ifms.projeto.repositories;

import com.ifms.projeto.models.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Integer> {
}
