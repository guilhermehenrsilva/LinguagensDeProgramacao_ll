package modelo;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import java.text.SimpleDateFormat;

public class Clientes implements Serializable{
    
    private Integer codCliente;
    private String nomeCliente;
    private String cpf;
    private String email;
    private String telefone;
    private Calendar dataNascimento;

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
            
    public Clientes() {
        
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codCliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.codCliente, other.codCliente)) {
            return false;
        }
        return true;
    }
    
    @Transient
    public String getNascimentoFormatado(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataNascimento.getTime());
    }
    
}
