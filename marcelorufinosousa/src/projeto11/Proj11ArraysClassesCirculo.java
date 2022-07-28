package projeto11;

import

public class Proj11ArraysClassesCirculo {
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);		
	}
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {

	return	Math.PI * Math.pow(this.getRaio(), 2);
		
		
	}


	@Override
	public int compareTo(Figura o) {
		return 0;
	}

}
