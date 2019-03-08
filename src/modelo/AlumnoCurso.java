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
@Table(name = "AlumnoCurso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlumnoCurso.findAll", query = "SELECT a FROM AlumnoCurso a")
    , @NamedQuery(name = "AlumnoCurso.findByIdAlmnCurso", query = "SELECT a FROM AlumnoCurso a WHERE a.idAlmnCurso = :idAlmnCurso")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNt1Parcial", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNt1Parcial = :almnCursoNt1Parcial")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNtExamenInterciclo", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNtExamenInterciclo = :almnCursoNtExamenInterciclo")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNt2Parcial", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNt2Parcial = :almnCursoNt2Parcial")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNtExamenFinal", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNtExamenFinal = :almnCursoNtExamenFinal")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNtExamenSupletorio", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNtExamenSupletorio = :almnCursoNtExamenSupletorio")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoAsistencia", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoAsistencia = :almnCursoAsistencia")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNotaFinal", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNotaFinal = :almnCursoNotaFinal")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoEstado", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoEstado = :almnCursoEstado")
    , @NamedQuery(name = "AlumnoCurso.findByAlmnCursoNumFaltas", query = "SELECT a FROM AlumnoCurso a WHERE a.almnCursoNumFaltas = :almnCursoNumFaltas")})
public class AlumnoCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_almn_curso")
    private Integer idAlmnCurso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "almn_curso_nt_1_parcial")
    private BigDecimal almnCursoNt1Parcial;
    @Column(name = "almn_curso_nt_examen_interciclo")
    private BigDecimal almnCursoNtExamenInterciclo;
    @Column(name = "almn_curso_nt_2_parcial")
    private BigDecimal almnCursoNt2Parcial;
    @Column(name = "almn_curso_nt_examen_final")
    private BigDecimal almnCursoNtExamenFinal;
    @Column(name = "almn_curso_nt_examen_supletorio")
    private BigDecimal almnCursoNtExamenSupletorio;
    @Column(name = "almn_curso_asistencia")
    private String almnCursoAsistencia;
    @Column(name = "almn_curso_nota_final")
    private BigDecimal almnCursoNotaFinal;
    @Column(name = "almn_curso_estado")
    private String almnCursoEstado;
    @Column(name = "almn_curso_num_faltas")
    private Integer almnCursoNumFaltas;
    @JoinColumn(name = "id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne(optional = false)
    private Alumnos idAlumno;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    @ManyToOne(optional = false)
    private Cursos idCurso;

    public AlumnoCurso() {
    }

    public AlumnoCurso(Integer idAlmnCurso) {
        this.idAlmnCurso = idAlmnCurso;
    }

    public Integer getIdAlmnCurso() {
        return idAlmnCurso;
    }

    public void setIdAlmnCurso(Integer idAlmnCurso) {
        this.idAlmnCurso = idAlmnCurso;
    }

    public BigDecimal getAlmnCursoNt1Parcial() {
        return almnCursoNt1Parcial;
    }

    public void setAlmnCursoNt1Parcial(BigDecimal almnCursoNt1Parcial) {
        this.almnCursoNt1Parcial = almnCursoNt1Parcial;
    }

    public BigDecimal getAlmnCursoNtExamenInterciclo() {
        return almnCursoNtExamenInterciclo;
    }

    public void setAlmnCursoNtExamenInterciclo(BigDecimal almnCursoNtExamenInterciclo) {
        this.almnCursoNtExamenInterciclo = almnCursoNtExamenInterciclo;
    }

    public BigDecimal getAlmnCursoNt2Parcial() {
        return almnCursoNt2Parcial;
    }

    public void setAlmnCursoNt2Parcial(BigDecimal almnCursoNt2Parcial) {
        this.almnCursoNt2Parcial = almnCursoNt2Parcial;
    }

    public BigDecimal getAlmnCursoNtExamenFinal() {
        return almnCursoNtExamenFinal;
    }

    public void setAlmnCursoNtExamenFinal(BigDecimal almnCursoNtExamenFinal) {
        this.almnCursoNtExamenFinal = almnCursoNtExamenFinal;
    }

    public BigDecimal getAlmnCursoNtExamenSupletorio() {
        return almnCursoNtExamenSupletorio;
    }

    public void setAlmnCursoNtExamenSupletorio(BigDecimal almnCursoNtExamenSupletorio) {
        this.almnCursoNtExamenSupletorio = almnCursoNtExamenSupletorio;
    }

    public String getAlmnCursoAsistencia() {
        return almnCursoAsistencia;
    }

    public void setAlmnCursoAsistencia(String almnCursoAsistencia) {
        this.almnCursoAsistencia = almnCursoAsistencia;
    }

    public BigDecimal getAlmnCursoNotaFinal() {
        return almnCursoNotaFinal;
    }

    public void setAlmnCursoNotaFinal(BigDecimal almnCursoNotaFinal) {
        this.almnCursoNotaFinal = almnCursoNotaFinal;
    }

    public String getAlmnCursoEstado() {
        return almnCursoEstado;
    }

    public void setAlmnCursoEstado(String almnCursoEstado) {
        this.almnCursoEstado = almnCursoEstado;
    }

    public Integer getAlmnCursoNumFaltas() {
        return almnCursoNumFaltas;
    }

    public void setAlmnCursoNumFaltas(Integer almnCursoNumFaltas) {
        this.almnCursoNumFaltas = almnCursoNumFaltas;
    }

    public Alumnos getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumnos idAlumno) {
        this.idAlumno = idAlumno;
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
        hash += (idAlmnCurso != null ? idAlmnCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumnoCurso)) {
            return false;
        }
        AlumnoCurso other = (AlumnoCurso) object;
        if ((this.idAlmnCurso == null && other.idAlmnCurso != null) || (this.idAlmnCurso != null && !this.idAlmnCurso.equals(other.idAlmnCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.AlumnoCurso[ idAlmnCurso=" + idAlmnCurso + " ]";
    }

}
