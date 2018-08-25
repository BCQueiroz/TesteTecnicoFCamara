package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		double salMin;
		int qtHoraTrab;
		
		Scanner a = new Scanner(System.in);
		while(true) {
			try {
				do {
					System.out.println("Digite o salario minimo: ");
					salMin = a.nextDouble();
					if(salMin<=0) {
						System.out.println("Digite um valor positivo, por favor.");
					}	
				}while(salMin<=0);
				break;
			}catch(InputMismatchException erro) {
				System.out.println("Digite um valor de salario valido, por favor.");
				a.next();
				continue;
			}
		}
		while(true) {
			try {
				do {
					System.out.println("Digite a quantidade de horas trabalhadas");
					qtHoraTrab = a.nextInt();
					if(qtHoraTrab<=0) {
						System.out.println("Digite um valor positivo, por favor.");
					}	
				}while(qtHoraTrab<=0);
				break;
			}catch(InputMismatchException erro) {
				System.out.println("Digite uma quantidade de horas valida, por favor.");
				a.next();
				continue;
			}
		}
		Salario alfa = new Salario(salMin,qtHoraTrab);
		alfa.CalcSalarioReceber();
		System.out.printf("O salario a receber é: %.2f",alfa.getSalarioReceber());
		
		a.close();
	}
}
