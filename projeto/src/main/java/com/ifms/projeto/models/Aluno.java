package com.ifms.projeto.models;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity

public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nome;
	
    @Column(nullable = false, unique = false)
    private Date dtIngresso;



    @Column(nullable = false, unique = false)
    private Date dtConclusao;

	
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

	@ManyToOne
	private Situacao situacao;
	
	@ManyToOne
	private Sexo sexo;
	
	@ManyToOne
	private Cidade cidade;
	
	@ManyToOne
	private Cidade campus;
	

}
