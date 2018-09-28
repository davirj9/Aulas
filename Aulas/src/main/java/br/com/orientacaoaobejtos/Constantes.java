/**
 * 
 */
package br.com.orientacaoaobejtos;

/**
 * @author DaviMacana
 *
 */
public abstract class Constantes {
	
	private Constantes() {
	    throw new IllegalStateException("classe utilitária de menssagens !");
	} 

	public static final String LIGAR = "LIGAR";
	public static final String DESLIGAR = "DESLIGAR";
	public static final String MSG_ERRO_LIGADO = "O veículo já está ligado !";
	public static final String MSG_ERRO_DESLIGADO = "O veículo já está desligado !";
	public static final String MSG_SUCESSO_LIGADO = "Vraaau, você ligou o motor !";
	public static final String MSG_SUCESSO_DESLIGADO = "Você desligou o motor !";
	public static final String MSG_OPCAO_INVALIDA = "Opção inválida !";
}
