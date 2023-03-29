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
public class Cliente {
    
    private String nome;
    private String cpf;
    private String RG;
    private Motorista m1;
    private Onibus onibus1;
    private Viagem viagem1 ;
    
   public Cliente(String nome, Motorista m1, Viagem viagem1, Onibus onibus1) {
        this.nome = nome;
        this.m1 = m1;
        this.viagem1 = viagem1;
        this.onibus1 = onibus1; 
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Motorista getM1() {
        return m1;
    }

    public void setM1(Motorista m1) {
        this.m1 = m1;
    }

    public Onibus getOnibus1() {
        return onibus1;
    }

    public void setOnibus1(Onibus onibus1) {
        this.onibus1 = onibus1;
    }

    public Viagem getViagem1() {
        return viagem1;
    }

    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }
      
   public void visualizarViagem() {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Motorista: " + this.getM1().getNome());
        System.out.println("Veiculo: " + this.getOnibus1().getModeloOnibus());
        System.out.println("Destino: " + this.getViagem1().getDestino());
        System.out.print("Valor KM: " + this.getViagem1().getValorKM() + " ");
        System.out.println("Distancia: " + this.getViagem1().getDistancia());
        System.out.println("Valor total viagem: " + getViagem1().getValorViagem());
}
}

