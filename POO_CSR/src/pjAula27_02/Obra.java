package pjAula27_02;
/**
 * 
 * @author Cauê Spalla Rovaron
 * @data 27/02/2024
 * Classe de modelagem conceitual de Obra
 */
public class Obra {
	private int codigo;
	private String titulo;
	private Autor autor;
	private float preco;
	private boolean situacao;
	
	//getter & setter
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	//método construtor
	public Obra(){
		System.out.println("Objeto foi instanciado.");
	}
	
	
	
	public Obra(int codigo, String titulo, Autor autor, float preco, boolean situacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.situacao = situacao;
	}
	@Override
	public String toString(){
		return "Código: " + getCodigo() + " Autor: " + getAutor().getNome();
	}
}
