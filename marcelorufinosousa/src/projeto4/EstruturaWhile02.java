package projeto4;

public class EstruturaWhile02 {
	public static void main(String[] args) {
		
		int numero = (int)(Math.random() *20);
		
		//faca
		do {
			
			System.out.println(numero++);
		}
		while(numero < 20); //enquanto
		
		   System.out.println(" FIM DO PROGRAMA ");
		
	}

}
