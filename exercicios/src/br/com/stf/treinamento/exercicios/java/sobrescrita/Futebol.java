package br.com.stf.treinamento.exercicios.java.sobrescrita;

public class Futebol extends Esporte {
	
	@Override
	public String getNome() {
		System.out.println("Futebol");
		return "Futebol";
	}

}
