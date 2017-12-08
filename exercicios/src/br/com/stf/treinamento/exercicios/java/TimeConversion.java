package br.com.stf.treinamento.exercicios.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class TimeConversion {
	
	private TimeConversion() {}
	
	public static void executar() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String tempo = scanner.next();
		scanner.close();
		
		Date date = obterData24Horas(tempo);
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		System.out.println(formatter.format(date));
	}

	private static Date obterData24Horas(String tempo) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
		Date date = sdf.parse(tempo);
		return date;
	}
}
