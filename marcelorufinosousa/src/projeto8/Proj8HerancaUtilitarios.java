package projeto8;

public class Proj8HerancaUtilitarios {
	
	String curso = "Java";
	
	public static double somar(double x, double y) {
	 return x + y;
			 
	}
	public static String removerEspacos(String texto) {
		return texto.replace(" ", "");
	}
	
	public static String gerarEmail(String nome, String sobrenome) {
   String email = nome.toLowerCase() + "." + sobreNome.toLowerCase() + "@impacta.com.br";
	return removerEspacos(email);
	}
	

}
