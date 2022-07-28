package projeto8;

import

public class Proj8HerancaClasseFuncionario {
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, int idade, Sexo sexo,String cargo, double salario) {
		
		@Override
		public String mostrar() {
			return super.mostrar() +
					"\n Cargo: " + this.getCargo() +
					"\n Salario: " + this.getSalario();
		}
		
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
	}


