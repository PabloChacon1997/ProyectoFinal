/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuarios;
import modelo.pgConect;

import org.postgresql.util.Base64;

/**
 *
 * @author Andres Ullauri
 */
public class dbUsuarios extends Usuarios {

    pgConect conecta = new pgConect();

    public dbUsuarios() {
    }

    public dbUsuarios(String usuUsername, String usuPassword) {
        super(usuUsername, usuPassword);
    }

    public boolean insertar() {

        //Transformo image a base64 encode para postgresl
        String psw = null;

        psw = Base64.encodeBytes(this.getUsuPassword().getBytes());

        String nSql = "INSERT INTO public.\"Usuarios\"(\n"
                + "	 usu_username, usu_password, id_persona, id_rol)\n"
                + "	VALUES  ('" + this.getUsuUsername() + "','" + psw + "'," + 48 + "," + 1 + ")";

        nSql = "UPDATE public.\"Usuarios\"\n"
                + "	SET  usu_username='"+this.getUsuUsername() +"', usu_password='"+psw+"', id_persona="+48+", id_rol="+1+"\n"
                + "	WHERE id_usuario=1";
        
        if (conecta.noQuery(nSql) == null) {
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public dbUsuarios autenticar(String userName, String password) {

        try {
            dbUsuarios dbusuario = null;
            String sql = "SELECT usu_username, usu_password, id_persona\n"
                    + "FROM \"Usuarios\"\n"
                    + "WHERE usu_username='" + userName + "' AND usu_password='" + password + "'";
            ResultSet rs = conecta.query(sql);
            while (rs.next()) {
                dbusuario = new dbUsuarios();
                dbusuario.setUsuUsername(rs.getString("usu_username"));
                dbusuario.setUsuPassword(rs.getString("usu_password"));
                dbusuario.setIdPersona(new dbPersonas().buscarPersonas(rs.getInt("id_persona")));
                
                System.out.println(dbusuario.getUsuPassword());
            }

            rs.close();
            return dbusuario;
        } catch (SQLException ex) {
            Logger.getLogger(dbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
