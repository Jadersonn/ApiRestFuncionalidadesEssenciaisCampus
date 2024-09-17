package com.ifms.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cargo;
	
	public int getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNome_cargo() {
		return nome_cargo;
	}

	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}

	@Column(nullable = false)
	private String nome_cargo;
	
	
	
	

}
