package projeto10;

import

public class Proj10InterfacesInterfacesFigura {
	
	double calcularArea();
	
	String AUTOR = "Equipe Impacta"
			
	default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass()
		                               .getSimpleName() +
		                      "\n Area: " + this.calcularArea();
		return resposta;
	}

}
