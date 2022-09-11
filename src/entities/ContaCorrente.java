 package entities;

import exceptions.ContaException;

public class ContaCorrente extends Conta implements Tributacao{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }
    
    @Override
    public void saca(double valor) throws ContaException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

	@Override
	public double getValorImposto() {
		System.out.println("Calculando imposto de: " + super.getNumero());
		if(super.getSaldo() >= 5000.0) {			
			return super.getSaldo() * 0.1; //10% do saldo
		}
		return super.getSaldo() * 0.05; //5% do saldo
	}    
    
}
