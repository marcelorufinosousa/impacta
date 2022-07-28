package projeto14;

public class Proj14ColecaoInterfacesFigura {
	 double calcularArea();
	  

	   String AUTOR = "Equipe Impacta";

	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	

		}

}
