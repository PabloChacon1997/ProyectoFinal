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
@Table(name = "Requisitos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requisitos.findAll", query = "SELECT r FROM Requisitos r")
    , @NamedQuery(name = "Requisitos.findByIdRequisito", query = "SELECT r FROM Requisitos r WHERE r.idRequisito = :idRequisito")
    , @NamedQuery(name = "Requisitos.findByEsPrerequisito", query = "SELECT r FROM Requisitos r WHERE r.esPrerequisito = :esPrerequisito")})
public class Requisitos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_requisito")
    private Integer idRequisito;
    @Basic(optional = false)
    @Column(name = "es_prerequisito")
    private boolean esPrerequisito;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateria;
    @JoinColumn(name = "id_materia_requisito", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateriaRequisito;

    public Requisitos() {
    }

    public Requisitos(Integer idRequisito) {
        this.idRequisito = idRequisito;
    }

    public Requisitos(Integer idRequisito, boolean esPrerequisito) {
        this.idRequisito = idRequisito;
        this.esPrerequisito = esPrerequisito;
    }

    public Integer getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(Integer idRequisito) {
        this.idRequisito = idRequisito;
    }

    public boolean getEsPrerequisito() {
        return esPrerequisito;
    }

    public void setEsPrerequisito(boolean esPrerequisito) {
        this.esPrerequisito = esPrerequisito;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

    public Materias getIdMateriaRequisito() {
        return idMateriaRequisito;
    }

    public void setIdMateriaRequisito(Materias idMateriaRequisito) {
        this.idMateriaRequisito = idMateriaRequisito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequisito != null ? idRequisito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requisitos)) {
            return false;
        }
        Requisitos other = (Requisitos) object;
        if ((this.idRequisito == null && other.idRequisito != null) || (this.idRequisito != null && !this.idRequisito.equals(other.idRequisito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Requisitos[ idRequisito=" + idRequisito + " ]";
    }

}
