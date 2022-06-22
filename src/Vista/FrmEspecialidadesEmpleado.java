/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.geom.RoundRectangle2D;
import javax.swing.UIManager;

/**
 *
 * @author pc
 */
public class FrmEspecialidadesEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form FrmTallasPacientes
     */
    public FrmEspecialidadesEmpleado() {
        initComponents();
         //aliniar al centro
        setLocationRelativeTo(null);
        
        //Redondear 
        
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),25,25));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlMenu = new javax.swing.JPanel();
        PnlMenuTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PnlMenuBotones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PnlContenedor = new javax.swing.JPanel();
        TxtBuscar = new jtextfieldround.JTextFieldRound();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        BtnAgregar = new Validaciones.BotonRedondo();
        BtnActualizar = new Validaciones.BotonRedondo();
        BtnLimpiarCampos1 = new Validaciones.BotonRedondo();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 228));

        PnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        PnlMenu.setPreferredSize(new java.awt.Dimension(610, 30));
        PnlMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PnlMenuMouseDragged(evt);
            }
        });
        PnlMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PnlMenuMousePressed(evt);
            }
        });
        PnlMenu.setLayout(new java.awt.BorderLayout());

        PnlMenuTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Especialidades");

        javax.swing.GroupLayout PnlMenuTituloLayout = new javax.swing.GroupLayout(PnlMenuTitulo);
        PnlMenuTitulo.setLayout(PnlMenuTituloLayout);
        PnlMenuTituloLayout.setHorizontalGroup(
            PnlMenuTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuTituloLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        PnlMenuTituloLayout.setVerticalGroup(
            PnlMenuTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PnlMenu.add(PnlMenuTitulo, java.awt.BorderLayout.LINE_START);

        PnlMenuBotones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancel_20px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlMenuBotonesLayout = new javax.swing.GroupLayout(PnlMenuBotones);
        PnlMenuBotones.setLayout(PnlMenuBotonesLayout);
        PnlMenuBotonesLayout.setHorizontalGroup(
            PnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuBotonesLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        PnlMenuBotonesLayout.setVerticalGroup(
            PnlMenuBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PnlMenu.add(PnlMenuBotones, java.awt.BorderLayout.LINE_END);

        getContentPane().add(PnlMenu, java.awt.BorderLayout.PAGE_START);

        PnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        PnlContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBuscar.setText("Ingrese el nombre del paciente a buscar");
        TxtBuscar.setBackground(new java.awt.Color(236, 245, 250));
        TxtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        PnlContenedor.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_20px.png"))); // NOI18N
        PnlContenedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 30));

        jComboBox3.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PnlContenedor.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Empleado");
        PnlContenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        BtnAgregar.setBackground(new java.awt.Color(144, 224, 239));
        BtnAgregar.setForeground(new java.awt.Color(83, 83, 83));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Plus +_20px.png"))); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.setToolTipText("");
        BtnAgregar.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnAgregar.setColor(new java.awt.Color(144, 224, 239));
        BtnAgregar.setColorClick(new java.awt.Color(0, 204, 204));
        BtnAgregar.setColorOver(new java.awt.Color(0, 204, 204));
        BtnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnAgregar.setRadius(40);
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseClicked(evt);
            }
        });
        PnlContenedor.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 130, 50));

        BtnActualizar.setBackground(new java.awt.Color(144, 224, 239));
        BtnActualizar.setForeground(new java.awt.Color(83, 83, 83));
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh_20px.png"))); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setToolTipText("");
        BtnActualizar.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnActualizar.setColor(new java.awt.Color(144, 224, 239));
        BtnActualizar.setColorClick(new java.awt.Color(0, 204, 204));
        BtnActualizar.setColorOver(new java.awt.Color(0, 204, 204));
        BtnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnActualizar.setRadius(40);
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });
        PnlContenedor.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 130, 50));

        BtnLimpiarCampos1.setBackground(new java.awt.Color(144, 224, 239));
        BtnLimpiarCampos1.setForeground(new java.awt.Color(83, 83, 83));
        BtnLimpiarCampos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/broom_20px.png"))); // NOI18N
        BtnLimpiarCampos1.setText("Limpiar Campos");
        BtnLimpiarCampos1.setToolTipText("");
        BtnLimpiarCampos1.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnLimpiarCampos1.setColor(new java.awt.Color(144, 224, 239));
        BtnLimpiarCampos1.setColorClick(new java.awt.Color(0, 204, 204));
        BtnLimpiarCampos1.setColorOver(new java.awt.Color(0, 204, 204));
        BtnLimpiarCampos1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnLimpiarCampos1.setRadius(40);
        BtnLimpiarCampos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarCampos1MouseClicked(evt);
            }
        });
        PnlContenedor.add(BtnLimpiarCampos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 160, 50));

        jComboBox4.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PnlContenedor.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo Especialidad");
        PnlContenedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        getContentPane().add(PnlContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//               FrmEmpleados next = new FrmEmpleados();
//               next.setVisible(true);
               this.dispose();
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnLimpiarCampos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarCampos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarCampos1MouseClicked
 int xMouse, yMouse;
    private void PnlMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlMenuMouseDragged
                                     
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);  
        // TODO add your handling code here:
    }//GEN-LAST:event_PnlMenuMouseDragged

    private void PnlMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlMenuMousePressed
            xMouse = evt.getX();
        yMouse = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_PnlMenuMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmEspecialidadesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmEspecialidadesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmEspecialidadesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmEspecialidadesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
             UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "ProgressBar.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEspecialidadesEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Validaciones.BotonRedondo BtnActualizar;
    private Validaciones.BotonRedondo BtnAgregar;
    private Validaciones.BotonRedondo BtnLimpiarCampos1;
    private javax.swing.JPanel PnlContenedor;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JPanel PnlMenuBotones;
    private javax.swing.JPanel PnlMenuTitulo;
    private jtextfieldround.JTextFieldRound TxtBuscar;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}