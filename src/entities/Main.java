package entities;

public class Main {

	public static void main(String[] args) {
		
		try {
			ContaCorrente contaCorrente = new ContaCorrente(111, 111);
			ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);     

			contaCorrente.deposita(100.0);
			contaPoupanca.deposita(200.0);
			System.out.println("Saldo contaPoupanca: " + contaPoupanca.getSaldo());
			System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo() + "\n");

			contaCorrente.transfere(12310.0, contaPoupanca);
		}catch(Exception e) {
			System.out.println("Ocorreu um erro: " + "\n" + e.getMessage() + "\n");
		}		

	}

}
