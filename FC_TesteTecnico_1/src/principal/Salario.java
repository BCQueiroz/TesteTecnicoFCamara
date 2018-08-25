package principal;

public class Salario {

	private double sal;
	private double percAumentoAnual=1.5;
	
	Salario(double sal){
		this.sal=sal;
	}
	
	public void calcSalarioAtual() {
		for(int ano=2006;ano<=2018;ano++) {
				sal = sal+(sal*(percAumentoAnual/100));
				percAumentoAnual*=2;
		}
		System.out.printf("Seu salario atual é: %.2f",sal);
	}
}
