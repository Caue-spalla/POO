package pjAula4_05_03;

/**
 * Exemplo de polimorfismo e sobrecarga
 * @author Caue Spalla Rovaron
 * @data 05/03/2024
 */
public class Calculadora {
	
	
	//Métodos
	public long soma(long a, long b) {
		return a+b;
	}
	public long soma(int a, int b) {
		return a+b;
	}
	public long soma(int a, int b, int c) {
		return a+b+c;
	}
	public long soma(String a, String b) {
		return Long.parseLong(a) + Long.parseLong(b);
	}
	public long soma(int a, String b) {
		return a + Long.parseLong(b);
	}
	public long soma(String a, int b) {
		return Long.parseLong(a) + b;
	}
	public long soma(Integer ... valores) {
		long result = 0;
		for (Integer i : valores) {
			result += i;
		}
		return result; 
	}
	public long soma(String ... valores) {
		long result = 0;
		for (String i : valores) {
			result += Long.parseLong(i);
		}
		return result; 
	}
}
