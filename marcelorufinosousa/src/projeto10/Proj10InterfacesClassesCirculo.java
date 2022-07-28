package projeto10;

import 

public class Proj10InterfacesClassesCirculo {
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		return Math.PI* Math.pow(this.getRaio(), 2);
	}

}
