/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;


 //*
 //* @author guilh
/**
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Conta minhaConta = new Conta ();
        Conta outraConta = new Conta ();
        
        System.out.println(minhaConta);
        System.out.println("Saldo Minha conta: "+minhaConta.getSaldo());  
        
        
        System.out.println(outraConta);
        System.out.println("Saldo Outra Conta:"+outraConta.getSaldo());
       
        
        System.out.println("Digite um valor para deposito para minha conta: ");
        minhaConta.deposita(entrada.nextDouble());
        
        
        
        System.out.println("Digite um valor para Saque: ");
        minhaConta.saque(entrada.nextDouble());  
        
        System.out.println("Digite um valor para transferencia: ");
        minhaConta.Transfere(outraConta, entrada.nextDouble());
        
        
        System.out.println("Saldo Minha conta após saque: "+minhaConta.getSaldo());
        
        System.out.println("Saldo Minha outra conta após saque: "+outraConta.getSaldo());
        
        
        
       
       
         //Conta outraConta = new Conta();
         //Conta minhaConta = new Conta(); //criando um objeto
        // minhaConta.deposita(1000);
       
      //  outraConta.saldo = 1500;
      
        
}
}
// Classe: especificação de um objeto(o que ele contém)
// Objeto: Estancia de uma classe (cópia de uma classe0