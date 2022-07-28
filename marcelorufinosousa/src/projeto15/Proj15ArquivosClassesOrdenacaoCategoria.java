package projeto15;

public class Proj15ArquivosClassesOrdenacaoCategoria {
	@Override
	public int compare(Produto prod1, Produto prod2) {
		
		return prod1.getCategoria().compareTo(prod2.getCategoria());
		
		
	}

}
