package Lista7;

import Entidades.Fornecedor;

public class testeFonecedor {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Erick","av.loka","1545452", 1000.0,100.0);
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getTelefone());
		
		System.out.println(fornecedor1.obterSaldo());
		
		
	}

}
