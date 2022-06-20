package com.projects.studiohair.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf;
	private String nome;
	private String senha;
	private String rgfuncionario;
	private String endereco;
	private String celularfuncionario;
	@ManyToOne
	@JoinColumn(name = "perfilfuncionario_id")
	private Perfil perfilfuncionario;
	@ManyToMany
	@JoinColumn(name = "servico_funcionario_id")
	private Servico servico_funcionario;
	@ManyToOne
	@JoinColumn(name = "agendamento_funcionario_id")
	private Agendamento agendamento_funcionario;
	@ManyToOne
	@JoinColumn(name = "salao_funcionario_id")
	private Salao salao_funcionarios;
	
	public void inserir() {

	}

	public void alterar() {

	}

	public void excluir() {

	}

	public List<Funcionario> funcionarios = new ArrayList<>();

	public void carregarPorCpf(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String cpf, String nome, String senha, String rgfuncionario, String endereco,
			String celularfuncionario, Perfil perfilfuncionario, List<Funcionario> funcionarios) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.rgfuncionario = rgfuncionario;
		this.endereco = endereco;
		this.celularfuncionario = celularfuncionario;
		this.perfilfuncionario = perfilfuncionario;
		this.funcionarios = funcionarios;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRgfuncionario() {
		return rgfuncionario;
	}

	public void setRgfuncionario(String rgfuncionario) {
		this.rgfuncionario = rgfuncionario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelularfuncionario() {
		return celularfuncionario;
	}

	public void setCelularfuncionario(String celularfuncionario) {
		this.celularfuncionario = celularfuncionario;
	}
	
	public Perfil getPerfilfuncionario() {
		return perfilfuncionario;
	}
	
	public void setPerfilfuncionario(Perfil perfilfuncionario) {
		this.perfilfuncionario = perfilfuncionario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
}
