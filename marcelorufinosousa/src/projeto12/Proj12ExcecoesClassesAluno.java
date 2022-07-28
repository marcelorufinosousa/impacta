package projeto12;

import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj12ExcecoesClassesAluno {
	private int matricula;
	private Curso curso;
	
	 
	public Aluno() {	
		super();
	}
	
	public Aluno(String nome, int idade,Sexo sexo,
			Documento documento, int matricula,Curso curso)
					throws IllegalAccessException {
		
      super(nome, idade,sexo,documento);
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
			"\nMatricula: " + this.getMatricula() +		
		
			
	          ((this.getCurso() == null) ? "\nNenhum curso atribuido" :		        
		        	"\n\nDADOS DO CURSO:\n\n" + this.getCurso().mostrar());    		
		
	}

}
