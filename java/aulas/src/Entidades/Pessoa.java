package Entidades;

public class Pessoa {
	//atributo da classe
	public String nome;
	public char genero;
	public int anoNascimento;
	public String sobrenome;
	//construtor
	public Pessoa() {
		
	}
	public Pessoa(String nome, String sobrenome) {
		this.nome=nome;
		this.sobrenome=sobrenome;
	}

}
