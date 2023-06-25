package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCliente {
    
    //public List<Clientes> getLista(){ // DATA ACESS OBJECT
        //return Dados.listaCliente;
        public List<Clientes> getLista() {
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
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                java.sql.Date dt = rs.getDate("dataNascimento");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setDataNascimento(c);
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista()" + e.getMessage());
        }
        return lista;
    }
    public boolean incluir(Clientes obj) {
        String sql = "insert into clientes (codCliente , nomeCliente,cpf,telefone,email) values(null,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getCpf());
           // pst.setDate(3, new java.sql.Date(obj.getDataNascimento().getTimeInMillis()));
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getEmail());
          
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

     public boolean salvar(Clientes obj){
        if(obj.getCodCliente() == null){
            Integer codigo = Dados.listaCliente.size() + 1;
            obj.setCodCliente(codigo);
            Dados.listaCliente.add(obj);
        }
        return true;
    }
    
    public boolean remover(Clientes obj){
        Dados.listaCliente.remove(obj);
        return true;
    }
}
