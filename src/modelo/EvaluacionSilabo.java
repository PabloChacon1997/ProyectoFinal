package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class EvaluacionSilabo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idEvaluacion;

    private String actividad;

    private String instrumento;

    private int valoracion;

    private LocalDate fechaEnvio;

    private LocalDate fechaPresentacion;

    private Silabo idSilabo;

    private TipoActividad idTipoActividad;

    private UnidadSilabo idUnidad;

    public EvaluacionSilabo() {
    }

    public EvaluacionSilabo(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public EvaluacionSilabo(Integer idEvaluacion, String actividad, String instrumento, int valoracion, LocalDate fechaEnvio, LocalDate fechaPresentacion) {
        this.idEvaluacion = idEvaluacion;
        this.actividad = actividad;
        this.instrumento = instrumento;
        this.valoracion = valoracion;
        this.fechaEnvio = fechaEnvio;
        this.fechaPresentacion = fechaPresentacion;
    }

    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public Silabo getIdSilabo() {
        return idSilabo;
    }

    public void setIdSilabo(Silabo idSilabo) {
        this.idSilabo = idSilabo;
    }

    public TipoActividad getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(TipoActividad idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public UnidadSilabo getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(UnidadSilabo idUnidad) {
        this.idUnidad = idUnidad;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionSilabo)) {
            return false;
        }
        EvaluacionSilabo other = (EvaluacionSilabo) object;
        if ((this.idEvaluacion == null && other.idEvaluacion != null) || (this.idEvaluacion != null && !this.idEvaluacion.equals(other.idEvaluacion))) {
            return false;
        }
        return true;
    }

}
