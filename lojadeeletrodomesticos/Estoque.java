/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeeletrodomesticos;

/**
 *
 * @author 15894822637
 */
public class Estoque {
    
    private int Quantidade;
    private double totalRealEstoque;
    private double valorEstoque;

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double getTotalRealEstoque() {
        return totalRealEstoque;
    }

    public void setTotalRealEstoque(double totalRealEstoque) {
        this.totalRealEstoque = valorEstoque * Quantidade;
    }

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque ;
    }
    

  

}
