package com.projects.studiohair.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Salao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cnpj;
	private String nome;
	private String endereco;
	private String telefone;
	
	@OneToMany(mappedBy = "salao_cliente")
	
	
	
	public void inserir() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	@OneToMany(mappedBy = "salao_funcionarios")
	
	public List<Salao> salao = new ArrayList<>();
	
	public void carregarPorCnpj(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public Salao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salao(String cnpj, String nome, String endereco, String telefone, List<Salao> salao) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salao = salao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Salao> getSalao() {
		return salao;
	}

	public void setSalao(List<Salao> salao) {
		this.salao = salao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salao other = (Salao) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	
}
