package br.com.stf.treinamento.exercicios.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class JavaExceptionHandling {

	private JavaExceptionHandling() {
	}
	
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
		try {
			int valor1 = scanner.nextInt();
			int valor2 = scanner.nextInt();
			scanner.close();
			int resultado = valor1/valor2;
			System.out.println(resultado);
		} 
		catch (InputMismatchException e) {
			throw new InputMismatchException(e.getClass() + " by: /zero");
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
