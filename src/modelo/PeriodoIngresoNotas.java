/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "PeriodoIngresoNotas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodoIngresoNotas.findAll", query = "SELECT p FROM PeriodoIngresoNotas p")
    , @NamedQuery(name = "PeriodoIngresoNotas.findByIdPerdIngrNotas", query = "SELECT p FROM PeriodoIngresoNotas p WHERE p.idPerdIngrNotas = :idPerdIngrNotas")
    , @NamedQuery(name = "PeriodoIngresoNotas.findByPerdNotasFechaInicio", query = "SELECT p FROM PeriodoIngresoNotas p WHERE p.perdNotasFechaInicio = :perdNotasFechaInicio")
    , @NamedQuery(name = "PeriodoIngresoNotas.findByPerdNotasFechaCierre", query = "SELECT p FROM PeriodoIngresoNotas p WHERE p.perdNotasFechaCierre = :perdNotasFechaCierre")})
public class PeriodoIngresoNotas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perd_ingr_notas")
    private Integer idPerdIngrNotas;
    @Basic(optional = false)
    @Column(name = "perd_notas_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date perdNotasFechaInicio;
    @Basic(optional = false)
    @Column(name = "perd_notas_fecha_cierre")
    @Temporal(TemporalType.DATE)
    private Date perdNotasFechaCierre;
    @JoinColumn(name = "id_prd_lectivo", referencedColumnName = "id_prd_lectivo")
    @ManyToOne(optional = false)
    private PeriodoLectivo idPrdLectivo;
    @JoinColumn(name = "id_tipo_nota", referencedColumnName = "id_tipo_nota")
    @ManyToOne(optional = false)
    private TipoDeNota idTipoNota;

    public PeriodoIngresoNotas() {
    }

    public PeriodoIngresoNotas(Integer idPerdIngrNotas) {
        this.idPerdIngrNotas = idPerdIngrNotas;
    }

    public PeriodoIngresoNotas(Integer idPerdIngrNotas, Date perdNotasFechaInicio, Date perdNotasFechaCierre) {
        this.idPerdIngrNotas = idPerdIngrNotas;
        this.perdNotasFechaInicio = perdNotasFechaInicio;
        this.perdNotasFechaCierre = perdNotasFechaCierre;
    }

    public Integer getIdPerdIngrNotas() {
        return idPerdIngrNotas;
    }

    public void setIdPerdIngrNotas(Integer idPerdIngrNotas) {
        this.idPerdIngrNotas = idPerdIngrNotas;
    }

    public Date getPerdNotasFechaInicio() {
        return perdNotasFechaInicio;
    }

    public void setPerdNotasFechaInicio(Date perdNotasFechaInicio) {
        this.perdNotasFechaInicio = perdNotasFechaInicio;
    }

    public Date getPerdNotasFechaCierre() {
        return perdNotasFechaCierre;
    }

    public void setPerdNotasFechaCierre(Date perdNotasFechaCierre) {
        this.perdNotasFechaCierre = perdNotasFechaCierre;
    }

    public PeriodoLectivo getIdPrdLectivo() {
        return idPrdLectivo;
    }

    public void setIdPrdLectivo(PeriodoLectivo idPrdLectivo) {
        this.idPrdLectivo = idPrdLectivo;
    }

    public TipoDeNota getIdTipoNota() {
        return idTipoNota;
    }

    public void setIdTipoNota(TipoDeNota idTipoNota) {
        this.idTipoNota = idTipoNota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerdIngrNotas != null ? idPerdIngrNotas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodoIngresoNotas)) {
            return false;
        }
        PeriodoIngresoNotas other = (PeriodoIngresoNotas) object;
        if ((this.idPerdIngrNotas == null && other.idPerdIngrNotas != null) || (this.idPerdIngrNotas != null && !this.idPerdIngrNotas.equals(other.idPerdIngrNotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PeriodoIngresoNotas[ idPerdIngrNotas=" + idPerdIngrNotas + " ]";
    }

}
