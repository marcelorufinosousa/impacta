package projeto15;

import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj15ArquivosClassesFuncionario {
	private String cargo;
	private double salario;
	
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, Sexo sexo,
			Documento documento, String cargo,
			double salario) throws IllegalAccessException {
		
		super(nome, idade,sexo,documento);
		this.setCargo(cargo);
		this.setSalario(salario);	
		
	}

	@Override
	public String mostrar() {
		
		return super.mostrar() + 
				"\nCargo: " + this.getCargo() +
				"\nSal?rio: " + this.getSalario();		
		
	}
			
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome() +   " - " + getSalario();
	}

}
