/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.UnidadSilabo;
import modelo.db.dbCarreras;
import modelo.db.dbEvaluacionSilabo;

import modelo.db.dbMaterias;
import modelo.db.dbSilabo;
import modelo.db.dbUsuarios;
import sun.util.BuddhistCalendar;
import vista.frmConfiguracionSilabo;
import vista.frmGestionSilabo;

/**
 *
 * @author Andres Ullauri
 */
public class ControladorSilabo {

    private modelo.db.dbSilabo silabo;

    private modelo.db.dbUsuarios usuario;

    private modelo.db.dbEvaluacionSilabo dbevalSilabo;

    private vista.frmConfiguracionSilabo setup;

    private vista.frmGestionSilabo gestion;

    private List<UnidadSilabo> unidades;

    public frmConfiguracionSilabo getSetup() {
        return setup;
    }

    public frmGestionSilabo getGestion() {
        return gestion;
    }

    public ControladorSilabo(dbSilabo silabo, dbUsuarios usuario, frmConfiguracionSilabo setup, dbEvaluacionSilabo dbevaSilabo) {
        this.silabo = silabo;
        this.usuario = usuario;
        this.setup = setup;
        this.dbevalSilabo = dbevaSilabo;
        this.gestion = new frmGestionSilabo();
        setup.setVisible(true);
        iniciarControlador();
        
        gestion.getPnlUnidad().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int j = gestion.getCmbUnidad().getSelectedIndex();
                guardarFecha(j);
            }
            
        });
        

    }

    public void iniciarControlador() {

        gestion.getBtnAgregarAD().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregar_en_Tabla(e);
            }
        });

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
                
                
                guardarFecha(j);
                
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

    private void guardarFecha(int j) {
        try {

            int anioInicio = gestion.getDchFechaInicio().getCalendar().get(Calendar.YEAR);
            int mesInicio = gestion.getDchFechaInicio().getCalendar().get(Calendar.MONTH) + 1;
            int diaInicio = gestion.getDchFechaInicio().getCalendar().get(Calendar.DAY_OF_MONTH);

            LocalDate fechaInicio = LocalDate.of(anioInicio, mesInicio, diaInicio);

            unidades.get(j).setFechaInicioUnidad(fechaInicio);

            int anioFin = gestion.getDchFechaFin().getCalendar().get(Calendar.YEAR);
            int mesFin = gestion.getDchFechaFin().getCalendar().get(Calendar.MONTH) + 1;
            int diaFin = gestion.getDchFechaFin().getCalendar().get(Calendar.DAY_OF_MONTH);

            LocalDate fechaFin = LocalDate.of(anioFin, mesFin, diaFin);

            unidades.get(j).setFechaFinUnidad(fechaFin);

        } catch (NullPointerException e) {
        }
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

        if (unidades.get(unidad).getFechaInicioUnidad() != null) {
            gestion.getDchFechaInicio().setDate(java.sql.Date.valueOf(unidades.get(unidad).getFechaInicioUnidad()));
        } else {

            gestion.getDchFechaInicio().setDate(null);

        }
        if (unidades.get(unidad).getFechaFinUnidad() != null) {
            gestion.getDchFechaFin().setDate(java.sql.Date.valueOf(unidades.get(unidad).getFechaFinUnidad()));
        } else {
            gestion.getDchFechaFin().setCalendar(null);
        }

    }

    public void iniciarSilabo() {

        //silabo.getEvaluacionSilaboList()
        //silabo.setEvaluacionSilaboList(new ArrayList<>());
        unidades = new ArrayList<>();

        //agregarUnidad();
    }

    public void agregarUnidad() {

        //silabo.getEvaluacionSilaboList().add(new EvaluacionSilabo());
        UnidadSilabo unidad = new UnidadSilabo();
//        
//        int anio = gestion.getDchFechaInicio().getCalendar().get(Calendar.YEAR);
//        int mes = gestion.getDchFechaInicio().getCalendar().get(Calendar.MONTH+1);
//        int dia  = gestion.getDchFechaInicio().getCalendar().get(Calendar.DAY_OF_MONTH);
//        
//        LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
//        unidad.setFechaInicioUnidad(fechaInicio);

        unidades.add(unidad);

        gestion.getCmbUnidad().addItem("Unidad " + unidades.size());

    }

    public void cargarDatosTabla() {
        DefaultTableModel modelo_tabla;
        modelo_tabla = (DefaultTableModel) gestion.getTblAsistidaDocente().getModel();
        List<modelo.EvaluacionSilabo> lista = dbevalSilabo.mostrarEvaluacionSilabos1();

        int columnas = modelo_tabla.getColumnCount();

        for (int i = 0; i < lista.size(); i++) {
            modelo_tabla.addRow(new Object[columnas]);
            gestion.getTblAsistidaDocente().setValueAt(lista.get(i).getActividad(), i, 0);
            gestion.getTblAsistidaDocente().setValueAt(lista.get(i).getInstrumento(), i, 1);
            gestion.getTblAsistidaDocente().setValueAt(lista.get(i).getValoracion(), i, 2);
            gestion.getTblAsistidaDocente().setValueAt(lista.get(i).getFechaEnvio(), i, 3);
            gestion.getTblAsistidaDocente().setValueAt(lista.get(i).getFechaPresentacion(), i, 4);

        }

    }

    public void agregar_en_Tabla(MouseEvent e) {
        dbevalSilabo.setActividad(gestion.getTxtIndicadorAD().getText());
        dbevalSilabo.setInstrumento(gestion.getTxtInstrumentoAD().getText());
        dbevalSilabo.setValoracion(Integer.parseInt(gestion.getSpnValoracionAD().getValue().toString()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String date = (gestion.getDchFechaEnvioAD().getDateFormatString());
        LocalDate localDate = LocalDate.parse(date, formatter);
        dbevalSilabo.setFechaEnvio(localDate);

        String date1 = gestion.getDchFechaPresentacionAD().getDateFormatString();
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        dbevalSilabo.setFechaPresentacion(localDate1);
        cargarDatosTabla();
    }

}
