package projeto13;

public class Proj13PFAplicacaoAppOperacao03 {
	 public static void main(String[] args) {
			
		   Operacao03<String> op1 =  p -> p.replace(" ","").length();
		   
		   Operacao03<Integer> op2 = p -> p;
		   
		   
		   System.out.println("op1: " + op1.executar("Programa��o Funcional"));
		   System.out.println("op2: " + op2.executar(120));
		   
		   
	}

}