/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorUsuarios;

/**
 *
 * @author Andres Ullauri
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       modelo.db.dbUsuarios m= new modelo.db.dbUsuarios();
        
        vista.frmLogin v = new vista.frmLogin();
        
        controlador.ControladorUsuarios c= new ControladorUsuarios(m,v);
        
        c.iniciarControlador();
       
       /*modelo.db.dbUsuarios m= new modelo.db.dbUsuarios();
        
        vista.frmIngresoUsuario v = new vista.frmIngresoUsuario();
        
        controlador.ControladorUsuarios c= new ControladorUsuarios(m,v);
        
        c.iniciarControlador();*/
        
    }
    
}
