package modelo.db;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class dbEvaluacionSilabo extends EvaluacionSilabo {

    pgConect con = new pgConect();

    public dbEvaluacionSilabo() {
        
    }

    public boolean InsertarEvaluacionSilabo() {
        String sql = "INSERT INTO public.\"EvaluacionSilabo\"(\n"
                + "	id_evaluacion, id_silabo, id_unidad, actividad, id_tipo_actividad, instrumento, valoracion, fecha_envio, fecha_presentacion)\n"
                + "	VALUES (" + getIdEvaluacion() + "," + getIdSilabo() + "," + getIdUnidad() + ",'" + getActividad() + "'," + getIdTipoActividad() + ",'" + getInstrumento() + "'," + getValoracion() + ",'" + getFechaEnvio() + "','" + getFechaPresentacion() + "');";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean ModificarEvaluacionSilabo(int id) {
        String sql = "UPDATE public.\"EvaluacionSilabo\"\n"
                + "	SET id_evaluacion=" + getIdEvaluacion() + ", id_silabo=" + getIdSilabo() + ", id_unidad=" + getIdUnidad() + ", actividad='" + getActividad() + "', id_tipo_actividad=" + getIdTipoActividad() + ", instrumento='" + getInstrumento() + "', valoracion=" + getValoracion() + ", fecha_envio='" + getFechaEnvio() + "', fecha_presentacion='" + getFechaPresentacion() + "'\n"
                + "	WHERE id_evaluacion=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean EliminarEvaluacionSilabo(int id) {
        String sql = "DELETE FROM public.\"EvaluacionSilabo\"\n"
                + "	WHERE id_evaluacion=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public List<EvaluacionSilabo> mostrarEvaluacionSilabo() {
        List<EvaluacionSilabo> lista = new ArrayList<EvaluacionSilabo>();
        String sql = "SELECT * FROM public.\"EvaluacionSilabo\"";
        ResultSet rs = con.query(sql);
        System.out.println(sql);
        try {
            while (rs.next()) {

                EvaluacionSilabo es = new EvaluacionSilabo();
                es.setIdEvaluacion(rs.getInt(1));
                //es.setIdSilabo(rs.getInt(2));
                // es.setIdUnidad(rs.getInt(3));
                es.setActividad(rs.getString(4));
                //es.setIdTipoActividad(rs.getInt(5));
                es.setInstrumento(rs.getString(6));
                es.setValoracion(rs.getInt(7));
                es.setFechaEnvio(rs.getDate(8).toLocalDate());
                es.setFechaPresentacion(rs.getDate(9).toLocalDate());
                lista.add(es);

            }

            rs.close();
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
    
    public List<EvaluacionSilabo> mostrarEvaluacionSilabos1(){
        List<EvaluacionSilabo> lista = new ArrayList<EvaluacionSilabo>();
        EvaluacionSilabo es = new EvaluacionSilabo();
        es.setActividad(getActividad());
        es.setInstrumento(getInstrumento());
        es.setValoracion(getValoracion());
        es.setFechaEnvio(getFechaEnvio());
        es.setFechaPresentacion(getFechaPresentacion());
        lista.add(es);
        return lista;
    }
}
