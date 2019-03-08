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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "EjesFormacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EjesFormacion.findAll", query = "SELECT e FROM EjesFormacion e")
    , @NamedQuery(name = "EjesFormacion.findByIdEje", query = "SELECT e FROM EjesFormacion e WHERE e.idEje = :idEje")
    , @NamedQuery(name = "EjesFormacion.findByEjeCodigo", query = "SELECT e FROM EjesFormacion e WHERE e.ejeCodigo = :ejeCodigo")
    , @NamedQuery(name = "EjesFormacion.findByEjeNombre", query = "SELECT e FROM EjesFormacion e WHERE e.ejeNombre = :ejeNombre")})
public class EjesFormacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje")
    private Integer idEje;
    @Basic(optional = false)
    @Column(name = "eje_codigo")
    private String ejeCodigo;
    @Basic(optional = false)
    @Column(name = "eje_nombre")
    private String ejeNombre;
    @JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera")
    @ManyToOne(optional = false)
    private Carreras idCarrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEje")
    private List<Materias> materiasList;

    public EjesFormacion() {
    }

    public EjesFormacion(Integer idEje) {
        this.idEje = idEje;
    }

    public EjesFormacion(Integer idEje, String ejeCodigo, String ejeNombre) {
        this.idEje = idEje;
        this.ejeCodigo = ejeCodigo;
        this.ejeNombre = ejeNombre;
    }

    public Integer getIdEje() {
        return idEje;
    }

    public void setIdEje(Integer idEje) {
        this.idEje = idEje;
    }

    public String getEjeCodigo() {
        return ejeCodigo;
    }

    public void setEjeCodigo(String ejeCodigo) {
        this.ejeCodigo = ejeCodigo;
    }

    public String getEjeNombre() {
        return ejeNombre;
    }

    public void setEjeNombre(String ejeNombre) {
        this.ejeNombre = ejeNombre;
    }

    public Carreras getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Carreras idCarrera) {
        this.idCarrera = idCarrera;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEje != null ? idEje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjesFormacion)) {
            return false;
        }
        EjesFormacion other = (EjesFormacion) object;
        if ((this.idEje == null && other.idEje != null) || (this.idEje != null && !this.idEje.equals(other.idEje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EjesFormacion[ idEje=" + idEje + " ]";
    }

}
