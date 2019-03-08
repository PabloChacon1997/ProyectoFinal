/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Personas;
import modelo.db.dbPersonas;
import modelo.db.dbUsuarios;
import org.postgresql.util.Base64;
import vista.frmConfiguracionSilabo;
import vista.frmGestionSilabo;
import vista.frmIngresoUsuario;
import vista.frmLogin;
import vista.frmPrincipal;

/**
 *
 * @author Andres Ullauri
 */
public class ControladorUsuarios {

    private modelo.db.dbUsuarios usuario;
    private vista.frmIngresoUsuario ingreso;
    private vista.frmLogin login;
    private vista.frmPrincipal principal;

    public ControladorUsuarios(dbUsuarios usuario, frmLogin login) {
        this.usuario = usuario;
        this.login = login;
        this.principal = new frmPrincipal();
        login.setVisible(true);
    }

    public frmPrincipal getPrincipal() {
        return principal;
    }

    public void iniciarControlador() {
        login.setLocationRelativeTo(null);
        //ingreso.getBtnGuardar().addActionListener(e->grabaUsuario());
        login.getBtnIngresar().addActionListener(e -> iniciarSesion());
        login.getBtnIngresar().addActionListener(e -> login.dispose());
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                
                ControladorSilabo cs = new ControladorSilabo(new modelo.db.dbSilabo(), usuario, new frmConfiguracionSilabo());
                
                principal.getDkpSilabo().add(cs.getSetup());

                cs.getSetup().show();
                cs.getSetup().setLocation(0, 0);

                ActionListener a2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae2) {

                        principal.getDkpSilabo().add(cs.getGestion());
                        cs.iniciarSilabo();
                       
                        cs.getGestion().show();
                        cs.getGestion().setLocation(0, 0);
                        cs.getSetup().setVisible(false);
                        cs.getGestion().toFront();
                    }

                };
                cs.getSetup().getBtnSiguiente().addActionListener(a2);
                cs.getGestion().getBtnAtras().addActionListener(a->cs.getSetup().setVisible(true));
                cs.getGestion().getBtnAtras().addActionListener(a->cs.getGestion().dispose());
                cs.getSetup().getBtnCancelar().addActionListener(a->cs.getSetup().dispose());
                
            }

        };
        principal.getMntNuevoSilabo().addActionListener(al);
    }

    private void grabaUsuario() {

        usuario.setUsuUsername(ingreso.getTxtUsuario().getText());

        usuario.setUsuPassword(Hash1.md5(String.valueOf(ingreso.getTxtContrasena().getText())));

        if (usuario.insertar()) {
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar.");
        }

    }

    public void iniciarSesion() {
        principal.setLocationRelativeTo(null);
        usuario.setUsuUsername(login.getTxtUsuario().getText());
        usuario.setUsuPassword(Base64.encodeBytes(Hash1.md5(String.valueOf(login.getPswContrasena().getPassword())).getBytes()));
        usuario = usuario.autenticar(usuario.getUsuUsername(), usuario.getUsuPassword());
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, "BIENVENIDO: "+new dbPersonas().buscarPersonas(usuario.getIdPersona().getIdPersona()).getPersonaPrimerNombre()+"  "+new dbPersonas().buscarPersonas(usuario.getIdPersona().getIdPersona()).getPersonaPrimerApellido());

            principal.setVisible(true);
            getPrincipal().setTitle("USUARIO: "+new dbPersonas().buscarPersonas(usuario.getIdPersona().getIdPersona()).getPersonaPrimerNombre()+"  "+new dbPersonas().buscarPersonas(usuario.getIdPersona().getIdPersona()).getPersonaPrimerApellido());
            

        } else {
            JOptionPane.showMessageDialog(null, "Datos erroneos");
        }

    }

}

class Hash1 {

    /* Retorna un hash a partir de un tipo y un texto */
    public static String getHash(String txt, String hashType) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /* Retorna un hash MD5 a partir de un texto */
    public static String md5(String txt) {
        return Hash1.getHash(txt, "MD5");
    }

}
