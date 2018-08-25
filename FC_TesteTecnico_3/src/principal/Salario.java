package principal;

public class Salario {	
	private double salarioMinimo;
	private int qtHorasTrabalhadas;
	private double salarioBruto;
	private double salarioReceber;
	private final double IMPOSTO = 0.03;
	
	Salario(double salarioMinimo,int qtHorasTrabalhadas){
		this.salarioMinimo = salarioMinimo;
		this.qtHorasTrabalhadas = qtHorasTrabalhadas;
	}
	
	//Na linha 18, salarioMinimo*0.1 calcula o valor da hora trabalhada
	public void CalcSalarioReceber() {
		salarioBruto = (salarioMinimo*0.1)*qtHorasTrabalhadas;
		salarioReceber = salarioBruto - (salarioBruto*IMPOSTO); 
	}

	public double getSalarioReceber() {
		return salarioReceber;
	}
	
	
}
