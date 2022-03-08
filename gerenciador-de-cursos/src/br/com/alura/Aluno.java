package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroDeMatricula;
	
	public Aluno(String nome, int numeroDeMatricula) {
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroDeMatricula + "]";
	}
}