/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author guilh
 */
public class TesteCasa {
     public static void main(String[] args) {
        Porta porta1 = new Porta(false, "verde", 80, 200, 3);
        Porta porta2 = new Porta(true, "azul", 90, 210, 4);
        Porta porta3 = new Porta(false, "vermelha", 100, 220, 5);

        Casa casa = new Casa("amarela", porta1, porta2, porta3);

        System.out.println("Cor da casa: " + casa.getCor());

        casa.pinta("laranja");
        System.out.println("Nova cor da casa: " + casa.getCor());

        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());

        porta1.abre();
        porta2.abre();

        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());

        porta1.fecha();
        porta2.fecha();

        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}
