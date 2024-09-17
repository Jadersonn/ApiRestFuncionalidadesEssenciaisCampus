package com.ifms.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Campus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_campus;
	
	@Column(nullable = false)
	private String nome_campus;

	public int getId_campus() {
		return id_campus;
	}

	public void setId_campus(int id_campus) {
		this.id_campus = id_campus;
	}

	public String getNome_campus() {
		return nome_campus;
	}

	public void setNome_campus(String nome_campus) {
		this.nome_campus = nome_campus;
	}
	
}
