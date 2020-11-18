package Lista7;

public class Vendendor extends Pessoa {
	private double valorVendas;
	private double Comissao;
	public Vendendor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		Comissao = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return Comissao;
	}
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
	public double Vencimento() {
		return ((this.valorVendas*this.Comissao)/100);
	}

}
