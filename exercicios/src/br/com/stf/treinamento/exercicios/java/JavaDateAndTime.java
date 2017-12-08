package br.com.stf.treinamento.exercicios.java;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public final class JavaDateAndTime {

	public static void executar() {
		
		Scanner scanner = new Scanner(System.in);
		String month = scanner.next();
		String day = scanner.next();
		String year = scanner.next();

		System.out.println(getDay(day, month, year));
		
		scanner.close();
	}
	
	public static String getDay(String dia,String mes,String ano) {
		Locale locale = Locale.getDefault();
		return LocalDate.of(Integer.parseInt(ano),Integer.parseInt(mes), Integer.parseInt(dia))
						.getDayOfWeek()
						.getDisplayName(TextStyle.FULL, locale);
	}
}
