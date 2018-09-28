/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 */
public class Moto extends Veiculo {
	
	private static int qtdMotos; 
	
	public Moto(String cor, String modelo, String segmento) {
		super(cor, modelo, segmento);
		qtdMotos ++;
	}

	public static int getQtdMotos() {
		return qtdMotos;
	}

	public static void setQtdMotos(int qtdMotos) {
		Moto.qtdMotos = qtdMotos;
	}
}
