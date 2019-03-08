/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TipoDeNota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDeNota.findAll", query = "SELECT t FROM TipoDeNota t")
    , @NamedQuery(name = "TipoDeNota.findByIdTipoNota", query = "SELECT t FROM TipoDeNota t WHERE t.idTipoNota = :idTipoNota")
    , @NamedQuery(name = "TipoDeNota.findByTipoNotaNombre", query = "SELECT t FROM TipoDeNota t WHERE t.tipoNotaNombre = :tipoNotaNombre")
    , @NamedQuery(name = "TipoDeNota.findByTipoNotaValorMinimo", query = "SELECT t FROM TipoDeNota t WHERE t.tipoNotaValorMinimo = :tipoNotaValorMinimo")
    , @NamedQuery(name = "TipoDeNota.findByTipoNotaValorMaximo", query = "SELECT t FROM TipoDeNota t WHERE t.tipoNotaValorMaximo = :tipoNotaValorMaximo")})
public class TipoDeNota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_nota")
    private Integer idTipoNota;
    @Basic(optional = false)
    @Column(name = "tipo_nota_nombre")
    private String tipoNotaNombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "tipo_nota_valor_minimo")
    private BigDecimal tipoNotaValorMinimo;
    @Basic(optional = false)
    @Column(name = "tipo_nota_valor_maximo")
    private BigDecimal tipoNotaValorMaximo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoNota")
    private List<PeriodoIngresoNotas> periodoIngresoNotasList;

    public TipoDeNota() {
    }

    public TipoDeNota(Integer idTipoNota) {
        this.idTipoNota = idTipoNota;
    }

    public TipoDeNota(Integer idTipoNota, String tipoNotaNombre, BigDecimal tipoNotaValorMinimo, BigDecimal tipoNotaValorMaximo) {
        this.idTipoNota = idTipoNota;
        this.tipoNotaNombre = tipoNotaNombre;
        this.tipoNotaValorMinimo = tipoNotaValorMinimo;
        this.tipoNotaValorMaximo = tipoNotaValorMaximo;
    }

    public Integer getIdTipoNota() {
        return idTipoNota;
    }

    public void setIdTipoNota(Integer idTipoNota) {
        this.idTipoNota = idTipoNota;
    }

    public String getTipoNotaNombre() {
        return tipoNotaNombre;
    }

    public void setTipoNotaNombre(String tipoNotaNombre) {
        this.tipoNotaNombre = tipoNotaNombre;
    }

    public BigDecimal getTipoNotaValorMinimo() {
        return tipoNotaValorMinimo;
    }

    public void setTipoNotaValorMinimo(BigDecimal tipoNotaValorMinimo) {
        this.tipoNotaValorMinimo = tipoNotaValorMinimo;
    }

    public BigDecimal getTipoNotaValorMaximo() {
        return tipoNotaValorMaximo;
    }

    public void setTipoNotaValorMaximo(BigDecimal tipoNotaValorMaximo) {
        this.tipoNotaValorMaximo = tipoNotaValorMaximo;
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
        hash += (idTipoNota != null ? idTipoNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeNota)) {
            return false;
        }
        TipoDeNota other = (TipoDeNota) object;
        if ((this.idTipoNota == null && other.idTipoNota != null) || (this.idTipoNota != null && !this.idTipoNota.equals(other.idTipoNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TipoDeNota[ idTipoNota=" + idTipoNota + " ]";
    }

}
