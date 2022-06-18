package com.projects.studiohair.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Servico {

	private Integer id;
	private String nome;
	private Double preco;
	
	public void inserir() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	
	public List<Servico> servicos = new ArrayList<>();
	
	public void carregarPorId(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Servico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servico(Integer id, String nome, Double preco, List<Servico> servicos) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.servicos = servicos;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
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
		Servico other = (Servico) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
