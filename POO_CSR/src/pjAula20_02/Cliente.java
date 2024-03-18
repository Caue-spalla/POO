package pjAula20_02;

/**
 * @author CaueSpalla
 * @data 20/02/2024
 *Classe de modelagem conceitual de Cliete
 */

public class Cliente {
	//Atributos
	private String nome;
	private float telefone;
	private String email;

	//Metodo
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;		
	}
	public float getTelefone() {
		return telefone;
	}
	public void setTelefone(float telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}