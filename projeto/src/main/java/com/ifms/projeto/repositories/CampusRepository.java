package com.ifms.projeto.repositories;

import com.ifms.projeto.models.Campus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CampusRepository extends JpaRepository<Campus, Integer> {
}
