package projeto15;

import projeto6.Proj6PessoaClasse.Pessoa;
import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj15ArquivosClassesPessoa {
	private	String nome;
	private	int idade;
	private	Sexo sexo;
	
	private Documento documento;
	
	public Pessoa() {
		super();
	}
	
	
	public Pessoa(String nome, int idade, Sexo sexo, Documento documento) 
	throws IllegalAccessException
	{
		super();
		this.setNome(nome);	
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setDocumento(documento);
		
	}
	
	public String mostrar() {
		
		return  "\nNome: " + this.getNome() + 
				"\nIdade:" + this.getIdade() +
				"\nSexo:" + this.getSexo() +
				
		(this.getDocumento() instanceof DocumentoCpf 
				? "\nCPF: " : "\nCNPJ: " )
		
		+  this.getDocumento().getNumero();
				
				
	}
	
	
	
	
	public Documento getDocumento() {
		return documento;
	}


	public void setDocumento(Documento documento) {
		this.documento = documento;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException
			("O nome foi fornecido incorretamente.");
		}
		this.nome = nome;
	}
	public int getIdade() {		
		return idade;
	}
	public void setIdade(int idade) throws IllegalAccessException {
		
        if(idade < 0) {
        	throw new IllegalAccessException("A idade n?o pode ser negativa");
			
		}
		
		
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	@Override
	public int compareTo(Pessoa o) {
		
		return this.getNome().compareTo(o.getNome());
		
	}

}
