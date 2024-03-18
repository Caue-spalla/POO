package pjAula27_02;

import javax.swing.JOptionPane;

public class TesteConversao {
	public static void main(String[] args) {
		int qtd;
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
		
		float valorpago = qtd*10;
		JOptionPane.showMessageDialog(null, valorpago);
		
	}
}
