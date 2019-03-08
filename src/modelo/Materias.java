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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materias.findAll", query = "SELECT m FROM Materias m")
    , @NamedQuery(name = "Materias.findByIdMateria", query = "SELECT m FROM Materias m WHERE m.idMateria = :idMateria")
    , @NamedQuery(name = "Materias.findByMateriaCodigo", query = "SELECT m FROM Materias m WHERE m.materiaCodigo = :materiaCodigo")
    , @NamedQuery(name = "Materias.findByMateriaNombre", query = "SELECT m FROM Materias m WHERE m.materiaNombre = :materiaNombre")
    , @NamedQuery(name = "Materias.findByMateriaCiclo", query = "SELECT m FROM Materias m WHERE m.materiaCiclo = :materiaCiclo")
    , @NamedQuery(name = "Materias.findByMateriaCreditos", query = "SELECT m FROM Materias m WHERE m.materiaCreditos = :materiaCreditos")
    , @NamedQuery(name = "Materias.findByMateriaTipo", query = "SELECT m FROM Materias m WHERE m.materiaTipo = :materiaTipo")
    , @NamedQuery(name = "Materias.findByMateriaCategoria", query = "SELECT m FROM Materias m WHERE m.materiaCategoria = :materiaCategoria")
    , @NamedQuery(name = "Materias.findByMateriaTipoAcreditacion", query = "SELECT m FROM Materias m WHERE m.materiaTipoAcreditacion = :materiaTipoAcreditacion")
    , @NamedQuery(name = "Materias.findByMateriaHorasDocencia", query = "SELECT m FROM Materias m WHERE m.materiaHorasDocencia = :materiaHorasDocencia")
    , @NamedQuery(name = "Materias.findByMateriaHorasPracticas", query = "SELECT m FROM Materias m WHERE m.materiaHorasPracticas = :materiaHorasPracticas")
    , @NamedQuery(name = "Materias.findByMateriaHorasAutoEstudio", query = "SELECT m FROM Materias m WHERE m.materiaHorasAutoEstudio = :materiaHorasAutoEstudio")
    , @NamedQuery(name = "Materias.findByMateriaHorasPresencial", query = "SELECT m FROM Materias m WHERE m.materiaHorasPresencial = :materiaHorasPresencial")
    , @NamedQuery(name = "Materias.findByMateriaTotalHoras", query = "SELECT m FROM Materias m WHERE m.materiaTotalHoras = :materiaTotalHoras")
    , @NamedQuery(name = "Materias.findByMateriaActiva", query = "SELECT m FROM Materias m WHERE m.materiaActiva = :materiaActiva")
    , @NamedQuery(name = "Materias.findByMateriaObjetivo", query = "SELECT m FROM Materias m WHERE m.materiaObjetivo = :materiaObjetivo")
    , @NamedQuery(name = "Materias.findByMateriaDescripcion", query = "SELECT m FROM Materias m WHERE m.materiaDescripcion = :materiaDescripcion")
    , @NamedQuery(name = "Materias.findByMateriaObjetivoEspecifico", query = "SELECT m FROM Materias m WHERE m.materiaObjetivoEspecifico = :materiaObjetivoEspecifico")
    , @NamedQuery(name = "Materias.findByMateriaOrganizacionCurricular", query = "SELECT m FROM Materias m WHERE m.materiaOrganizacionCurricular = :materiaOrganizacionCurricular")
    , @NamedQuery(name = "Materias.findByMateriaCampoFormacion", query = "SELECT m FROM Materias m WHERE m.materiaCampoFormacion = :materiaCampoFormacion")})
public class Materias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Basic(optional = false)
    @Column(name = "materia_codigo")
    private String materiaCodigo;
    @Basic(optional = false)
    @Column(name = "materia_nombre")
    private String materiaNombre;
    @Basic(optional = false)
    @Column(name = "materia_ciclo")
    private int materiaCiclo;
    @Basic(optional = false)
    @Column(name = "materia_creditos")
    private int materiaCreditos;
    @Column(name = "materia_tipo")
    private String materiaTipo;
    @Column(name = "materia_categoria")
    private String materiaCategoria;
    @Basic(optional = false)
    @Column(name = "materia_tipo_acreditacion")
    private String materiaTipoAcreditacion;
    @Basic(optional = false)
    @Column(name = "materia_horas_docencia")
    private int materiaHorasDocencia;
    @Basic(optional = false)
    @Column(name = "materia_horas_practicas")
    private int materiaHorasPracticas;
    @Basic(optional = false)
    @Column(name = "materia_horas_auto_estudio")
    private int materiaHorasAutoEstudio;
    @Basic(optional = false)
    @Column(name = "materia_horas_presencial")
    private int materiaHorasPresencial;
    @Basic(optional = false)
    @Column(name = "materia_total_horas")
    private int materiaTotalHoras;
    @Basic(optional = false)
    @Column(name = "materia_activa")
    private boolean materiaActiva;
    @Basic(optional = false)
    @Column(name = "materia_objetivo")
    private String materiaObjetivo;
    @Basic(optional = false)
    @Column(name = "materia_descripcion")
    private String materiaDescripcion;
    @Column(name = "materia_objetivo_especifico")
    private String materiaObjetivoEspecifico;
    @Column(name = "materia_organizacion_curricular")
    private String materiaOrganizacionCurricular;
    @Column(name = "materia_campo_formacion")
    private String materiaCampoFormacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<Cursos> cursosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<MallaEstudiante> mallaEstudianteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<DocentesMateria> docentesMateriaList;
    @JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera")
    @ManyToOne(optional = false)
    private Carreras idCarrera;
    @JoinColumn(name = "id_eje", referencedColumnName = "id_eje")
    @ManyToOne(optional = false)
    private EjesFormacion idEje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<Silabo> silaboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<Requisitos> requisitosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriaRequisito")
    private List<Requisitos> requisitosList1;

    public Materias() {
    }

    public Materias(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Materias(Integer idMateria, String materiaCodigo, String materiaNombre, int materiaCiclo, int materiaCreditos, String materiaTipoAcreditacion, int materiaHorasDocencia, int materiaHorasPracticas, int materiaHorasAutoEstudio, int materiaHorasPresencial, int materiaTotalHoras, boolean materiaActiva, String materiaObjetivo, String materiaDescripcion) {
        this.idMateria = idMateria;
        this.materiaCodigo = materiaCodigo;
        this.materiaNombre = materiaNombre;
        this.materiaCiclo = materiaCiclo;
        this.materiaCreditos = materiaCreditos;
        this.materiaTipoAcreditacion = materiaTipoAcreditacion;
        this.materiaHorasDocencia = materiaHorasDocencia;
        this.materiaHorasPracticas = materiaHorasPracticas;
        this.materiaHorasAutoEstudio = materiaHorasAutoEstudio;
        this.materiaHorasPresencial = materiaHorasPresencial;
        this.materiaTotalHoras = materiaTotalHoras;
        this.materiaActiva = materiaActiva;
        this.materiaObjetivo = materiaObjetivo;
        this.materiaDescripcion = materiaDescripcion;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateriaCodigo() {
        return materiaCodigo;
    }

    public void setMateriaCodigo(String materiaCodigo) {
        this.materiaCodigo = materiaCodigo;
    }

    public String getMateriaNombre() {
        return materiaNombre;
    }

    public void setMateriaNombre(String materiaNombre) {
        this.materiaNombre = materiaNombre;
    }

    public int getMateriaCiclo() {
        return materiaCiclo;
    }

    public void setMateriaCiclo(int materiaCiclo) {
        this.materiaCiclo = materiaCiclo;
    }

    public int getMateriaCreditos() {
        return materiaCreditos;
    }

    public void setMateriaCreditos(int materiaCreditos) {
        this.materiaCreditos = materiaCreditos;
    }

    public String getMateriaTipo() {
        return materiaTipo;
    }

    public void setMateriaTipo(String materiaTipo) {
        this.materiaTipo = materiaTipo;
    }

    public String getMateriaCategoria() {
        return materiaCategoria;
    }

    public void setMateriaCategoria(String materiaCategoria) {
        this.materiaCategoria = materiaCategoria;
    }

    public String getMateriaTipoAcreditacion() {
        return materiaTipoAcreditacion;
    }

    public void setMateriaTipoAcreditacion(String materiaTipoAcreditacion) {
        this.materiaTipoAcreditacion = materiaTipoAcreditacion;
    }

    public int getMateriaHorasDocencia() {
        return materiaHorasDocencia;
    }

    public void setMateriaHorasDocencia(int materiaHorasDocencia) {
        this.materiaHorasDocencia = materiaHorasDocencia;
    }

    public int getMateriaHorasPracticas() {
        return materiaHorasPracticas;
    }

    public void setMateriaHorasPracticas(int materiaHorasPracticas) {
        this.materiaHorasPracticas = materiaHorasPracticas;
    }

    public int getMateriaHorasAutoEstudio() {
        return materiaHorasAutoEstudio;
    }

    public void setMateriaHorasAutoEstudio(int materiaHorasAutoEstudio) {
        this.materiaHorasAutoEstudio = materiaHorasAutoEstudio;
    }

    public int getMateriaHorasPresencial() {
        return materiaHorasPresencial;
    }

    public void setMateriaHorasPresencial(int materiaHorasPresencial) {
        this.materiaHorasPresencial = materiaHorasPresencial;
    }

    public int getMateriaTotalHoras() {
        return materiaTotalHoras;
    }

    public void setMateriaTotalHoras(int materiaTotalHoras) {
        this.materiaTotalHoras = materiaTotalHoras;
    }

    public boolean getMateriaActiva() {
        return materiaActiva;
    }

    public void setMateriaActiva(boolean materiaActiva) {
        this.materiaActiva = materiaActiva;
    }

    public String getMateriaObjetivo() {
        return materiaObjetivo;
    }

    public void setMateriaObjetivo(String materiaObjetivo) {
        this.materiaObjetivo = materiaObjetivo;
    }

    public String getMateriaDescripcion() {
        return materiaDescripcion;
    }

    public void setMateriaDescripcion(String materiaDescripcion) {
        this.materiaDescripcion = materiaDescripcion;
    }

    public String getMateriaObjetivoEspecifico() {
        return materiaObjetivoEspecifico;
    }

    public void setMateriaObjetivoEspecifico(String materiaObjetivoEspecifico) {
        this.materiaObjetivoEspecifico = materiaObjetivoEspecifico;
    }

    public String getMateriaOrganizacionCurricular() {
        return materiaOrganizacionCurricular;
    }

    public void setMateriaOrganizacionCurricular(String materiaOrganizacionCurricular) {
        this.materiaOrganizacionCurricular = materiaOrganizacionCurricular;
    }

    public String getMateriaCampoFormacion() {
        return materiaCampoFormacion;
    }

    public void setMateriaCampoFormacion(String materiaCampoFormacion) {
        this.materiaCampoFormacion = materiaCampoFormacion;
    }

    @XmlTransient
    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    @XmlTransient
    public List<MallaEstudiante> getMallaEstudianteList() {
        return mallaEstudianteList;
    }

    public void setMallaEstudianteList(List<MallaEstudiante> mallaEstudianteList) {
        this.mallaEstudianteList = mallaEstudianteList;
    }

    @XmlTransient
    public List<DocentesMateria> getDocentesMateriaList() {
        return docentesMateriaList;
    }

    public void setDocentesMateriaList(List<DocentesMateria> docentesMateriaList) {
        this.docentesMateriaList = docentesMateriaList;
    }

    public Carreras getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Carreras idCarrera) {
        this.idCarrera = idCarrera;
    }

    public EjesFormacion getIdEje() {
        return idEje;
    }

    public void setIdEje(EjesFormacion idEje) {
        this.idEje = idEje;
    }

    @XmlTransient
    public List<Silabo> getSilaboList() {
        return silaboList;
    }

    public void setSilaboList(List<Silabo> silaboList) {
        this.silaboList = silaboList;
    }

    @XmlTransient
    public List<Requisitos> getRequisitosList() {
        return requisitosList;
    }

    public void setRequisitosList(List<Requisitos> requisitosList) {
        this.requisitosList = requisitosList;
    }

    @XmlTransient
    public List<Requisitos> getRequisitosList1() {
        return requisitosList1;
    }

    public void setRequisitosList1(List<Requisitos> requisitosList1) {
        this.requisitosList1 = requisitosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materias)) {
            return false;
        }
        Materias other = (Materias) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Materias[ idMateria=" + idMateria + " ]";
    }

}
