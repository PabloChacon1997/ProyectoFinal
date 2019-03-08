/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "Carreras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carreras.findAll", query = "SELECT c FROM Carreras c")
    , @NamedQuery(name = "Carreras.findByIdCarrera", query = "SELECT c FROM Carreras c WHERE c.idCarrera = :idCarrera")
    , @NamedQuery(name = "Carreras.findByCarreraNombre", query = "SELECT c FROM Carreras c WHERE c.carreraNombre = :carreraNombre")
    , @NamedQuery(name = "Carreras.findByCarreraCodigo", query = "SELECT c FROM Carreras c WHERE c.carreraCodigo = :carreraCodigo")
    , @NamedQuery(name = "Carreras.findByCarreraFechaInicio", query = "SELECT c FROM Carreras c WHERE c.carreraFechaInicio = :carreraFechaInicio")
    , @NamedQuery(name = "Carreras.findByCarreraFechaFin", query = "SELECT c FROM Carreras c WHERE c.carreraFechaFin = :carreraFechaFin")
    , @NamedQuery(name = "Carreras.findByCarreraModalidad", query = "SELECT c FROM Carreras c WHERE c.carreraModalidad = :carreraModalidad")
    , @NamedQuery(name = "Carreras.findByCarreraActivo", query = "SELECT c FROM Carreras c WHERE c.carreraActivo = :carreraActivo")})
public class Carreras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carrera")
    private Integer idCarrera;
    @Basic(optional = false)
    @Column(name = "carrera_nombre")
    private String carreraNombre;
    @Basic(optional = false)
    @Column(name = "carrera_codigo")
    private String carreraCodigo;
    @Column(name = "carrera_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date carreraFechaInicio;
    @Column(name = "carrera_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date carreraFechaFin;
    @Basic(optional = false)
    @Column(name = "carrera_modalidad")
    private String carreraModalidad;
    @Column(name = "carrera_activo")
    private Boolean carreraActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrera")
    private List<PeriodoLectivo> periodoLectivoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrera")
    private List<EjesFormacion> ejesFormacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrera")
    private List<Materias> materiasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrera")
    private List<AlumnosCarrera> alumnosCarreraList;
    @JoinColumn(name = "id_docente_coordinador", referencedColumnName = "id_docente")
    @ManyToOne
    private Docentes idDocenteCoordinador;

    public Carreras() {
    }

    public Carreras(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Carreras(Integer idCarrera, String carreraNombre, String carreraCodigo, String carreraModalidad) {
        this.idCarrera = idCarrera;
        this.carreraNombre = carreraNombre;
        this.carreraCodigo = carreraCodigo;
        this.carreraModalidad = carreraModalidad;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getCarreraNombre() {
        return carreraNombre;
    }

    public void setCarreraNombre(String carreraNombre) {
        this.carreraNombre = carreraNombre;
    }

    public String getCarreraCodigo() {
        return carreraCodigo;
    }

    public void setCarreraCodigo(String carreraCodigo) {
        this.carreraCodigo = carreraCodigo;
    }

    public Date getCarreraFechaInicio() {
        return carreraFechaInicio;
    }

    public void setCarreraFechaInicio(Date carreraFechaInicio) {
        this.carreraFechaInicio = carreraFechaInicio;
    }

    public Date getCarreraFechaFin() {
        return carreraFechaFin;
    }

    public void setCarreraFechaFin(Date carreraFechaFin) {
        this.carreraFechaFin = carreraFechaFin;
    }

    public String getCarreraModalidad() {
        return carreraModalidad;
    }

    public void setCarreraModalidad(String carreraModalidad) {
        this.carreraModalidad = carreraModalidad;
    }

    public Boolean getCarreraActivo() {
        return carreraActivo;
    }

    public void setCarreraActivo(Boolean carreraActivo) {
        this.carreraActivo = carreraActivo;
    }

    @XmlTransient
    public List<PeriodoLectivo> getPeriodoLectivoList() {
        return periodoLectivoList;
    }

    public void setPeriodoLectivoList(List<PeriodoLectivo> periodoLectivoList) {
        this.periodoLectivoList = periodoLectivoList;
    }

    @XmlTransient
    public List<EjesFormacion> getEjesFormacionList() {
        return ejesFormacionList;
    }

    public void setEjesFormacionList(List<EjesFormacion> ejesFormacionList) {
        this.ejesFormacionList = ejesFormacionList;
    }

    @XmlTransient
    public List<Materias> getMateriasList() {
        return materiasList;
    }

    public void setMateriasList(List<Materias> materiasList) {
        this.materiasList = materiasList;
    }

    @XmlTransient
    public List<AlumnosCarrera> getAlumnosCarreraList() {
        return alumnosCarreraList;
    }

    public void setAlumnosCarreraList(List<AlumnosCarrera> alumnosCarreraList) {
        this.alumnosCarreraList = alumnosCarreraList;
    }

    public Docentes getIdDocenteCoordinador() {
        return idDocenteCoordinador;
    }

    public void setIdDocenteCoordinador(Docentes idDocenteCoordinador) {
        this.idDocenteCoordinador = idDocenteCoordinador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrera != null ? idCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carreras)) {
            return false;
        }
        Carreras other = (Carreras) object;
        if ((this.idCarrera == null && other.idCarrera != null) || (this.idCarrera != null && !this.idCarrera.equals(other.idCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Carreras[ idCarrera=" + idCarrera + " ]";
    }

}
