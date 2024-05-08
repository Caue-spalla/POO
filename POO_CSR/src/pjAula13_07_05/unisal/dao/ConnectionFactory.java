package pjAula13_07_05.unisal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Prover uma ponte de conexão com SGBD - Sistema Gerenciador de B. Dados
 * @author Paulo Barreto
 * @data 03/05/2024
 */

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbaula13",
					"root",
					"unisal"
					);
		}catch(ClassNotFoundException erro) {
			throw new SQLException("Houve um erro, não foi possível a conexão "
					+ erro);
		}
	}
}
