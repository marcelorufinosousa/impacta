package projeto15;

import com.sun.tools.javac.util.List;

import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj15ArquivosClassesAluno {
	private int matricula;
	private List<Curso> cursos;
	
	 
	public Aluno() {	
		super();
	}
	
	public Aluno(String nome, int idade,Sexo sexo,
			Documento documento, int matricula)
					throws IllegalAccessException {
		
      super(nome, idade,sexo,documento);
      this.setMatricula(matricula);
     
	}

	public int getMatricula() {

		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public String mostrar() {

		return super.mostrar() + 
			"\nMatricula: " + this.getMatricula();	

		
	}

}
