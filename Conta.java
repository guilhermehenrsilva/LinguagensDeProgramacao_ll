/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author guilherme
 */
public class Conta { // atributos ou variaveis de instancia 
    Cliente objCliente = new Cliente();
    Cliente objCliente2 ;
    private double saldo;
    private double limite;
    boolean tranfere;
    String getSaldo;
    
    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    public Cliente getObjCliente2() {
        return objCliente2;
    }

    public void setObjCliente2(Cliente objCliente2) {
        this.objCliente2 = objCliente2;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isTranfere() {
        return tranfere;
    }

    public void setTranfere(boolean tranfere) {
        this.tranfere = tranfere;
    }
    
    
    public void deposita(double saldo){
        this.saldo = this.saldo+saldo;
        System.out.println("Deposito feito com sucesso!");
        //this.saldo +=saldo;
    }

    public boolean saque(double saque) {
        if (this.saldo >= saque){
        this.saldo = this.saldo - saque;    
        System.out.println("Saque feito com sucesso!");
        return true ; }
        
        else {
            System.out.println("Saque não realizado!");
            return false ;       
                }
        
    }
     boolean Transfere (Conta Conta, double saldo){
        if (this.saque(saldo)== true ){
            Conta.deposita(saldo);
            return true;
        }
        else 
        {
            
            return false;
        }
    }
     
}
