package projeto6;

public class Proj6Utilitarios01 {
	
	String curso = "Java";
	
	public static double somar(double x , double y) {
		return x + y;
	}
	public static String removerEspacos(String texto) {
		
		return texto.replace(" ", "");
	}
	public static String gerarEmail(String nome, String sobrenome) {
		String Email = nome.ToLowerCase() + "." + sobrenome.toLowerCase() + 
				"@impacta.com.br";
		return removerEspacos(Email);
	}

}
