package principal;

public class LojaTintas {

	private double areaPintura;
	private int quantLatas;
	private double precoTotal;
	private double quantTinta;
	
	LojaTintas(double areaPintura){
		this.areaPintura=areaPintura;
	}
	
	public void CalcCusto() {
	//Primeiro calcula quantos litros de tinta ser� necessaria com base na area informada pelo usuario
	//Depois, descobre a quantidade de latas de tinta necess�rias, e a fun��o Math.Ceil arrendonda o valor
	//para o cima, retornando um double que pode ser convertido para um valor inteiro
	//Por fim, � calculado o pre�o total com base no pre�o unitario da lata de tinta e da quantidade necess�ria
		quantTinta=areaPintura/3;
		quantLatas=(int)Math.ceil(quantTinta/18);
		precoTotal = quantLatas*80.00;
	}

	public int getQuantLatas() {
		return quantLatas;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}
	
	
	
}
