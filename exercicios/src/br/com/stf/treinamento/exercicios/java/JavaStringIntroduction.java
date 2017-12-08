package br.com.stf.treinamento.exercicios.java;

import java.util.Scanner;

public final class JavaStringIntroduction {
	//FALAR SOBRE CLASSE FINAL E CONSTRUTOR PRIVADO
	//lexicograficamente -> se são a mesma palavra
	
	private JavaStringIntroduction() {}
	
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
		int somaTamanho = 0;
		String resposta = "";

		System.out.println("Digite a primeira palavra:");
		String a = scanner.nextLine();

		System.out.println("Digite a segunda palavra:");
		String b = scanner.nextLine();
		
		resposta = obterResposta(a, b);
		somaTamanho = somarTamanhoStrings(a, b);

		System.out.print(somaTamanho + "\n" + resposta + "\n" + capitalize(a, b));
		scanner.close();
	}

	private static String obterResposta(String a, String b) {
		String resposta;
		if (a.compareTo(b) == 0) {
			resposta = "Sim";
		} else {
			resposta = "Não";
		}
		return resposta;
	}

	private static int somarTamanhoStrings(String primeiraString, String segundaString) {
		if (primeiraString != null && segundaString != null) {
			return primeiraString.length() + segundaString.length();
		}

		return 0;
	}

	private static String capitalize(String nome1, String nome2) {
		nome1 = Character.toUpperCase(nome1.charAt(0)) + nome1.substring(1);
		nome2 = Character.toUpperCase(nome2.charAt(0)) + nome2.substring(1);

		return nome1 + " " + nome2;
	}
}
