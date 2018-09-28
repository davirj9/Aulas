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
	    throw new IllegalStateException("classe utilit�ria de menssagens !");
	} 

	public static final String LIGAR = "LIGAR";
	public static final String DESLIGAR = "DESLIGAR";
	public static final String MSG_ERRO_LIGADO = "O ve�culo j� est� ligado !";
	public static final String MSG_ERRO_DESLIGADO = "O ve�culo j� est� desligado !";
	public static final String MSG_SUCESSO_LIGADO = "Vraaau, voc� ligou o motor !";
	public static final String MSG_SUCESSO_DESLIGADO = "Voc� desligou o motor !";
	public static final String MSG_OPCAO_INVALIDA = "Op��o inv�lida !";
}
