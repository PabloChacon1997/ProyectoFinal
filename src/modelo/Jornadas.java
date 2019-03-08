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
@Table(name = "Jornadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jornadas.findAll", query = "SELECT j FROM Jornadas j")
    , @NamedQuery(name = "Jornadas.findByIdJornada", query = "SELECT j FROM Jornadas j WHERE j.idJornada = :idJornada")
    , @NamedQuery(name = "Jornadas.findByNombreJornada", query = "SELECT j FROM Jornadas j WHERE j.nombreJornada = :nombreJornada")})
public class Jornadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jornada")
    private Integer idJornada;
    @Basic(optional = false)
    @Column(name = "nombre_jornada")
    private String nombreJornada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJornada")
    private List<DetalleJornada> detalleJornadaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJornada")
    private List<Cursos> cursosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJornada")
    private List<JornadaDocente> jornadaDocenteList;

    public Jornadas() {
    }

    public Jornadas(Integer idJornada) {
        this.idJornada = idJornada;
    }

    public Jornadas(Integer idJornada, String nombreJornada) {
        this.idJornada = idJornada;
        this.nombreJornada = nombreJornada;
    }

    public Integer getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Integer idJornada) {
        this.idJornada = idJornada;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
    }

    @XmlTransient
    public List<DetalleJornada> getDetalleJornadaList() {
        return detalleJornadaList;
    }

    public void setDetalleJornadaList(List<DetalleJornada> detalleJornadaList) {
        this.detalleJornadaList = detalleJornadaList;
    }

    @XmlTransient
    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    @XmlTransient
    public List<JornadaDocente> getJornadaDocenteList() {
        return jornadaDocenteList;
    }

    public void setJornadaDocenteList(List<JornadaDocente> jornadaDocenteList) {
        this.jornadaDocenteList = jornadaDocenteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJornada != null ? idJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jornadas)) {
            return false;
        }
        Jornadas other = (Jornadas) object;
        if ((this.idJornada == null && other.idJornada != null) || (this.idJornada != null && !this.idJornada.equals(other.idJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Jornadas[ idJornada=" + idJornada + " ]";
    }

}
