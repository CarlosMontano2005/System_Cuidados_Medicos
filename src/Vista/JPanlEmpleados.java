/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author pc
 */
public class JPanlEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form JPanlPrue
     */
    public JPanlEmpleados() {
        initComponents();
         try {
             UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "ProgressBar.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtBuscar = new jtextfieldround.JTextFieldRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DtChNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDireccion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BtnAgregar = new Validaciones.BotonRedondo();
        BtnActualizar = new Validaciones.BotonRedondo();
        BtnLimpiarCampos1 = new Validaciones.BotonRedondo();
        BtnTelefono = new Validaciones.BotonRedondo();
        BtnEspecialidades = new Validaciones.BotonRedondo();
        BtnAsisteneciaTrabajo = new Validaciones.BotonRedondo();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        BtnEmpleados = new Validaciones.BotonRedondo();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(895, 627));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBuscar.setText("Ingrese el nombre del empleado a buscar");
        TxtBuscar.setBackground(new java.awt.Color(236, 245, 250));
        TxtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 570, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de documento");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres completos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos completos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Documento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de nacimiento");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NIT");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        DtChNacimiento.setBackground(new java.awt.Color(236, 245, 250));
        DtChNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        DtChNacimiento.setToolTipText("");
        DtChNacimiento.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        add(DtChNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Genero");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dirección");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        TxtAreaDireccion.setBackground(new java.awt.Color(236, 245, 250));
        TxtAreaDireccion.setColumns(20);
        TxtAreaDireccion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(TxtAreaDireccion);
        TxtAreaDireccion.getAccessibleContext().setAccessibleDescription("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 250, 90));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Estado Civil");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Telefono principal");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

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
        add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 130, 50));

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
        add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 130, 50));

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
        add(BtnLimpiarCampos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 160, 50));

        BtnTelefono.setBackground(new java.awt.Color(144, 224, 239));
        BtnTelefono.setForeground(new java.awt.Color(83, 83, 83));
        BtnTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnTelefono.setText("Telefonos");
        BtnTelefono.setToolTipText("");
        BtnTelefono.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnTelefono.setColor(new java.awt.Color(144, 224, 239));
        BtnTelefono.setColorClick(new java.awt.Color(0, 204, 204));
        BtnTelefono.setColorOver(new java.awt.Color(0, 204, 204));
        BtnTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTelefono.setHideActionText(true);
        BtnTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnTelefono.setRadius(50);
        BtnTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTelefonoMouseClicked(evt);
            }
        });
        add(BtnTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 210, 50));

        BtnEspecialidades.setBackground(new java.awt.Color(144, 224, 239));
        BtnEspecialidades.setForeground(new java.awt.Color(83, 83, 83));
        BtnEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnEspecialidades.setText("Especialidades");
        BtnEspecialidades.setToolTipText("");
        BtnEspecialidades.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnEspecialidades.setColor(new java.awt.Color(144, 224, 239));
        BtnEspecialidades.setColorClick(new java.awt.Color(0, 204, 204));
        BtnEspecialidades.setColorOver(new java.awt.Color(0, 204, 204));
        BtnEspecialidades.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnEspecialidades.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnEspecialidades.setRadius(50);
        BtnEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEspecialidadesMouseClicked(evt);
            }
        });
        add(BtnEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 210, 50));

        BtnAsisteneciaTrabajo.setBackground(new java.awt.Color(144, 224, 239));
        BtnAsisteneciaTrabajo.setForeground(new java.awt.Color(83, 83, 83));
        BtnAsisteneciaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnAsisteneciaTrabajo.setText("Asistencias de trabajo");
        BtnAsisteneciaTrabajo.setToolTipText("");
        BtnAsisteneciaTrabajo.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnAsisteneciaTrabajo.setColor(new java.awt.Color(144, 224, 239));
        BtnAsisteneciaTrabajo.setColorClick(new java.awt.Color(0, 204, 204));
        BtnAsisteneciaTrabajo.setColorOver(new java.awt.Color(0, 204, 204));
        BtnAsisteneciaTrabajo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnAsisteneciaTrabajo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnAsisteneciaTrabajo.setRadius(50);
        BtnAsisteneciaTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAsisteneciaTrabajoMouseClicked(evt);
            }
        });
        add(BtnAsisteneciaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 210, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_20px.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Empresa");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 250, 30));

        jComboBox2.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 250, 30));

        jComboBox3.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 250, 30));

        jComboBox4.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 250, 30));

        jTextField2.setBackground(new java.awt.Color(236, 245, 250));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 250, 30));

        jTextField3.setBackground(new java.awt.Color(236, 245, 250));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 30));

        jTextField4.setBackground(new java.awt.Color(236, 245, 250));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 250, 30));

        jTextField5.setBackground(new java.awt.Color(236, 245, 250));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 30));

        jTextField6.setBackground(new java.awt.Color(236, 245, 250));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 250, 30));

        BtnEmpleados.setBackground(new java.awt.Color(144, 224, 239));
        BtnEmpleados.setForeground(new java.awt.Color(83, 83, 83));
        BtnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnEmpleados.setText("Empleados");
        BtnEmpleados.setToolTipText("");
        BtnEmpleados.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnEmpleados.setColor(new java.awt.Color(144, 224, 239));
        BtnEmpleados.setColorClick(new java.awt.Color(0, 204, 204));
        BtnEmpleados.setColorOver(new java.awt.Color(0, 204, 204));
        BtnEmpleados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnEmpleados.setHideActionText(true);
        BtnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnEmpleados.setRadius(50);
        BtnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmpleadosMouseClicked(evt);
            }
        });
        add(BtnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnLimpiarCampos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarCampos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarCampos1MouseClicked

    private void BtnTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTelefonoMouseClicked
            FrmTelefonoEmpleado next = new FrmTelefonoEmpleado();
            next.setVisible(true);
             
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTelefonoMouseClicked

    private void BtnEspecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEspecialidadesMouseClicked
        // TODO add your handling code here:
        FrmEspecialidadesEmpleado next = new FrmEspecialidadesEmpleado();
        next.setVisible(true);
    }//GEN-LAST:event_BtnEspecialidadesMouseClicked

    private void BtnAsisteneciaTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAsisteneciaTrabajoMouseClicked
        FrmAsistenciaTrabajoEmpleado next = new FrmAsistenciaTrabajoEmpleado();
        next.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAsisteneciaTrabajoMouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void BtnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Validaciones.BotonRedondo BtnActualizar;
    private Validaciones.BotonRedondo BtnAgregar;
    private Validaciones.BotonRedondo BtnAsisteneciaTrabajo;
    private Validaciones.BotonRedondo BtnEmpleados;
    private Validaciones.BotonRedondo BtnEspecialidades;
    private Validaciones.BotonRedondo BtnLimpiarCampos1;
    private Validaciones.BotonRedondo BtnTelefono;
    private com.toedter.calendar.JDateChooser DtChNacimiento;
    private javax.swing.JTextArea TxtAreaDireccion;
    private jtextfieldround.JTextFieldRound TxtBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
