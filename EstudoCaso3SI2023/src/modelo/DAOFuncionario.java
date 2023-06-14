/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class DAOFuncionario { // Data Acess Object
   
    DAOCidade objDAOCidade = new DAOCidade();
    
   /* public List<Funcionario> getLista(){
        return Dados.listaFuncionario;
    }
    
    public boolean salvar(Funcionario obj){
        if(obj.getCodigoFuncionario()==null){
            Integer codigo = Dados.listaFuncionario.size() +1;
            obj.setCodigoFuncionario(codigo);
            Dados.listaFuncionario.add(obj);
        }
        return true;
    }
    
    public boolean remover(Funcionario obj){
        Dados.listaFuncionario.remove(obj);
        return true;
    }    */
 public List<Funcionario> getLista(){
        String sql = "select * from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Funcionario obj = new Funcionario();
                obj.setCodigoFuncionario(rs.getInt("codigo"));
                obj.setNomeFuncionario(rs.getString("nome"));
                obj.setSalarioFuncionario(rs.getDouble("salario"));
                java.sql.Date dt = rs.getDate("nascimento");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setNascimentoFuncionario(c);
                obj.setObjCidade(objDAOCidade.localizar(rs.getInt("cidade")));
                
                
                lista.add(obj);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL no getList() do DAOFuncionario: "+ex.getMessage());
        }
        return lista;
    }
 
 public boolean incluir(Funcionario obj) {
        String sql = "insert into funcionario (nome,salario,nascimento,cidade) values(?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setDouble(2, obj.getSalarioFuncionario());
            pst.setDate(3, new java.sql.Date(obj.getNascimentoFuncionario().getTimeInMillis()));
            pst.setInt(4, obj.getObjCidade().getCodigoCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário incluido");
               return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não incluido");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOFuncionario" + e.getMessage());

        }
        return false;
  }
  public boolean salvar(Funcionario obj) throws SQLException {
        if (obj.getCodigoFuncionario()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
           
        }

    }
  public boolean alterar(Funcionario obj)throws SQLException {
        String sql = "update Funcionario set nome=?,salario=?, nascimento=?, cidade=? where codigo=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setDouble(2, obj.getSalarioFuncionario());
            pst.setDate(3, new java.sql.Date(obj.getNascimentoFuncionario().getTimeInMillis()));
            pst.setInt(4, obj.getObjCidade().getCodigoCidade());
            pst.setInt(5,obj.getCodigoFuncionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario Alterado");
               return true;
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario não Alterado");
               return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOFuncionario" + e.getMessage());

        }
        return false;
  }
  public boolean remover(Funcionario obj) {
        String sql = "delete from Funcionario where codigo=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1,obj.getCodigoFuncionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario Excluido");
               return true;
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario não Excluido");
               return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOFuncionario" + e.getMessage());

        }
        return false;
  }
}
 
  
    

    
    
    

