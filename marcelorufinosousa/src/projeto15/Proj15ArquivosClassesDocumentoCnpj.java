package projeto15;

public class Proj15ArquivosClassesDocumentoCnpj {
	private String cnpj;
	
	public DocumentoCnpj(String cnpj) {
		super();
		this.setNumero(cnpj);
	}

	@Override
	public void setNumero(String numero) {
	=
		if(!numero.matches("[0-9]{14}")) {
			throw new NumberFormatException("O CNPJ  "
					+ "deve ter 14 digitos");
		}
		
		this.cnpj = numero;	
		
	}

	@Override
	public String getNumero() {		
		return this.cnpj;
	}

}
