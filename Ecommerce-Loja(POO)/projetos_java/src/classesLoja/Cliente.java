package classesLoja;

import java.time.LocalDate;

public class Cliente
{
	//ATRIBUTOS
	private LocalDate data = LocalDate.now();
	private String nome; 
	private String cpf;
	private char genero;
	
	
	//construtor padrao
	public Cliente(){}
	//construtor
	public Cliente(String nome, String cpf)
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		
	}
	//getters and setters
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	

}
