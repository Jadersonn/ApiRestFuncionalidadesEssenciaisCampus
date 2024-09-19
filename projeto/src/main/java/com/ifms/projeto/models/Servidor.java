package com.ifms.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class Servidor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_servidor;
	
	@Column(nullable = false)
	private String nome_servidor;
	
	@Column(nullable = false)
	private String email;
	
	
	@ManyToOne
	private Campus campus;
	
	@ManyToOne
	private Setor setor;
	
	@ManyToOne
	private Cargo cargo;
	
	

	

}
