package entities;

public class CoreImposto {

	public static void main(String[] args) {
		
		ContaCorrente contaEmanuel = new ContaCorrente(1465, 514204);
		contaEmanuel.deposita(2000.0);
		
		ContaCorrente contaMaria = new ContaCorrente(222, 999);
		contaMaria.deposita(4000.0);
		
		CalculadorImposto calculaImposto = new CalculadorImposto();
		calculaImposto.registra(contaEmanuel);
		System.out.println(calculaImposto.getTotalImposto());

		calculaImposto.registra(contaMaria);
		System.out.println(calculaImposto.getTotalImposto());
	}

}
 