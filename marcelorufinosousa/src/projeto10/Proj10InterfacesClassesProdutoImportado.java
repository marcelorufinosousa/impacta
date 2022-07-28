package projeto10;

public class Proj10InterfacesClassesProdutoImportado {
	
private double taxaImportacao;
		
	
	public ProdutoImportado(String categoria,
			String descricao, double preco) {
		super(categoria,descricao,preco);	
	}
	
	public ProdutoImportado(String categoria,
			String descricao, 
			double preco, 
			double taxaImportacao) {
		
		this(categoria,descricao, preco);
		
		this.setTaxaImportacao(taxaImportacao); 
		                                 
	}
	
	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	@Override
	public String mostrar() {		
		return super.mostrar() +  "\nTaxa de Importa��o:" 
		+ this.getTaxaImportacao() ;
	}	

}