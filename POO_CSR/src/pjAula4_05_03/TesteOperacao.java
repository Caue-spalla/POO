package pjAula4_05_03;

public class TesteOperacao {
	public void calcular(OperacaoMatematica op, double a, double b) {
		System.out.println(op.calcular(a, b));
		op.getTipo();
	}
	
	public static void main(String[] args) {
		TesteOperacao teste = new TesteOperacao();
		
		teste.calcular(new Soma(), 123, 456);
		teste.calcular(new Subtracao(), 123, 456);
		teste.calcular(new Muliplicacao(), 123, 456);
		teste.calcular(new Divisao(), 123, 456);
		teste.calcular(new Modulo(), 123, 456);
		
		OperacaoMatematica mult = new Muliplicacao();
		
		teste.calcular(mult, 3, 6);
	}
}