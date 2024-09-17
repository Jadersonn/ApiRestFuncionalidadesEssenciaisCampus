package com.ifms.projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Situacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_situacao;
	
	@Column(nullable = false)
	private String nome_situacao;

	public int getId_situacao() {
		return id_situacao;
	}

	public void setId_situacao(int id_situacao) {
		this.id_situacao = id_situacao;
	}

	public String getNome_situacao() {
		return nome_situacao;
	}

	public void setNome_situacao(String nome_situacao) {
		this.nome_situacao = nome_situacao;
	}
	
}
