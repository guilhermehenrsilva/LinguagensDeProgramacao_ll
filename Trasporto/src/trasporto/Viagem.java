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
public class Viagem {
    private String  Destino;
    private double valorKM;
    private double valorViagem;
    private double distancia;
    
    public Viagem (double km, double valor, double dist){
        this.valorKM = km;
        this.valorViagem = valor;
        this.distancia = dist;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public double getValorKM() {
        return valorKM;
    }

    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }

    public double getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void carcularViagem(){
        this.setValorViagem(this.getValorKM() * this.getDistancia());
}
}
