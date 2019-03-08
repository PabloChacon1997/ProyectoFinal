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
@Table(name = "PeriodoLectivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodoLectivo.findAll", query = "SELECT p FROM PeriodoLectivo p")
    , @NamedQuery(name = "PeriodoLectivo.findByIdPrdLectivo", query = "SELECT p FROM PeriodoLectivo p WHERE p.idPrdLectivo = :idPrdLectivo")
    , @NamedQuery(name = "PeriodoLectivo.findByPrdLectivoNombre", query = "SELECT p FROM PeriodoLectivo p WHERE p.prdLectivoNombre = :prdLectivoNombre")
    , @NamedQuery(name = "PeriodoLectivo.findByPrdLectivoFechaInicio", query = "SELECT p FROM PeriodoLectivo p WHERE p.prdLectivoFechaInicio = :prdLectivoFechaInicio")
    , @NamedQuery(name = "PeriodoLectivo.findByPrdLectivoFechaFin", query = "SELECT p FROM PeriodoLectivo p WHERE p.prdLectivoFechaFin = :prdLectivoFechaFin")
    , @NamedQuery(name = "PeriodoLectivo.findByPrdLectivoObservacion", query = "SELECT p FROM PeriodoLectivo p WHERE p.prdLectivoObservacion = :prdLectivoObservacion")
    , @NamedQuery(name = "PeriodoLectivo.findByPrdLectivoActivo", query = "SELECT p FROM PeriodoLectivo p WHERE p.prdLectivoActivo = :prdLectivoActivo")})
public class PeriodoLectivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prd_lectivo")
    private Integer idPrdLectivo;
    @Basic(optional = false)
    @Column(name = "prd_lectivo_nombre")
    private String prdLectivoNombre;
    @Basic(optional = false)
    @Column(name = "prd_lectivo_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date prdLectivoFechaInicio;
    @Basic(optional = false)
    @Column(name = "prd_lectivo_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date prdLectivoFechaFin;
    @Basic(optional = false)
    @Column(name = "prd_lectivo_observacion")
    private String prdLectivoObservacion;
    @Basic(optional = false)
    @Column(name = "prd_lectivo_activo")
    private boolean prdLectivoActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrdLectivo")
    private List<Cursos> cursosList;
    @JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera")
    @ManyToOne(optional = false)
    private Carreras idCarrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrdLectivo")
    private List<JornadaDocente> jornadaDocenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrdLectivo")
    private List<PeriodoIngresoNotas> periodoIngresoNotasList;

    public PeriodoLectivo() {
    }

    public PeriodoLectivo(Integer idPrdLectivo) {
        this.idPrdLectivo = idPrdLectivo;
    }

    public PeriodoLectivo(Integer idPrdLectivo, String prdLectivoNombre, Date prdLectivoFechaInicio, Date prdLectivoFechaFin, String prdLectivoObservacion, boolean prdLectivoActivo) {
        this.idPrdLectivo = idPrdLectivo;
        this.prdLectivoNombre = prdLectivoNombre;
        this.prdLectivoFechaInicio = prdLectivoFechaInicio;
        this.prdLectivoFechaFin = prdLectivoFechaFin;
        this.prdLectivoObservacion = prdLectivoObservacion;
        this.prdLectivoActivo = prdLectivoActivo;
    }

    public Integer getIdPrdLectivo() {
        return idPrdLectivo;
    }

    public void setIdPrdLectivo(Integer idPrdLectivo) {
        this.idPrdLectivo = idPrdLectivo;
    }

    public String getPrdLectivoNombre() {
        return prdLectivoNombre;
    }

    public void setPrdLectivoNombre(String prdLectivoNombre) {
        this.prdLectivoNombre = prdLectivoNombre;
    }

    public Date getPrdLectivoFechaInicio() {
        return prdLectivoFechaInicio;
    }

    public void setPrdLectivoFechaInicio(Date prdLectivoFechaInicio) {
        this.prdLectivoFechaInicio = prdLectivoFechaInicio;
    }

    public Date getPrdLectivoFechaFin() {
        return prdLectivoFechaFin;
    }

    public void setPrdLectivoFechaFin(Date prdLectivoFechaFin) {
        this.prdLectivoFechaFin = prdLectivoFechaFin;
    }

    public String getPrdLectivoObservacion() {
        return prdLectivoObservacion;
    }

    public void setPrdLectivoObservacion(String prdLectivoObservacion) {
        this.prdLectivoObservacion = prdLectivoObservacion;
    }

    public boolean getPrdLectivoActivo() {
        return prdLectivoActivo;
    }

    public void setPrdLectivoActivo(boolean prdLectivoActivo) {
        this.prdLectivoActivo = prdLectivoActivo;
    }

    @XmlTransient
    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    public Carreras getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Carreras idCarrera) {
        this.idCarrera = idCarrera;
    }

    @XmlTransient
    public List<JornadaDocente> getJornadaDocenteList() {
        return jornadaDocenteList;
    }

    public void setJornadaDocenteList(List<JornadaDocente> jornadaDocenteList) {
        this.jornadaDocenteList = jornadaDocenteList;
    }

    @XmlTransient
    public List<PeriodoIngresoNotas> getPeriodoIngresoNotasList() {
        return periodoIngresoNotasList;
    }

    public void setPeriodoIngresoNotasList(List<PeriodoIngresoNotas> periodoIngresoNotasList) {
        this.periodoIngresoNotasList = periodoIngresoNotasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrdLectivo != null ? idPrdLectivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodoLectivo)) {
            return false;
        }
        PeriodoLectivo other = (PeriodoLectivo) object;
        if ((this.idPrdLectivo == null && other.idPrdLectivo != null) || (this.idPrdLectivo != null && !this.idPrdLectivo.equals(other.idPrdLectivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PeriodoLectivo[ idPrdLectivo=" + idPrdLectivo + " ]";
    }

}
