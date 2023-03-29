/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilherme_henrique_29_03;

/**
 *
 * @author guilh
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Onibus CT-7000");
        Motorista m1 = new Motorista("Joao Alves", "12.345.789/0001-10", "123.456.789-10", 2500.00);
        Viagem v1 = new Viagem(4.5, .0, 350.0);
        Cliente cli1 = new Cliente("Pedro",m1, v1,onibus1);
        
        v1.setDestino("Sao Paulo");
        v1.carcularViagem();
        cli1.visualizarViagem();
    }
    
}
