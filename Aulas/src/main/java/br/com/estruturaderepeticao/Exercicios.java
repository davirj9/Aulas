package br.com.estruturaderepeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		System.out.println("Qual exerc�cio deseja executar ?");
		Scanner scanner = new Scanner(System.in);
		int exerc = scanner.nextInt();
		
		if (exerc == 1) {
			exercicio01();
		} else if (exerc == 2) {
			exercicio02();
		}
	}
	private static void exercicio02() {
		Random rnd = new Random(); 
		int valorRandom = rnd.nextInt(10);
		
		System.out.println("Foi gerado um n�mero aleat�rio de 0 a 10, d� o seu chute, voc� ter� 5 chances !");
		boolean isCerto = false ;
		for (int i = 0; i <= 10; i ++) {
			System.out.println("Tentativa n�mero " + i +", informe seu n�mero:");
			Scanner scanner = new Scanner(System.in);
			int chute = scanner.nextInt();
			if (chute == valorRandom) {
				System.out.println("Parab�ns, voc� acertou !!");
				break;
			} else {
				System.out.println("Tente novamente.");
			}
		}
	}
	private static void exercicio01() {
		System.out.println("Infome uma nota:");
		Scanner scanner = new Scanner(System.in);
		double nota = scanner.nextDouble();
		
		if (nota >0 && nota <= 10) {
			System.out.println("Voc� digitou a nota" + nota);
		} else {
			System.out.println("Nota inv�lida, digite novamente.");
		}
	}

}
