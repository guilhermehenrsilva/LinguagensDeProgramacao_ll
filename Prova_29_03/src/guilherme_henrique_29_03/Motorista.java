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
public class Motorista {
    private String nome;
    private String cnpj;
    private String cpf;
    private double salario;
    
    

public Motorista(String nome,String cnpj, String cpf, double salario){
    this.nome = nome;
    this.cnpj = cnpj;
    this.cpf = cpf; 
    this.salario = salario;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
    
