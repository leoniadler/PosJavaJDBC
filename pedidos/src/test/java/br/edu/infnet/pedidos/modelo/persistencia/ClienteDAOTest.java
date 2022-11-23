package br.edu.infnet.pedidos.modelo.persistencia;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.infnet.pedidos.modelo.entidades.Cliente;
import br.edu.infnet.pedidos.modelo.persistencia.ClienteDAO;
import br.edu.infnet.pedidos.modelo.persistencia.IDAO;
import junit.framework.Assert;

public class ClienteDAOTest {

	
	@Before
	public void inicializar() {
		IDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente("Jose das Couves"); 
		clienteDAO.salvar(cliente);
	}
	
	
	@Test
	public void test() {
		IDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente("Jose das Couves"); 
		boolean validacao = clienteDAO.salvar(cliente);
		Assert.assertTrue(validacao);
	}
	
	
	@Test
	public void testUpdate() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = new Cliente("Maria das Couves", lista.get(0).getCodigo()); 
		boolean validacao = clienteDAO.atualizar(cliente);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void testDelete() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = new Cliente("Maria das Couves", lista.get(lista.size()-1).getCodigo()); 
		boolean validacao = clienteDAO.deletar(cliente);
		Assert.assertTrue(validacao);
	}
	
	
	@Test
	public void testListaClientes() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Assert.assertTrue(lista.size() > 0);
	}
	

	@Test
	public void testObterCliente() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = (Cliente) clienteDAO.obter(lista.get(0).getCodigo()); // coloquei o Cast
		Assert.assertNotNull(cliente);
	}

	
	
}
