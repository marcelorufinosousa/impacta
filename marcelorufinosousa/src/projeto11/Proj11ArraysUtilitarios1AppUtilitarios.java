package projeto11;

import

import

public class Proj11ArraysUtilitarios1AppUtilitarios {
	  double calcularArea();

	   String AUTOR = "Equipe Impacta";

	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	
			

		}

}
