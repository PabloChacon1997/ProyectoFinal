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
@Table(name = "TipoActividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoActividad.findAll", query = "SELECT t FROM TipoActividad t")
    , @NamedQuery(name = "TipoActividad.findByIdTipoActividad", query = "SELECT t FROM TipoActividad t WHERE t.idTipoActividad = :idTipoActividad")
    , @NamedQuery(name = "TipoActividad.findByNombreTipoActividad", query = "SELECT t FROM TipoActividad t WHERE t.nombreTipoActividad = :nombreTipoActividad")
    , @NamedQuery(name = "TipoActividad.findByNombreSubtipoActividad", query = "SELECT t FROM TipoActividad t WHERE t.nombreSubtipoActividad = :nombreSubtipoActividad")})
public class TipoActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_actividad")
    private Integer idTipoActividad;
    @Basic(optional = false)
    @Column(name = "nombre_tipo_actividad")
    private String nombreTipoActividad;
    @Basic(optional = false)
    @Column(name = "nombre_subtipo_actividad")
    private String nombreSubtipoActividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoActividad")
    private List<EvaluacionSilabo> evaluacionSilaboList;

    public TipoActividad() {
    }

    public TipoActividad(Integer idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public TipoActividad(Integer idTipoActividad, String nombreTipoActividad, String nombreSubtipoActividad) {
        this.idTipoActividad = idTipoActividad;
        this.nombreTipoActividad = nombreTipoActividad;
        this.nombreSubtipoActividad = nombreSubtipoActividad;
    }

    public Integer getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(Integer idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public String getNombreTipoActividad() {
        return nombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        this.nombreTipoActividad = nombreTipoActividad;
    }

    public String getNombreSubtipoActividad() {
        return nombreSubtipoActividad;
    }

    public void setNombreSubtipoActividad(String nombreSubtipoActividad) {
        this.nombreSubtipoActividad = nombreSubtipoActividad;
    }

    @XmlTransient
    public List<EvaluacionSilabo> getEvaluacionSilaboList() {
        return evaluacionSilaboList;
    }

    public void setEvaluacionSilaboList(List<EvaluacionSilabo> evaluacionSilaboList) {
        this.evaluacionSilaboList = evaluacionSilaboList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoActividad != null ? idTipoActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoActividad)) {
            return false;
        }
        TipoActividad other = (TipoActividad) object;
        if ((this.idTipoActividad == null && other.idTipoActividad != null) || (this.idTipoActividad != null && !this.idTipoActividad.equals(other.idTipoActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TipoActividad[ idTipoActividad=" + idTipoActividad + " ]";
    }

}
