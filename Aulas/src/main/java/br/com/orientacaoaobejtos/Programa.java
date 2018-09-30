/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Veiculo carro = new Carro("Preto", "Evoque", "SUV");
		System.out.println("Carro criado:");
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Segmento: " + carro.getSegmento());
		
		VeiculoUtils.virarChave(Constantes.LIGAR, carro);
		VeiculoUtils.virarChave(Constantes.DESLIGAR, carro);
		
		System.out.println("----------------------------------------------------");
		
		Veiculo moto = new Moto("Preto", "Harley Davidson 883", "Custom");
		System.out.println("Moto criada:");
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Segmento: " + moto.getSegmento());
		
		VeiculoUtils.virarChave(Constantes.LIGAR, moto);
		VeiculoUtils.virarChave(Constantes.DESLIGAR, moto);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Foram criados " + Moto.getQtdMotos() + " Motos.");
		System.out.println("Foram criados " + Carro.getQtdCarros() + " Carros.");
		System.out.println("Foram criados " + Veiculo.getQtdVeiculos() + " Veículos.");
		
		
	}

}
