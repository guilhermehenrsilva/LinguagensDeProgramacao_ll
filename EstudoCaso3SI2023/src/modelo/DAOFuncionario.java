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
    
    public List<Funcionario> getLista(){
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
    }    
 public List<Funcionario> getLita(){
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
}
    

    
    
    

