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
public class Onibus {
   
    private String cor;
    private String modeloOnibus;

    
    
   public Onibus(String cor, String modeloOnibus) {
        this.cor = cor;
        this.modeloOnibus = modeloOnibus;
    }
    
       
   public Onibus(String modelo) {
        this.modeloOnibus = modelo;
    }
   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModeloOnibus() {
        return modeloOnibus;
    }

    
    public void setModeloOnibus(String modeloCarreta) {
        this.modeloOnibus = modeloOnibus;
  }
    }  

