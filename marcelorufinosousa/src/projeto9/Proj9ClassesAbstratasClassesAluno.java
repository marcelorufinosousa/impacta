package projeto9;

import

public class Proj9ClassesAbstratasClassesAluno {

	private int matricula;
	private Curso curso;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade,Sexo sexo, int matricula, Curso curso) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String mostrar() {
		return super.mostrar() +
				"\n Matricula: " + this.getMatricula() +
				((this.getCurso() == null) ? "\n Nenhum curso atribuido" :
					"\n Dados do curso: \n\n" + this.getCurso().mostrar());
		
	}
	
}
