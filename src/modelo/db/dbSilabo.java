package modelo.db;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class dbSilabo extends Silabo {

    pgConect con = new pgConect();

    public dbSilabo() {
    }

    public dbSilabo(Integer idSilabo) {
        super(idSilabo);
    }

    public dbSilabo(Integer idSilabo, String estadoSilabo) {
        super(idSilabo, estadoSilabo);
    }

    public boolean InsertarSilabo() {
        String sql = "INSERT INTO public.\"Silabo\"(\n"
                + "	id_silabo, id_materia, estado_silabo)\n"
                + "	VALUES (" + getIdSilabo() + "," + getIdMateria().getIdMateria() + ",'" + getEstadoSilabo() + "')";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean ModificarSilabo(int id) {
        String sql = "UPDATE public.\"Silabo\"\n"
                + "	SET id_silabo=" + getIdSilabo() + ", id_materia=" + getIdMateria() + ", estado_silabo='" + getEstadoSilabo() + "'\n"
                + "	WHERE id_silabo=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean EliminarSilabo(int id) {
        String sql = "DELETE FROM public.\"Silabo\"\n"
                + "	WHERE id_silabo=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public List<Silabo> mostrarDatosSilabo() {
        List<Silabo> lista = new ArrayList<Silabo>();
        String sql = "SELECT * FROM public.\"Silabo\"";

        ResultSet rs = con.query(sql);
        System.out.println(sql);
        try {
            while (rs.next()) {
                Silabo s = new Silabo();
                s.setIdSilabo(rs.getInt(1));
                //s.setIdMateria(rs.get);
                s.setEstadoSilabo(rs.getString(1));
                lista.add(s);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void cargarCarreras() {
        String sql = "SELECT carrera_nombre FROM public.\"Silabo\"";
        ResultSet rs = con.query(sql);
        try {
            while (rs.next()) {
                rs.getString("carrera_nombre");
            }
            rs.close();

        } catch (Exception e) {
            System.out.println(e);

        }

    }
    
    
    
}
