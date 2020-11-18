package Lista7;

public class testeEmpregado {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Erick","av.loka","4523-4546",1,2000,20);
		
		System.out.println("Nome: "+empregado1.getNome());
		System.out.println("Endereço"+empregado1.getEndereco());
		System.out.println("Telefone"+empregado1.getTelefone());
		System.out.println("Codigo do Setor: "+empregado1.getCodigoSetor());
		System.out.println("Salario: "+empregado1.getSalarioBase());
		System.out.println("Imposto: "+empregado1.getImposto());
		System.out.println("Resultado: "+empregado1.calcularSalario());
		
	}
}
