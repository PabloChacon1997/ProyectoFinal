package modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class dbMaterias extends Materias {

    pgConect con = new pgConect();

    public boolean InsertarMaterias() {
        String sql = "INSERT INTO public.\"Materias\"(\n"
                + "	id_materia, id_carrera, id_eje, materia_codigo, materia_nombre, materia_ciclo, materia_creditos, materia_tipo, materia_categoria, materia_tipo_acreditacion, materia_horas_docencia, materia_horas_practicas, materia_horas_auto_estudio, materia_horas_presencial, materia_total_horas, materia_activa, materia_objetivo, materia_descripcion, materia_objetivo_especifico, materia_organizacion_curricular, materia_campo_formacion)\n"
                + "	VALUES (" + getIdMateria() + ", " + getIdCarrera() + ", " + getIdEje() + ",  '" + getMateriaCodigo() + "',  '" + getMateriaNombre() + "'"
                + ", " + getMateriaCiclo() + ", " + getMateriaCreditos() + ",  '" + getMateriaTipo() + "', '" + getMateriaCategoria() + "', "
                + " '" + getMateriaTipoAcreditacion() + "', " + getMateriaHorasDocencia() + ", " + getMateriaHorasPracticas() + ", "
                + "" + getMateriaHorasAutoEstudio() + ", " + getMateriaHorasPresencial() + ", " + getMateriaTotalHoras() + ", " + getMateriaActiva() + ""
                + ", '" + getMateriaObjetivo() + "', '" + getMateriaDescripcion() + "','" + getMateriaObjetivoEspecifico() + "' ,"
                + " '" + getMateriaOrganizacionCurricular() + "', '" + getMateriaCampoFormacion() + "');";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean ModificarMaterias(int id) {
        String sql = "UPDATE public.\"Materias\"\n"
                + "	SET id_materia=" + getIdMateria() + ", id_carrera=" + getIdCarrera() + ", id_eje=" + getIdEje() + ", materia_codigo='" + getMateriaCodigo() + "', materia_nombre='" + getMateriaNombre() + "'"
                + ", materia_ciclo=" + getMateriaCiclo() + ", materia_creditos=" + getMateriaCreditos() + ", materia_tipo= '" + getMateriaTipo() + "', materia_categoria='" + getMateriaCategoria() + "'"
                + ", materia_tipo_acreditacion='" + getMateriaTipoAcreditacion() + "', materia_horas_docencia=" + getMateriaHorasDocencia() + ", materia_horas_practicas=" + getMateriaHorasPracticas() + ""
                + ", materia_horas_auto_estudio=" + getMateriaHorasAutoEstudio() + ", materia_horas_presencial=" + getMateriaHorasPresencial() + ", materia_total_horas=" + getMateriaTotalHoras() + ", materia_activa=" + getMateriaActiva() + ""
                + ", materia_objetivo='" + getMateriaObjetivo() + "', materia_descripcion='" + getMateriaDescripcion() + "', materia_objetivo_especifico='" + getMateriaObjetivoEspecifico() + "'"
                + ", materia_organizacion_curricular='" + getMateriaOrganizacionCurricular() + "', materia_campo_formacion= '" + getMateriaCampoFormacion() + "'\n"
                + "	WHERE id_materia=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public boolean EliminarMaterias(int id) {
        String sql = "DELETE FROM public.\"Materias\"\n"
                + "	WHERE id_materia=" + id + "";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }

    public List<Materias> mostrarDatosMaterias() {
        List<Materias> lista = new ArrayList<Materias>();
        String sql = "SELECT * FROM public.\"Materias\"";

        ResultSet rs = con.query(sql);
        System.out.println(sql);
        try {
            while (rs.next()) {
                Materias mat = new Materias();
                mat.setIdMateria(rs.getInt(1));
                //mat.setIdCarrera(idCarrera);rs.getInt(2)); 
                //si son llaves foraneas le dejas comentado asi como este
                //mat.setIdEje(rs.getString(3));
                mat.setMateriaCodigo(rs.getString(4));
                mat.setMateriaNombre(rs.getString(5));
                mat.setMateriaCiclo(rs.getInt(6));
                mat.setMateriaCreditos(rs.getInt(7));
                mat.setMateriaTipo(rs.getString(8));
                mat.setMateriaCategoria(rs.getString(9));
                mat.setMateriaTipoAcreditacion(rs.getString(10));
                mat.setMateriaHorasDocencia(rs.getInt(11));
                mat.setMateriaHorasPracticas(rs.getInt(12));
                mat.setMateriaHorasAutoEstudio(rs.getInt(13));
                mat.setMateriaHorasPresencial(rs.getInt(14));
                mat.setMateriaTotalHoras(rs.getInt(15));
                mat.setMateriaActiva(rs.getBoolean(16));
                mat.setMateriaObjetivo(rs.getString(17));
                mat.setMateriaDescripcion(rs.getString(18));
                mat.setMateriaObjetivoEspecifico(rs.getString(19));
                mat.setMateriaOrganizacionCurricular(rs.getString(20));
                mat.setMateriaCampoFormacion(rs.getString(21));
                lista.add(mat);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Materias> buscarMateria(int[] aguja) {

        List<Materias> lista = new ArrayList<>();
        String sql = "SELECT DISTINCT \"Materias\".id_materia, materia_nombre FROM \"Materias\",\"Cursos\",\"Docentes\",\"Personas\"\n"
                + "WHERE \"Personas\".id_persona="+aguja[0]+"\n"
                + "AND \"Materias\".id_materia=\"Cursos\".id_materia\n"
                + "AND id_carrera="+aguja[1]+"\n"
                + "AND \"Personas\".id_persona=\"Docentes\".id_persona\n"
                + "AND \"Cursos\".id_docente=\"Docentes\".id_docente";

        ResultSet rs = con.query(sql);
        System.out.println(sql);
        try {
            while (rs.next()) {
                Materias mat = new Materias();
                mat.setIdMateria(rs.getInt(1));
                mat.setMateriaNombre(rs.getString(2));
                lista.add(mat);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    
    public Materias retornaMateria(String aguja) {

       try {
            Materias materia = null;
            String sql = "SELECT id_materia FROM \"Materias\" WHERE materia_nombre='"+aguja+"'";
            ResultSet rs = con.query(sql);
            while (rs.next()) {
                materia= new Materias();
                materia.setIdMateria(Integer.parseInt("id_materia"));
               
            }

            rs.close();
            return materia;
        } catch (SQLException ex) {
            Logger.getLogger(dbCarreras.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
