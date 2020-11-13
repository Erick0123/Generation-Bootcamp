package ListaRevisao;

import java.util.Scanner;

public class RevisaoExercicio1 {
	public static void main(String[] args) {
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento.
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		 * escolhida e efetuar o cálculo adequado. Código Condição de pagamento 1 À
		 * vista em dinheiro ou cheque, recebe 20% de desconto 2 À vista no cartão de
		 * crédito, recebe 15% de desconto 3 Em duas vezes, preço normal de etiqueta sem
		 * juros 4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		double preco = 0;
		int codigo;
		double avista = 0, cartao1, cartao2, cartao3 = 0;

		System.out.println("preço do produto: ");
		preco = leia.nextDouble();

		avista = Math.floor(preco * 0.2);
		cartao1 = Math.floor(preco * 0.15);
		cartao2 = Math.floor(preco / 2);
		cartao3 = (preco + Math.floor((preco * 0.1)));

		System.out.println("Codigo 0 para Valor à vista: " + avista);
		System.out.println("\nCodigo 1 para Valor à vista no cartão: " + cartao1);
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
