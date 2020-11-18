package Entidades;

public class contaEmpresa extends Conta {
	private double emprestimo;

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public contaEmpresa(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
		// TODO Auto-generated constructor stub
	}
	public void empreste(double valorEmprestimo) {
		this.emprestimo=this.emprestimo+valorEmprestimo;
	}
	

}
