package loja;

import java.util.ArrayList;
import java.util.Scanner;

import classesLoja.Pagamento;
import classesLoja.Produtos;

	public class EcommercePOO {
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			ArrayList<Produtos> produtos = new ArrayList<>();
			ArrayList<String> carrinho = new ArrayList<>();
			Pagamento pagamento = new Pagamento();
			
			int codigo, qtde, cont=0, opcaoPagamento=0;
			char opcao;
			double total=0;
			
			produtos.add(new Produtos(1,"CAMISA\t", 30.00, 10));
			produtos.add(new Produtos(2,"JAQUETA\t", 50.00, 10));
			produtos.add(new Produtos(3,"MOLETOM\t", 120.00, 10));
			produtos.add(new Produtos(4,"REGATA\t", 20.00, 10));
			produtos.add(new Produtos(5,"SHORT\t", 30.00, 10));
			produtos.add(new Produtos(6,"CALCA\t", 70.00, 10));
			produtos.add(new Produtos(7,"JALECO\t", 10.00, 10));
			produtos.add(new Produtos(8,"CINTO\t",25.00, 10));
			produtos.add(new Produtos(9,"LUVA\t",10.00, 10));
			produtos.add(new Produtos(10,"MEIAS\t",5.00, 10));
			
			
			System.out.println("SEJAM BEM VINDOS[AS] AO MYSTIC-STORE \n" + "\nAQUI ESTA NOSSO MENU DE PRODUTOS:");
			
			//Lista de Produtos
			System.out.print("\n-----------------------------------------------\n");
			System.out.println("CÓDIGO	PRODUTO \tPREÇO   \tESTOQUE");
			System.out.print("-----------------------------------------------\n");
			for (Produtos itens : produtos)
			{
				System.out.println("______________________________________________");
				System.out.println(itens.getCodProd()+"\t"+itens.getNome()+"\t"+itens.getPrecoProd()+"\t\t"+itens.getEstoque());
			}
			System.out.print("\n-----------------------------------------------\n");
			
			//Escolha Produtos
			do {
				
				System.out.print("\nDIGITE O CODIGO DO PRODUTO: ");
				codigo = input.nextInt();
				System.out.print("DIGITE A QUANTIDADE DE PRODUTOS: ");
				qtde = input.nextInt();
				
				 cont=0;
				 for (Produtos itens : produtos) {	 

					 if(itens.getCodProd() == codigo && itens.getEstoque()>=qtde)
					 {
						 carrinho.add(produtos.get(cont).getNome()+"\t\tR$"+produtos.get(cont).getPrecoProd()+"\t\t"+qtde);
						 total = (qtde* produtos.get(cont).getPrecoProd()) + total;
						 itens.retirarEstoque(qtde);
					 }
					 
					 else if(itens.getCodProd() == codigo && itens.getEstoque()<qtde)
					 {
						 System.out.println("Não temos mais essa quantidade no estoque escolha outro produto");
					 }
					 cont++;
					 
				 }
				
				 System.out.print("CONTINUAR S/N?: ");
			opcao = input.next().toUpperCase().charAt(0);
			
			}while(opcao != 'N');
		
			
			System.out.println("__________________________________________________________________________"
					+ "\n<><><><><><><><><><><><><><><><>ESTRATO<><><><><><><><>><><><><><><><><><>\n"
					+ "__________________________________________________________________________");
		   System.out.println("PRODUTO \t\tPREÇO\tQUANTIDADE");
		   int qnt = 0;
		  
		   for (String itens : carrinho) {
			   System.out.println(itens.indent(qnt));
			   qnt ++;
		   }
		   System.out.printf("Total a pagar: R$%.2f",total);
		   pagamento.setValorTotal(total);
		   System.out.println("\n1__________________________________________________________________________"
					+ "\n<><><><><><><><><><><><><><><><><><><<><><><><><><><><>><><><><><><><><><>\n"
					+ "__________________________________________________________________________\n");
		   
		   System.out.println("==========================FORMA DE PAGAMENTO==============================\n ");
		   
		    	// imprimindo os valores e o imposto separadamente
		  
		 
		   double cartao2=(pagamento.getValorTotal())+(pagamento.getValorTotal())*0.09;
		   double cartao3=(pagamento.getValorTotal()+(pagamento.getValorTotal()*0.10))+pagamento.getValorTotal()*0.09;
		   
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1- Valor à vista: " + pagamento.getValorTotal()+ " Desconto de 20%: "+(pagamento.getValorTotal()*0.80)+"+ imposto: "+(pagamento.getValorTotal()*0.80)*0.09);
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("2- Valor à vista no cartão: " + pagamento.getValorTotal() + " Desconto de 15%: "+(pagamento.getValorTotal()*0.85)+"+ imposto: "+(pagamento.getValorTotal()*0.85)*0.09);
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("3- Valor em 2x: "+ pagamento.getValorTotal()+"+ imposto: "+(pagamento.getValorTotal())*0.09);
			System.out.println("Primeira parcela = "+cartao2/2);
			System.out.println("Segunda parcela = "+cartao2/2);
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("4- Valor em 3x: "+pagamento.getValorTotal()+ " + valor com juros de 10%: " +(pagamento.getValorTotal()*0.10)+"+ imposto: "+ (pagamento.getValorTotal()+(pagamento.getValorTotal()*0.10))*0.09);
			System.out.println("Primeira parcela = "+cartao3/3);
			System.out.println("Segunda parcela = " +cartao3/3);
			System.out.println("Terceira parcela = "+cartao3/3);
			System.out.println("--------------------------------------------------------------------------");
		    
		   
		   //Pagamento
		   do {
			   System.out.print("\nSelecione a forma de Pagamento");
			   System.out.print("\n1- Pagamento A vista \n2- Pagamento Cartao 1x \n3- Pagamento Cartão 2X \n4- Pagamento Cartão 3X");
			   System.out.println("\nOpcao escolhida: ");
			   opcaoPagamento = input.nextInt();
			   
			   if(opcaoPagamento == 1)
			   {
				   pagamento.pagamentoAvistaEmDinheiro();
				   pagamento.nota1();
				   int qnt1 = 0;
				   for (String itens : carrinho) 
				   {
					   System.out.println(itens.indent(qnt));
					   qnt1 ++;
				   }
				   pagamento.nota2();
			   }
			   else if(opcaoPagamento == 2)
			   {
				   pagamento.pagamentoAvistaCartao();
				   pagamento.nota1();
				   int qnt1 = 0;
				   for (String itens : carrinho) 
				   {
					   System.out.println(itens.indent(qnt));
					   qnt1 ++;
				   }
				   pagamento.nota2();
			   }
			   else if(opcaoPagamento == 3)
			   {
				   pagamento.pagamentoCartao2x();
				   pagamento.nota1();
				   int qnt1 = 0;
				   for (String itens : carrinho) 
				   {
					   System.out.println(itens.indent(qnt));
					   qnt1 ++;
				   }
				   pagamento.nota2();
			   }
			   else if(opcaoPagamento == 4)
			   {
				   pagamento.pagamentoCartao3x();
				   pagamento.nota1();
				   int qnt1 = 0;
				   for (String itens : carrinho) 
				   {
					   System.out.println(itens.indent(qnt));
					   qnt1 ++;
				   }
				   pagamento.nota2();
			   }
			   else if(opcaoPagamento <0 && opcaoPagamento<5)
			   {
				   System.out.println("Opcao Invalida");
			   }
			   
		   }while(opcaoPagamento <0 && opcaoPagamento<5);
		   

		 
		}
		
	}


