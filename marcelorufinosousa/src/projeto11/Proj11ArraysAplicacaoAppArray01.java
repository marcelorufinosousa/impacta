package projeto11;

public class Proj11ArraysAplicacaoAppArray01 {
public static void main(String[] args) {
		

		int[] numeros = new int[5];
		
		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -12;
		numeros[3] = 0;
		numeros[4] = 8;
		
		
			
		for(int i= 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		for(int i = numeros.length-1 ; i >= 0; i--) {
			
			System.out.println(numeros[i]);
		}
		
   }

}
