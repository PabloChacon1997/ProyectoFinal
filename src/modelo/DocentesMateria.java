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
@Table(name = "DocentesMateria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocentesMateria.findAll", query = "SELECT d FROM DocentesMateria d")
    , @NamedQuery(name = "DocentesMateria.findByIdDocenteMat", query = "SELECT d FROM DocentesMateria d WHERE d.idDocenteMat = :idDocenteMat")
    , @NamedQuery(name = "DocentesMateria.findByDocenteMatActivo", query = "SELECT d FROM DocentesMateria d WHERE d.docenteMatActivo = :docenteMatActivo")})
public class DocentesMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_docente_mat")
    private Integer idDocenteMat;
    @Basic(optional = false)
    @Column(name = "docente_mat_activo")
    private boolean docenteMatActivo;
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(optional = false)
    private Docentes idDocente;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateria;

    public DocentesMateria() {
    }

    public DocentesMateria(Integer idDocenteMat) {
        this.idDocenteMat = idDocenteMat;
    }

    public DocentesMateria(Integer idDocenteMat, boolean docenteMatActivo) {
        this.idDocenteMat = idDocenteMat;
        this.docenteMatActivo = docenteMatActivo;
    }

    public Integer getIdDocenteMat() {
        return idDocenteMat;
    }

    public void setIdDocenteMat(Integer idDocenteMat) {
        this.idDocenteMat = idDocenteMat;
    }

    public boolean getDocenteMatActivo() {
        return docenteMatActivo;
    }

    public void setDocenteMatActivo(boolean docenteMatActivo) {
        this.docenteMatActivo = docenteMatActivo;
    }

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
        this.idDocente = idDocente;
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
        hash += (idDocenteMat != null ? idDocenteMat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocentesMateria)) {
            return false;
        }
        DocentesMateria other = (DocentesMateria) object;
        if ((this.idDocenteMat == null && other.idDocenteMat != null) || (this.idDocenteMat != null && !this.idDocenteMat.equals(other.idDocenteMat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DocentesMateria[ idDocenteMat=" + idDocenteMat + " ]";
    }

}
