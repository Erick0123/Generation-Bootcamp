package Entidades;

public class Conta {
	//atributo
	private String cpf_cnpj;
	private double saldo;
	private int numero;

	//construtor
	public Conta(int numero) {
		this.numero=numero;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, String cpf_cnpj) {
		this.numero=numero;
		this.cpf_cnpj=cpf_cnpj;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public double getSaldo() {
		return saldo;
	}
	//metodos
	public void debite(double valorDebito) {
		this.saldo=this.saldo-valorDebito;
	}
	public void credite(double valorCredito) {
		this.saldo=this.saldo+valorCredito;
	}
}
