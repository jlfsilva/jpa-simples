/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriajpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOSÉLUISFREIREDASILV
 */
@Entity
@Table(name = "cardapio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cardapio.findAll", query = "SELECT c FROM Cardapio c")
    , @NamedQuery(name = "Cardapio.findByCod", query = "SELECT c FROM Cardapio c WHERE c.cod = :cod")
    , @NamedQuery(name = "Cardapio.findByTipooferta", query = "SELECT c FROM Cardapio c WHERE c.tipooferta = :tipooferta")
    , @NamedQuery(name = "Cardapio.findByDescricao", query = "SELECT c FROM Cardapio c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Cardapio.findByPreco", query = "SELECT c FROM Cardapio c WHERE c.preco = :preco")
    , @NamedQuery(name = "Cardapio.findByQuantsolicitacoes", query = "SELECT c FROM Cardapio c WHERE c.quantsolicitacoes = :quantsolicitacoes")})
public class Cardapio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod")
    private Integer cod;
    @Basic(optional = false)
    @Column(name = "tipooferta")
    private String tipooferta;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "preco")
    private float preco;
    @Basic(optional = false)
    @Column(name = "quantsolicitacoes")
    private int quantsolicitacoes;

    public Cardapio() {
    }

    public Cardapio(Integer cod) {
        this.cod = cod;
    }

    public Cardapio(Integer cod, String tipooferta, String descricao, float preco, int quantsolicitacoes) {
        this.cod = cod;
        this.tipooferta = tipooferta;
        this.descricao = descricao;
        this.preco = preco;
        this.quantsolicitacoes = quantsolicitacoes;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getTipooferta() {
        return tipooferta;
    }

    public void setTipooferta(String tipooferta) {
        this.tipooferta = tipooferta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantsolicitacoes() {
        return quantsolicitacoes;
    }

    public void setQuantsolicitacoes(int quantsolicitacoes) {
        this.quantsolicitacoes = quantsolicitacoes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod != null ? cod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cardapio)) {
            return false;
        }
        Cardapio other = (Cardapio) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafeteriajpa.Cardapio[ cod=" + cod + " ]";
    }
    
}
