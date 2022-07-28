package projeto15;

public class Proj15ArquivosUtilitariosUtilitarios {
String curso = "Java";
	

	public static double somar(double x, double y) {
		return x + y;
	}

	public static String removerEspacos(String texto) {

		return texto.replace(" ", "");		
	}

	public static String gerarEmail(String nome,String sobrenome) {		
		String email = nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@impacta.com.br";		
		return removerEspacos(email);	
		
	}

	
	public static double calcularMediaArray(double[] numeros) {
		double soma =0;
		
		for (int i = 0; i < numeros.length; i++) {			
		     soma += numeros[i];				
		}	
		
		return  numeros.length > 0 ? soma / numeros.length : soma;
		
	}	

	public static double calcularMediaNumeros(double... numeros) {
				
		return 	calcularMediaArray(numeros);
	}

}
