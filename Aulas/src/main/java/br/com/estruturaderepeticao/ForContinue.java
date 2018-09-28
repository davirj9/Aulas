package br.com.estruturaderepeticao;

public class ForContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i ++) {
			if (i%2!=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
