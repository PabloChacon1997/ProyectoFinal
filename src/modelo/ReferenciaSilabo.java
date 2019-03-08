/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "ReferenciaSilabo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReferenciaSilabo.findAll", query = "SELECT r FROM ReferenciaSilabo r")
    , @NamedQuery(name = "ReferenciaSilabo.findByIdReferenciaSilabo", query = "SELECT r FROM ReferenciaSilabo r WHERE r.idReferenciaSilabo = :idReferenciaSilabo")})
public class ReferenciaSilabo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_referencia_silabo")
    private Integer idReferenciaSilabo;
    @JoinColumn(name = "id_referencia", referencedColumnName = "id_referencia")
    @ManyToOne(optional = false)
    private Referencias idReferencia;
    @JoinColumn(name = "id_silabo", referencedColumnName = "id_silabo")
    @ManyToOne(optional = false)
    private Silabo idSilabo;

    public ReferenciaSilabo() {
    }

    public ReferenciaSilabo(Integer idReferenciaSilabo) {
        this.idReferenciaSilabo = idReferenciaSilabo;
    }

    public Integer getIdReferenciaSilabo() {
        return idReferenciaSilabo;
    }

    public void setIdReferenciaSilabo(Integer idReferenciaSilabo) {
        this.idReferenciaSilabo = idReferenciaSilabo;
    }

    public Referencias getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Referencias idReferencia) {
        this.idReferencia = idReferencia;
    }

    public Silabo getIdSilabo() {
        return idSilabo;
    }

    public void setIdSilabo(Silabo idSilabo) {
        this.idSilabo = idSilabo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReferenciaSilabo != null ? idReferenciaSilabo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferenciaSilabo)) {
            return false;
        }
        ReferenciaSilabo other = (ReferenciaSilabo) object;
        if ((this.idReferenciaSilabo == null && other.idReferenciaSilabo != null) || (this.idReferenciaSilabo != null && !this.idReferenciaSilabo.equals(other.idReferenciaSilabo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ReferenciaSilabo[ idReferenciaSilabo=" + idReferenciaSilabo + " ]";
    }

}
