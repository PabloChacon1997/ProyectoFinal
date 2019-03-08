/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "MallaEstudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MallaEstudiante.findAll", query = "SELECT m FROM MallaEstudiante m")
    , @NamedQuery(name = "MallaEstudiante.findByIdMallaAlumno", query = "SELECT m FROM MallaEstudiante m WHERE m.idMallaAlumno = :idMallaAlumno")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnCiclo", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnCiclo = :mallaAlmnCiclo")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnNumMatricula", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnNumMatricula = :mallaAlmnNumMatricula")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnNota1", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnNota1 = :mallaAlmnNota1")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnNota2", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnNota2 = :mallaAlmnNota2")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnNota3", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnNota3 = :mallaAlmnNota3")
    , @NamedQuery(name = "MallaEstudiante.findByMallaAlmnEstado", query = "SELECT m FROM MallaEstudiante m WHERE m.mallaAlmnEstado = :mallaAlmnEstado")})
public class MallaEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_malla_alumno")
    private String idMallaAlumno;
    @Basic(optional = false)
    @Column(name = "malla_almn_ciclo")
    private int mallaAlmnCiclo;
    @Basic(optional = false)
    @Column(name = "malla_almn_num_matricula")
    private int mallaAlmnNumMatricula;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "malla_almn_nota1")
    private BigDecimal mallaAlmnNota1;
    @Basic(optional = false)
    @Column(name = "malla_almn_nota2")
    private BigDecimal mallaAlmnNota2;
    @Basic(optional = false)
    @Column(name = "malla_almn_nota3")
    private BigDecimal mallaAlmnNota3;
    @Basic(optional = false)
    @Column(name = "malla_almn_estado")
    private String mallaAlmnEstado;
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne(optional = false)
    private Alumnos idAlumno;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materias idMateria;

    public MallaEstudiante() {
    }

    public MallaEstudiante(String idMallaAlumno) {
        this.idMallaAlumno = idMallaAlumno;
    }

    public MallaEstudiante(String idMallaAlumno, int mallaAlmnCiclo, int mallaAlmnNumMatricula, BigDecimal mallaAlmnNota1, BigDecimal mallaAlmnNota2, BigDecimal mallaAlmnNota3, String mallaAlmnEstado) {
        this.idMallaAlumno = idMallaAlumno;
        this.mallaAlmnCiclo = mallaAlmnCiclo;
        this.mallaAlmnNumMatricula = mallaAlmnNumMatricula;
        this.mallaAlmnNota1 = mallaAlmnNota1;
        this.mallaAlmnNota2 = mallaAlmnNota2;
        this.mallaAlmnNota3 = mallaAlmnNota3;
        this.mallaAlmnEstado = mallaAlmnEstado;
    }

    public String getIdMallaAlumno() {
        return idMallaAlumno;
    }

    public void setIdMallaAlumno(String idMallaAlumno) {
        this.idMallaAlumno = idMallaAlumno;
    }

    public int getMallaAlmnCiclo() {
        return mallaAlmnCiclo;
    }

    public void setMallaAlmnCiclo(int mallaAlmnCiclo) {
        this.mallaAlmnCiclo = mallaAlmnCiclo;
    }

    public int getMallaAlmnNumMatricula() {
        return mallaAlmnNumMatricula;
    }

    public void setMallaAlmnNumMatricula(int mallaAlmnNumMatricula) {
        this.mallaAlmnNumMatricula = mallaAlmnNumMatricula;
    }

    public BigDecimal getMallaAlmnNota1() {
        return mallaAlmnNota1;
    }

    public void setMallaAlmnNota1(BigDecimal mallaAlmnNota1) {
        this.mallaAlmnNota1 = mallaAlmnNota1;
    }

    public BigDecimal getMallaAlmnNota2() {
        return mallaAlmnNota2;
    }

    public void setMallaAlmnNota2(BigDecimal mallaAlmnNota2) {
        this.mallaAlmnNota2 = mallaAlmnNota2;
    }

    public BigDecimal getMallaAlmnNota3() {
        return mallaAlmnNota3;
    }

    public void setMallaAlmnNota3(BigDecimal mallaAlmnNota3) {
        this.mallaAlmnNota3 = mallaAlmnNota3;
    }

    public String getMallaAlmnEstado() {
        return mallaAlmnEstado;
    }

    public void setMallaAlmnEstado(String mallaAlmnEstado) {
        this.mallaAlmnEstado = mallaAlmnEstado;
    }

    public Alumnos getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumnos idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMallaAlumno != null ? idMallaAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MallaEstudiante)) {
            return false;
        }
        MallaEstudiante other = (MallaEstudiante) object;
        if ((this.idMallaAlumno == null && other.idMallaAlumno != null) || (this.idMallaAlumno != null && !this.idMallaAlumno.equals(other.idMallaAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.MallaEstudiante[ idMallaAlumno=" + idMallaAlumno + " ]";
    }

}
