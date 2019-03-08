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
@Table(name = "JornadaDocente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JornadaDocente.findAll", query = "SELECT j FROM JornadaDocente j")
    , @NamedQuery(name = "JornadaDocente.findByIdJornadaDocente", query = "SELECT j FROM JornadaDocente j WHERE j.idJornadaDocente = :idJornadaDocente")})
public class JornadaDocente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jornada_docente")
    private Integer idJornadaDocente;
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(optional = false)
    private Docentes idDocente;
    @JoinColumn(name = "id_jornada", referencedColumnName = "id_jornada")
    @ManyToOne(optional = false)
    private Jornadas idJornada;
    @JoinColumn(name = "id_prd_lectivo", referencedColumnName = "id_prd_lectivo")
    @ManyToOne(optional = false)
    private PeriodoLectivo idPrdLectivo;

    public JornadaDocente() {
    }

    public JornadaDocente(Integer idJornadaDocente) {
        this.idJornadaDocente = idJornadaDocente;
    }

    public Integer getIdJornadaDocente() {
        return idJornadaDocente;
    }

    public void setIdJornadaDocente(Integer idJornadaDocente) {
        this.idJornadaDocente = idJornadaDocente;
    }

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
        this.idDocente = idDocente;
    }

    public Jornadas getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Jornadas idJornada) {
        this.idJornada = idJornada;
    }

    public PeriodoLectivo getIdPrdLectivo() {
        return idPrdLectivo;
    }

    public void setIdPrdLectivo(PeriodoLectivo idPrdLectivo) {
        this.idPrdLectivo = idPrdLectivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJornadaDocente != null ? idJornadaDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JornadaDocente)) {
            return false;
        }
        JornadaDocente other = (JornadaDocente) object;
        if ((this.idJornadaDocente == null && other.idJornadaDocente != null) || (this.idJornadaDocente != null && !this.idJornadaDocente.equals(other.idJornadaDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.JornadaDocente[ idJornadaDocente=" + idJornadaDocente + " ]";
    }

}
