/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Personas;

import modelo.pgConect;

/**
 * 
 * @author Andres Ullauri
 */
public class dbPersonas extends Personas {

    pgConect conecta = new pgConect();

    public dbPersonas() {
    }

    public dbPersonas(Integer idPersona, String personaPrimerApellido, String personaPrimerNombre, String personaSexo, String personaEstadoCivil, String personaEtnia, String personaIdiomaRaiz, String personaTipoSangre, Date personaFechaRegistro, boolean personaDiscapacidad, Date personaFechaNacimiento, boolean personaActiva) {
        super(idPersona, personaPrimerApellido, personaPrimerNombre, personaSexo, personaEstadoCivil, personaEtnia, personaIdiomaRaiz, personaTipoSangre, personaFechaRegistro, personaDiscapacidad, personaFechaNacimiento, personaActiva);
    }
    
    public Personas buscarPersonas(int aguja) {

       try {
            Personas persona = null;
            String sql = "SELECT id_persona, persona_primer_nombre, persona_primer_apellido FROM \"Personas\" WHERE id_persona="+aguja+"";
            ResultSet rs = conecta.query(sql);
            while (rs.next()) {
                persona= new Personas();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setPersonaPrimerNombre(rs.getString("persona_primer_nombre"));
                persona.setPersonaPrimerApellido(rs.getString("persona_primer_apellido"));
            }

            rs.close();
            return persona;
        } catch (SQLException ex) {
            Logger.getLogger(dbPersonas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
