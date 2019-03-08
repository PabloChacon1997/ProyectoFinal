/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Andres Ullauri
 */
public class frmGestionSilabo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Principal
     */
    
    public frmGestionSilabo() {
        initComponents();
    }

    public JLabel getLblAgregarUnidad() {
        return lblAgregarUnidad;
    }

    public void setLblAgregarUnidad(JLabel lblAgregarUnidad) {
        this.lblAgregarUnidad = lblAgregarUnidad;
    }
    
    public JButton getBtnAgregarA() {
        return btnAgregarA;
    }

    public void setBtnAgregarA(JButton btnAgregarA) {
        this.btnAgregarA = btnAgregarA;
    }

    public JButton getBtnAgregarAC() {
        return btnAgregarAC;
    }

    public void setBtnAgregarAC(JButton btnAgregarAC) {
        this.btnAgregarAC = btnAgregarAC;
    }

    public JButton getBtnAgregarAD() {
        return btnAgregarAD;
    }

    public void setBtnAgregarAD(JButton btnAgregarAD) {
        this.btnAgregarAD = btnAgregarAD;
    }

    public JButton getBtnAgregarP() {
        return btnAgregarP;
    }

    public void setBtnAgregarP(JButton btnAgregarP) {
        this.btnAgregarP = btnAgregarP;
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public void setBtnAtras(JButton btnAtras) {
        this.btnAtras = btnAtras;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnFinalizar() {
        return btnFinalizar;
    }

    public void setBtnFinalizar(JButton btnFinalizar) {
        this.btnFinalizar = btnFinalizar;
    }

    public JButton getBtnQuitarA() {
        return btnQuitarA;
    }

    public void setBtnQuitarA(JButton btnQuitarA) {
        this.btnQuitarA = btnQuitarA;
    }

    public JButton getBtnQuitarAC() {
        return btnQuitarAC;
    }

    public void setBtnQuitarAC(JButton btnQuitarAC) {
        this.btnQuitarAC = btnQuitarAC;
    }

    public JButton getBtnQuitarAD() {
        return btnQuitarAD;
    }

    public void setBtnQuitarAD(JButton btnQuitarAD) {
        this.btnQuitarAD = btnQuitarAD;
    }

    public JButton getBtnQuitarP() {
        return btnQuitarP;
    }

    public void setBtnQuitarP(JButton btnQuitarP) {
        this.btnQuitarP = btnQuitarP;
    }

    public JComboBox<String> getCmbUnidad() {
        return cmbUnidad;
    }

    public void setCmbUnidad(JComboBox<String> cmbUnidad) {
        this.cmbUnidad = cmbUnidad;
    }

    public JDateChooser getDchFechaEnvioA() {
        return dchFechaEnvioA;
    }

    public void setDchFechaEnvioA(JDateChooser dchFechaEnvioA) {
        this.dchFechaEnvioA = dchFechaEnvioA;
    }

    public JDateChooser getDchFechaEnvioAC() {
        return dchFechaEnvioAC;
    }

    public void setDchFechaEnvioAC(JDateChooser dchFechaEnvioAC) {
        this.dchFechaEnvioAC = dchFechaEnvioAC;
    }

    public JDateChooser getDchFechaEnvioAD() {
        return dchFechaEnvioAD;
    }

    public void setDchFechaEnvioAD(JDateChooser dchFechaEnvioAD) {
        this.dchFechaEnvioAD = dchFechaEnvioAD;
    }

    public JDateChooser getDchFechaEnvioP() {
        return dchFechaEnvioP;
    }

    public void setDchFechaEnvioP(JDateChooser dchFechaEnvioP) {
        this.dchFechaEnvioP = dchFechaEnvioP;
    }

    public JDateChooser getDchFechaFin() {
        return dchFechaFin;
    }

    public void setDchFechaFin(JDateChooser dchFechaFin) {
        this.dchFechaFin = dchFechaFin;
    }

    public JDateChooser getDchFechaInicio() {
        return dchFechaInicio;
    }

    public void setDchFechaInicio(JDateChooser dchFechaInicio) {
        this.dchFechaInicio = dchFechaInicio;
    }

    public JDateChooser getDchFechaPresentacionA() {
        return dchFechaPresentacionA;
    }

    public void setDchFechaPresentacionA(JDateChooser dchFechaPresentacionA) {
        this.dchFechaPresentacionA = dchFechaPresentacionA;
    }

    public JDateChooser getDchFechaPresentacionAC() {
        return dchFechaPresentacionAC;
    }

    public void setDchFechaPresentacionAC(JDateChooser dchFechaPresentacionAC) {
        this.dchFechaPresentacionAC = dchFechaPresentacionAC;
    }

    public JDateChooser getDchFechaPresentacionAD() {
        return dchFechaPresentacionAD;
    }

    public void setDchFechaPresentacionAD(JDateChooser dchFechaPresentacionAD) {
        this.dchFechaPresentacionAD = dchFechaPresentacionAD;
    }

    public JDateChooser getDchFechaPresentacionP() {
        return dchFechaPresentacionP;
    }

    public void setDchFechaPresentacionP(JDateChooser dchFechaPresentacionP) {
        this.dchFechaPresentacionP = dchFechaPresentacionP;
    }

    public JLabel getLblContenidos() {
        return lblContenidos;
    }

    public void setLblContenidos(JLabel lblContenidos) {
        this.lblContenidos = lblContenidos;
    }

    

    public JLabel getLblFechaEnvioA() {
        return lblFechaEnvioA;
    }

    public void setLblFechaEnvioA(JLabel lblFechaEnvioA) {
        this.lblFechaEnvioA = lblFechaEnvioA;
    }

    public JLabel getLblFechaEnvioAC() {
        return lblFechaEnvioAC;
    }

    public void setLblFechaEnvioAC(JLabel lblFechaEnvioAC) {
        this.lblFechaEnvioAC = lblFechaEnvioAC;
    }

    public JLabel getLblFechaEnvioAD() {
        return lblFechaEnvioAD;
    }

    public void setLblFechaEnvioAD(JLabel lblFechaEnvioAD) {
        this.lblFechaEnvioAD = lblFechaEnvioAD;
    }

    public JLabel getLblFechaEnvioP() {
        return lblFechaEnvioP;
    }

    public void setLblFechaEnvioP(JLabel lblFechaEnvioP) {
        this.lblFechaEnvioP = lblFechaEnvioP;
    }

    public JLabel getLblFechaFin() {
        return lblFechaFin;
    }

    public void setLblFechaFin(JLabel lblFechaFin) {
        this.lblFechaFin = lblFechaFin;
    }

    public JLabel getLblFechaInicio() {
        return lblFechaInicio;
    }

    public void setLblFechaInicio(JLabel lblFechaInicio) {
        this.lblFechaInicio = lblFechaInicio;
    }

    public JLabel getLblFechaPresentacionA() {
        return lblFechaPresentacionA;
    }

    public void setLblFechaPresentacionA(JLabel lblFechaPresentacionA) {
        this.lblFechaPresentacionA = lblFechaPresentacionA;
    }

    public JLabel getLblFechaPresentacionAC() {
        return lblFechaPresentacionAC;
    }

    public void setLblFechaPresentacionAC(JLabel lblFechaPresentacionAC) {
        this.lblFechaPresentacionAC = lblFechaPresentacionAC;
    }

    public JLabel getLblFechaPresentacionAD() {
        return lblFechaPresentacionAD;
    }

    public void setLblFechaPresentacionAD(JLabel lblFechaPresentacionAD) {
        this.lblFechaPresentacionAD = lblFechaPresentacionAD;
    }

    public JLabel getLblFechaPresentacionP() {
        return lblFechaPresentacionP;
    }

    public void setLblFechaPresentacionP(JLabel lblFechaPresentacionP) {
        this.lblFechaPresentacionP = lblFechaPresentacionP;
    }

    public JLabel getLblIndicadorA() {
        return lblIndicadorA;
    }

    public void setLblIndicadorA(JLabel lblIndicadorA) {
        this.lblIndicadorA = lblIndicadorA;
    }

    public JLabel getLblIndicadorAC() {
        return lblIndicadorAC;
    }

    public void setLblIndicadorAC(JLabel lblIndicadorAC) {
        this.lblIndicadorAC = lblIndicadorAC;
    }

    public JLabel getLblIndicadorAD() {
        return lblIndicadorAD;
    }

    public void setLblIndicadorAD(JLabel lblIndicadorAD) {
        this.lblIndicadorAD = lblIndicadorAD;
    }

    public JLabel getLblIndicadorP() {
        return lblIndicadorP;
    }

    public void setLblIndicadorP(JLabel lblIndicadorP) {
        this.lblIndicadorP = lblIndicadorP;
    }

    public JLabel getLblInstrumentoA() {
        return lblInstrumentoA;
    }

    public void setLblInstrumentoA(JLabel lblInstrumentoA) {
        this.lblInstrumentoA = lblInstrumentoA;
    }

    public JLabel getLblInstrumentoAC() {
        return lblInstrumentoAC;
    }

    public void setLblInstrumentoAC(JLabel lblInstrumentoAC) {
        this.lblInstrumentoAC = lblInstrumentoAC;
    }

    public JLabel getLblInstrumentoAD() {
        return lblInstrumentoAD;
    }

    public void setLblInstrumentoAD(JLabel lblInstrumentoAD) {
        this.lblInstrumentoAD = lblInstrumentoAD;
    }

    public JLabel getLblInstrumentoP() {
        return lblInstrumentoP;
    }

    public void setLblInstrumentoP(JLabel lblInstrumentoP) {
        this.lblInstrumentoP = lblInstrumentoP;
    }

    public JLabel getLblObjetivos() {
        return lblObjetivos;
    }

    public void setLblObjetivos(JLabel lblObjetivos) {
        this.lblObjetivos = lblObjetivos;
    }

    public JLabel getLblResultados() {
        return lblResultados;
    }

    public void setLblResultados(JLabel lblResultados) {
        this.lblResultados = lblResultados;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblUnidad() {
        return lblUnidad;
    }

    public void setLblUnidad(JLabel lblUnidad) {
        this.lblUnidad = lblUnidad;
    }

    public JLabel getLblValoracionA() {
        return lblValoracionA;
    }

    public void setLblValoracionA(JLabel lblValoracionA) {
        this.lblValoracionA = lblValoracionA;
    }

    public JLabel getLblValoracionAC() {
        return lblValoracionAC;
    }

    public void setLblValoracionAC(JLabel lblValoracionAC) {
        this.lblValoracionAC = lblValoracionAC;
    }

    public JLabel getLblValoracionAD() {
        return lblValoracionAD;
    }

    public void setLblValoracionAD(JLabel lblValoracionAD) {
        this.lblValoracionAD = lblValoracionAD;
    }

    public JLabel getLblValoracionP() {
        return lblValoracionP;
    }

    public void setLblValoracionP(JLabel lblValoracionP) {
        this.lblValoracionP = lblValoracionP;
    }

    public JPanel getPnlAprendizajeColaborativo() {
        return pnlAprendizajeColaborativo;
    }

    public void setPnlAprendizajeColaborativo(JPanel pnlAprendizajeColaborativo) {
        this.pnlAprendizajeColaborativo = pnlAprendizajeColaborativo;
    }

    public JPanel getPnlAsistidaDocente() {
        return pnlAsistidaDocente;
    }

    public void setPnlAsistidaDocente(JPanel pnlAsistidaDocente) {
        this.pnlAsistidaDocente = pnlAsistidaDocente;
    }

    public JPanel getPnlAutonoma() {
        return pnlAutonoma;
    }

    public void setPnlAutonoma(JPanel pnlAutonoma) {
        this.pnlAutonoma = pnlAutonoma;
    }

    public JPanel getPnlPractica() {
        return pnlPractica;
    }

    public void setPnlPractica(JPanel pnlPractica) {
        this.pnlPractica = pnlPractica;
    }

    public JPanel getPnlUnidad() {
        return pnlUnidad;
    }

    public void setPnlUnidad(JPanel pnlUnidad) {
        this.pnlUnidad = pnlUnidad;
    }

    public JScrollPane getScrAprendizajeColaboratibo() {
        return scrAprendizajeColaboratibo;
    }

    public void setScrAprendizajeColaboratibo(JScrollPane scrAprendizajeColaboratibo) {
        this.scrAprendizajeColaboratibo = scrAprendizajeColaboratibo;
    }

    public JScrollPane getScrAsistidaDocente() {
        return scrAsistidaDocente;
    }

    public void setScrAsistidaDocente(JScrollPane scrAsistidaDocente) {
        this.scrAsistidaDocente = scrAsistidaDocente;
    }

    public JScrollPane getScrAutonoma() {
        return scrAutonoma;
    }

    public void setScrAutonoma(JScrollPane scrAutonoma) {
        this.scrAutonoma = scrAutonoma;
    }

    public JScrollPane getScrContenidos() {
        return scrContenidos;
    }

    public void setScrContenidos(JScrollPane scrContenidos) {
        this.scrContenidos = scrContenidos;
    }

    

    public JScrollPane getScrObjetivos() {
        return scrObjetivos;
    }

    public void setScrObjetivos(JScrollPane scrObjetivos) {
        this.scrObjetivos = scrObjetivos;
    }

    public JScrollPane getScrPractica() {
        return scrPractica;
    }

    public void setScrPractica(JScrollPane scrPractica) {
        this.scrPractica = scrPractica;
    }

    public JScrollPane getScrResultados() {
        return scrResultados;
    }

    public void setScrResultados(JScrollPane scrResultados) {
        this.scrResultados = scrResultados;
    }

    public JSpinner getSpnValoracionA() {
        return spnValoracionA;
    }

    public void setSpnValoracionA(JSpinner spnValoracionA) {
        this.spnValoracionA = spnValoracionA;
    }

    public JSpinner getSpnValoracionAC() {
        return spnValoracionAC;
    }

    public void setSpnValoracionAC(JSpinner spnValoracionAC) {
        this.spnValoracionAC = spnValoracionAC;
    }

    public JSpinner getSpnValoracionAD() {
        return spnValoracionAD;
    }

    public void setSpnValoracionAD(JSpinner spnValoracionAD) {
        this.spnValoracionAD = spnValoracionAD;
    }

    public JSpinner getSpnValoracionP() {
        return spnValoracionP;
    }

    public void setSpnValoracionP(JSpinner spnValoracionP) {
        this.spnValoracionP = spnValoracionP;
    }

    public JTable getTblAprendizajeColaborativo() {
        return tblAprendizajeColaborativo;
    }

    public void setTblAprendizajeColaborativo(JTable tblAprendizajeColaborativo) {
        this.tblAprendizajeColaborativo = tblAprendizajeColaborativo;
    }

    public JTable getTblAsistidaDocente() {
        return tblAsistidaDocente;
    }

    public void setTblAsistidaDocente(JTable tblAsistidaDocente) {
        this.tblAsistidaDocente = tblAsistidaDocente;
    }

    public JTable getTblAutonoma() {
        return tblAutonoma;
    }

    public void setTblAutonoma(JTable tblAutonoma) {
        this.tblAutonoma = tblAutonoma;
    }

    public JTable getTblPractica() {
        return tblPractica;
    }

    public void setTblPractica(JTable tblPractica) {
        this.tblPractica = tblPractica;
    }

    public JTabbedPane getTbpEvaluacion() {
        return tbpEvaluacion;
    }

    public void setTbpEvaluacion(JTabbedPane tbpEvaluacion) {
        this.tbpEvaluacion = tbpEvaluacion;
    }

    public JTextArea getTxrContenidos() {
        return txrContenidos;
    }

    public void setTxrContenidos(JTextArea txrContenidos) {
        this.txrContenidos = txrContenidos;
    }

    

    public JTextArea getTxrObjetivos() {
        return txrObjetivos;
    }

    public void setTxrObjetivos(JTextArea txrObjetivos) {
        this.txrObjetivos = txrObjetivos;
    }

    public JTextArea getTxrResultados() {
        return txrResultados;
    }

    public void setTxrResultados(JTextArea txrResultados) {
        this.txrResultados = txrResultados;
    }

    public JTextField getTxtIndicadorA() {
        return txtIndicadorA;
    }

    public void setTxtIndicadorA(JTextField txtIndicadorA) {
        this.txtIndicadorA = txtIndicadorA;
    }

    public JTextField getTxtIndicadorAC() {
        return txtIndicadorAC;
    }

    public void setTxtIndicadorAC(JTextField txtIndicadorAC) {
        this.txtIndicadorAC = txtIndicadorAC;
    }

    public JTextField getTxtIndicadorAD() {
        return txtIndicadorAD;
    }

    public void setTxtIndicadorAD(JTextField txtIndicadorAD) {
        this.txtIndicadorAD = txtIndicadorAD;
    }

    public JTextField getTxtIndicadorP() {
        return txtIndicadorP;
    }

    public void setTxtIndicadorP(JTextField txtIndicadorP) {
        this.txtIndicadorP = txtIndicadorP;
    }

    public JTextField getTxtInstrumentoA() {
        return txtInstrumentoA;
    }

    public void setTxtInstrumentoA(JTextField txtInstrumentoA) {
        this.txtInstrumentoA = txtInstrumentoA;
    }

    public JTextField getTxtInstrumentoAC() {
        return txtInstrumentoAC;
    }

    public void setTxtInstrumentoAC(JTextField txtInstrumentoAC) {
        this.txtInstrumentoAC = txtInstrumentoAC;
    }

    public JTextField getTxtInstrumentoAD() {
        return txtInstrumentoAD;
    }

    public void setTxtInstrumentoAD(JTextField txtInstrumentoAD) {
        this.txtInstrumentoAD = txtInstrumentoAD;
    }

    public JTextField getTxtInstrumentoP() {
        return txtInstrumentoP;
    }

    public void setTxtInstrumentoP(JTextField txtInstrumentoP) {
        this.txtInstrumentoP = txtInstrumentoP;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUnidad = new javax.swing.JPanel();
        cmbUnidad = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JTextField();
        lblUnidad = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        dchFechaInicio = new com.toedter.calendar.JDateChooser();
        dchFechaFin = new com.toedter.calendar.JDateChooser();
        lblFechaFin = new javax.swing.JLabel();
        lblObjetivos = new javax.swing.JLabel();
        lblResultados = new javax.swing.JLabel();
        lblContenidos = new javax.swing.JLabel();
        tbpEvaluacion = new javax.swing.JTabbedPane();
        pnlAsistidaDocente = new javax.swing.JPanel();
        lblIndicadorAD = new javax.swing.JLabel();
        txtIndicadorAD = new javax.swing.JTextField();
        txtInstrumentoAD = new javax.swing.JTextField();
        lblInstrumentoAD = new javax.swing.JLabel();
        spnValoracionAD = new javax.swing.JSpinner();
        lblValoracionAD = new javax.swing.JLabel();
        lblFechaEnvioAD = new javax.swing.JLabel();
        dchFechaEnvioAD = new com.toedter.calendar.JDateChooser();
        lblFechaPresentacionAD = new javax.swing.JLabel();
        dchFechaPresentacionAD = new com.toedter.calendar.JDateChooser();
        scrAsistidaDocente = new javax.swing.JScrollPane();
        tblAsistidaDocente = new javax.swing.JTable();
        btnAgregarAD = new javax.swing.JButton();
        btnQuitarAD = new javax.swing.JButton();
        pnlAprendizajeColaborativo = new javax.swing.JPanel();
        lblIndicadorAC = new javax.swing.JLabel();
        txtIndicadorAC = new javax.swing.JTextField();
        txtInstrumentoAC = new javax.swing.JTextField();
        lblInstrumentoAC = new javax.swing.JLabel();
        spnValoracionAC = new javax.swing.JSpinner();
        lblValoracionAC = new javax.swing.JLabel();
        lblFechaEnvioAC = new javax.swing.JLabel();
        dchFechaEnvioAC = new com.toedter.calendar.JDateChooser();
        lblFechaPresentacionAC = new javax.swing.JLabel();
        dchFechaPresentacionAC = new com.toedter.calendar.JDateChooser();
        scrAprendizajeColaboratibo = new javax.swing.JScrollPane();
        tblAprendizajeColaborativo = new javax.swing.JTable();
        btnAgregarAC = new javax.swing.JButton();
        btnQuitarAC = new javax.swing.JButton();
        pnlPractica = new javax.swing.JPanel();
        lblIndicadorP = new javax.swing.JLabel();
        txtIndicadorP = new javax.swing.JTextField();
        txtInstrumentoP = new javax.swing.JTextField();
        lblInstrumentoP = new javax.swing.JLabel();
        spnValoracionP = new javax.swing.JSpinner();
        lblValoracionP = new javax.swing.JLabel();
        lblFechaEnvioP = new javax.swing.JLabel();
        dchFechaEnvioP = new com.toedter.calendar.JDateChooser();
        lblFechaPresentacionP = new javax.swing.JLabel();
        dchFechaPresentacionP = new com.toedter.calendar.JDateChooser();
        scrPractica = new javax.swing.JScrollPane();
        tblPractica = new javax.swing.JTable();
        btnAgregarP = new javax.swing.JButton();
        btnQuitarP = new javax.swing.JButton();
        pnlAutonoma = new javax.swing.JPanel();
        lblIndicadorA = new javax.swing.JLabel();
        txtIndicadorA = new javax.swing.JTextField();
        txtInstrumentoA = new javax.swing.JTextField();
        lblInstrumentoA = new javax.swing.JLabel();
        spnValoracionA = new javax.swing.JSpinner();
        lblValoracionA = new javax.swing.JLabel();
        lblFechaEnvioA = new javax.swing.JLabel();
        dchFechaEnvioA = new com.toedter.calendar.JDateChooser();
        lblFechaPresentacionA = new javax.swing.JLabel();
        dchFechaPresentacionA = new com.toedter.calendar.JDateChooser();
        scrAutonoma = new javax.swing.JScrollPane();
        tblAutonoma = new javax.swing.JTable();
        btnAgregarA = new javax.swing.JButton();
        btnQuitarA = new javax.swing.JButton();
        scrResultados = new javax.swing.JScrollPane();
        txrResultados = new javax.swing.JTextArea();
        scrObjetivos = new javax.swing.JScrollPane();
        txrObjetivos = new javax.swing.JTextArea();
        scrContenidos = new javax.swing.JScrollPane();
        txrContenidos = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblAgregarUnidad = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlUnidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUnidad.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 141, -1));

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        pnlUnidad.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 47, 510, -1));

        lblUnidad.setText("Seleccione la unidad:");
        pnlUnidad.add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        lblTitulo.setText("Titulo de la unidad:");
        pnlUnidad.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 25, -1, -1));

        lblFechaInicio.setText("Fecha de Inicio de Unidad:");
        pnlUnidad.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));
        pnlUnidad.add(dchFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, -1, -1));
        pnlUnidad.add(dchFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        lblFechaFin.setText("Fecha de Fin de Unidad:");
        pnlUnidad.add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        lblObjetivos.setText("Objetivos Específicos de la Unidad:");
        pnlUnidad.add(lblObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblResultados.setText("Resultados de Aprendizaje:");
        pnlUnidad.add(lblResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, -1, -1));

        lblContenidos.setText("Contenidos de la Unidad:");
        pnlUnidad.add(lblContenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblIndicadorAD.setText("Indicador:");

        lblInstrumentoAD.setText("Instrumento:");

        lblValoracionAD.setText("Valoración");

        lblFechaEnvioAD.setText("Fecha Envío:");

        lblFechaPresentacionAD.setText("Fecha Presentación:");

        tblAsistidaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Indicador", "Instrumento", "Valoración", "Fecha  Envío", "Fecha  Presentación"
            }
        ));
        tblAsistidaDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrAsistidaDocente.setViewportView(tblAsistidaDocente);
        if (tblAsistidaDocente.getColumnModel().getColumnCount() > 0) {
            tblAsistidaDocente.getColumnModel().getColumn(0).setMinWidth(270);
            tblAsistidaDocente.getColumnModel().getColumn(0).setPreferredWidth(270);
            tblAsistidaDocente.getColumnModel().getColumn(0).setMaxWidth(270);
            tblAsistidaDocente.getColumnModel().getColumn(1).setMinWidth(250);
            tblAsistidaDocente.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblAsistidaDocente.getColumnModel().getColumn(1).setMaxWidth(250);
            tblAsistidaDocente.getColumnModel().getColumn(2).setMinWidth(90);
            tblAsistidaDocente.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblAsistidaDocente.getColumnModel().getColumn(2).setMaxWidth(90);
            tblAsistidaDocente.getColumnModel().getColumn(3).setMinWidth(150);
            tblAsistidaDocente.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblAsistidaDocente.getColumnModel().getColumn(3).setMaxWidth(150);
            tblAsistidaDocente.getColumnModel().getColumn(4).setMinWidth(150);
            tblAsistidaDocente.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblAsistidaDocente.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        btnAgregarAD.setText("Agregar");

        btnQuitarAD.setText("Quitar");

        javax.swing.GroupLayout pnlAsistidaDocenteLayout = new javax.swing.GroupLayout(pnlAsistidaDocente);
        pnlAsistidaDocente.setLayout(pnlAsistidaDocenteLayout);
        pnlAsistidaDocenteLayout.setHorizontalGroup(
            pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAD)
                    .addComponent(btnQuitarAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIndicadorAD)
                            .addComponent(txtIndicadorAD, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstrumentoAD)
                            .addComponent(txtInstrumentoAD, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValoracionAD)
                            .addComponent(spnValoracionAD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaEnvioAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEnvioAD))
                        .addGap(32, 32, 32)
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaPresentacionAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaPresentacionAD)))
                    .addComponent(scrAsistidaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );
        pnlAsistidaDocenteLayout.setVerticalGroup(
            pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInstrumentoAD)
                            .addComponent(lblIndicadorAD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIndicadorAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstrumentoAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnValoracionAD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                            .addComponent(lblFechaPresentacionAD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaPresentacionAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                            .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValoracionAD)
                                .addComponent(lblFechaEnvioAD))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaEnvioAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlAsistidaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnAgregarAD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarAD)
                        .addGap(26, 26, 26))
                    .addGroup(pnlAsistidaDocenteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrAsistidaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        tbpEvaluacion.addTab("Gestión Docente - Asistida Docente", pnlAsistidaDocente);

        lblIndicadorAC.setText("Indicador:");

        lblInstrumentoAC.setText("Instrumento:");

        lblValoracionAC.setText("Valoración");

        lblFechaEnvioAC.setText("Fecha Envío:");

        lblFechaPresentacionAC.setText("Fecha Presentación:");

        tblAprendizajeColaborativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Indicador", "Instrumento", "Valoración", "Fecha  Envío", "Fecha  Presentación"
            }
        ));
        tblAprendizajeColaborativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrAprendizajeColaboratibo.setViewportView(tblAprendizajeColaborativo);
        if (tblAprendizajeColaborativo.getColumnModel().getColumnCount() > 0) {
            tblAprendizajeColaborativo.getColumnModel().getColumn(0).setMinWidth(270);
            tblAprendizajeColaborativo.getColumnModel().getColumn(0).setPreferredWidth(270);
            tblAprendizajeColaborativo.getColumnModel().getColumn(0).setMaxWidth(270);
            tblAprendizajeColaborativo.getColumnModel().getColumn(1).setMinWidth(250);
            tblAprendizajeColaborativo.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblAprendizajeColaborativo.getColumnModel().getColumn(1).setMaxWidth(250);
            tblAprendizajeColaborativo.getColumnModel().getColumn(2).setMinWidth(90);
            tblAprendizajeColaborativo.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblAprendizajeColaborativo.getColumnModel().getColumn(2).setMaxWidth(90);
            tblAprendizajeColaborativo.getColumnModel().getColumn(3).setMinWidth(150);
            tblAprendizajeColaborativo.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblAprendizajeColaborativo.getColumnModel().getColumn(3).setMaxWidth(150);
            tblAprendizajeColaborativo.getColumnModel().getColumn(4).setMinWidth(150);
            tblAprendizajeColaborativo.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblAprendizajeColaborativo.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        btnAgregarAC.setText("Agregar");

        btnQuitarAC.setText("Quitar");

        javax.swing.GroupLayout pnlAprendizajeColaborativoLayout = new javax.swing.GroupLayout(pnlAprendizajeColaborativo);
        pnlAprendizajeColaborativo.setLayout(pnlAprendizajeColaborativoLayout);
        pnlAprendizajeColaborativoLayout.setHorizontalGroup(
            pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAprendizajeColaborativoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAC)
                    .addComponent(btnQuitarAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIndicadorAC)
                            .addComponent(txtIndicadorAC, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstrumentoAC)
                            .addComponent(txtInstrumentoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValoracionAC)
                            .addComponent(spnValoracionAC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaEnvioAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEnvioAC))
                        .addGap(37, 37, 37)
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaPresentacionAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaPresentacionAC)))
                    .addComponent(scrAprendizajeColaboratibo, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(391, 391, 391))
        );
        pnlAprendizajeColaborativoLayout.setVerticalGroup(
            pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInstrumentoAC)
                            .addComponent(lblIndicadorAC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIndicadorAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstrumentoAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnValoracionAC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                            .addComponent(lblFechaPresentacionAC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaPresentacionAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                            .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValoracionAC)
                                .addComponent(lblFechaEnvioAC))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaEnvioAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlAprendizajeColaborativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrAprendizajeColaboratibo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAprendizajeColaborativoLayout.createSequentialGroup()
                        .addComponent(btnAgregarAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarAC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpEvaluacion.addTab("Gestión Docente - Aprendizaje Colaborativo", pnlAprendizajeColaborativo);

        lblIndicadorP.setText("Indicador:");

        lblInstrumentoP.setText("Instrumento:");

        lblValoracionP.setText("Valoración");

        lblFechaEnvioP.setText("Fecha Envío:");

        lblFechaPresentacionP.setText("Fecha Presentación:");

        tblPractica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Indicador", "Instrumento", "Valoración", "Fecha  Envío", "Fecha  Presentación"
            }
        ));
        tblPractica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrPractica.setViewportView(tblPractica);
        if (tblPractica.getColumnModel().getColumnCount() > 0) {
            tblPractica.getColumnModel().getColumn(0).setMinWidth(270);
            tblPractica.getColumnModel().getColumn(0).setPreferredWidth(270);
            tblPractica.getColumnModel().getColumn(0).setMaxWidth(270);
            tblPractica.getColumnModel().getColumn(1).setMinWidth(250);
            tblPractica.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblPractica.getColumnModel().getColumn(1).setMaxWidth(250);
            tblPractica.getColumnModel().getColumn(2).setMinWidth(90);
            tblPractica.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblPractica.getColumnModel().getColumn(2).setMaxWidth(90);
            tblPractica.getColumnModel().getColumn(3).setMinWidth(150);
            tblPractica.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblPractica.getColumnModel().getColumn(3).setMaxWidth(150);
            tblPractica.getColumnModel().getColumn(4).setMinWidth(150);
            tblPractica.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblPractica.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        btnAgregarP.setText("Agregar");

        btnQuitarP.setText("Quitar");

        javax.swing.GroupLayout pnlPracticaLayout = new javax.swing.GroupLayout(pnlPractica);
        pnlPractica.setLayout(pnlPracticaLayout);
        pnlPracticaLayout.setHorizontalGroup(
            pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPracticaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarP)
                    .addComponent(btnQuitarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPracticaLayout.createSequentialGroup()
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIndicadorP)
                            .addComponent(txtIndicadorP, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstrumentoP)
                            .addComponent(txtInstrumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValoracionP)
                            .addComponent(spnValoracionP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaEnvioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEnvioP))
                        .addGap(37, 37, 37)
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaPresentacionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaPresentacionP)))
                    .addComponent(scrPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(391, 391, 391))
        );
        pnlPracticaLayout.setVerticalGroup(
            pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPracticaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPracticaLayout.createSequentialGroup()
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInstrumentoP)
                            .addComponent(lblIndicadorP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIndicadorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstrumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnValoracionP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlPracticaLayout.createSequentialGroup()
                            .addComponent(lblFechaPresentacionP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaPresentacionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPracticaLayout.createSequentialGroup()
                            .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValoracionP)
                                .addComponent(lblFechaEnvioP))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaEnvioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPracticaLayout.createSequentialGroup()
                        .addComponent(btnAgregarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpEvaluacion.addTab("Gestión Práctica", pnlPractica);

        lblIndicadorA.setText("Indicador:");

        lblInstrumentoA.setText("Instrumento:");

        lblValoracionA.setText("Valoración");

        lblFechaEnvioA.setText("Fecha Envío:");

        lblFechaPresentacionA.setText("Fecha Presentación:");

        tblAutonoma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Indicador", "Instrumento", "Valoración", "Fecha  Envío", "Fecha  Presentación"
            }
        ));
        tblAutonoma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrAutonoma.setViewportView(tblAutonoma);
        if (tblAutonoma.getColumnModel().getColumnCount() > 0) {
            tblAutonoma.getColumnModel().getColumn(0).setMinWidth(270);
            tblAutonoma.getColumnModel().getColumn(0).setPreferredWidth(270);
            tblAutonoma.getColumnModel().getColumn(0).setMaxWidth(270);
            tblAutonoma.getColumnModel().getColumn(1).setMinWidth(250);
            tblAutonoma.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblAutonoma.getColumnModel().getColumn(1).setMaxWidth(250);
            tblAutonoma.getColumnModel().getColumn(2).setMinWidth(90);
            tblAutonoma.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblAutonoma.getColumnModel().getColumn(2).setMaxWidth(90);
            tblAutonoma.getColumnModel().getColumn(3).setMinWidth(150);
            tblAutonoma.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblAutonoma.getColumnModel().getColumn(3).setMaxWidth(150);
            tblAutonoma.getColumnModel().getColumn(4).setMinWidth(150);
            tblAutonoma.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblAutonoma.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        btnAgregarA.setText("Agregar");

        btnQuitarA.setText("Quitar");

        javax.swing.GroupLayout pnlAutonomaLayout = new javax.swing.GroupLayout(pnlAutonoma);
        pnlAutonoma.setLayout(pnlAutonomaLayout);
        pnlAutonomaLayout.setHorizontalGroup(
            pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAutonomaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarA)
                    .addComponent(btnQuitarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAutonomaLayout.createSequentialGroup()
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIndicadorA)
                            .addComponent(txtIndicadorA, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstrumentoA)
                            .addComponent(txtInstrumentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValoracionA)
                            .addComponent(spnValoracionA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaEnvioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEnvioA))
                        .addGap(37, 37, 37)
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaPresentacionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaPresentacionA)))
                    .addComponent(scrAutonoma, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(391, 391, 391))
        );
        pnlAutonomaLayout.setVerticalGroup(
            pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutonomaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAutonomaLayout.createSequentialGroup()
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInstrumentoA)
                            .addComponent(lblIndicadorA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIndicadorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstrumentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnValoracionA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlAutonomaLayout.createSequentialGroup()
                            .addComponent(lblFechaPresentacionA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaPresentacionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAutonomaLayout.createSequentialGroup()
                            .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValoracionA)
                                .addComponent(lblFechaEnvioA))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dchFechaEnvioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlAutonomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrAutonoma, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAutonomaLayout.createSequentialGroup()
                        .addComponent(btnAgregarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpEvaluacion.addTab("Gestión Autónoma", pnlAutonoma);

        pnlUnidad.add(tbpEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1310, 217));

        txrResultados.setColumns(20);
        txrResultados.setRows(5);
        scrResultados.setViewportView(txrResultados);

        pnlUnidad.add(scrResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 410, 100));

        txrObjetivos.setColumns(20);
        txrObjetivos.setRows(5);
        scrObjetivos.setViewportView(txrObjetivos);

        pnlUnidad.add(scrObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 410, 100));

        txrContenidos.setColumns(20);
        txrContenidos.setRows(5);
        scrContenidos.setViewportView(txrContenidos);

        pnlUnidad.add(scrContenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 410, 100));

        btnCancelar.setText("Cancelar");
        pnlUnidad.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 580, -1, -1));

        btnFinalizar.setText("Finalizar");
        pnlUnidad.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 580, -1, -1));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlUnidad.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, -1, -1));

        lblAgregarUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icono_agregar.png"))); // NOI18N
        pnlUnidad.add(lblAgregarUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 39, -1, -1));
        pnlUnidad.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, 60, -1));

        jLabel1.setText("Horas Prácticas:");
        pnlUnidad.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, -1, -1));

        jLabel2.setText("Horas Docencia:");
        pnlUnidad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel3.setText("Horas Autónomas:");
        pnlUnidad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, -1, -1));
        pnlUnidad.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, 60, -1));
        pnlUnidad.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 60, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        pnlUnidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 390, 230));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        pnlUnidad.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 410, 100));

        jLabel4.setText("Estrategias de Enseñanza:");
        pnlUnidad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        jLabel5.setText("Estrategias predeterminadas:");
        pnlUnidad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGestionSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGestionSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGestionSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGestionSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGestionSilabo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JButton btnAgregarAC;
    private javax.swing.JButton btnAgregarAD;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnQuitarA;
    private javax.swing.JButton btnQuitarAC;
    private javax.swing.JButton btnQuitarAD;
    private javax.swing.JButton btnQuitarP;
    private javax.swing.JComboBox<String> cmbUnidad;
    private com.toedter.calendar.JDateChooser dchFechaEnvioA;
    private com.toedter.calendar.JDateChooser dchFechaEnvioAC;
    private com.toedter.calendar.JDateChooser dchFechaEnvioAD;
    private com.toedter.calendar.JDateChooser dchFechaEnvioP;
    private com.toedter.calendar.JDateChooser dchFechaFin;
    private com.toedter.calendar.JDateChooser dchFechaInicio;
    private com.toedter.calendar.JDateChooser dchFechaPresentacionA;
    private com.toedter.calendar.JDateChooser dchFechaPresentacionAC;
    private com.toedter.calendar.JDateChooser dchFechaPresentacionAD;
    private com.toedter.calendar.JDateChooser dchFechaPresentacionP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgregarUnidad;
    private javax.swing.JLabel lblContenidos;
    private javax.swing.JLabel lblFechaEnvioA;
    private javax.swing.JLabel lblFechaEnvioAC;
    private javax.swing.JLabel lblFechaEnvioAD;
    private javax.swing.JLabel lblFechaEnvioP;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFechaPresentacionA;
    private javax.swing.JLabel lblFechaPresentacionAC;
    private javax.swing.JLabel lblFechaPresentacionAD;
    private javax.swing.JLabel lblFechaPresentacionP;
    private javax.swing.JLabel lblIndicadorA;
    private javax.swing.JLabel lblIndicadorAC;
    private javax.swing.JLabel lblIndicadorAD;
    private javax.swing.JLabel lblIndicadorP;
    private javax.swing.JLabel lblInstrumentoA;
    private javax.swing.JLabel lblInstrumentoAC;
    private javax.swing.JLabel lblInstrumentoAD;
    private javax.swing.JLabel lblInstrumentoP;
    private javax.swing.JLabel lblObjetivos;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JLabel lblValoracionA;
    private javax.swing.JLabel lblValoracionAC;
    private javax.swing.JLabel lblValoracionAD;
    private javax.swing.JLabel lblValoracionP;
    private javax.swing.JPanel pnlAprendizajeColaborativo;
    private javax.swing.JPanel pnlAsistidaDocente;
    private javax.swing.JPanel pnlAutonoma;
    private javax.swing.JPanel pnlPractica;
    private javax.swing.JPanel pnlUnidad;
    private javax.swing.JScrollPane scrAprendizajeColaboratibo;
    private javax.swing.JScrollPane scrAsistidaDocente;
    private javax.swing.JScrollPane scrAutonoma;
    private javax.swing.JScrollPane scrContenidos;
    private javax.swing.JScrollPane scrObjetivos;
    private javax.swing.JScrollPane scrPractica;
    private javax.swing.JScrollPane scrResultados;
    private javax.swing.JSpinner spnValoracionA;
    private javax.swing.JSpinner spnValoracionAC;
    private javax.swing.JSpinner spnValoracionAD;
    private javax.swing.JSpinner spnValoracionP;
    private javax.swing.JTable tblAprendizajeColaborativo;
    private javax.swing.JTable tblAsistidaDocente;
    private javax.swing.JTable tblAutonoma;
    private javax.swing.JTable tblPractica;
    private javax.swing.JTabbedPane tbpEvaluacion;
    private javax.swing.JTextArea txrContenidos;
    private javax.swing.JTextArea txrObjetivos;
    private javax.swing.JTextArea txrResultados;
    private javax.swing.JTextField txtIndicadorA;
    private javax.swing.JTextField txtIndicadorAC;
    private javax.swing.JTextField txtIndicadorAD;
    private javax.swing.JTextField txtIndicadorP;
    private javax.swing.JTextField txtInstrumentoA;
    private javax.swing.JTextField txtInstrumentoAC;
    private javax.swing.JTextField txtInstrumentoAD;
    private javax.swing.JTextField txtInstrumentoP;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
