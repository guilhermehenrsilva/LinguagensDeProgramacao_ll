/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author guilh
 */
public class Categoria implements Serializable{
    
    private Integer codCategoria;
    private String nomeCategoria;

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codCategoria);
        hash = 97 * hash + Objects.hashCode(this.nomeCategoria);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.nomeCategoria, other.nomeCategoria)) {
            return false;
        }
        if (!Objects.equals(this.codCategoria, other.codCategoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomeCategoria;
    }
    
    
}
