package classesLoja;

public class Pagamento
{

private double valor;//preco dos produtos
private double parcelas;
private double valorTotal;
private int parc = 0;
public Pagamento() {}

public Pagamento(double valor)
{
    this.valor = valor;
}
public double getParcelas() {
    return parcelas;
}
public void setParcelas(double parcelas) {
    this.parcelas = parcelas;
}
public double getValorTotal() {
    return valorTotal;
}
public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
    
}

public void  pagamentoAvistaEmDinheiro ()
{
	    this.valorTotal = this.valorTotal - (this.valorTotal*0.20);
}
public void pagamentoAvistaCartao()
{
	 this.valorTotal = this.valorTotal - (this.valorTotal*0.15);
}
public void pagamentoCartao2x ()
{
    this.parcelas = this.valorTotal / 2;
    this.parc ++;
}
public void pagamentoCartao3x ()
{
	this.valorTotal = this.valorTotal + (this.valorTotal*0.10);
    this.parcelas = this.valorTotal / 3;
    this.parc += 2;
}
public void nota1 ()
{
	System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬NOTA FISCAL¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ ");
	System.out.println("Loja MYSTIC-STORE\nCnpj: 15. 356. 845/1234-00 \nRua toca do coelho nº 156");
	System.out.println("--------------------------------------------------------------------------");
    System.out.println("PRODUTOS:\t"+"\tVALOR:\t\tQUANTIDADE:\n");
}
public void nota2 ()
{
    double impostos;
    impostos = this.valorTotal*0.09;
    this.valorTotal += impostos;
    System.out.printf("\nIMPOSTOS A SEREM PAGOS R$ %.2f",impostos,"\n\n");
    if (this.parc == 1)
    {
        System.out.printf("\n\nTOTAL A SER PAGO = R$ %.2f\n",this.valorTotal);
        System.out.printf("\nPARCELADO EM 2X DE R$ %.2f " ,this.parcelas,"\n\n");
    }
    else if (parc == 2)
    {
        System.out.printf("\nTOTAL A SER PAGO = R$ %.2f\n",this.valorTotal);
        System.out.printf("\nPARCELADO EM 3X DE R$ %.2f" ,this.parcelas,"\n\n");
    }
    else
    {
        System.out.printf("\nTOTAL A SER PAGO = R$ %.2f ",this.valorTotal);
    }
	System.out.println("\n___________________________");
	System.out.println("OBRIGADO, VOLTE SEMPRE!!!!!");
}
public void valorTotal(double valor) {
    this.valorTotal += valor;
}
	

}
