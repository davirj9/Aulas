package br.com.estruturaderepeticao;

public class ForBreak {
	
	public static void main(String[] args) {
		String nomes[] = {"Davi", "Costa", "Ma�ana"};
		String nomeProcurado = "Davi";
		boolean isNomeAchado = false;
		
		for (int i = 0; i < nomes.length; i ++) {
			if(nomes[i].equals(nomeProcurado)) {
				isNomeAchado = true;
				break;
			}
		}
		if (isNomeAchado) {
			System.out.println("Foi encontrado o nome: " + nomeProcurado);
		} else {
			System.out.println("N�o foi encontrado o nome: " + nomeProcurado);
		}

	}
	
}
