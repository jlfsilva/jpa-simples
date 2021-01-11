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
@Table(name = "tiposdeofertas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposdeofertas.findAll", query = "SELECT t FROM Tiposdeofertas t")
    , @NamedQuery(name = "Tiposdeofertas.findByTipooferta", query = "SELECT t FROM Tiposdeofertas t WHERE t.tipooferta = :tipooferta")
    , @NamedQuery(name = "Tiposdeofertas.findByDescoferta", query = "SELECT t FROM Tiposdeofertas t WHERE t.descoferta = :descoferta")})
public class Tiposdeofertas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tipooferta")
    private String tipooferta;
    @Column(name = "descoferta")
    private String descoferta;

    public Tiposdeofertas() {
    }

    public Tiposdeofertas(String tipooferta) {
        this.tipooferta = tipooferta;
    }

    public String getTipooferta() {
        return tipooferta;
    }

    public void setTipooferta(String tipooferta) {
        this.tipooferta = tipooferta;
    }

    public String getDescoferta() {
        return descoferta;
    }

    public void setDescoferta(String descoferta) {
        this.descoferta = descoferta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipooferta != null ? tipooferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposdeofertas)) {
            return false;
        }
        Tiposdeofertas other = (Tiposdeofertas) object;
        if ((this.tipooferta == null && other.tipooferta != null) || (this.tipooferta != null && !this.tipooferta.equals(other.tipooferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafeteriajpa.Tiposdeofertas[ tipooferta=" + tipooferta + " ]";
    }
    
}
