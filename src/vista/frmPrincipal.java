/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Andres Ullauri
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            initComponents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public JDesktopPane getDkpSilabo() {
        return dkpSilabo;
    }

    public void setDkpSilabo(JDesktopPane dkpSilabo) {
        this.dkpSilabo = dkpSilabo;
    }

    public JLabel getLblAbrirSilabo() {
        return lblAbrirSilabo;
    }

    public void setLblAbrirSilabo(JLabel lblAbrirSilabo) {
        this.lblAbrirSilabo = lblAbrirSilabo;
    }

    public JLabel getLblImprimirSilabo() {
        return lblImprimirSilabo;
    }

    public void setLblImprimirSilabo(JLabel lblImprimirSilabo) {
        this.lblImprimirSilabo = lblImprimirSilabo;
    }

    public JLabel getLblNuevaUnidad() {
        return lblNuevaUnidad;
    }

    public void setLblNuevaUnidad(JLabel lblNuevaUnidad) {
        this.lblNuevaUnidad = lblNuevaUnidad;
    }

    public JLabel getLblNuevoSilabo() {
        return lblNuevoSilabo;
    }

    public void setLblNuevoSilabo(JLabel lblNuevoSilabo) {
        this.lblNuevoSilabo = lblNuevoSilabo;
    }

    public JMenu getMnSilabo() {
        return mnSilabo;
    }

    public void setMnSilabo(JMenu mnSilabo) {
        this.mnSilabo = mnSilabo;
    }

    public JMenuBar getMnbSilabo() {
        return mnbSilabo;
    }

    public void setMnbSilabo(JMenuBar mnbSilabo) {
        this.mnbSilabo = mnbSilabo;
    }

    public JMenuItem getMntAbrirSilabo() {
        return mntAbrirSilabo;
    }

    public void setMntAbrirSilabo(JMenuItem mntAbrirSilabo) {
        this.mntAbrirSilabo = mntAbrirSilabo;
    }

    public JMenuItem getMntGuardar() {
        return mntGuardar;
    }

    public void setMntGuardar(JMenuItem mntGuardar) {
        this.mntGuardar = mntGuardar;
    }

    public JMenuItem getMntImprimirSilabo() {
        return mntImprimirSilabo;
    }

    public void setMntImprimirSilabo(JMenuItem mntImprimirSilabo) {
        this.mntImprimirSilabo = mntImprimirSilabo;
    }

    public JMenuItem getMntNuevaUnidad() {
        return mntNuevaUnidad;
    }

    public void setMntNuevaUnidad(JMenuItem mntNuevaUnidad) {
        this.mntNuevaUnidad = mntNuevaUnidad;
    }

    public JMenuItem getMntNuevoSilabo() {
        return mntNuevoSilabo;
    }

    public void setMntNuevoSilabo(JMenuItem mntNuevoSilabo) {
        this.mntNuevoSilabo = mntNuevoSilabo;
    }

    public JToolBar getTlbSilabo() {
        return tlbSilabo;
    }

    public void setTlbSilabo(JToolBar tlbSilabo) {
        this.tlbSilabo = tlbSilabo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tlbSilabo = new javax.swing.JToolBar();
        lblNuevoSilabo = new javax.swing.JLabel();
        lblNuevaUnidad = new javax.swing.JLabel();
        lblAbrirSilabo = new javax.swing.JLabel();
        lblImprimirSilabo = new javax.swing.JLabel();
        dkpSilabo = new javax.swing.JDesktopPane();
        mnbSilabo = new javax.swing.JMenuBar();
        mnSilabo = new javax.swing.JMenu();
        mntNuevoSilabo = new javax.swing.JMenuItem();
        mntNuevaUnidad = new javax.swing.JMenuItem();
        mntAbrirSilabo = new javax.swing.JMenuItem();
        mntGuardar = new javax.swing.JMenuItem();
        mntImprimirSilabo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tlbSilabo.setRollover(true);

        lblNuevoSilabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icono_nuevo_silabo.png"))); // NOI18N
        tlbSilabo.add(lblNuevoSilabo);

        lblNuevaUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icono_nueva_unidad.png"))); // NOI18N
        tlbSilabo.add(lblNuevaUnidad);

        lblAbrirSilabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icono_abrir.png"))); // NOI18N
        tlbSilabo.add(lblAbrirSilabo);

        lblImprimirSilabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/icono_guardar.png"))); // NOI18N
        lblImprimirSilabo.setToolTipText("");
        tlbSilabo.add(lblImprimirSilabo);

        dkpSilabo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dkpSilaboLayout = new javax.swing.GroupLayout(dkpSilabo);
        dkpSilabo.setLayout(dkpSilaboLayout);
        dkpSilaboLayout.setHorizontalGroup(
            dkpSilaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dkpSilaboLayout.setVerticalGroup(
            dkpSilaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        mnSilabo.setText("Silabo");

        mntNuevoSilabo.setText("Nuevo Silabo");
        mntNuevoSilabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntNuevoSilaboActionPerformed(evt);
            }
        });
        mnSilabo.add(mntNuevoSilabo);

        mntNuevaUnidad.setText("Nueva Unidad");
        mnSilabo.add(mntNuevaUnidad);

        mntAbrirSilabo.setText("Abrir");
        mntAbrirSilabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntAbrirSilaboActionPerformed(evt);
            }
        });
        mnSilabo.add(mntAbrirSilabo);

        mntGuardar.setText("Guardar");
        mnSilabo.add(mntGuardar);

        mntImprimirSilabo.setText("Imprimir");
        mntImprimirSilabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntImprimirSilaboActionPerformed(evt);
            }
        });
        mnSilabo.add(mntImprimirSilabo);

        mnbSilabo.add(mnSilabo);

        setJMenuBar(mnbSilabo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tlbSilabo, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dkpSilabo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlbSilabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dkpSilabo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntNuevoSilaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntNuevoSilaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mntNuevoSilaboActionPerformed

    private void mntAbrirSilaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntAbrirSilaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mntAbrirSilaboActionPerformed

    private void mntImprimirSilaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntImprimirSilaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mntImprimirSilaboActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpSilabo;
    private javax.swing.JLabel lblAbrirSilabo;
    private javax.swing.JLabel lblImprimirSilabo;
    private javax.swing.JLabel lblNuevaUnidad;
    private javax.swing.JLabel lblNuevoSilabo;
    private javax.swing.JMenu mnSilabo;
    private javax.swing.JMenuBar mnbSilabo;
    private javax.swing.JMenuItem mntAbrirSilabo;
    private javax.swing.JMenuItem mntGuardar;
    private javax.swing.JMenuItem mntImprimirSilabo;
    private javax.swing.JMenuItem mntNuevaUnidad;
    private javax.swing.JMenuItem mntNuevoSilabo;
    private javax.swing.JToolBar tlbSilabo;
    // End of variables declaration//GEN-END:variables
}