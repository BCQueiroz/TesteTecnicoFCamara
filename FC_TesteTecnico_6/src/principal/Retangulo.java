package principal;

public class Retangulo {

	private double LadoA, LadoB;
	private final double PISO=0.25,RODAPE=0.1;
	
	Retangulo(double LadoA,double LadoB){
		this.LadoA = LadoA;
		this.LadoB = LadoB;
	}
	
	public void MudarValorLados(double a,double b) {
		LadoA = a;
		LadoB = b;
	}

	public double getLadoA() {
		return LadoA;
	}

	public double getLadoB() {
		return LadoB;
	}
	
	public double CalcArea() {
		return LadoA*LadoB;
	}
	
	public double CalcPerimetro() {
		return LadoA*2+LadoB*2;
	}
	
	public double calcQuantPiso() {
		return CalcArea()/PISO;
	}
	
	public double calcRodape() {
		return (LadoA/RODAPE*4)+(LadoB/RODAPE*4);
	}
}
