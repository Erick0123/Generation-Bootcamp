package Lista7;

public class Administrador extends Pessoa{
	private double ajusteCusto;

	public Administrador(String nome, String endereco, String telefone, double ajusteCusto) {
		super(nome, endereco, telefone);
		this.ajusteCusto = ajusteCusto;
	}

	public double getAjusteCusto() {
		return ajusteCusto;
	}

	public void setAjusteCusto(double ajusteCusto) {
		this.ajusteCusto = ajusteCusto;
	}
	
}
