package projeto9;

public class Proj9ClassesAbstratasUltilitarios {
	
	String curso = "Java";
	
	public static double somar(double x, double y) {
		return x + y;
	}
	public static String removerEspacos(String texto) {
		return texto.replace(" ", "");
	}
	public static String gerarEmail(String nome,String sobrenome) {
		String email = nome.toLowerCase() + "." + sobrenome.toLowerCase() +
				"@impacta.com.br";
	       return removerEspacos(email);	
	}

}
