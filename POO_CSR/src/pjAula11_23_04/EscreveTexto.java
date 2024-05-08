package pjAula11_23_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveTexto {
	public static void main(String[] args) {
		String texto = "Ah, esse seu buraquinho \n" + 
						"É tão lindo mas ninguém vê \n" + 
						"Fica escondidinho \n" +
						"Na parte de trás de você. \n";
		String nome_arq = "memoria.txt";
		File tstArquivo = new File("src/pjAula11_23_04/" + nome_arq);
		if(tstArquivo.exists()) {
			try {
				tstArquivo.createNewFile();
			}catch(IOException e){
				System.err.println("Erro ao abrir o arquivo");
			}
		}
		
		//estrutura para escrita
		
		try {
			FileWriter arquivoSaida = new FileWriter(nome_arq);
			BufferedWriter buffer = new BufferedWriter(arquivoSaida);
			buffer.write(texto);
			buffer.close();
		}catch(IOException e){
			System.err.println("Erro ao abrir o arquivo");
		}
		
		//estrutura para leiura
		
		try {
			FileReader arquivoLeitura = new FileReader(nome_arq);
			BufferedReader buffer = new BufferedReader(arquivoLeitura);
			String saida = buffer.readLine();
			while(saida != null) {
				if(saida != null) {
					System.out.println(saida);
					saida = buffer.readLine();
				}
			}
			buffer.close();
		}catch(IOException e) {
			System.err.println("Erro ao abrir o arquivo");
		}
	}
}
