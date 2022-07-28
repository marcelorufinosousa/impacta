package projeto12;

public class Proj12ExcecoesClassesDocumentoCpf {
	private String cpf;
	
	
	public DocumentoCpf(String cpf) {
		super();
		this.setNumero(cpf);
	}

	@Override
	public void setNumero(String numero) {
		 
		 //expressao regular.
		if(!numero.matches("[0-9]{11}")) {
			throw new NumberFormatException("O CPF  "
					+ "deve ter 11 digitos");
		}
		
		this.cpf = numero;
		
		
	}

	@Override
	public String getNumero() {		
		return this.cpf;
	}

}
