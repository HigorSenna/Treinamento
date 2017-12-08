package br.com.stf.treinamento.exercicios;

import java.text.ParseException;

import br.com.stf.treinamento.exercicios.java.JavaCurrencyFormatter;
import br.com.stf.treinamento.exercicios.java.JavaDateAndTime;
import br.com.stf.treinamento.exercicios.java.JavaIntToString;
import br.com.stf.treinamento.exercicios.java.JavaList;
import br.com.stf.treinamento.exercicios.java.JavaLoops2;
import br.com.stf.treinamento.exercicios.java.JavaMap;
import br.com.stf.treinamento.exercicios.java.JavaStringIntroduction;
import br.com.stf.treinamento.exercicios.java.JavaStringReverse;
import br.com.stf.treinamento.exercicios.java.JavaSubstring;
import br.com.stf.treinamento.exercicios.java.TimeConversion;
import br.com.stf.treinamento.exercicios.java.abstrct.LivroComedia;
import br.com.stf.treinamento.exercicios.java.heranca.Passaro;
import br.com.stf.treinamento.exercicios.java.sobrescrita.Esporte;
import br.com.stf.treinamento.exercicios.java.sobrescrita.Futebol;

public class Principal {
	 public static void main(String[] args) throws ParseException {
		 JavaStringIntroduction.executar();
		 JavaLoops2.executar();
		 JavaIntToString.executar();
		 JavaDateAndTime.executar();
		 JavaCurrencyFormatter.executar();
		 JavaSubstring.executar();
		 JavaStringReverse.executar();
		 JavaList.executar();
		 JavaMap.executar();
		 new Passaro().executar();
		 new LivroComedia().setTitulo("Comédia");
		 new Esporte().getNome();
		 new Futebol().getNome();
		 TimeConversion.executar();
	}
}
