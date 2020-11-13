package ListaRevisao;

import java.util.Scanner;

public class RevisaoExercicio1 {
	public static void main(String[] args) {
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
		 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento
		 * escolhida e efetuar o c�lculo adequado. C�digo Condi��o de pagamento 1 �
		 * vista em dinheiro ou cheque, recebe 20% de desconto 2 � vista no cart�o de
		 * cr�dito, recebe 15% de desconto 3 Em duas vezes, pre�o normal de etiqueta sem
		 * juros 4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		double preco = 0;
		int codigo;
		double avista = 0, cartao1, cartao2, cartao3 = 0;

		System.out.println("pre�o do produto: ");
		preco = leia.nextDouble();

		avista = Math.floor(preco * 0.2);
		cartao1 = Math.floor(preco * 0.15);
		cartao2 = Math.floor(preco / 2);
		cartao3 = (preco + Math.floor((preco * 0.1)));

		System.out.println("Codigo 0 para Valor � vista: " + avista);
		System.out.println("\nCodigo 1 para Valor � vista no cart�o: " + cartao1);
		System.out.println("\nCodigo 2 para Valor parcelado em 2x: " + cartao2);
		System.out.printf("\nCodigo 3 para Valor parcelado em 3x: " + cartao3);

		System.out.println("\nDigite o codigo de pagamento: ");
		codigo = leia.nextInt();

		if (codigo == 0) {
			System.out.println(avista);

		} else if (codigo == 1) {
			System.out.println(cartao1);
		}
		if (codigo == 2) {
			System.out.println(cartao2);
		}
		if (codigo == 3) {
			System.out.println(Math.floor(cartao3 / 3));
		}

	}
}
