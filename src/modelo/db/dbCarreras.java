/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carreras;
import modelo.pgConect;

/**
 *
 * @author Andres Ullauri
 */
public class dbCarreras extends Carreras {

    pgConect conecta = new pgConect();

    public dbCarreras() {
    }

    public dbCarreras(Integer idCarrera, String carreraNombre, String carreraCodigo, String carreraModalidad) {
        super(idCarrera, carreraNombre, carreraCodigo, carreraModalidad);
    }

    public List<Carreras> buscarCarreras(int aguja) {

        try {
            List<Carreras> lista = new ArrayList<Carreras>();
            String sql = "SELECT DISTINCT \"Carreras\".id_carrera, carrera_nombre FROM \"Cursos\",\"PeriodoLectivo\",\"Docentes\",\"Personas\",\"Carreras\"\n"
                    + "WHERE \"Personas\".id_persona=" + aguja + "\n"
                    + "AND \"PeriodoLectivo\".id_prd_lectivo=\"Cursos\".id_prd_lectivo\n"
                    + "AND \"Carreras\".id_carrera=\"PeriodoLectivo\".id_carrera\n"
                    + "AND \"Personas\".id_persona=\"Docentes\".id_persona\n"
                    + "AND \"Cursos\".id_docente=\"Docentes\".id_docente";

            ResultSet rs = conecta.query(sql);

            while (rs.next()) {
                Carreras car = new Carreras();

                car.setIdCarrera(Integer.parseInt(rs.getString("id_carrera")));
                car.setCarreraNombre(rs.getString("carrera_nombre"));

                lista.add(car);
            }
            rs.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(dbCarreras.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public Carreras retornaCarrera(String aguja) {

       try {
            Carreras carrera = null;
            String sql = "SELECT id_carrera FROM \"Carreras\" WHERE carrera_nombre='"+aguja+"'";
            ResultSet rs = conecta.query(sql);
            while (rs.next()) {
                carrera= new Carreras();
                carrera.setIdCarrera(Integer.parseInt(rs.getString("id_carrera")));
                
               
            }

            rs.close();
            return carrera;
        } catch (SQLException ex) {
            Logger.getLogger(dbCarreras.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
