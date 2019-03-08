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
@Table(name = "AlumnosCarrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlumnosCarrera.findAll", query = "SELECT a FROM AlumnosCarrera a")
    , @NamedQuery(name = "AlumnosCarrera.findByIdAlmnCarrera", query = "SELECT a FROM AlumnosCarrera a WHERE a.idAlmnCarrera = :idAlmnCarrera")
    , @NamedQuery(name = "AlumnosCarrera.findByAlmnCarreraActivo", query = "SELECT a FROM AlumnosCarrera a WHERE a.almnCarreraActivo = :almnCarreraActivo")})
public class AlumnosCarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_almn_carrera")
    private Integer idAlmnCarrera;
    @Basic(optional = false)
    @Column(name = "almn_carrera_activo")
    private boolean almnCarreraActivo;
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne(optional = false)
    private Alumnos idAlumno;
    @JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera")
    @ManyToOne(optional = false)
    private Carreras idCarrera;

    public AlumnosCarrera() {
    }

    public AlumnosCarrera(Integer idAlmnCarrera) {
        this.idAlmnCarrera = idAlmnCarrera;
    }

    public AlumnosCarrera(Integer idAlmnCarrera, boolean almnCarreraActivo) {
        this.idAlmnCarrera = idAlmnCarrera;
        this.almnCarreraActivo = almnCarreraActivo;
    }

    public Integer getIdAlmnCarrera() {
        return idAlmnCarrera;
    }

    public void setIdAlmnCarrera(Integer idAlmnCarrera) {
        this.idAlmnCarrera = idAlmnCarrera;
    }

    public boolean getAlmnCarreraActivo() {
        return almnCarreraActivo;
    }

    public void setAlmnCarreraActivo(boolean almnCarreraActivo) {
        this.almnCarreraActivo = almnCarreraActivo;
    }

    public Alumnos getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumnos idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Carreras getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Carreras idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlmnCarrera != null ? idAlmnCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumnosCarrera)) {
            return false;
        }
        AlumnosCarrera other = (AlumnosCarrera) object;
        if ((this.idAlmnCarrera == null && other.idAlmnCarrera != null) || (this.idAlmnCarrera != null && !this.idAlmnCarrera.equals(other.idAlmnCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AlumnosCarrera[ idAlmnCarrera=" + idAlmnCarrera + " ]";
    }

}
