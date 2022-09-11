package entities;

import exceptions.ContaException;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;

	public Conta(int agencia, int numero){
		if(agencia < 1) {
			throw new IllegalArgumentException(
					"Agência definida é inválida.");
		}
		if(numero < 1) {
			throw new IllegalArgumentException(
					"Número da conta é inválido.");
		}
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) throws 
	ContaException {
		if(this.saldo < valor) {
			throw new ContaException(
					"Saldo Atual: " + this.saldo + ", Valor Solicitado: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws 
	ContaException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo(){
		return this.saldo;
	}

	public int getNumero(){
		return this.numero;
	}

	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia(){
		return this.agencia;
	}

	public void setAgencia(int agencia){
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public static int getTotal(){
		return Conta.total;
	}

}
