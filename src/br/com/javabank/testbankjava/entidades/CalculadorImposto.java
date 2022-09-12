package br.com.javabank.testbankjava.entidades;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributacao tributacao) {
		double valor = tributacao.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
