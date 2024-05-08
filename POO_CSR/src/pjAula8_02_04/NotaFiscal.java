package pjAula8_02_04;

import java.util.List;

public class NotaFiscal {
	
	public static int sequencia = 1;
	public static double cambio;
	
	private int numero;
	private String fornecedor;
	private double total;
	private List<NotaFiscalItem> itens;	

	public NotaFiscal() {
		this.numero = sequencia++;
	}
	
	//Getters and Setters
	public int getNumero() {
		return numero;
	}
	
	
	
	public void mama() {
		
	}
	public void  meajuda() {
		
	}
	public void  funcaodesespero() {
		
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<NotaFiscalItem> getItens() {
		return itens;
	}
	public void setItens(List<NotaFiscalItem> itens) {
		this.itens = itens;
	}
	
}
