package pjAula06_02;
/**
 * @author CaueSpalla
 * @data 06/02/2024
 *Classe de modelagem conceitual de produto
 */
public class Produto {
	//Atributos
	int codigo;
	String descricao;
	float quantidade;
	
	//M�todos
	public void incluir(int id, String nome, float valor) {
		//atividade de inclus�o
		codigo = id;
		descricao = nome;
		quantidade = valor;
	}
	public void excluir() {
		//atividade de exclus�o
	}
	
	public static void main(String[] args) {
		System.out.println("Ai papai");
	}
}


/**
 * package teste;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ol� MUndo !!!");
	}

}
*/
