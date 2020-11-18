package Entidades;

public class Aluno {
	//atributo
	private int matricula;
	private String nome;
	private int anoNascimento;
	private char genero;
	private boolean ativo;

	//construtor
	public Aluno() {}
	public Aluno(int matricula, int anoNascimento)
	{
	this.matricula = matricula;
	this.anoNascimento = anoNascimento;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public String obtergenero() {
		String texto="";
		
		if(this.genero=='M') {
		texto="Aluno";
	}
		else if(this.genero=='F') {
		texto="Aluna";
	}
	else {
		texto="alunx";
	}
	return texto;
 }
	public int idade() {
		return 2020-this.anoNascimento;
	}
	public int idade(int anoAtual) {
		return anoAtual-this.anoNascimento;
	}
	public void situacao() {
		this.ativo=true;
	}
	public void situacao(char status) {
		if(status=='A') {
			this.ativo=true;
		}
		else {
			this.ativo=false;
		}
	}
 
}
