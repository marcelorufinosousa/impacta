package projeto8;

public class Proj8HerancaClasseProdutoImportado {
	
	private double taxaImportacao;
	
	public ProdutoImportado(String categoria,
			                String descricao, double preco) {
		super(categoria,descricao,preco);
		
	}
	public produtoImportado(String categoria,
			                String descricao,
			                double preco,
			                double taxaImportacao) {
		
		this(categoria, descricao, preco);
		
		this.setTaxaImportacao(taxaImportacao);
	}
	
	public double getImportacao() {
		return taxaImportacao;
	}
	
	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
    @Override
    
    public String mostrar() {
    	return super.mostrar() + "\n Taxa de importação:"
    			+ this.getTaxaImportacao();
    }

}
