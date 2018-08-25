package principal;

public class ContaCorrente {
	
	private int numeroConta;
	private String nomeCorrentista;
	private double saldo = 0;
	
	
	ContaCorrente(String nomeCorrentista,int numeroConta,double saldo){
		this.nomeCorrentista=nomeCorrentista;
		this.numeroConta=numeroConta;
		this.saldo = saldo;
	}
	
	public void alterarNome(String novoNome) {
		nomeCorrentista = novoNome;
		System.out.println("Nome alterado, novo nome é: "+nomeCorrentista);
	}
	
	public void deposito(double vlDeposito) {
		saldo+=vlDeposito;
		System.out.printf("Transação bem sucedida, saldo atual é %.2f reais. \n",saldo);
	}
	
	public void saque(double vlSaque) {
		if(vlSaque>saldo) {
			System.out.printf("Perdão, o senhor(a) não possui saldo para efetuar essa transação,"
					+ "seu saldo atual é %.2f reais. \n ",saldo);
		}else {
			saldo-=vlSaque;
			System.out.printf("Transação bem sucedida, saldo atual é %.2f reais \n",saldo);
		}
	}
}
