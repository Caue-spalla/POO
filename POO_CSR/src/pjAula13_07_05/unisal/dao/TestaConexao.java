package pjAula13_07_05.unisal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import pjAula13_07_05.unisal.modelagem.Cliente;

public class TestaConexao {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			if(con != null) {
				System.out.println("Conex�o Realizada");
				
				Cliente cliente = new Cliente();
				cliente.setCpf(123456789);
				cliente.setNome("Paulo C. Barreto");
				cliente.setEndRua("Av. Brasil");
				cliente.setEndNum(1000);
				cliente.setEndBairro("Jardim Gl�ria");
				cliente.setEndCidade("Americana");
				cliente.setEndUF("SP");
				cliente.setSexo("M");
				
				ClienteDao dao = new ClienteDao();
				dao.adicionar(cliente);
				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
