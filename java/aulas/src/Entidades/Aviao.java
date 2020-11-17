package Entidades;

public class Aviao {
	public String cor;
	public String agencia;
	public double velocidadeMaxima;
	public double velocidadeMinima;

	public void liga() 
	{
		System.out.println("Motor do Aviao ligado");
	}
	public void acelera(double kmh)
	{
		double velocidade=this.velocidadeMinima+kmh;
		this.velocidadeMinima=velocidade;
	}
	public int decola()
	{
		if(this.velocidadeMinima<0)
		{
			return -1;
		}
		if(this.velocidadeMinima>20)
		{
			return 1;
		}
		if(this.velocidadeMinima>100 && this.velocidadeMinima<150)
		{
			return 2;
		}
		return 3;
	}public void desacelera(double kmh)
	{
		double velocidade=this.velocidadeMaxima+kmh;
		this.velocidadeMaxima-=velocidade;
	}
		
	public int pousa() 
	{
		if(this.velocidadeMaxima>200)
		{
			return -1;
		}
			return 0;
	}
}
