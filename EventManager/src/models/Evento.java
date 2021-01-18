package models;

import java.util.Calendar;

public class Evento {
	private String nome;
	private Calendar dataInicio;
	private Calendar dataFim;
	private int cargaHorarioTotal;
	private Palestra[] palestra;
	private Responsavel  responsavel;
	
	public Evento(String nome, Calendar dataInicio, Calendar dataFim, int cargaHorarioTotal, Palestra[] palestra,
			Responsavel responsavel) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cargaHorarioTotal = cargaHorarioTotal;
		this.palestra = palestra;
		this.responsavel = responsavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public int getCargaHorarioTotal() {
		return cargaHorarioTotal;
	}

	public void setCargaHorarioTotal(int cargaHorarioTotal) {
		this.cargaHorarioTotal = cargaHorarioTotal;
	}

	public Palestra[] getPalestra() {
		return palestra;
	}

	public void setPalestra(Palestra[] palestra) {
		this.palestra = palestra;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public double calculaValorGastoResponsavel() {
		return cargaHorarioTotal * responsavel.getValorHora();
	}
	
public double calculaValorGastoPalestras() {
		
		double totalGastoPalestra = 0;
		for(int i = 0; i < palestra.length; i++) {
			totalGastoPalestra = totalGastoPalestra + calculaValorGastoPalestra(i);;
		}
		return totalGastoPalestra;
	}
	
	public double calculaValorGastoPalestra(int index) {
		if(index < 0 || index >= palestra.length) {
			System.out.println("Índice "+index+" invalido"+" digite um valor entre 0 e "+(palestra.length -1));
			return -1;
		}
		return palestra[index].calculaValorPalestra();
	}
	
	public Palestrante calculaPalestranteComMaiorValor() {
		
		Palestra palestraMaiorValor = palestra[0];
		
		for(int i = 1; i < palestra.length; i++) {
			if(palestra[i].calculaValorPalestra() > palestraMaiorValor.calculaValorPalestra()) {
				palestraMaiorValor = palestra[i];
			}
		}
		return palestraMaiorValor.getPalestrante();
	}
	
	public Palestrante calculaPalestranteComMenorValor() {
		
		Palestra palestraMaiorValor = palestra[0];
		
		for(int i = 1; i < palestra.length; i++) {
			if(palestra[i].calculaValorPalestra() < palestraMaiorValor.calculaValorPalestra()) {
				palestraMaiorValor = palestra[i];
			}
		}
		return palestraMaiorValor.getPalestrante();
	}
	
}
