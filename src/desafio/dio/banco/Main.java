package desafio.dio.banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente jessika = new Cliente(); 
		
		jessika.setNome("jessika");
		
		Conta cc = new ContaCorrente(jessika);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(jessika);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
	}

}
