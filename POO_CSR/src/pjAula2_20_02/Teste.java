package pjAula2_20_02;

import java.util.Scanner;

/**
 * @author CaueSpalla
 * @data 20/02/2024
 *Classe de modelagem conceitual de automovel
 */


 /**
  * 
  * 	public static void main(String[] args) {
		Automovel carro = new Automovel();
		
		carro.ano = 1990;
		carro.cor = "Colorido";
		
		System.out.println(carro.ano);
		for (int i = 51; i <= 171; i++) {
			System.out.println(i);
		}
		
		Cliente voce = new Cliente();
		
		voce.setNome("Cauê");
		System.out.println(voce.getNome());
	}
  *
  */

public class Teste {
	public static void main(String[] args) {
		Cliente [] agenda = new Cliente[5];
	
		//entrada
		for(int i = 0; i<5; i++) {
			java.util.Scanner digito = new Scanner(System.in);
			Cliente elemento = new Cliente();
			System.out.println("Informe o nome: ");
			elemento.setNome(digito.next());
			System.out.println("Informe o telefone: ");
			elemento.setTelefone(digito.nextFloat());
			System.out.println("Informe o Email: ");
			elemento.setEmail(digito.next());
		
			agenda[i] = elemento;
			digito.close();
		}
		//saida
		for(int i=0; i<5;i++) {
			System.out.println("Nome: "+ agenda[i].getNome() + "Telefone: "+ agenda[i].getTelefone() + "Email: "+ agenda[i].getEmail());
		}
	}
}