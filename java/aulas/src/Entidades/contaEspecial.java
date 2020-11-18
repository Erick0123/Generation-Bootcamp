package Entidades;

public class contaEspecial extends Conta{
	private double Limite;
	public double getValorLimite() {
		return Limite;
	}
	public void setValorLimite(double valorLimite) {
		this.Limite = valorLimite;
	}
	public contaEspecial(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
		// TODO Auto-generated constructor stub
	}

	public void limita(double valorLimite) {
		this.Limite=this.Limite+valorLimite;
	}
	

}
