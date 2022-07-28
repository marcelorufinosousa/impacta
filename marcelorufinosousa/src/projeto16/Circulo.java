package projeto16;

import br.com.impacta.interfaces.Figura;

public class Circulo implements Figura {
	
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
		// TODO Auto-generated method stub
		return 0;
	}

}
