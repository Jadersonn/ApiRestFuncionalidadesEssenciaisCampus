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

	public int getId_servidor() {
		return id_servidor;
	}

	public void setId_servidor(int id_servidor) {
		this.id_servidor = id_servidor;
	}

	public String getNome_servidor() {
		return nome_servidor;
	}

	public void setNome_servidor(String nome_servidor) {
		this.nome_servidor = nome_servidor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
