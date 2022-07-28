package projeto9;

public class Proj9ClassesAbstartasClassesProdutoImportado {
	
	private double TaxaImportacao;
	
	public ProdutoImportado(String categoria, String descricao, double preco,) {
		super(categoria, descricao, preco);
	}
	public ProdutoImportado(String categoria, String descricao
			double preco, double TaxaImportacao) {
		
		this(categoria, descricao, preco);
		this.setTaxaImportacao(taxaImportacao);
	}
	public double getTaxaIportacao() {
		return taxaImportacao;
	}
	public void setTaxaImportacao(double taxaImportacao) {
		this.TaxaImportacao = taxaImportacao;
	}
	@Override
	public String mostrar() {
		return super.mostrar() + "\n Taxa de Importação: " + this.getTaxaImportacao();
	}

}
