package Entidades;

public class contaPoupanca extends Conta{
	
	//atributos
	private int dataAniversario;
	//construtor	
	public contaPoupanca(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
		this.dataAniversario=this.dataAniversario;
	}
	public int getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
 
}
