package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOVenda {
    
      ConverteDataWEB converte = new ConverteDataWEB();
    private int lastId;

    public int getLastId() {
        return lastId;
    }

    public boolean incluir(Venda objVenda) {
        
        String sql = "insert into vendas_geral (datahoraVenda,tipoVenda,CLIENTES_codClientes) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
           
            pst.setDate(1, converte.converteBanco(objVenda.getDatahoraVenda()));
            pst.setString(2, objVenda.getTipoVenda());
            pst.setInt(3, objVenda.getClientes().getCodCliente());
            

            if (pst.executeUpdate() > 0) {
                 ResultSet rs = pst.getGeneratedKeys();// retorna o último idCaixa cadastrado
                if (rs.next()) {
                    lastId = rs.getInt(1); //armazena o último idCaixa cadastrado
                }
                 JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");

            } else {
                 JOptionPane.showMessageDialog(null, "Venda não cadastrada");

            }
            pst.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro de SQL no incluirVenda" + e.getMessage());

        }
        return false;
    }
    
    public boolean removeVenda(Venda objVenda) {
        String mensagem;
        String sql = "delete from vendas_geral where codVendaG=?";
        try {
            PreparedStatement stmt = Conexao.getPreparedStatement(sql);
            stmt.setInt(1, objVenda.getCodVendaG());
            if (stmt.executeUpdate() > 0) {
                 JOptionPane.showMessageDialog(null, "Venda cancelada");

            } else {
                 JOptionPane.showMessageDialog(null, "Venda não cancelada");

            }
            stmt.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro de SQL no remove venda" + e.getMessage() + "\nComando SQL = " + sql);
 

        }
        return false;
    }
    public Venda localizarVenda(Integer id) {
        String sql = "select * from vendas_geral where codVendaG = ?";
        Venda obj = new Venda();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
               pst.setDate(1, converte.converteBanco(obj.getDatahoraVenda()));
            pst.setString(2, obj.getTipoVenda());
            pst.setInt(3, obj.getClientes().getCodCliente());
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no localizarProduto" + e.getMessage());

        }
        return null;
    }
}
