package br.com.javabank.testbankjava.exececoes;

import br.com.javabank.testbankjava.exececoes.ContaException;

public class ContaException extends Exception {
	
	public ContaException() {
		
	}
	
	public ContaException(String s) {
		super(s);
	}

}
