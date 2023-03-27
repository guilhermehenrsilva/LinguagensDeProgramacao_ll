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
public class Cliente {
    private String nome;
    private String cpf;
    private String RG;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;
    
   
     public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;         
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

    public Caminhoneiro getC1() {
        return c1;
    }

    public void setC1(Caminhoneiro c1) {
        this.c1 = c1;
    }

    public Viagem getViagem1() {
        return viagem1;
    }

    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }

    public Carreta getCarreta1() {
        return carreta1;
    }

    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }
    public void visualizarViagem() {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Motorista: " + this.getC1().getNome());
        System.out.println("Veiculo: " + this.getCarreta1().getModeloCarreta());
        System.out.println("Destino: " + this.getViagem1().getDestino());
        System.out.print("Valor KM: " + this.getViagem1().getValorKM() + " ");
        System.out.println("Distancia: " + this.getViagem1().getDistancia());
        System.out.println("Valor total viagem: " + this.getViagem1().getValorViagem());
    }
}
