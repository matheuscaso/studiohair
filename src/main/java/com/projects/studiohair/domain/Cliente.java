package com.projects.studiohair.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

	private String cpf;
	private String nome;
	private String senha;
	private String rgcliente;
	private String endereco;
	private String telefonecliente;
	private String email;
	private String celularcliente;

	public void inserir() {

	}

	public void alterar() {

	}

	public void excluir() {

	}

	public List<Cliente> clientes = new ArrayList<>();

	public void carregarPorCpf(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, String nome, String senha, String rgcliente, String endereco, String telefonecliente,
			String email, String celularcliente, List<Cliente> clientes) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.rgcliente = rgcliente;
		this.endereco = endereco;
		this.telefonecliente = telefonecliente;
		this.email = email;
		this.celularcliente = celularcliente;
		this.clientes = clientes;
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

	public String getRgcliente() {
		return rgcliente;
	}

	public void setRgcliente(String rgcliente) {
		this.rgcliente = rgcliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefonecliente() {
		return telefonecliente;
	}

	public void setTelefonecliente(String telefonecliente) {
		this.telefonecliente = telefonecliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelularcliente() {
		return celularcliente;
	}

	public void setCelularcliente(String celularcliente) {
		this.celularcliente = celularcliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
}
