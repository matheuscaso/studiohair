package com.projects.studiohair.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agendamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idagendamento;
	private Date dataagendamento;
	private Date horaagendamento;
	private Double valoragendamento;
	
	@OneToMany(mappedBy = "agendamento_funcionario")
	
	public void registrarAgendamento() {
		
	}
	
	public void alterar() {
		
	}
	
	public void cancelar() {
		
	}
	
	public List<Agendamento> agendamentos = new ArrayList<>();
	
	public void carregarPorIdagendamento(Integer idagendamento) {
		this.idagendamento = idagendamento;
	}

	public Agendamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agendamento(Integer idagendamento, Date dataagendamento, Date horaagendamento, Double valoragendamento,
			List<Agendamento> agendamentos) {
		super();
		this.idagendamento = idagendamento;
		this.dataagendamento = dataagendamento;
		this.horaagendamento = horaagendamento;
		this.valoragendamento = valoragendamento;
		this.agendamentos = agendamentos;
	}

	public Integer getIdagendamento() {
		return idagendamento;
	}

	public void setIdagendamento(Integer idagendamento) {
		this.idagendamento = idagendamento;
	}

	public Date getDataagendamento() {
		return dataagendamento;
	}

	public void setDataagendamento(Date dataagendamento) {
		this.dataagendamento = dataagendamento;
	}

	public Date getHoraagendamento() {
		return horaagendamento;
	}

	public void setHoraagendamento(Date horaagendamento) {
		this.horaagendamento = horaagendamento;
	}

	public Double getValoragendamento() {
		return valoragendamento;
	}

	public void setValoragendamento(Double valoragendamento) {
		this.valoragendamento = valoragendamento;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idagendamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(idagendamento, other.idagendamento);
	}
	
	
}
