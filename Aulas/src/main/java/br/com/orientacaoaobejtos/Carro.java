/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 * 
 * 
 */
public class Carro extends Veiculo {
	
	private static int qtdCarros;
	
	public Carro(String cor, String modelo, String segmento) {
		super(cor, modelo, segmento);
		qtdCarros ++;
	}

	public static int getQtdCarros() {
		return qtdCarros;
	}

	public static void setQtdCarros(int qtdCarros) {
		Carro.qtdCarros = qtdCarros;
	}
}
