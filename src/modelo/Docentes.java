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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "Docentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docentes.findAll", query = "SELECT d FROM Docentes d")
    , @NamedQuery(name = "Docentes.findByIdDocente", query = "SELECT d FROM Docentes d WHERE d.idDocente = :idDocente")
    , @NamedQuery(name = "Docentes.findByDocenteCodigo", query = "SELECT d FROM Docentes d WHERE d.docenteCodigo = :docenteCodigo")
    , @NamedQuery(name = "Docentes.findByDocenteOtroTrabajo", query = "SELECT d FROM Docentes d WHERE d.docenteOtroTrabajo = :docenteOtroTrabajo")
    , @NamedQuery(name = "Docentes.findByDocenteCategoria", query = "SELECT d FROM Docentes d WHERE d.docenteCategoria = :docenteCategoria")
    , @NamedQuery(name = "Docentes.findByDocenteFechaContrato", query = "SELECT d FROM Docentes d WHERE d.docenteFechaContrato = :docenteFechaContrato")
    , @NamedQuery(name = "Docentes.findByDocenteFechaFin", query = "SELECT d FROM Docentes d WHERE d.docenteFechaFin = :docenteFechaFin")
    , @NamedQuery(name = "Docentes.findByDocenteTipoTiempo", query = "SELECT d FROM Docentes d WHERE d.docenteTipoTiempo = :docenteTipoTiempo")
    , @NamedQuery(name = "Docentes.findByDocenteActivo", query = "SELECT d FROM Docentes d WHERE d.docenteActivo = :docenteActivo")
    , @NamedQuery(name = "Docentes.findByDocenteObservacion", query = "SELECT d FROM Docentes d WHERE d.docenteObservacion = :docenteObservacion")
    , @NamedQuery(name = "Docentes.findByDocenteCapacitador", query = "SELECT d FROM Docentes d WHERE d.docenteCapacitador = :docenteCapacitador")})
public class Docentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_docente")
    private Integer idDocente;
    @Column(name = "docente_codigo")
    private String docenteCodigo;
    @Column(name = "docente_otro_trabajo")
    private Boolean docenteOtroTrabajo;
    @Column(name = "docente_categoria")
    private Integer docenteCategoria;
    @Column(name = "docente_fecha_contrato")
    @Temporal(TemporalType.DATE)
    private Date docenteFechaContrato;
    @Column(name = "docente_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date docenteFechaFin;
    @Column(name = "docente_tipo_tiempo")
    private String docenteTipoTiempo;
    @Basic(optional = false)
    @Column(name = "docente_activo")
    private boolean docenteActivo;
    @Column(name = "docente_observacion")
    private String docenteObservacion;
    @Basic(optional = false)
    @Column(name = "docente_capacitador")
    private boolean docenteCapacitador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente")
    private List<Cursos> cursosList;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @OneToOne(optional = false)
    private Personas idPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente")
    private List<JornadaDocente> jornadaDocenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente")
    private List<DocentesMateria> docentesMateriaList;
    @OneToMany(mappedBy = "idDocenteCoordinador")
    private List<Carreras> carrerasList;

    public Docentes() {
    }

    public Docentes(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Docentes(Integer idDocente, boolean docenteActivo, boolean docenteCapacitador) {
        this.idDocente = idDocente;
        this.docenteActivo = docenteActivo;
        this.docenteCapacitador = docenteCapacitador;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public String getDocenteCodigo() {
        return docenteCodigo;
    }

    public void setDocenteCodigo(String docenteCodigo) {
        this.docenteCodigo = docenteCodigo;
    }

    public Boolean getDocenteOtroTrabajo() {
        return docenteOtroTrabajo;
    }

    public void setDocenteOtroTrabajo(Boolean docenteOtroTrabajo) {
        this.docenteOtroTrabajo = docenteOtroTrabajo;
    }

    public Integer getDocenteCategoria() {
        return docenteCategoria;
    }

    public void setDocenteCategoria(Integer docenteCategoria) {
        this.docenteCategoria = docenteCategoria;
    }

    public Date getDocenteFechaContrato() {
        return docenteFechaContrato;
    }

    public void setDocenteFechaContrato(Date docenteFechaContrato) {
        this.docenteFechaContrato = docenteFechaContrato;
    }

    public Date getDocenteFechaFin() {
        return docenteFechaFin;
    }

    public void setDocenteFechaFin(Date docenteFechaFin) {
        this.docenteFechaFin = docenteFechaFin;
    }

    public String getDocenteTipoTiempo() {
        return docenteTipoTiempo;
    }

    public void setDocenteTipoTiempo(String docenteTipoTiempo) {
        this.docenteTipoTiempo = docenteTipoTiempo;
    }

    public boolean getDocenteActivo() {
        return docenteActivo;
    }

    public void setDocenteActivo(boolean docenteActivo) {
        this.docenteActivo = docenteActivo;
    }

    public String getDocenteObservacion() {
        return docenteObservacion;
    }

    public void setDocenteObservacion(String docenteObservacion) {
        this.docenteObservacion = docenteObservacion;
    }

    public boolean getDocenteCapacitador() {
        return docenteCapacitador;
    }

    public void setDocenteCapacitador(boolean docenteCapacitador) {
        this.docenteCapacitador = docenteCapacitador;
    }

    @XmlTransient
    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    @XmlTransient
    public List<JornadaDocente> getJornadaDocenteList() {
        return jornadaDocenteList;
    }

    public void setJornadaDocenteList(List<JornadaDocente> jornadaDocenteList) {
        this.jornadaDocenteList = jornadaDocenteList;
    }

    @XmlTransient
    public List<DocentesMateria> getDocentesMateriaList() {
        return docentesMateriaList;
    }

    public void setDocentesMateriaList(List<DocentesMateria> docentesMateriaList) {
        this.docentesMateriaList = docentesMateriaList;
    }

    @XmlTransient
    public List<Carreras> getCarrerasList() {
        return carrerasList;
    }

    public void setCarrerasList(List<Carreras> carrerasList) {
        this.carrerasList = carrerasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docentes)) {
            return false;
        }
        Docentes other = (Docentes) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Docentes[ idDocente=" + idDocente + " ]";
    }

}
