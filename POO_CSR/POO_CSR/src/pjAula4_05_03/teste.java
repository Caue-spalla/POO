package pjAula4_05_03;


public class teste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		long a = 123, b = 456;
		int c = 123, d = 46;
		System.out.println(calc.soma(a, b));
		System.out.println(calc.soma(c, d));
		System.out.println(calc.soma("7", "5"));
		System.out.println(calc.soma(4,8,2));
		System.out.println(calc.soma(4,76,65,76,565));
		System.out.println(calc.soma("4434","76","65","76","565"));
	}
}