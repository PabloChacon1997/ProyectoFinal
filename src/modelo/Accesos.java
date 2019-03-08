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
@Table(name = "Accesos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accesos.findAll", query = "SELECT a FROM Accesos a")
    , @NamedQuery(name = "Accesos.findByIdAcceso", query = "SELECT a FROM Accesos a WHERE a.idAcceso = :idAcceso")
    , @NamedQuery(name = "Accesos.findByAccNombre", query = "SELECT a FROM Accesos a WHERE a.accNombre = :accNombre")
    , @NamedQuery(name = "Accesos.findByAccDescripcion", query = "SELECT a FROM Accesos a WHERE a.accDescripcion = :accDescripcion")})
public class Accesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_acceso")
    private Integer idAcceso;
    @Basic(optional = false)
    @Column(name = "acc_nombre")
    private String accNombre;
    @Column(name = "acc_descripcion")
    private String accDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private List<AccesosDelRol> accesosDelRolList;

    public Accesos() {
    }

    public Accesos(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public Accesos(Integer idAcceso, String accNombre) {
        this.idAcceso = idAcceso;
        this.accNombre = accNombre;
    }

    public Integer getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getAccNombre() {
        return accNombre;
    }

    public void setAccNombre(String accNombre) {
        this.accNombre = accNombre;
    }

    public String getAccDescripcion() {
        return accDescripcion;
    }

    public void setAccDescripcion(String accDescripcion) {
        this.accDescripcion = accDescripcion;
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
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accesos)) {
            return false;
        }
        Accesos other = (Accesos) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Accesos[ idAcceso=" + idAcceso + " ]";
    }

}
