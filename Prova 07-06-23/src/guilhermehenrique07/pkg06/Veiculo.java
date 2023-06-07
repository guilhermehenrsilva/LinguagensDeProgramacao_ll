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

    
    abstract class Veiculo {
    private String placa;
    
    
    public Veiculo(String placa) {
        this.placa = placa;
    }
    
    public abstract void mover();
    
    public abstract void parar();
    
    public void dadosVeiculo() {
        
        System.out.println("Placa: " + placa);
    }
    
    public void registraPlaca() {
        System.out.println("Número da placa: " + placa);
    }
}

