/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilhermehenrique07.pkg06;

/**
 *
 * @author guilh
 */

    
    class VeiculoPequeno extends Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
        

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public VeiculoPequeno(String placa, String modelo, String marca, int ano, Double preco,String cor) {
        super(placa);
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.cor= cor;
    }
    
    @Override
    public void mover() {
        System.out.println("Veículo pequeno modelo " + modelo + " em movimento.");
    }
    
    @Override
    public void parar() {
        System.out.println("Veículo pequeno modelo " + modelo + " parado.");
    }
    
    @Override
    public void dadosVeiculo() {
        super.dadosVeiculo();
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("ano: " + ano);
        System.out.println("preço: " + preco);
        System.out.println("cor: " + cor);
    
    }
}


