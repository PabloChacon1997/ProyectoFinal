package modelo.db;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class dbUnidadSilabo extends UnidadSilabo {

    pgConect con = new pgConect();

    public dbUnidadSilabo() {
    }

    public dbUnidadSilabo(Integer idUnidad) {
        super(idUnidad);
    }

    public dbUnidadSilabo(Integer idUnidad, int numeroUnidad, String objetivoEspecificoUnidad, String resultadosAprendizajeUnidad, String contenidosUnidad, LocalDate fechaInicioUnidad, LocalDate fechaFinUnidad, int horasDocenciaUnidad, int horasPracticaUnidad, int horasAutonomoUnidad, String estrategiasUnidad) {
        super(idUnidad, numeroUnidad, objetivoEspecificoUnidad, resultadosAprendizajeUnidad, contenidosUnidad, fechaInicioUnidad, fechaFinUnidad, horasDocenciaUnidad, horasPracticaUnidad, horasAutonomoUnidad, estrategiasUnidad);
    }

    public boolean InsertarUnidadSilabo() {
        String sql = "INSERT INTO public.\"UnidadSilabo\"(\n"
                + "	id_unidad, numero_unidad, objetivo_especifico_unidad, resultados_aprendizaje_unidad, contenidos_unidad, fecha_inicio_unidad, fecha_fin_unidad, horas_docencia_unidad, horas_practica_unidad, horas_autonomo_unidad, estrategias_unidad)\n"
                + "	VALUES (" + getIdUnidad() + ", " + getNumeroUnidad() + ",'" + getObjetivoEspecificoUnidad() + "', '" + getResultadosAprendizajeUnidad() + "', "
                + "'" + getContenidosUnidad() + "', '" + getFechaInicioUnidad() + "', '" + getFechaFinUnidad() + "'," + getHorasDocenciaUnidad() + " ," + getHorasPracticaUnidad() + ", " + getHorasAutonomoUnidad() + ", '" + getEstrategiasUnidad() + "');";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean ModificarUnidadSilabo(int id) {
        String sql = "UPDATE public.\"UnidadSilabo\"\n"
                + "	SET id_unidad=" + getIdUnidad() + ", numero_unidad=" + getNumeroUnidad() + ", objetivo_especifico_unidad='" + getObjetivoEspecificoUnidad() + "', resultados_aprendizaje_unidad= '" + getResultadosAprendizajeUnidad() + "', contenidos_unidad="
                + "'" + getContenidosUnidad() + "', fecha_inicio_unidad= '" + getFechaInicioUnidad() + "', fecha_fin_unidad='" + getFechaFinUnidad() + "', horas_docencia_unidad=" + getHorasDocenciaUnidad() + ", horas_practica_unidad=" + getHorasPracticaUnidad() + ", horas_autonomo_unidad= " + getHorasAutonomoUnidad() + ", estrategias_unidad= '" + getEstrategiasUnidad() + "'\n"
                + "	WHERE id_unidad=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean EliminarUnidadSilabo(int id) {
        String sql = "DELETE FROM public.\"UnidadSilabo\"\n"
                + "	WHERE id_unidad=" + id + "";

        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public List<UnidadSilabo> mostrarDatosUnidadSilabo() {
        List<UnidadSilabo> lista = new ArrayList<UnidadSilabo>();
        String sql = "SELECT * FROM public.\"UnidadSilabo\"";

        ResultSet rs = con.query(sql);
        System.out.println(sql);
        try {
            while (rs.next()) {
                UnidadSilabo us = new UnidadSilabo();
                us.setIdUnidad(rs.getInt(1));
                us.setNumeroUnidad(rs.getInt(2));
                us.setObjetivoEspecificoUnidad(rs.getString(3));
                us.setResultadosAprendizajeUnidad(rs.getString(4));
                us.setContenidosUnidad(rs.getString(5));
                us.setFechaInicioUnidad(rs.getDate(6).toLocalDate());
                us.setFechaFinUnidad(rs.getDate(7).toLocalDate());
                us.setHorasDocenciaUnidad(rs.getInt(8));
                us.setHorasPracticaUnidad(rs.getInt(9));
                us.setHorasAutonomoUnidad(rs.getInt(10));
                us.setEstrategiasUnidad(rs.getString(11));
                lista.add(us);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
