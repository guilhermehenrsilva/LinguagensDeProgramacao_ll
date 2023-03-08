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
public class TestePessoa {
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas ();
        
         p1.setNome("Guilherme Henrique");
            System.out.println("nome:"+p1.getNome());
         
         p1.setIdade(25);
            System.out.println("Idade:"+p1.getIdade());
            
        p1.fazAniversario();
            System.out.println("PARABÉNS !!!!");
           
        System.out.println(p1.getNome());
            System.out.println("Idade:"+p1.getIdade());
            
            
         
            
    }
    
}
