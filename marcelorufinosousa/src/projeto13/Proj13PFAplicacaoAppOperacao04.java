package projeto13;

public class Proj13PFAplicacaoAppOperacao04 {
public static void main(String[] args) {
		
		Operacao04<Curso,Integer> op1 = p -> p.getCargaHoraria();	
		
		
		System.out.println(op1.executar
				(new Curso(10,"Java",100,850.0)));
		

	}

}
