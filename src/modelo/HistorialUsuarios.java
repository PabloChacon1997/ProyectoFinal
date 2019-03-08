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
@Table(name = "HistorialUsuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialUsuarios.findAll", query = "SELECT h FROM HistorialUsuarios h")
    , @NamedQuery(name = "HistorialUsuarios.findByIdHistorialUser", query = "SELECT h FROM HistorialUsuarios h WHERE h.idHistorialUser = :idHistorialUser")
    , @NamedQuery(name = "HistorialUsuarios.findByHistorialFecha", query = "SELECT h FROM HistorialUsuarios h WHERE h.historialFecha = :historialFecha")
    , @NamedQuery(name = "HistorialUsuarios.findByHistorialTipoAccion", query = "SELECT h FROM HistorialUsuarios h WHERE h.historialTipoAccion = :historialTipoAccion")
    , @NamedQuery(name = "HistorialUsuarios.findByHistorialNombreTabla", query = "SELECT h FROM HistorialUsuarios h WHERE h.historialNombreTabla = :historialNombreTabla")
    , @NamedQuery(name = "HistorialUsuarios.findByHistorialPkTabla", query = "SELECT h FROM HistorialUsuarios h WHERE h.historialPkTabla = :historialPkTabla")})
public class HistorialUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historial_user")
    private Integer idHistorialUser;
    @Basic(optional = false)
    @Column(name = "historial_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date historialFecha;
    @Basic(optional = false)
    @Column(name = "historial_tipo_accion")
    private String historialTipoAccion;
    @Basic(optional = false)
    @Column(name = "historial_nombre_tabla")
    private String historialNombreTabla;
    @Basic(optional = false)
    @Column(name = "historial_pk_tabla")
    private int historialPkTabla;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios idUsuario;

    public HistorialUsuarios() {
    }

    public HistorialUsuarios(Integer idHistorialUser) {
        this.idHistorialUser = idHistorialUser;
    }

    public HistorialUsuarios(Integer idHistorialUser, Date historialFecha, String historialTipoAccion, String historialNombreTabla, int historialPkTabla) {
        this.idHistorialUser = idHistorialUser;
        this.historialFecha = historialFecha;
        this.historialTipoAccion = historialTipoAccion;
        this.historialNombreTabla = historialNombreTabla;
        this.historialPkTabla = historialPkTabla;
    }

    public Integer getIdHistorialUser() {
        return idHistorialUser;
    }

    public void setIdHistorialUser(Integer idHistorialUser) {
        this.idHistorialUser = idHistorialUser;
    }

    public Date getHistorialFecha() {
        return historialFecha;
    }

    public void setHistorialFecha(Date historialFecha) {
        this.historialFecha = historialFecha;
    }

    public String getHistorialTipoAccion() {
        return historialTipoAccion;
    }

    public void setHistorialTipoAccion(String historialTipoAccion) {
        this.historialTipoAccion = historialTipoAccion;
    }

    public String getHistorialNombreTabla() {
        return historialNombreTabla;
    }

    public void setHistorialNombreTabla(String historialNombreTabla) {
        this.historialNombreTabla = historialNombreTabla;
    }

    public int getHistorialPkTabla() {
        return historialPkTabla;
    }

    public void setHistorialPkTabla(int historialPkTabla) {
        this.historialPkTabla = historialPkTabla;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorialUser != null ? idHistorialUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialUsuarios)) {
            return false;
        }
        HistorialUsuarios other = (HistorialUsuarios) object;
        if ((this.idHistorialUser == null && other.idHistorialUser != null) || (this.idHistorialUser != null && !this.idHistorialUser.equals(other.idHistorialUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.HistorialUsuarios[ idHistorialUser=" + idHistorialUser + " ]";
    }

}
