package principal;
import java.util.ArrayList;

public class NumeroPrimo {

	private int vlInicial,vlFinal,qtDivisor;
	private ArrayList<Integer> numPrimos = new ArrayList<Integer>();
	
	NumeroPrimo(int vlInicial,int vlFinal){
		this.vlInicial=vlInicial;
		this.vlFinal=vlFinal;
	}
	//Função que adiciona o numero verificado ao ArrayList numPrimos caso o valor retornado 
	//da função verificaNumero seja 2(Se for maior que 2 o numero em questão não é primo)
	public void criaListaPrimos() {
		for(int b=vlInicial;b<=vlFinal;b++) {
			if(verificaNumero(b)==2) {
				numPrimos.add(b);
			}
			qtDivisor=0;
		}
		mostraNumPrimos();
	}
	
	//Função para verificar se um numero é primo
	public int verificaNumero(int parametroAtual) {
		for(int a=1;a<=parametroAtual;a++) {
			if(parametroAtual%a==0) {
				qtDivisor+=1;
			}
		}
		return qtDivisor;
	}
	
	public void mostraNumPrimos() {
		System.out.print("Numeros primos no intervalo: ");
		for(int i=0;i<numPrimos.size();i++) {
			System.out.print(numPrimos.get(i)+" ");
		}		
	}
}
