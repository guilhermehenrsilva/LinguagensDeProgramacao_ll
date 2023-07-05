/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author guilh
 */

    public class ProdutosVendas implements Serializable{
    private Venda codvendaG;
    private Produto codProduto;
    private Integer qtdProduto;
    private Venda objVenda;
    private Produto objProduto;
    
    
     public ProdutosVendas (){
    
    }

    public Produto getObjProduto() {
        return objProduto;
    }

    public void setObjProduto(Produto objProduto) {
        this.objProduto = objProduto;
    }

    public Venda getObjVenda() {
        return objVenda;
    }

    public void setObjVenda(Venda objVenda) {
        this.objVenda = objVenda;
    }

        public Venda getCodvenda() {
            return codvendaG;
        }

        public void setCodvenda(Venda codvenda) {
            this.codvendaG = codvenda;
        }

        public Produto getCodProduto() {
            return codProduto;
        }

        public void setCodProduto(Produto codProduto) {
            this.codProduto = codProduto;
        }

        public  Integer getQtdProduto() {
            return qtdProduto;
        }

        public void setQtdProduto(Integer qtdProduto) {
            this.qtdProduto = qtdProduto;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 79 * hash + Objects.hashCode(this.codvendaG);
            hash = 79 * hash + Objects.hashCode(this.codProduto);
            hash = 79 * hash + Objects.hashCode(this.qtdProduto);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final ProdutosVendas other = (ProdutosVendas) obj;
            if (!Objects.equals(this.codvendaG, other.codvendaG)) {
                return false;
            }
            if (!Objects.equals(this.codProduto, other.codProduto)) {
                return false;
            }
            if (!Objects.equals(this.qtdProduto, other.qtdProduto)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "ItensVenda{" + "codvenda=" + codvendaG + ", codProduto=" + codProduto + ", qtdProduto=" + qtdProduto + '}';
        }
    
    
   }
    
