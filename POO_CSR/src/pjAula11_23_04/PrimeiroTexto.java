package pjAula11_23_04;

import java.io.File;

public class PrimeiroTexto {
	public static void main(String[] args) {
		//String informacoes = "";
		File arquivo = new File("src/pjAula11_23_04/MeuPrimeiroArquivo.txt");
		File arquivoOutro = new File("../arquivo.csv");
		
		System.out.println(arquivo.getAbsolutePath());
		System.out.println(arquivoOutro.getAbsolutePath());
		System.out.println(arquivo.exists());
		
		System.out.println(arquivo.canWrite());
		System.out.println(arquivo.isDirectory());
		System.out.println(arquivo.isFile());
		
		
		File integracao = new File("src/pjAula11_23_04/integra/integacao.csv");
		if(integracao.exists()) {
			System.out.println("ArquivoExiste");
		}else {
			integracao.mkdirs();
		}
		System.out.println(integracao.exists() ? "Existe" : "Não Existe");
	}
}
