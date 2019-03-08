/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
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
@Table(name = "RolesUsuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolesUsuarios.findAll", query = "SELECT r FROM RolesUsuarios r")
    , @NamedQuery(name = "RolesUsuarios.findByIdRol", query = "SELECT r FROM RolesUsuarios r WHERE r.idRol = :idRol")
    , @NamedQuery(name = "RolesUsuarios.findByRolNombre", query = "SELECT r FROM RolesUsuarios r WHERE r.rolNombre = :rolNombre")})
public class RolesUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Integer idRol;
    @Basic(optional = false)
    @Column(name = "rol_nombre")
    private String rolNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private List<Usuarios> usuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private List<AccesosDelRol> accesosDelRolList;

    public RolesUsuarios() {
    }

    public RolesUsuarios(Integer idRol) {
        this.idRol = idRol;
    }

    public RolesUsuarios(Integer idRol, String rolNombre) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<AccesosDelRol> getAccesosDelRolList() {
        return accesosDelRolList;
    }

    public void setAccesosDelRolList(List<AccesosDelRol> accesosDelRolList) {
        this.accesosDelRolList = accesosDelRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesUsuarios)) {
            return false;
        }
        RolesUsuarios other = (RolesUsuarios) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.RolesUsuarios[ idRol=" + idRol + " ]";
    }

}
