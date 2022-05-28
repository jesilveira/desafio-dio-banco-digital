package desafio.dio.banco;

public interface Iconta {
	
		 void sacar(double valor);
		
		 void depositar(double valor);
		
		 void transferir(double Valor, Conta contaDestino);
		 
		 void imprimirExtrato();		 

}
