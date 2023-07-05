package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public class Venda implements Serializable{

    private Integer codVendaG;
    private Calendar datahoraVenda;
    private String tipoVenda;
    private Clientes clientes = new Clientes();
 
    public Venda(){
    
    }

    public Integer getCodVendaG() {
        return codVendaG;
    }

    public void setCodVendaG(Integer codVendaG) {
        this.codVendaG = codVendaG;
    }

    public Calendar getDatahoraVenda() {
        return datahoraVenda;
    }

    public void setDatahoraVenda(Calendar datahoraVenda) {
        this.datahoraVenda = datahoraVenda;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.codVendaG, other.codVendaG)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "datahoraVenda=" + datahoraVenda + '}';
    }
    
    
}
