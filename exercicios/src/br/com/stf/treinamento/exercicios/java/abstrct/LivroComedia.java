package br.com.stf.treinamento.exercicios.java.abstrct;

public class LivroComedia extends Livro {

	@Override
	public void setTitulo(String titulo) {
		this.titulo = "O título é: " + titulo;
		System.out.println(this.getTitulo());
	}
}
