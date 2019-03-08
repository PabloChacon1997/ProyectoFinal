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
@Table(name = "Silabo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Silabo.findAll", query = "SELECT s FROM Silabo s")
    , @NamedQuery(name = "Silabo.findByIdSilabo", query = "SELECT s FROM Silabo s WHERE s.idSilabo = :idSilabo")
    , @NamedQuery(name = "Silabo.findByEstadoSilabo", query = "SELECT s FROM Silabo s WHERE s.estadoSilabo = :estadoSilabo")})
public class Silabo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_silabo")
    private Integer idSilabo;
    @Basic(optional = false)
    @Column(name = "estado_silabo")
    private String estadoSilabo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSilabo")
    private List<EvaluacionSilabo> evaluacionSilaboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSilabo")
    private List<ReferenciaSilabo> referenciaSilaboList;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateria;

    public Silabo() {
    }

    public Silabo(Integer idSilabo) {
        this.idSilabo = idSilabo;
    }

    public Silabo(Integer idSilabo, String estadoSilabo) {
        this.idSilabo = idSilabo;
        this.estadoSilabo = estadoSilabo;
    }

    public Integer getIdSilabo() {
        return idSilabo;
    }

    public void setIdSilabo(Integer idSilabo) {
        this.idSilabo = idSilabo;
    }

    public String getEstadoSilabo() {
        return estadoSilabo;
    }

    public void setEstadoSilabo(String estadoSilabo) {
        this.estadoSilabo = estadoSilabo;
    }

    @XmlTransient
    public List<EvaluacionSilabo> getEvaluacionSilaboList() {
        return evaluacionSilaboList;
    }

    public void setEvaluacionSilaboList(List<EvaluacionSilabo> evaluacionSilaboList) {
        this.evaluacionSilaboList = evaluacionSilaboList;
    }

    @XmlTransient
    public List<ReferenciaSilabo> getReferenciaSilaboList() {
        return referenciaSilaboList;
    }

    public void setReferenciaSilaboList(List<ReferenciaSilabo> referenciaSilaboList) {
        this.referenciaSilaboList = referenciaSilaboList;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSilabo != null ? idSilabo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Silabo)) {
            return false;
        }
        Silabo other = (Silabo) object;
        if ((this.idSilabo == null && other.idSilabo != null) || (this.idSilabo != null && !this.idSilabo.equals(other.idSilabo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Silabo[ idSilabo=" + idSilabo + " ]";
    }

}
