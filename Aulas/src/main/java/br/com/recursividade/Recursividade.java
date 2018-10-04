package br.com.recursividade;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(Fatorial.fat(5));
		
		int[] vetor = {1,2,3,4,5};
		int resultado = somaVetor(vetor, 0);
		System.out.println(resultado);
	}
	static class Fatorial{
		static int fat(int n) {
			if(n<=1) {
				return 1;
			}
			int r = fat(n-1)*n;
			return r;
		}
	}
	
	static int somaVetor(int[] vetor, int i){
		if (i < vetor.length) {
			return vetor[i] + somaVetor(vetor, i+1);
		} else {
			return 0;
		}	
	}
}
