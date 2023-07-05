package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCliente {
    
        public List<Clientes> getListaClientes() {
        String sql = "select * from clientes";
        List<Clientes> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Clientes obj = new Clientes();
                obj.setCodCliente(rs.getInt("codCliente"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
                obj.setCpf(rs.getString("cpf"));
                java.sql.Date dt = rs.getDate("dataNascimento");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setDataNascimento(c);
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro de SQL no getLista()" + e.getMessage());
        }
        return lista;
    }
       public boolean salvar(Clientes obj) {
        if (obj.getCodCliente() == null) {
            return incluir (obj);
        } else {
            return alterar(obj);
        }

    }
    
    public boolean incluir(Clientes obj) {
        String sql = "insert into clientes (nomeCliente,cpf,dataNascimento,telefone,email) values(?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getCpf());
            pst.setDate  (3, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setString(4, obj.getTelefone());
            pst.setString(5, obj.getEmail());
          
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente incluido(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não incluido(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCliente" + e.getMessage());

        }
        return false;
    }

     public boolean alterar(Clientes obj) {
        String sql = "update clientes set nomeCliente=?,cpf=?,dataNascimento=?,telefone=?,email=?  where codCliente=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getCpf());
            pst.setDate(3, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setString(4, obj.getTelefone());
            pst.setString(5, obj.getEmail());
            pst.setInt(6, obj.getCodCliente());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente alterado(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não alterado(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCliente" + e.getMessage());

        }
        return false;
    }
    
   public boolean remover(Clientes obj) {
        String sql = "delete from clientes where codCliente=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCliente());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluído(a)");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não excluído(a)");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no excluir do DAOCliente" + e.getMessage());

        }
        return false;
    }
}
