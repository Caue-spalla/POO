package pjAula8_02_04;

public class Faturamento {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		System.out.println("Atualmente NotaFiscal.Sequencia: " + NotaFiscal.sequencia);
	
		NotaFiscal notaA = new NotaFiscal();
		System.out.println("Atualmente NotaFiscal.Sequencia: " + NotaFiscal.sequencia);		
		System.out.println("Atualmente NotaFiscal.numero: " + notaA.getNumero());	
		*/
		NotaFiscal entrada = new NotaFiscal();
		entrada.setFornecedor("Ana Maria Braga");
		entrada.setTotal(634);
		NotaFiscal.cambio = 5.45;
		
		
		NotaFiscal saida = new NotaFiscal();
		saida.setFornecedor("Unisal");
		saida.setTotal(120);
		NotaFiscal.cambio = 2.175;
		
		System.out.println("Entrada - Total: " + entrada.getTotal() * NotaFiscal.cambio + " Numero: " + entrada.getNumero());
		System.out.println("Saida - Total: " + saida.getTotal() * NotaFiscal.cambio + " Numero: " + saida.getNumero());
		}
}
