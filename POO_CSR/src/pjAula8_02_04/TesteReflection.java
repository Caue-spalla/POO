package pjAula8_02_04;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TesteReflection {
	public static void main(String[] args) {
		List<String> listanegra = new ArrayList<String>();
		
		listanegra.add("mama");
		listanegra.add("meajuda");
		listanegra.add("funcaodesespero");
		
		Field[] campos = NotaFiscal.class.getDeclaredFields();
		
		for(Field f: campos) {
			System.out.println(f.getType() + " " + f.getName());
			if(f.getName().length() <6) {
				System.err.println(f.getName() + " não atende padrão");
			}
		}
		
		Method[] metodos = NotaFiscal.class.getDeclaredMethods();
		
		for(Method f: metodos) {
			System.out.println(f.getName() + " " + f.getReturnType());
			if(listanegra.contains(f.getName())) {
				System.err.println(f.getName() + " não é um nome valido");
			}
		}
	}
}
