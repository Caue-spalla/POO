package pjAula6_19_03.br.unisal.colecoes;

import java.util.Collection;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		Collection<String> c= new TreeSet<String>();
		//HashSet
		/**
		Produto produto = new Produto(1435, "adasd");
		Produto produtoA = new Produto(143435, "adadhhjsd");
		
		c.add(produtoA);
		c.add(produto);
		
		
		System.out.println(c);
		**/
		
		c.add("Ana");
		c.add("maria");
		c.add("zmaaaaa");
		
		System.out.println(c);
	}
}
