/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.UnidadSilabo;
import modelo.db.dbCarreras;

import modelo.db.dbMaterias;
import modelo.db.dbSilabo;
import modelo.db.dbUsuarios;
import vista.frmConfiguracionSilabo;
import vista.frmGestionSilabo;

/**
 *
 * @author Andres Ullauri
 */
public class ControladorSilabo {

    private modelo.db.dbSilabo silabo;

    private modelo.db.dbUsuarios usuario;

    private vista.frmConfiguracionSilabo setup;

    private vista.frmGestionSilabo gestion;

    private List<UnidadSilabo> unidades;

    public frmConfiguracionSilabo getSetup() {
        return setup;
    }

    public frmGestionSilabo getGestion() {
        return gestion;
    }

    public ControladorSilabo(dbSilabo silabo, dbUsuarios usuario, frmConfiguracionSilabo setup) {
        this.silabo = silabo;
        this.usuario = usuario;
        this.setup = setup;
        this.gestion = new frmGestionSilabo();
        setup.setVisible(true);
        iniciarControlador();

    }

    public void iniciarControlador() {

        cargarCombo1();

        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                setup.getCmbAsignatura().removeAllItems();
                cargarCombo2();
            }

        };
        setup.getCmbCarrera().addActionListener(a1);

        setup.getBtnSiguiente().addActionListener(e -> iniciarSilabo());

        MouseListener m1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                agregarUnidad();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };

       

        KeyListener k1 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                int j = gestion.getCmbUnidad().getSelectedIndex();
                unidades.get(j).setTituloUnidad(gestion.getTxtTitulo().getText());
                unidades.get(j).setObjetivoEspecificoUnidad(gestion.getTxrObjetivos().getText());
                unidades.get(j).setContenidosUnidad(gestion.getTxrContenidos().getText());
                 unidades.get(j).setResultadosAprendizajeUnidad(gestion.getTxrResultados().getText());
               
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };

        gestion.getTxtTitulo().addKeyListener(k1);
        gestion.getTxrObjetivos().addKeyListener(k1);
        gestion.getTxrContenidos().addKeyListener(k1);

        gestion.getTxrResultados().addKeyListener(k1);
        
        gestion.getLblAgregarUnidad().addMouseListener(m1);

        gestion.getCmbUnidad().addActionListener(e -> mostrarUnidades(gestion.getCmbUnidad().getSelectedIndex()));

    }

    private void cargarCombo1() {

        List<modelo.Carreras> carreras;

        System.out.println(usuario.getIdPersona().getIdPersona());
        carreras = new dbCarreras().buscarCarreras(usuario.getIdPersona().getIdPersona());

        for (int i = 0; i < carreras.size(); i++) {
            System.out.println(carreras.get(i).getCarreraNombre());
        }

        for (int i = 0; i < carreras.size(); i++) {
            setup.getCmbCarrera().addItem(carreras.get(i).getCarreraNombre());
        }

        cargarCombo2();
    }

    private void cargarCombo2() {

        List<modelo.Materias> materias;

        int[] aguja = {usuario.getIdPersona().getIdPersona(), new dbCarreras().retornaCarrera(setup.getCmbCarrera().getSelectedItem().toString()).getIdCarrera()};

        materias = new dbMaterias().buscarMateria(aguja);

        for (int i = 0; i < materias.size(); i++) {
            setup.getCmbAsignatura().addItem(materias.get(i).getMateriaNombre());
        }
    }

    public void guardarSilabo() {

        silabo.setEstadoSilabo("Por aprobar");
        silabo.setIdMateria(new dbMaterias().retornaMateria(setup.getCmbAsignatura().getSelectedItem().toString()));

    }

    public void mostrarUnidades(int unidad) {

        //silabo.getEvaluacionSilaboList().get(unidad).get
        gestion.getTxtTitulo().setText(unidades.get(unidad).getTituloUnidad());
        gestion.getTxrObjetivos().setText(unidades.get(unidad).getObjetivoEspecificoUnidad());
        gestion.getTxrContenidos().setText(unidades.get(unidad).getContenidosUnidad());
        gestion.getTxrResultados().setText(unidades.get(unidad).getResultadosAprendizajeUnidad());



    }

    public void iniciarSilabo() {

        //silabo.getEvaluacionSilaboList()
        //silabo.setEvaluacionSilaboList(new ArrayList<>());
        unidades = new ArrayList<>();
        
        //agregarUnidad();

    }

    public void agregarUnidad() {

        //silabo.getEvaluacionSilaboList().add(new EvaluacionSilabo());
        unidades.add(new UnidadSilabo());

        gestion.getCmbUnidad().addItem("Unidad " + unidades.size());

        
    }

}
