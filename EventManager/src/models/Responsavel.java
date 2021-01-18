package models;

public class Responsavel {
	private String nomeCompleto;
	private String telefone;
	private double valorHora;
	
	public Responsavel(String nomeCompleto, String telefone, double valorHora) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.valorHora = valorHora;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
}
