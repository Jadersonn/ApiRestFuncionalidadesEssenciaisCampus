package com.ifms.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;


@Entity
public class Sexo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_sexo;
	
	@Column(nullable = false)
	private String nome_sexo;
	
	public int getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(int id_sexo) {
		this.id_sexo = id_sexo;
	}

	public String getNome_sexo() {
		return nome_sexo;
	}

	public void setNome_sexo(String nome_sexo) {
		this.nome_sexo = nome_sexo;
	}


	
}
