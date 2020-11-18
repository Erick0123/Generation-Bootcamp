package Entidades;

public class contaCorrente extends Conta{
	private int talao=1;
	public int getTalao() {
		return talao;
	}
	public void setTalao(int talao) {
		this.talao = talao;
	}
	public contaCorrente(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);

	}

	public void emite() {
		this.talao=this.talao+1;
	}
	 

}
