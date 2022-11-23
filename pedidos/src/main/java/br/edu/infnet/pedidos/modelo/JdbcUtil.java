package br.edu.infnet.pedidos.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class JdbcUtil {

	private static org.slf4j.Logger logger =  LoggerFactory.getLogger(JdbcUtil.class);
	
	public static Connection obterConexao() {
		
		logger.info("Iniciando conexao com o banco");
		
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/app02?createDatabaseIfNotExist=true";
		
		
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			logger.error("Erro ao conectar", e);
			throw new RuntimeException(e);
		}
		
	}

}
