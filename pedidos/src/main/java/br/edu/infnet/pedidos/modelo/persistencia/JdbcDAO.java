package br.edu.infnet.pedidos.modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.edu.infnet.pedidos.modelo.JdbcUtil;
import br.edu.infnet.pedidos.modelo.entidades.Cliente;

public abstract class JdbcDAO<T> implements IDAO<T> {

	protected Connection con;
	protected PreparedStatement pstm;
	protected Statement stm;
	protected ResultSet rs;

	public JdbcDAO() {
		super();
		con = JdbcUtil.obterConexao();
	}

}