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
public class Funcionario {
    
    private String nome;
    private String departamento;
    private double salario;
    private String dataAdmissao;
    private String rg;
    private boolean ativo=true;
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void demite(){
        this.setAtivo(false);
    }
    
    public void bonifica(double aumento){
        this.salario+=aumento;
    }
    
    public void mostra (){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Deparmento : "+ this.getDepartamento());
        System.out.println("Salario: "+ this.getSalario());
        System.out.println("Data de Admissao : "+ this.getDataAdmissao());
        System.out.println("RG : "+ this.getRg());
        System.out.println("Funcionario ativo? : "+ this.getAtivo());
      
    }
   
   
    
    
}
