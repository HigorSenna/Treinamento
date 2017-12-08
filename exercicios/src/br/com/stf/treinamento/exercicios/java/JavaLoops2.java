package br.com.stf.treinamento.exercicios.java;

import java.util.Scanner;

public final class JavaLoops2 {
	public static void executar() {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			Double resultado = new Double(a);
			for (int j = 0; j < n; j++) {
				resultado = resultado + (Math.pow(2, j) * b);
				System.out.print(resultado.intValue() + " ");
			}
			System.out.println("");
		}
		in.close();
	}
}
