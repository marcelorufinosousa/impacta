package projeto15;

public class Proj15ArquivosInterfacesFigura {
	double calcularArea();

	   String AUTOR = "Equipe Impacta";

	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	
		
			
		}

}
