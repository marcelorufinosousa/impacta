package projeto4;

public class EstrtuturaWhile01 {
	public static void main(String[] args) {
		
		int numero = (int) (Math.random() *20);
		
		//System.out.println("Numero gerado: " + numero);
		while(numero < 11){
		System.out.println(numero++);	
		}
		
		System.out.println(" FIM DO PROGRAMA ");
	}

}
