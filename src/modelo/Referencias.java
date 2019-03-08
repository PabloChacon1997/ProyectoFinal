/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "Referencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referencias.findAll", query = "SELECT r FROM Referencias r")
    , @NamedQuery(name = "Referencias.findByIdReferencia", query = "SELECT r FROM Referencias r WHERE r.idReferencia = :idReferencia")
    , @NamedQuery(name = "Referencias.findByCodigoReferencia", query = "SELECT r FROM Referencias r WHERE r.codigoReferencia = :codigoReferencia")
    , @NamedQuery(name = "Referencias.findByDescripcionReferencia", query = "SELECT r FROM Referencias r WHERE r.descripcionReferencia = :descripcionReferencia")
    , @NamedQuery(name = "Referencias.findByTipoReferencia", query = "SELECT r FROM Referencias r WHERE r.tipoReferencia = :tipoReferencia")
    , @NamedQuery(name = "Referencias.findByExisteEnBiblioteca", query = "SELECT r FROM Referencias r WHERE r.existeEnBiblioteca = :existeEnBiblioteca")})
public class Referencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_referencia")
    private Integer idReferencia;
    @Basic(optional = false)
    @Column(name = "codigo_referencia")
    private String codigoReferencia;
    @Basic(optional = false)
    @Column(name = "descripcion_referencia")
    private String descripcionReferencia;
    @Basic(optional = false)
    @Column(name = "tipo_referencia")
    private String tipoReferencia;
    @Basic(optional = false)
    @Column(name = "existe_en_biblioteca")
    private boolean existeEnBiblioteca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReferencia")
    private List<ReferenciaSilabo> referenciaSilaboList;

    public Referencias() {
    }

    public Referencias(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }

    public Referencias(Integer idReferencia, String codigoReferencia, String descripcionReferencia, String tipoReferencia, boolean existeEnBiblioteca) {
        this.idReferencia = idReferencia;
        this.codigoReferencia = codigoReferencia;
        this.descripcionReferencia = descripcionReferencia;
        this.tipoReferencia = tipoReferencia;
        this.existeEnBiblioteca = existeEnBiblioteca;
    }

    public Integer getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public String getDescripcionReferencia() {
        return descripcionReferencia;
    }

    public void setDescripcionReferencia(String descripcionReferencia) {
        this.descripcionReferencia = descripcionReferencia;
    }

    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    public boolean getExisteEnBiblioteca() {
        return existeEnBiblioteca;
    }

    public void setExisteEnBiblioteca(boolean existeEnBiblioteca) {
        this.existeEnBiblioteca = existeEnBiblioteca;
    }

    @XmlTransient
    public List<ReferenciaSilabo> getReferenciaSilaboList() {
        return referenciaSilaboList;
    }

    public void setReferenciaSilaboList(List<ReferenciaSilabo> referenciaSilaboList) {
        this.referenciaSilaboList = referenciaSilaboList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReferencia != null ? idReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referencias)) {
            return false;
        }
        Referencias other = (Referencias) object;
        if ((this.idReferencia == null && other.idReferencia != null) || (this.idReferencia != null && !this.idReferencia.equals(other.idReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Referencias[ idReferencia=" + idReferencia + " ]";
    }

}
