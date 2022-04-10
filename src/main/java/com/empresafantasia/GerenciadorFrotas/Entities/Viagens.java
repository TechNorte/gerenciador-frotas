package com.empresafantasia.GerenciadorFrotas.Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_viagens")
public class Viagens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String horario_saida;
	private String horario_chegada;
	private Long hodometro_saida;
	private Long hodometro_chegada;
	private String destino;
	private String solicitante;
	
	@ManyToOne
	@JoinColumn(name = "motorista_id")
	private Motorista motorista;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	public Viagens() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHorario_saida() {
		return horario_saida;
	}

	public void setHorario_saida(String horario_saida) {
		this.horario_saida = horario_saida;
	}

	public String getHorario_chegada() {
		return horario_chegada;
	}

	public void setHorario_chegada(String horario_chegada) {
		this.horario_chegada = horario_chegada;
	}

	public Long getHodometro_saida() {
		return hodometro_saida;
	}

	public void setHodometro_saida(Long hodometro_saida) {
		this.hodometro_saida = hodometro_saida;
	}

	public Long getHodometro_chegada() {
		return hodometro_chegada;
	}

	public void setHodometro_chegada(Long hodometro_chegada) {
		this.hodometro_chegada = hodometro_chegada;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	

}
