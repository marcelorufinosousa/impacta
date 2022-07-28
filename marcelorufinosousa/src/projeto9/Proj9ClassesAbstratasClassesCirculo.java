package projeto9;

public class Proj9ClassesAbstratasClassesCirculo {
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

}
