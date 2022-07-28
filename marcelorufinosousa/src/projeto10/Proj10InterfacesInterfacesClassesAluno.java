package projeto10;

import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj10InterfacesInterfacesClassesAluno {

	private int matricula;
	private Curso curso;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, int idade, Sexo sexo,
			Documento documento, int matricula, Curso curso) {
		
		super(nome, idade, sexo, documento);
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
		return String mostrar() + "\n Matricula: " + this.getMtricula() +
				((this.getCurso() == null) ? "\n Nenhum curso atribuido" :
					"\n\n Dados do curso\n\n" + this.getCurso().mostrar());
	}
}
