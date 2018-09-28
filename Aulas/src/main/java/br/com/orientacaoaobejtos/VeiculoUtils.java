/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 */
public class VeiculoUtils {
	
	public static void virarChave(String acao, Veiculo veiculo) {
		switch(acao) {
			case Constantes.LIGAR:
				ligarVeiculo(veiculo);
				break;
			case Constantes.DESLIGAR:
				desligarVeiculo(veiculo);
				break;
			default:
				System.out.println(Constantes.MSG_OPCAO_INVALIDA);
				break;
		}
	}
	
	private static void ligarVeiculo(Veiculo veiculo) {
		if (veiculo.isLigado()) {
			System.out.println(Constantes.MSG_ERRO_LIGADO);
		} else {
			veiculo.setLigado(true);
			System.out.println(Constantes.MSG_SUCESSO_LIGADO);
		}
	}
	
	private static void desligarVeiculo(Veiculo veiculo) {
		if (veiculo.isLigado()) {
			veiculo.setLigado(true);
			System.out.println(Constantes.MSG_SUCESSO_DESLIGADO);
		} else {
			System.out.println(Constantes.MSG_ERRO_DESLIGADO);
		}
	}
}
