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
public class TestePorta {
    public static void main(String[] args) {
        Porta porta = new Porta(false, "azul", 100, 200, 3);

        System.out.println("Porta criada: " + porta.getCor() + ", "
        +porta.getDimensaoX() + "x" + porta.getDimensaoY() + "x" + porta.getDimensaoZ());
        

        porta.abre();
        System.out.println("Porta aberta? " + porta.isAberta());

        porta.fecha();
        System.out.println("Porta aberta? " + porta.isAberta());

        porta.pinta("verde");
        System.out.println("Cor da porta: " + porta.getCor());

        porta.setDimensaoX(80);
        porta.setDimensaoY(180);
        porta.setDimensaoZ(4);
        System.out.println("Novas dimensões da porta: " + porta.getDimensaoX() + "x" + porta.getDimensaoY() + "x" + porta.getDimensaoZ());
    }
}
