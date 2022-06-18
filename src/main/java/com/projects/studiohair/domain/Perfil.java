package com.projects.studiohair.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Perfil {

	private Integer id;
	private String nome;
	private String descricao;
	
	public void inserir() {

	}

	public void alterar() {

	}

	public void excluir() {

	}

	public List<Perfil> perfis = new ArrayList<>();

	public void carregarPorId(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		
		
	}

	public Perfil() {
		super();
	}

	public Perfil(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
