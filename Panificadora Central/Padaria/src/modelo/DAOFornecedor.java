package modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFornecedor {
    
    public List<Fornecedor> getLista() {
        String sql = "select * from fornecedores";
        List<Fornecedor> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setCodFornecedor(rs.getInt("codFornecedor"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setNomeFornecedor(rs.getString("nomeFornecedor"));
                obj.setTelefoneFornecedor(rs.getString("telefoneFornecedor"));
                obj.setEmail(rs.getString("email"));
                obj.setCidadeFornecedor(rs.getString("cidadeFornecedor"));
                obj.setUf(rs.getString("uf"));
                
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista()" + e.getMessage());
        }
        return lista;
    }
    
    
    public boolean incluir(Fornecedor obj) {
        String sql = "insert into fornecedores (cnpj,nomeFornecedor,"
                            + "telefoneFornecedor,email,cidadeFornecedor,uf) values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getCnpj());
            pst.setString(2, obj.getNomeFornecedor());
            pst.setString(3, obj.getTelefoneFornecedor());
            pst.setString(4, obj.getEmail());
            pst.setString(5, obj.getCidadeFornecedor());
            pst.setString(6, obj.getUf());
          
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor incluido(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não incluido(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOFornecedor" + e.getMessage());

        }
        return false;
    }
    
    
    public boolean alterar(Fornecedor obj) {
        String sql = "update fornecedores set cnpj=?,nomeFornecedor=?,"
                                      + "telefoneFornecedor=?,email=?,cidadeFornecedor=? , uf=? where codFornecedor=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
           
            pst.setString(1, obj.getCnpj());
            pst.setString(2, obj.getNomeFornecedor());
            pst.setString(3, obj.getTelefoneFornecedor());
            pst.setString(4, obj.getEmail());
            pst.setString(5, obj.getCidadeFornecedor());
            pst.setString(6, obj.getUf());
            pst.setInt(7, obj.getCodFornecedor());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor alterado(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não alterado(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOFornecedor" + e.getMessage());

        }
        return false;
    }
    
    
     public boolean salvar(Fornecedor obj) {
        if (obj.getCodFornecedor()== null) {
            return incluir (obj);
        } else {
            return alterar(obj);
        }

    }
    
    public boolean remover(Fornecedor obj) {
        String sql = "delete from fornecedores where codFornecedor=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodFornecedor());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor excluído(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não excluído(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no excluir do DAOFornecedor" + e.getMessage());

        }
        return false;
    }
     public Fornecedor localizar(String id){
        String sql = "select * from fornecedores where codFornecedor=?";
        Fornecedor obj = new Fornecedor();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                obj.setCodFornecedor(rs.getInt("codFornecedor"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setNomeFornecedor(rs.getString("nomeFornecedor"));
                
                return obj;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog
        (null,"Erro de SQL Localizar"+e.getMessage());
    }
        return null;
    }
}
