package projeto11;

import

public class Proj11ArraysClassesRetangulo {
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura) {		
		this.setBase(base);
		this.setAltura(altura);		
	}
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override  
	public double calcularArea() {
		
		return this.getBase() * this.getAltura();
	}


	@Override
	public int compareTo(Figura o) {
		return 0;
	}

}
