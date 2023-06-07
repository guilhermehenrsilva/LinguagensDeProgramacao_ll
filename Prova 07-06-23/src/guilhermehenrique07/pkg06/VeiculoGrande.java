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

    class VeiculoGrande extends Veiculo {
    private int capacidade;
    
    public VeiculoGrande(String placa, int capacidade) {
        super(placa);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public void mover() {
        System.out.println("Veículo grande com capacidade para " + capacidade + " pessoas em movimento.");
    }
    
    @Override
    public void parar() {
        System.out.println("Veículo grande com capacidade para " + capacidade + " pessoas parado.");
    }
    
    @Override
    public void dadosVeiculo() {
        super.dadosVeiculo();
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }
}


