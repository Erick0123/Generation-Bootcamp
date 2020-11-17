package ListaPOO;

import Entidades.Aviao;

public class viajar {
	public static void main(String[] args) {
		Aviao meuAviao=new Aviao();
		meuAviao.cor= "branco";
		meuAviao.agencia="tansViajens";
		meuAviao.velocidadeMinima=0;
		meuAviao.velocidadeMaxima=200;
		
		System.out.println("A cor do seu Aviao é "+meuAviao.cor+" da agencia "+meuAviao.agencia);
		
		meuAviao.liga();
		
		meuAviao.acelera(100);
		System.out.println(meuAviao.velocidadeMinima);
		meuAviao.decola();
		
		meuAviao.desacelera(200);
		System.out.println(meuAviao.velocidadeMaxima);
		meuAviao.pousa();
	}

}
