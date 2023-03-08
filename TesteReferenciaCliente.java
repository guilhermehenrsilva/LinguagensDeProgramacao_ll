/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author guilh
 */
public class TesteReferenciaCliente {
    public static void main(String[] args) {
        Conta c1 = new Conta ();
        c1.objCliente.setNome("Guilherme Henrique");
        System.out.println("nome:"+c1.objCliente.getNome());
        c1.deposita(50000);
        
        
    }
    
}
