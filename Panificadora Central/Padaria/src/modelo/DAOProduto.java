package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOProduto {
    
 DAOFornecedor daoFornecedor = new DAOFornecedor();
 DAOCategoria daoCategoria = new DAOCategoria();
 
    public List<Produto> getLista() {
        String sql = "select * from produtos";
        List<Produto> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto obj = new Produto();
                obj.setCodProduto(rs.getInt("codProduto"));
                obj.setNomeProduto(rs.getString("nomeProduto"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setQtdEstoque(rs.getDouble("qtdEstoque"));               
                obj.setFornecedor(daoFornecedor.localizar(rs.getString("FORNECEDORES_cnpj")));
                obj.setCategoria(daoCategoria.localizar(rs.getInt("CATEGORIA_codCategoria")));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista()" + e.getMessage());
        }
        return lista;
    }
    
     public boolean incluir(Produto obj) {
        String sql = "insert into produtos(nomeProduto,precoVenda,qtdEstoque,FORNECEDORES_cnpj,CATEGORIA_codCategoria) values(?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeProduto());
            pst.setDouble(2, obj.getPrecoVenda());
            pst.setDouble(3, obj.getQtdEstoque());
            pst.setInt(4, obj.getFornecedor().getCodFornecedor());    
            pst.setInt(5, obj.getCategoria().getCodCategoria());    
          
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto incluido");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não incluido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOProduto" + e.getMessage());

        }
        return false;
    }
     
     public boolean alterar(Produto obj) {
        String sql = "update produtos set nomeProduto=?,precoVenda=?,qtdEstoque=?,FORNECEDORES_cnpj=?,CATEGORIA_codCategoria=?  where codProduto=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeProduto());
            pst.setDouble(2, obj.getPrecoVenda());
            pst.setDouble(3, obj.getQtdEstoque());
            pst.setInt(4, obj.getFornecedor().getCodFornecedor());    
            pst.setInt(5, obj.getCategoria().getCodCategoria()); 
            pst.setInt(6, obj.getCodProduto());
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto alterado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produtonão alterado");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOProduto" + e.getMessage());

        }
        return false;
    }
     
      public boolean salvar(Produto obj) {
        if (obj.getCodProduto() == null) {
            return incluir (obj);
        } else {
            return alterar(obj);
        }

    }
     
    
     
     public boolean remover(Produto obj) {
        String sql = "delete from produtos where codProduto=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodProduto());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto excluído");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não excluído");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no excluir do DAOProduto" + e.getMessage());

        }
        return false;
    }
     
   
}
