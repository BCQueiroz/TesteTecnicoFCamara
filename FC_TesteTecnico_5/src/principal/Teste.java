package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int numConta;
		String nome;
		double valor;
		
		Scanner alfa = new Scanner(System.in);
		while(true) {
			try {
				do {
				System.out.println("Digite o numero da conta: ");
				numConta=alfa.nextInt();
				if(numConta<=0) {
					System.out.println("Digite um numero valido, por favor.");
					}	
				}while(numConta<=0);
				break;
			}catch(InputMismatchException erro) {
				System.out.println("Digite um numero valido, por favor.");
				alfa.next();
				continue;
			}
		}
		System.out.println("Digite o nome do correntista: ");
		nome = alfa.next();
		
		while(true) {
			try {
				do {
					System.out.println("Digite o valor para ser depositado: ");
					valor = alfa.nextDouble();
					if(valor<0) {
						System.out.println("Digite um valor valido, por favor.");
						}	
					}while(valor<0);
			break;
		}catch(InputMismatchException erro) {
			System.out.println("Digite um valor valido, por favor.");
			alfa.next();
			continue;
		}
	}	
		ContaCorrente x = new ContaCorrente(nome,numConta,valor);
		x.alterarNome("Ariel");
		x.deposito(300.90);
		x.saque(260.5);
		x.deposito(500.00);
		alfa.close();
	}
}
