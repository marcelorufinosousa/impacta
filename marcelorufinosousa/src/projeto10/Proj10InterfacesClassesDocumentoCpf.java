package projeto10;

import 

public class Proj10InterfacesClassesDocumentoCpf {
	
	private String cpf;
	
	
	public DocumentoCpf(String cpf) {
		super();
		this.setNumero(cpf);
	}

	@Override
	public void setNumero(String numero) {
		 
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
	
	

