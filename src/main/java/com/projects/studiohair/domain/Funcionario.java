package com.projects.studiohair.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario {

	private String cpf;
	private String nome;
	private String senha;
	private String rgfuncionario;
	private String endereco;
	private String celularfuncionario;
	
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
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String cpf, String nome, String senha, String rgfuncionario, String endereco,
			String celularfuncionario, List<Funcionario> funcionarios) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.rgfuncionario = rgfuncionario;
		this.endereco = endereco;
		this.celularfuncionario = celularfuncionario;
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
