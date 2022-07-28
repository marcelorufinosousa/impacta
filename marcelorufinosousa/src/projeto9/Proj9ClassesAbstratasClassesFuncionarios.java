package projeto9;

import

//extends = heranca (subclasse de pessoa)

public class Proj9ClassesAbstratasClassesFuncionarios {

	private String cargo;
	private double salario;
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(nome, idade, sexo);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	//override = metedo que sobrescreve
	@Override
	public String mostrar() {
		return super.mostrar()+
				"\n Cargo: " + this.getCargo() +
				"\n Salario: " + this.getSalario();
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double setSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
