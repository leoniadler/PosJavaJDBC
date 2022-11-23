package br.edu.infnet.pedidos.modelo.persistencia;

import java.util.List;

import br.edu.infnet.pedidos.modelo.entidades.Cliente;
import br.edu.infnet.pedidos.modelo.entidades.Vendedor;

public interface IDAO<T> {

	//CRUD
	//CREATE RETRIEVE UPDATE DELETE
	Boolean salvar(T obj);

	Boolean atualizar(T obj);

	Boolean deletar(T obj);

	T obter(Long codigo);
	
	

	List<T> listarTodos();

}