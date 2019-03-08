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
@Table(name = "SesionClase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SesionClase.findAll", query = "SELECT s FROM SesionClase s")
    , @NamedQuery(name = "SesionClase.findByIdSesion", query = "SELECT s FROM SesionClase s WHERE s.idSesion = :idSesion")
    , @NamedQuery(name = "SesionClase.findByDiaSesion", query = "SELECT s FROM SesionClase s WHERE s.diaSesion = :diaSesion")
    , @NamedQuery(name = "SesionClase.findByHoraInicioSesion", query = "SELECT s FROM SesionClase s WHERE s.horaInicioSesion = :horaInicioSesion")
    , @NamedQuery(name = "SesionClase.findByHoraFinSesion", query = "SELECT s FROM SesionClase s WHERE s.horaFinSesion = :horaFinSesion")})
public class SesionClase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sesion")
    private Integer idSesion;
    @Basic(optional = false)
    @Column(name = "dia_sesion")
    private int diaSesion;
    @Basic(optional = false)
    @Column(name = "hora_inicio_sesion")
    @Temporal(TemporalType.TIME)
    private Date horaInicioSesion;
    @Basic(optional = false)
    @Column(name = "hora_fin_sesion")
    @Temporal(TemporalType.TIME)
    private Date horaFinSesion;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    @ManyToOne(optional = false)
    private Cursos idCurso;

    public SesionClase() {
    }

    public SesionClase(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public SesionClase(Integer idSesion, int diaSesion, Date horaInicioSesion, Date horaFinSesion) {
        this.idSesion = idSesion;
        this.diaSesion = diaSesion;
        this.horaInicioSesion = horaInicioSesion;
        this.horaFinSesion = horaFinSesion;
    }

    public Integer getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public int getDiaSesion() {
        return diaSesion;
    }

    public void setDiaSesion(int diaSesion) {
        this.diaSesion = diaSesion;
    }

    public Date getHoraInicioSesion() {
        return horaInicioSesion;
    }

    public void setHoraInicioSesion(Date horaInicioSesion) {
        this.horaInicioSesion = horaInicioSesion;
    }

    public Date getHoraFinSesion() {
        return horaFinSesion;
    }

    public void setHoraFinSesion(Date horaFinSesion) {
        this.horaFinSesion = horaFinSesion;
    }

    public Cursos getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Cursos idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionClase)) {
            return false;
        }
        SesionClase other = (SesionClase) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.SesionClase[ idSesion=" + idSesion + " ]";
    }

}
