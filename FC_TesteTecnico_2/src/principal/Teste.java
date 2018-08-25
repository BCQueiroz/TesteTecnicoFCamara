package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

  public static void main(String[] args) {
	int valorInicial,valorFinal;
	
	Scanner alfa = new Scanner(System.in);
	while(true) {
		try {
			do {
				System.out.println("Digite o valor inicial do intervalo: ");
				valorInicial = alfa.nextInt();
				if(valorInicial<0) {
					System.out.println("Digite um valor maior que zero, por favor.");
				}
			}while(valorInicial<0);
			break;
		}catch(InputMismatchException erro) {
			System.out.println("Por favor, digite um valor inteiro valido para continuar.");
			alfa.next();
			continue;
		}
	}
	while(true) {
		try {
			do {
				System.out.println("Digite o valor final do intervalo: ");
				valorFinal = alfa.nextInt();
				if(valorFinal<valorInicial) {
					System.out.println("Valor invalido, digite um valor maior que o valor inicial,"
							+ " por favor.");
				}
			}while(valorFinal<valorInicial);
			break;
		}catch(InputMismatchException erro) {
			System.out.println("Por favor, digite um valor inteiro valido para continuar.");
			alfa.next();
			continue;
		}
	}
	
	NumeroPrimo x = new NumeroPrimo(valorInicial,valorFinal);
	x.criaListaPrimos();
	alfa.close();
  }
}
