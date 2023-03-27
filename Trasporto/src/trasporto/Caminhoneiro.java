/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto;

/**
 *
 * @author guilh
 */
public class Caminhoneiro {
    private String nome;
    private String cnpj;
    private String cpf;
    private double salario;

public Caminhoneiro(String nome,String cnpj, String cpf, double salario){
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
