package br.edu.infnet.pedidos.modelo.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.pedidos.modelo.entidades.Cliente;
import br.edu.infnet.pedidos.modelo.entidades.Vendedor;

public class VendedorDAO extends JdbcDAO<Vendedor> {
	
	public VendedorDAO() {
		
	}

	@Override
	public Boolean salvar(Vendedor vendedor) {
		String sql = "insert into vendedor(descricao, codigo, contato) values (?,?, ?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, vendedor.getDescricao());
            pstm.setLong(2, vendedor.getCodigo());
            pstm.setString(3, vendedor.getContato());
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
	}

	@Override
	public Boolean atualizar(Vendedor vendedor) {
		  String sql = "update vendedor set descricao = ?, contato = ? where codigo = ?";
	        try {
	            pstm = con.prepareStatement(sql);
	            pstm.setString(1, vendedor.getDescricao());
	            pstm.setString(2, vendedor.getContato());
	            pstm.setLong(3, vendedor.getCodigo());
	            return pstm.executeUpdate() > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	}

	@Override
	public Boolean deletar(Vendedor vendedor) {
		String sql = "delete from vendedor where codigo = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setLong(1, vendedor.getCodigo());
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
	}

	@Override
	public Vendedor obter(Long codigo) {
		String sql = "select * from vendedor where codigo = ?";
        Vendedor vendedor = new Vendedor();
        try {
            pstm = con.prepareStatement(sql);
            pstm.setLong(1, codigo);
            rs = pstm.executeQuery();
            if(rs.next()) {
                String descricao = rs.getString("descricao");
                Long codigoDB = rs.getLong("codigo");
                String contato = rs.getString("contato");
                vendedor = new Vendedor(codigoDB, descricao, contato);
            }
            return vendedor;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public List<Vendedor> listarTodos() {
		 String sql = "select * from fornecedor";
	        List<Vendedor> vendedores = new ArrayList<>();
	        try {
	            stm = con.createStatement();
	            rs = stm.executeQuery(sql);
	            while(rs.next()) {
	                String descricao = rs.getString("descricao");
	                Long codigo = rs.getLong("codigo");
	                String contato = rs.getString("contato");
	                Vendedor vendedor = new Vendedor(codigo, descricao, contato);
	                vendedores.add(vendedor);
	            }
	            return vendedores;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}
	
}
