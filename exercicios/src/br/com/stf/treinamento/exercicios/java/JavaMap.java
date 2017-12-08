package br.com.stf.treinamento.exercicios.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class JavaMap {

	private JavaMap() { }
	
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
		Integer tamanho = scanner.nextInt();
		Map<String,String> pessoasTelefones = new HashMap<>(tamanho);
		
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite um nome:");
			String nome = scanner.next();
			
			System.out.println("Digite um telefone:");
			String telefone = scanner.next();
			
			pessoasTelefones.put(nome, telefone);
		}
		
		realizarBuscaTelefone(scanner, pessoasTelefones);
		
		scanner.close();
	}

	private static void realizarBuscaTelefone(Scanner scanner, Map<String, String> pessoasTelefones) {
		System.out.println("Pesquise uma pessoa :");
		String nome = scanner.next();
		
		if(pessoasTelefones.get(nome) == null || pessoasTelefones.get(nome).trim() == "") {
			System.out.println("Sem telefone");
		}
		else {
			System.out.println(pessoasTelefones.get(nome));
		}
	}

}
