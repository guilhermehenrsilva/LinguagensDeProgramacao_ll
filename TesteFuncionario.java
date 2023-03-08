/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner (System.in);
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Guilherme Henrique");
            System.out.println("nome:"+f1.getNome());
        
        f1.setRg("MG12345678");
            System.out.println("RG: "+f1.getRg());
        
        f1.setDataAdmissao("06-03-2023");
            System.out.println("Data de admissão: "+f1.getDataAdmissao());
        
        f1.setDepartamento("Fiscal");
            System.out.println("Departamento: "+f1.getDepartamento());
        
        f1.setSalario(1000.0);
            System.out.println("Salario: "+ f1.getSalario());
        
        f1.bonifica(50);
        
        
        f1.mostra();
        f1.demite();
       // f1.mostra();
        
        
    }
}
    
