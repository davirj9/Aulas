/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 */
public abstract class Veiculo {

	private String cor;
	private String modelo;
	private String segmento;
	private boolean isLigado = false;
	private static int qtdVeiculos;
	
	public Veiculo(String cor, String modelo, String segmento) {
		this.cor = cor;
		this.modelo = modelo;
		this.segmento = segmento;
		qtdVeiculos ++;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public static int getQtdVeiculos() {
		return qtdVeiculos;
	}

	public static void setQtdVeiculos(int qtdVeiculos) {
		Veiculo.qtdVeiculos = qtdVeiculos;
	}
}
