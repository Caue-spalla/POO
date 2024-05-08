package pjAula9_09_04;

import javax.swing.JOptionPane;

public class TesteAplicacao {
	public static Integer[] vet = new Integer[1000000];
	public static void preencher(int num) {
		try {
			for (int i = 0; i < num; i++) {
				vet[i] = i;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Falha ao realizar ação. ");
		}
		try{
			int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			JOptionPane.showMessageDialog(null, valorA/valorB);
		}catch(NumberFormatException e) {
			System.out.println("Valor infomado não é um numero, informe um numero. ");
		}catch(ArithmeticException e) {
			System.out.println("Erro ao dividir seu numero. ");
		}

	}
	public static void main(String[] args) {
		System.out.println("Inicio.");
		preencher(1000001);
		System.out.println("Fim.");
	}
}