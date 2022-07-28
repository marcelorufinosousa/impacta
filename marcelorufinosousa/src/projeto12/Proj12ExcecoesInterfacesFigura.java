package projeto12;

public class Proj12ExcecoesInterfacesFigura {
	double calcularArea();
	  

	   String AUTOR = "Equipe Impacta";
	
	   default String apresentarFigura() {
			
			String resposta = "Classe: " + this.getClass()
			                           .getSimpleName() +
					"\n¡rea: " + this.calcularArea();	
			
			return resposta;	
		
		}

}
