package br.com.stf.treinamento.exercicios.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public final class JavaCurrencyFormatter {

	private JavaCurrencyFormatter() {}
	
	public static void executar() {
		Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        scanner.close();
        
		formatar(valor);
	}
	
	private static void formatar(double numero) {
		formatarMoeda(numero,Locale.US.getLanguage(), Locale.US.getCountry());
		formatarMoeda(numero,Locale.US.getLanguage(), "in");	
		formatarMoeda(numero,Locale.CHINA.getLanguage(), Locale.CHINA.getCountry());
		formatarMoeda(numero,Locale.FRANCE.getLanguage(), Locale.FRANCE.getCountry());
		
	}

	private static void formatarMoeda(double numero,String linguagem,String pais) {
		Locale locale = new Locale(linguagem, pais);      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(pais + ": " + currencyFormatter.format(numero));
	}

}
