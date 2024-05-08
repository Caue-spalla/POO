package pjAula11_23_04;

import java.io.File;

public class ListaDiretorios {
	public static void main(String[] args) {
		File diretorio = new File(".");
		if(diretorio.isDirectory()){
			File arquivos[] = diretorio.listFiles();
			for (int i = 0; i < arquivos.length; i++) {
				File f = arquivos[i];
				System.out.println((f.isDirectory() ? "Diretório: "  : "Arquivo: ") + arquivos[i]);
				if(f.isDirectory()) 
					listar(f);
			}
		}
	}
	public static void listar(File pasta) {
		String pastas[] = pasta.list();
		for(String s : pastas) {
			File arquivo = new File(s);
			if(arquivo.isDirectory()) {
				listar(arquivo);
			}else {
				System.out.println("\tArquivo " + arquivo.getName());
			}
		}
	}
}
