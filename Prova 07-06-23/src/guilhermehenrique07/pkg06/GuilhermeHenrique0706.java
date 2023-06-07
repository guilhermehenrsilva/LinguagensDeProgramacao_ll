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
public class GuilhermeHenrique0706 {

    /**
     * @param args the command line arguments
     */
   
         public static void main(String[] args) {
        Veiculo veiculo1 = new VeiculoPequeno("xyz5252", "Uno","Fiat",2012,24000.00,"cinza");
        Veiculo veiculo2 = new VeiculoGrande("XYZ789", 30);
        
        veiculo1.mover();
        veiculo1.parar();
        veiculo1.dadosVeiculo();
        veiculo1.registraPlaca();
        
        System.out.println("-----------");
        
        veiculo2.mover();
        veiculo2.parar();
        veiculo2.dadosVeiculo();
        veiculo2.registraPlaca();
    }
}
    
    

