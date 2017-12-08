package br.com.stf.treinamento.exercicios.java.abstrct;

public abstract class Livro {
	protected String titulo;
	abstract void setTitulo(String titulo);
	
	protected String getTitulo() {
		return this.titulo;
	}
}
