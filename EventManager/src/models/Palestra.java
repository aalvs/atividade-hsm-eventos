package models;

import java.time.LocalTime;

public class Palestra {
	private String titulo;
	private String descricao;
	private LocalTime horarioInicio;
	private int cargaHoraria;
	private Palestrante palestrante;
	
	public Palestra(String titulo, String descricao, LocalTime horarioInicio, int cargaHoraria,
			Palestrante palestrante) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.horarioInicio = horarioInicio;
		this.cargaHoraria = cargaHoraria;
		this.palestrante = palestrante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}
	
	public double calculaValorPalestra() {
		return getCargaHoraria() * getPalestrante().getValorHora();
	}

}
