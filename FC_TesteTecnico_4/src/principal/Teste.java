package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
	double area;
	Scanner alfa = new Scanner(System.in);
	while(true) {
		try {
			do {
				System.out.println("Digite a area em metros quadrados que ser� pintada:  ");
				area = alfa.nextDouble();
				if(area<=0) {
					System.out.println("Digite um valor valido, por favor.");
				}	
			}while(area<=0);
			break;
		}catch(InputMismatchException erro) {
			System.out.println("Digite uma �rea valida, por favor.");
			alfa.next();
			continue;
			}
		}
		LojaTintas x = new LojaTintas(area);
		x.CalcCusto();
		System.out.println("A quantidade de latas de tintas necess�ria ser�: "+x.getQuantLatas());
		System.out.printf("O pre�o total da tinta ser� %.2f reais",x.getPrecoTotal());
		alfa.close();
	}
}
