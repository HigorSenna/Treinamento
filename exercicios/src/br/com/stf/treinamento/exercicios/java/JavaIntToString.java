package br.com.stf.treinamento.exercicios.java;

import java.util.Scanner;

public final class JavaIntToString {
	
	private JavaIntToString(){}
	
	public static void executar() {
		// Solução
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		String s = String.valueOf(n);
		
		System.out.println("Solução : " + "String s = String.valueOf(n)");
	}
}
