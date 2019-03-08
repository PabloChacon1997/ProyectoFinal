/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Andres Ullauri
 */
@Entity
@Table(name = "AccesosDelRol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccesosDelRol.findAll", query = "SELECT a FROM AccesosDelRol a")
    , @NamedQuery(name = "AccesosDelRol.findByIdAccesoDelRol", query = "SELECT a FROM AccesosDelRol a WHERE a.idAccesoDelRol = :idAccesoDelRol")})
public class AccesosDelRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso_del_rol")
    private Integer idAccesoDelRol;
    @JoinColumn(name = "id_acceso", referencedColumnName = "id_acceso")
    @ManyToOne(optional = false)
    private Accesos idAcceso;
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne(optional = false)
    private RolesUsuarios idRol;

    public AccesosDelRol() {
    }

    public AccesosDelRol(Integer idAccesoDelRol) {
        this.idAccesoDelRol = idAccesoDelRol;
    }

    public Integer getIdAccesoDelRol() {
        return idAccesoDelRol;
    }

    public void setIdAccesoDelRol(Integer idAccesoDelRol) {
        this.idAccesoDelRol = idAccesoDelRol;
    }

    public Accesos getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Accesos idAcceso) {
        this.idAcceso = idAcceso;
    }

    public RolesUsuarios getIdRol() {
        return idRol;
    }

    public void setIdRol(RolesUsuarios idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccesoDelRol != null ? idAccesoDelRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccesosDelRol)) {
            return false;
        }
        AccesosDelRol other = (AccesosDelRol) object;
        if ((this.idAccesoDelRol == null && other.idAccesoDelRol != null) || (this.idAccesoDelRol != null && !this.idAccesoDelRol.equals(other.idAccesoDelRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AccesosDelRol[ idAccesoDelRol=" + idAccesoDelRol + " ]";
    }

}
