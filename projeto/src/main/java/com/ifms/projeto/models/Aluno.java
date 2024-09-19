package com.ifms.projeto.models;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;
@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private Date dtIngresso;

	@Column(nullable = false)
	private Date dtConclusao;

	@ManyToOne
	private Situacao situacao;

	@ManyToOne
	private Sexo sexo;

	@ManyToOne
	private Cidade cidade;

	@ManyToOne
	private Campus campus; // Corrigido para Campus

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtIngresso() {
		return dtIngresso;
	}

	public void setDtIngresso(Date dtIngresso) {
		this.dtIngresso = dtIngresso;
	}

	public Date getDtConclusao() {
		return dtConclusao;
	}

	public void setDtConclusao(Date dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}
}
