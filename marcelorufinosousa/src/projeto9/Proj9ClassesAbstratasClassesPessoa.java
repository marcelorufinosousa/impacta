package projeto9;

import

public class Proj9ClassesAbstratasClassesPessoa {
	
	private String nome;
	private int idade;
	privare Sexo sexo;
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, Sexo sexo) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	public String mostrar() {
		return"\n Nome: " + this.getNome() +
				"\n Idade: " + this.getIdade() +
				"\n Sexo: " + this.getSexo();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo(Sexo sexo) {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.Sexo = sexo;
	}

}
