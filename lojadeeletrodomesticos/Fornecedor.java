/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeeletrodomesticos;

/**
 *
 * @author guilh
 */
public class Fornecedor {
    private String razaoSocial;
    private String emailFor; 
    private String cidadeFor; 
    private String enderecoFor;
    private long telefoneFor;
    private long cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmailFor() {
        return emailFor;
    }

    public void setEmailFor(String emailFor) {
        this.emailFor = emailFor;
    }

    public String getEnderecoFor() {
        return enderecoFor;
    }

    public void setEnderecoFor(String enderecoFor) {
        this.enderecoFor = enderecoFor;
    }

    public long getTelefoneFor() {
        return telefoneFor;
    }

    public void setTelefoneFor(long telefoneFor) {
        this.telefoneFor = telefoneFor;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidadeFor() {
        return cidadeFor;
    }

    public void setCidadeFor(String cidadeFor) {
        this.cidadeFor = cidadeFor;
    }
    
}
