package projeto13;

public class Proj13PFInterfacesFigura {
	double calcularArea();
	  

	   String AUTOR = "Equipe Impacta";

	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	

		}

}
