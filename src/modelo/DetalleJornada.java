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
@Table(name = "DetalleJornada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleJornada.findAll", query = "SELECT d FROM DetalleJornada d")
    , @NamedQuery(name = "DetalleJornada.findByIdDetalleJornada", query = "SELECT d FROM DetalleJornada d WHERE d.idDetalleJornada = :idDetalleJornada")
    , @NamedQuery(name = "DetalleJornada.findByHoraInicioJornada", query = "SELECT d FROM DetalleJornada d WHERE d.horaInicioJornada = :horaInicioJornada")
    , @NamedQuery(name = "DetalleJornada.findByHoraFinJornada", query = "SELECT d FROM DetalleJornada d WHERE d.horaFinJornada = :horaFinJornada")
    , @NamedQuery(name = "DetalleJornada.findByDiaInicioJornada", query = "SELECT d FROM DetalleJornada d WHERE d.diaInicioJornada = :diaInicioJornada")
    , @NamedQuery(name = "DetalleJornada.findByDiaFinJornada", query = "SELECT d FROM DetalleJornada d WHERE d.diaFinJornada = :diaFinJornada")})
public class DetalleJornada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_jornada")
    private Integer idDetalleJornada;
    @Basic(optional = false)
    @Column(name = "hora_inicio_jornada")
    @Temporal(TemporalType.TIME)
    private Date horaInicioJornada;
    @Basic(optional = false)
    @Column(name = "hora_fin_jornada")
    @Temporal(TemporalType.TIME)
    private Date horaFinJornada;
    @Basic(optional = false)
    @Column(name = "dia_inicio_jornada")
    private int diaInicioJornada;
    @Basic(optional = false)
    @Column(name = "dia_fin_jornada")
    private int diaFinJornada;
    @JoinColumn(name = "id_jornada", referencedColumnName = "id_jornada")
    @ManyToOne(optional = false)
    private Jornadas idJornada;

    public DetalleJornada() {
    }

    public DetalleJornada(Integer idDetalleJornada) {
        this.idDetalleJornada = idDetalleJornada;
    }

    public DetalleJornada(Integer idDetalleJornada, Date horaInicioJornada, Date horaFinJornada, int diaInicioJornada, int diaFinJornada) {
        this.idDetalleJornada = idDetalleJornada;
        this.horaInicioJornada = horaInicioJornada;
        this.horaFinJornada = horaFinJornada;
        this.diaInicioJornada = diaInicioJornada;
        this.diaFinJornada = diaFinJornada;
    }

    public Integer getIdDetalleJornada() {
        return idDetalleJornada;
    }

    public void setIdDetalleJornada(Integer idDetalleJornada) {
        this.idDetalleJornada = idDetalleJornada;
    }

    public Date getHoraInicioJornada() {
        return horaInicioJornada;
    }

    public void setHoraInicioJornada(Date horaInicioJornada) {
        this.horaInicioJornada = horaInicioJornada;
    }

    public Date getHoraFinJornada() {
        return horaFinJornada;
    }

    public void setHoraFinJornada(Date horaFinJornada) {
        this.horaFinJornada = horaFinJornada;
    }

    public int getDiaInicioJornada() {
        return diaInicioJornada;
    }

    public void setDiaInicioJornada(int diaInicioJornada) {
        this.diaInicioJornada = diaInicioJornada;
    }

    public int getDiaFinJornada() {
        return diaFinJornada;
    }

    public void setDiaFinJornada(int diaFinJornada) {
        this.diaFinJornada = diaFinJornada;
    }

    public Jornadas getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Jornadas idJornada) {
        this.idJornada = idJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleJornada != null ? idDetalleJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleJornada)) {
            return false;
        }
        DetalleJornada other = (DetalleJornada) object;
        if ((this.idDetalleJornada == null && other.idDetalleJornada != null) || (this.idDetalleJornada != null && !this.idDetalleJornada.equals(other.idDetalleJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleJornada[ idDetalleJornada=" + idDetalleJornada + " ]";
    }

}
