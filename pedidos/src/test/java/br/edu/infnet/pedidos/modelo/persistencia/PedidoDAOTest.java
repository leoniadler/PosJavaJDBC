package br.edu.infnet.pedidos.modelo.persistencia;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.infnet.pedidos.modelo.entidades.Cliente;
import br.edu.infnet.pedidos.modelo.entidades.Pedido;
import br.edu.infnet.pedidos.modelo.entidades.Produto;
import br.edu.infnet.pedidos.modelo.persistencia.IDAO;
import br.edu.infnet.pedidos.modelo.persistencia.PedidoDAO;
import junit.framework.Assert;

public class PedidoDAOTest {
	
	
	@Test
	public void testaListaPedidos() {
		IDAO pedidoDAO = new PedidoDAO();
		List<Pedido> lista = pedidoDAO.listarTodos();
		System.out.println(lista);
		Assert.assertTrue(lista.size() > 0);
	}
	
	

}
