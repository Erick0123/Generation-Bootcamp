package Lista4;

public class MatrizExercicio3 {
	public static void main(String[] args) {
		int N1[][]=new int[4][6];
		int N2[][]=new int[4][6];
		int M1[][]=new int[4][6];
		int M2[][]=new int[4][6];
		int linha=0;
		int coluna=0;
		
			
				for( linha=0;linha<4;linha++) 
				{
					 for(coluna=0;coluna<6;coluna++)
					{
						N1[linha][coluna]=(int)(Math.random()*10);
						N2[linha][coluna]=(int)(Math.random()*10);
					}
				}	
				
				for( linha=0;linha<4;linha++) 
				{
					 for(coluna=0;coluna<6;coluna++)
					{
						M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
						M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
					}
				}	
				
				System.out.println("MATRIZ 1\n");
					for(linha=0;linha<4;linha++)
					{
						for(coluna=0;coluna<6;coluna++)
						{
							System.out.print(N1[linha][coluna]);
							System.out.print(" ");	
						}
							System.out.print("\n \n");
					}
					
					System.out.println("MATRIZ 2\n");
					for(linha=0;linha<4;linha++)
					{
						for(coluna=0;coluna<6;coluna++)
						{
							System.out.print(N2[linha][coluna]);
							System.out.print(" ");	
						}
							System.out.print("\n \n");				
					}
					
					System.out.println("MATRIZ SOMA");
					for(linha=0;linha<4;linha++)
					{
						for(coluna=0;coluna<6;coluna++)
						{
							System.out.print(M1[linha][coluna]);
							System.out.print(" ");
							
						}
									System.out.print("\n \n");
					}
					
					System.out.println("MATRIZ SUBTRAÇAO");
					for(linha=0;linha<4;linha++)
					{
						for(coluna=0;coluna<6;coluna++)
						{
							System.out.print(M2[linha][coluna]);
							System.out.print(" ");
							
						}
									System.out.print("\n \n");

					}
	}
}
