package pjAula6_19_03.br.unisal.core;

public abstract class UnisalCRUD {
	//métodos abstratos
	public abstract void inserir(Object obj);
	public abstract Object pesquisar(int id);
	public abstract void atualizar(Object obj);
	public abstract boolean excluir(int id);
	
	public String toString() {
		return "Tipo " + this.getClass().getName() + " Hash code " +  this.hashCode();
	}
}
