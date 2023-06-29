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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class DAOCategoria {
    
    public List<Categoria> getLista() {
        String sql = "select * from categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Categoria obj = new Categoria();
                obj.setCodCategoria(rs.getInt("codCategoria"));
                obj.setNomeCategoria(rs.getString("nomeCategoria"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getLista()" + e.getMessage());
        }
        return lista;
    }
    
     public Categoria localizar(Integer id){
        String sql = "select * from categoria where codCategoria=?";
        Categoria obj = new Categoria();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                obj.setCodCategoria(rs.getInt("codCategoria"));
                obj.setNomeCategoria(rs.getString("nomeCategoria"));
                              
                return obj;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog
        (null,"Erro de SQL Localizar"+e.getMessage());
    }
        return null;
    }
     public boolean salvar(Categoria obj) {
        if (obj.getCodCategoria()== null) {
            return incluir (obj);
        } else {
            return alterar(obj);
        }

    }
    
    public boolean incluir(Categoria obj) {
        String sql = "insert into categoria ( nomeCategoria) values(?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            
           
            pst.setString(1, obj.getNomeCategoria());
            
            
          
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Categoria incluida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria não incluida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCategoria" + e.getMessage());

        }
        return false;
    }

     public boolean alterar(Categoria obj) {
        String sql = "update categoria set nomeCategoria=? where codCategoria=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCategoria());
            pst.setInt(2, obj.getCodCategoria());
           
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Categoria alterada");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria não alterada");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCategoria" + e.getMessage());

        }
        return false;
    }
    
   public boolean remover(Categoria obj) {
        String sql = "delete from categoria where codCategoria=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCategoria());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Categoria excluída");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Categoria não excluída");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no excluir do DAOCategoria" + e.getMessage());

        }
        return false;
    }
}
