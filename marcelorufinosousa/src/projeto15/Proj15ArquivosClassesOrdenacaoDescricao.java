package projeto15;

public class Proj15ArquivosClassesOrdenacaoDescricao {
	@Override
	public int compare(Produto o1, Produto o2) {
		
		return o1.getDescricao().compareTo(o2.getDescricao());
		
	}

}
