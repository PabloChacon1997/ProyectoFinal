/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "UnidadSilabo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadSilabo.findAll", query = "SELECT u FROM UnidadSilabo u")
    , @NamedQuery(name = "UnidadSilabo.findByIdUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByNumeroUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.numeroUnidad = :numeroUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByObjetivoEspecificoUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.objetivoEspecificoUnidad = :objetivoEspecificoUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByResultadosAprendizajeUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.resultadosAprendizajeUnidad = :resultadosAprendizajeUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByContenidosUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.contenidosUnidad = :contenidosUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByFechaInicioUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.fechaInicioUnidad = :fechaInicioUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByFechaFinUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.fechaFinUnidad = :fechaFinUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByHorasDocenciaUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.horasDocenciaUnidad = :horasDocenciaUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByHorasPracticaUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.horasPracticaUnidad = :horasPracticaUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByHorasAutonomoUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.horasAutonomoUnidad = :horasAutonomoUnidad")
    , @NamedQuery(name = "UnidadSilabo.findByEstrategiasUnidad", query = "SELECT u FROM UnidadSilabo u WHERE u.estrategiasUnidad = :estrategiasUnidad")})
public class UnidadSilabo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad")
    private Integer idUnidad;
    @Basic(optional = false)
    @Column(name = "numero_unidad")
    private String tituloUnidad;
    private int numeroUnidad;
    @Basic(optional = false)
    @Column(name = "objetivo_especifico_unidad")
    private String objetivoEspecificoUnidad;
    @Basic(optional = false)
    @Column(name = "resultados_aprendizaje_unidad")
    private String resultadosAprendizajeUnidad;
    @Basic(optional = false)
    @Column(name = "contenidos_unidad")
    private String contenidosUnidad;
    @Basic(optional = false)
    @Column(name = "fecha_inicio_unidad")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaInicioUnidad;
    @Basic(optional = false)
    @Column(name = "fecha_fin_unidad")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaFinUnidad;
    @Basic(optional = false)
    @Column(name = "horas_docencia_unidad")
    private int horasDocenciaUnidad;
    @Basic(optional = false)
    @Column(name = "horas_practica_unidad")
    private int horasPracticaUnidad;
    @Basic(optional = false)
    @Column(name = "horas_autonomo_unidad")
    private int horasAutonomoUnidad;
    @Basic(optional = false)
    @Column(name = "estrategias_unidad")
    private String estrategiasUnidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidad")
    private List<EvaluacionSilabo> evaluacionSilaboList;

    public UnidadSilabo() {
    }

    public UnidadSilabo(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public UnidadSilabo(Integer idUnidad, int numeroUnidad, String objetivoEspecificoUnidad, String resultadosAprendizajeUnidad, String contenidosUnidad, LocalDate fechaInicioUnidad, LocalDate fechaFinUnidad, int horasDocenciaUnidad, int horasPracticaUnidad, int horasAutonomoUnidad, String estrategiasUnidad) {
        this.idUnidad = idUnidad;
        this.numeroUnidad = numeroUnidad;
        this.objetivoEspecificoUnidad = objetivoEspecificoUnidad;
        this.resultadosAprendizajeUnidad = resultadosAprendizajeUnidad;
        this.contenidosUnidad = contenidosUnidad;
        this.fechaInicioUnidad = fechaInicioUnidad;
        this.fechaFinUnidad = fechaFinUnidad;
        this.horasDocenciaUnidad = horasDocenciaUnidad;
        this.horasPracticaUnidad = horasPracticaUnidad;
        this.horasAutonomoUnidad = horasAutonomoUnidad;
        this.estrategiasUnidad = estrategiasUnidad;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public String getObjetivoEspecificoUnidad() {
        return objetivoEspecificoUnidad;
    }

    public void setObjetivoEspecificoUnidad(String objetivoEspecificoUnidad) {
        this.objetivoEspecificoUnidad = objetivoEspecificoUnidad;
    }

    public String getResultadosAprendizajeUnidad() {
        return resultadosAprendizajeUnidad;
    }

    public void setResultadosAprendizajeUnidad(String resultadosAprendizajeUnidad) {
        this.resultadosAprendizajeUnidad = resultadosAprendizajeUnidad;
    }

    public String getContenidosUnidad() {
        return contenidosUnidad;
    }

    public void setContenidosUnidad(String contenidosUnidad) {
        this.contenidosUnidad = contenidosUnidad;
    }

    public LocalDate getFechaInicioUnidad() {
        return fechaInicioUnidad;
    }

    public void setFechaInicioUnidad(LocalDate fechaInicioUnidad) {
        this.fechaInicioUnidad = fechaInicioUnidad;
    }

    public LocalDate getFechaFinUnidad() {
        return fechaFinUnidad;
    }

    public void setFechaFinUnidad(LocalDate fechaFinUnidad) {
        this.fechaFinUnidad = fechaFinUnidad;
    }

    public int getHorasDocenciaUnidad() {
        return horasDocenciaUnidad;
    }

    public void setHorasDocenciaUnidad(int horasDocenciaUnidad) {
        this.horasDocenciaUnidad = horasDocenciaUnidad;
    }

    public int getHorasPracticaUnidad() {
        return horasPracticaUnidad;
    }

    public void setHorasPracticaUnidad(int horasPracticaUnidad) {
        this.horasPracticaUnidad = horasPracticaUnidad;
    }

    public int getHorasAutonomoUnidad() {
        return horasAutonomoUnidad;
    }

    public void setHorasAutonomoUnidad(int horasAutonomoUnidad) {
        this.horasAutonomoUnidad = horasAutonomoUnidad;
    }

    public String getEstrategiasUnidad() {
        return estrategiasUnidad;
    }

    public void setEstrategiasUnidad(String estrategiasUnidad) {
        this.estrategiasUnidad = estrategiasUnidad;
    }

    public String getTituloUnidad() {
        return tituloUnidad;
    }

    public void setTituloUnidad(String tituloUnidad) {
        this.tituloUnidad = tituloUnidad;
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
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadSilabo)) {
            return false;
        }
        UnidadSilabo other = (UnidadSilabo) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.UnidadSilabo[ idUnidad=" + idUnidad + " ]";
    }

}
