package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		double med1,med2;
		int opc;
		Scanner alfa = new Scanner(System.in);
		
		while(true) {
			try {
				do {
					System.out.println("Informe a primeira medida do local, por favor: ");
					med1 = alfa.nextDouble();
					if(med1<=0) {
						System.out.println("Digite uma medida valida, por favor.");
						}	
					}while(med1<=0);
					break;
				}catch(InputMismatchException erro) {
					System.out.println("Digite um valor valido, por favor.");
					alfa.next();
					continue;
				}
			}
		while(true) {
			try {
				do {
				System.out.println("Agora informe a segunda medida, por favor: ");
				med2 = alfa.nextDouble();
				if(med2<=0) {
					System.out.println("Digite uma medida valida, por favor.");
					}	
				}while(med2<=0);
				break;
			}catch(InputMismatchException erro) {
				System.out.println("Digite um valor valido, por favor.");
				alfa.next();
				continue;
			}
		}
		
		Retangulo terreno = new Retangulo(med1,med2);
		do {
			System.out.println("\nO que deseja fazer agora?\n"
					+ "1-CALCULAR A AREA DO LOCAL\n"
					+ "2-CALCULAR O PERIMETRO DO LOCAL\n"
					+ "3-VERIFICAR A MEDIDA DOS LADOS\n"
					+ "4-MUDAR A MEDIDA DOS LADOS\n"
					+ "5-MOSTRAR TODAS AS ESPECIFICAÇÕES DO LOCAL\n"
					+ "6-CALCULAR QUANTIDADE DE PISOS NECESSARIA\n"
					+ "7-CALCULAR A QUANTIDADE DE RODAPES NECESSARIA\n"
					+ "8-SAIR DA APLICAÇÃO\n");
			while(true) {
				try {
					do {
						opc=alfa.nextInt();
					}while(med2<=0);
					break;
				}catch(InputMismatchException erro) {
					System.out.println("Digite um valor valido, por favor.");
					alfa.next();
				continue;
				}
			}
			switch (opc) {
			case 1:
				System.out.println("A area do local: "+terreno.CalcArea());
				break;
			case 2:
				System.out.println("O perimetro do local: "+terreno.CalcPerimetro());
				break;
			case 3:
				System.out.println("Primeira medida: "+terreno.getLadoA());
				System.out.println("Segunda medida: "+terreno.getLadoB());
				break;
			case 4:
				System.out.println("Digite a nova medida do primeiro lado: ");
				med1=alfa.nextDouble();
				System.out.println("Digite a nova medida do segundo lado: ");
				med2=alfa.nextDouble();
				terreno.MudarValorLados(med1, med2);
				break;
			case 5: 	
				System.out.println("De acordo com as medidas informadas, as especificações do local são as seguintes: ");
				System.out.println("Primeira medida: "+terreno.getLadoA());
				System.out.println("Segunda medida: "+terreno.getLadoB());
				System.out.println("O perimetro do local: "+terreno.CalcPerimetro());
				System.out.println("A area do local: "+terreno.CalcArea());
				break;
			case 6: 
				System.out.println("Quantidade de pisos: "+terreno.calcQuantPiso());
				break;
			case 7:
				System.out.println("Quantidade de rodape: "+terreno.calcRodape());
				break;
			case 8:
				System.out.println("Obrigado por usar nosso serviço.");
				break;
			default: 
				System.out.println("Opção invalida.");
			}
		}while(opc!=8);
		
	alfa.close();
	}
}
