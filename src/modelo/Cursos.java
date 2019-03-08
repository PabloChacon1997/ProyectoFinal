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
@Table(name = "Cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c")
    , @NamedQuery(name = "Cursos.findByIdCurso", query = "SELECT c FROM Cursos c WHERE c.idCurso = :idCurso")
    , @NamedQuery(name = "Cursos.findByCursoNombre", query = "SELECT c FROM Cursos c WHERE c.cursoNombre = :cursoNombre")
    , @NamedQuery(name = "Cursos.findByCursoCapacidad", query = "SELECT c FROM Cursos c WHERE c.cursoCapacidad = :cursoCapacidad")
    , @NamedQuery(name = "Cursos.findByCursoCiclo", query = "SELECT c FROM Cursos c WHERE c.cursoCiclo = :cursoCiclo")
    , @NamedQuery(name = "Cursos.findByCursoPermisoIngresoNt", query = "SELECT c FROM Cursos c WHERE c.cursoPermisoIngresoNt = :cursoPermisoIngresoNt")})
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_curso")
    private Integer idCurso;
    @Basic(optional = false)
    @Column(name = "curso_nombre")
    private String cursoNombre;
    @Basic(optional = false)
    @Column(name = "curso_capacidad")
    private int cursoCapacidad;
    @Basic(optional = false)
    @Column(name = "curso_ciclo")
    private int cursoCiclo;
    @Basic(optional = false)
    @Column(name = "curso_permiso_ingreso_nt")
    private boolean cursoPermisoIngresoNt;
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(optional = false)
    private Docentes idDocente;
    @JoinColumn(name = "id_jornada", referencedColumnName = "id_jornada")
    @ManyToOne(optional = false)
    private Jornadas idJornada;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateria;
    @JoinColumn(name = "id_prd_lectivo", referencedColumnName = "id_prd_lectivo")
    @ManyToOne(optional = false)
    private PeriodoLectivo idPrdLectivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso")
    private List<SesionClase> sesionClaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso")
    private List<AlumnoCurso> alumnoCursoList;

    public Cursos() {
    }

    public Cursos(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Cursos(Integer idCurso, String cursoNombre, int cursoCapacidad, int cursoCiclo, boolean cursoPermisoIngresoNt) {
        this.idCurso = idCurso;
        this.cursoNombre = cursoNombre;
        this.cursoCapacidad = cursoCapacidad;
        this.cursoCiclo = cursoCiclo;
        this.cursoPermisoIngresoNt = cursoPermisoIngresoNt;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public int getCursoCapacidad() {
        return cursoCapacidad;
    }

    public void setCursoCapacidad(int cursoCapacidad) {
        this.cursoCapacidad = cursoCapacidad;
    }

    public int getCursoCiclo() {
        return cursoCiclo;
    }

    public void setCursoCiclo(int cursoCiclo) {
        this.cursoCiclo = cursoCiclo;
    }

    public boolean getCursoPermisoIngresoNt() {
        return cursoPermisoIngresoNt;
    }

    public void setCursoPermisoIngresoNt(boolean cursoPermisoIngresoNt) {
        this.cursoPermisoIngresoNt = cursoPermisoIngresoNt;
    }

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
        this.idDocente = idDocente;
    }

    public Jornadas getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Jornadas idJornada) {
        this.idJornada = idJornada;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

    public PeriodoLectivo getIdPrdLectivo() {
        return idPrdLectivo;
    }

    public void setIdPrdLectivo(PeriodoLectivo idPrdLectivo) {
        this.idPrdLectivo = idPrdLectivo;
    }

    @XmlTransient
    public List<SesionClase> getSesionClaseList() {
        return sesionClaseList;
    }

    public void setSesionClaseList(List<SesionClase> sesionClaseList) {
        this.sesionClaseList = sesionClaseList;
    }

    @XmlTransient
    public List<AlumnoCurso> getAlumnoCursoList() {
        return alumnoCursoList;
    }

    public void setAlumnoCursoList(List<AlumnoCurso> alumnoCursoList) {
        this.alumnoCursoList = alumnoCursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cursos[ idCurso=" + idCurso + " ]";
    }

}
