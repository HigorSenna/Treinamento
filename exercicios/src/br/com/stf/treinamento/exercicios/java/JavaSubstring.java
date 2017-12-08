package br.com.stf.treinamento.exercicios.java;

import java.util.Scanner;

public final class JavaSubstring {

	private JavaSubstring() {
	}

	public static void executar() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		
		System.out.println(s.substring(start,end));
	}

}
