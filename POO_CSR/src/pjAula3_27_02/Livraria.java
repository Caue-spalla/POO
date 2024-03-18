package pjAula3_27_02;

public class Livraria {
	public static void main(String[] args) {
		//Criacao de objetos
		Obra livro = new Obra();
		Autor autor = new Autor();
		Obra outraobra = new Obra(789, "Banco de dados", autor, 7.54f, true);
		
		//Setters
		livro.setCodigo(123);
		livro.setTitulo("Java como programar");
		livro.setPreco(178.40f);
		livro.setSituacao(true);
		livro.setAutor(autor);
		
		autor.setCodigo(365);
		autor.setNome("Deitel & Deitel");
		autor.setSituacao(true);
		
		//Saida
		System.out.println(outraobra.toString());
		
	}
}
