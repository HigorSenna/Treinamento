package br.com.stf.treinamento.exercicios.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class JavaList {

	private JavaList() { }
	
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numeros = popular(scanner);
		adicionarElementoEspecifico(scanner, numeros);
		removerElementoEspecifico(scanner, numeros);
		scanner.close();
	}

	private static List<Integer> popular(Scanner scanner) {
		
		System.out.println("Tamanho inicial da lista: ");
		int tamanhoInicial = scanner.nextInt();
		List<Integer> numeros = new ArrayList<>(tamanhoInicial);
		
		for(int i=0 ; i<tamanhoInicial; i++) {
			System.out.println("Adicione um elemento: ");
			numeros.add(scanner.nextInt());
		}
		imprimir(numeros);
		return numeros;
	}

	private static void removerElementoEspecifico(Scanner scanner, List<Integer> numeros) {
		System.out.println("Remova um elemento especifico : posição");
		numeros.remove(scanner.nextInt());
		
		imprimir(numeros);
	}

	private static void adicionarElementoEspecifico(Scanner scanner, List<Integer> numeros) {
		System.out.println("Adicione um elemento especifico : posição,elemento");
		numeros.add(scanner.nextInt(), scanner.nextInt());
		
		imprimir(numeros);
	}
	
	private static void imprimir(List<Integer> numeros) {
		System.out.print("[ ");
		numeros.forEach(numero -> {
			System.out.print("");
			System.out.print(numero);
		});
		System.out.println(" ] \n \n");
		
	}

}
