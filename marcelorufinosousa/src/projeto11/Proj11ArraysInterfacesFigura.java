package projeto11;

import

public class Proj11ArraysInterfacesFigura {
	double calcularArea();

	   String AUTOR = "Equipe Impacta";
	
	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	

			
		}

}
