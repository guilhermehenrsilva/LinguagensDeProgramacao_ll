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
public class DAOProdutosVendas {
    
    DAOProduto daoProduto = new DAOProduto();
    DAOVenda daoVenda = new DAOVenda();

    public List<ProdutosVendas> getListaProdutosVendas(Integer id) {
        String sql = "select * from produtos_venda where VENDAS_GERAL_codVendaG=?";
        List<ProdutosVendas> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ProdutosVendas obj = new ProdutosVendas();
                System.out.println("IDVENDA="+rs.getInt("VENDAS_GERAL_codVendaG"));
                obj.setCodvenda(daoVenda.localizarVenda(rs.getInt("VENDAS_GERAL_codVendaG")));
                obj.setCodProduto(daoProduto.localizarProduto(rs.getInt("PRODUTOS_codProduto")));
                obj.setQtdProduto(rs.getInt("qtdProduto"));
                
                lista.add(obj);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getListaItensVenda" + e.getMessage());

        }
        return lista;
    }

    public boolean incluir(ProdutosVendas objProdutosVendas) {

        String sql = "insert into produtos_venda (VENDAS_GERAL_codVendaG,PRODUTOS_codProduto,qtdProdutos) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            
            pst.setInt(1, objProdutosVendas.getCodvenda().getCodVendaG());    
            pst.setInt(2, objProdutosVendas.getCodProduto().getCodProduto()); 
            pst.setInt(3, objProdutosVendas.getQtdProduto());
            

            if (pst.executeUpdate() > 0) {

               // JOptionPane.showMessageDialog(null, "Item de venda cadastrado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Item de venda não cadastrado!");

            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no getListaItensVenda" + e.getMessage());

        }
        return false;
    }
}
