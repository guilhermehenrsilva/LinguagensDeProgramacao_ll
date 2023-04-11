/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.sintaxe;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio_5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double IMC , peso, altura;
        String  sexo ; 
        System.out.println("Qual é seu sexo");
        sexo=entrada.next();
        System.out.println("Entre com com seu peso: ");
        peso=entrada.nextDouble();
        System.out.println("Entre com sua altura: ");
        altura=entrada.nextDouble();
        IMC = peso / (altura * altura) ;
        System.out.println("Seu IMC É:"+IMC);
        
          
        if (IMC  < 19.1  ) {
            System.out.println("Abaixo do peso"); 
        }       
        else 
            System.out.println("peso ideal"); 
        if  (IMC > 26.4){
        System.out.println("Obeso");
        }
        
    }
    }

    
    