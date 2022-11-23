package br.edu.infnet.pedidos.modelo.persistencia;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.infnet.pedidos.modelo.entidades.Vendedor;

public class VendedorDAOTest {

	@Test
    public void test(){
        IDAO vendedorDAO = new VendedorDAO();
        Vendedor vendedor = new Vendedor(1l, "Vendedor 01", "33433333");
        boolean validacao = vendedorDAO.salvar(vendedor);
        Assert.assertTrue(validacao);

    }

    @Test
    public void testUpdate() {
        IDAO vendedorDAO = new VendedorDAO();
        List<Vendedor> lista = vendedorDAO.listarTodos();
        Vendedor vendedor = new Vendedor(lista.get(0).getCodigo(), "Vendedor alterado", "33435555");
        boolean validacao = vendedorDAO.atualizar(vendedor);
        Assert.assertTrue(validacao);
    }

    @Test
    public void testDelete() {
        IDAO vendedorDAO = new VendedorDAO();
        List<Vendedor> lista = vendedorDAO.listarTodos();
        Vendedor vendedor = new Vendedor(lista.get(lista.size()-1).getCodigo(), "Vendedor alterado", "33436666");
        boolean validacao = vendedorDAO.deletar(vendedor);
        Assert.assertTrue(validacao);
    }

    @Test
    public void testListaFornecedores() {
        IDAO vendedorDAO = new VendedorDAO();
        List<Vendedor> lista = vendedorDAO.listarTodos();
        Assert.assertTrue(lista.size() > 0);
    }

    @Test
    public void testObterFornecedor() {
        IDAO vendedorDAO = new VendedorDAO();
        List<Vendedor> lista = vendedorDAO.listarTodos();
        Object vendedor = vendedorDAO.obter(lista.get(0).getCodigo());
        Assert.assertNotNull(vendedor);;
    }

}
