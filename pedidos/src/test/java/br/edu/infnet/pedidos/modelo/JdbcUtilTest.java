package br.edu.infnet.pedidos.modelo;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.edu.infnet.pedidos.modelo.JdbcUtil;
import junit.framework.Assert;




@SuppressWarnings("deprecation")
public class JdbcUtilTest {

	@Test
	public void testConexao() {
		try (Connection obterConexao = JdbcUtil.obterConexao()){
			Assert.assertTrue("Conectado", true);
			
		} catch (SQLException e) {
//			e.printStackTrace();
			fail();
		};
	}

}
