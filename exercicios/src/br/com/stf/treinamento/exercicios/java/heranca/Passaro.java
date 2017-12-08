package br.com.stf.treinamento.exercicios.java.heranca;

public class Passaro extends Animal {

	public Passaro() {
	}
	
	public void voar() {
		System.out.println("Eu estou voando");
	}
	
	public void cantar() {
		System.out.println("Eu estou cantando");
	}
	
	public void executar() {
		this.voar();
		super.andar();
		this.cantar();
	}

}
