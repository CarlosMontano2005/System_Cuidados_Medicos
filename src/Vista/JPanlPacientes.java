/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;

/**
 *
 * @author pc
 */
public class JPanlPacientes extends javax.swing.JPanel {

    /**
     * Creates new form JPanlPre2
     */
    public JPanlPacientes() {
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
        BtnIndicacionesMedicas = new Validaciones.BotonRedondo();
        BtnTalla = new Validaciones.BotonRedondo();
        BtnAntecedentesPato = new Validaciones.BotonRedondo();
        BtnActividadFisica = new Validaciones.BotonRedondo();
        BtnAVD = new Validaciones.BotonRedondo();
        BtnDieta = new Validaciones.BotonRedondo();
        jLabel7 = new javax.swing.JLabel();
        BtnAgregar = new Validaciones.BotonRedondo();
        BtnActualizar = new Validaciones.BotonRedondo();
        BtnLimpiarCampos1 = new Validaciones.BotonRedondo();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBuscar.setText("Ingrese el nombre del paciente a buscar");
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 250, 150));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Estado civil");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Telefono principal");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        BtnIndicacionesMedicas.setBackground(new java.awt.Color(144, 224, 239));
        BtnIndicacionesMedicas.setForeground(new java.awt.Color(83, 83, 83));
        BtnIndicacionesMedicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnIndicacionesMedicas.setText("Indicaciones Medicas");
        BtnIndicacionesMedicas.setToolTipText("");
        BtnIndicacionesMedicas.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnIndicacionesMedicas.setColor(new java.awt.Color(144, 224, 239));
        BtnIndicacionesMedicas.setColorClick(new java.awt.Color(0, 204, 204));
        BtnIndicacionesMedicas.setColorOver(new java.awt.Color(0, 204, 204));
        BtnIndicacionesMedicas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnIndicacionesMedicas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnIndicacionesMedicas.setRadius(50);
        BtnIndicacionesMedicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIndicacionesMedicasMouseClicked(evt);
            }
        });
        add(BtnIndicacionesMedicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 210, 50));

        BtnTalla.setBackground(new java.awt.Color(144, 224, 239));
        BtnTalla.setForeground(new java.awt.Color(83, 83, 83));
        BtnTalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnTalla.setText("Tallas");
        BtnTalla.setToolTipText("");
        BtnTalla.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnTalla.setColor(new java.awt.Color(144, 224, 239));
        BtnTalla.setColorClick(new java.awt.Color(0, 204, 204));
        BtnTalla.setColorOver(new java.awt.Color(0, 204, 204));
        BtnTalla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTalla.setHideActionText(true);
        BtnTalla.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnTalla.setRadius(50);
        BtnTalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTallaMouseClicked(evt);
            }
        });
        add(BtnTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 210, 50));

        BtnAntecedentesPato.setBackground(new java.awt.Color(144, 224, 239));
        BtnAntecedentesPato.setForeground(new java.awt.Color(83, 83, 83));
        BtnAntecedentesPato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnAntecedentesPato.setText("Antecedentes Patologicos");
        BtnAntecedentesPato.setToolTipText("");
        BtnAntecedentesPato.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnAntecedentesPato.setColor(new java.awt.Color(144, 224, 239));
        BtnAntecedentesPato.setColorClick(new java.awt.Color(0, 204, 204));
        BtnAntecedentesPato.setColorOver(new java.awt.Color(0, 204, 204));
        BtnAntecedentesPato.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnAntecedentesPato.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnAntecedentesPato.setRadius(50);
        BtnAntecedentesPato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAntecedentesPatoMouseClicked(evt);
            }
        });
        add(BtnAntecedentesPato, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 210, 50));

        BtnActividadFisica.setBackground(new java.awt.Color(144, 224, 239));
        BtnActividadFisica.setForeground(new java.awt.Color(83, 83, 83));
        BtnActividadFisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnActividadFisica.setText("Actividades Fisicas");
        BtnActividadFisica.setToolTipText("");
        BtnActividadFisica.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnActividadFisica.setColor(new java.awt.Color(144, 224, 239));
        BtnActividadFisica.setColorClick(new java.awt.Color(0, 204, 204));
        BtnActividadFisica.setColorOver(new java.awt.Color(0, 204, 204));
        BtnActividadFisica.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnActividadFisica.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnActividadFisica.setRadius(50);
        BtnActividadFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActividadFisicaMouseClicked(evt);
            }
        });
        add(BtnActividadFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 210, 50));

        BtnAVD.setBackground(new java.awt.Color(144, 224, 239));
        BtnAVD.setForeground(new java.awt.Color(83, 83, 83));
        BtnAVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnAVD.setText("AVD");
        BtnAVD.setToolTipText("");
        BtnAVD.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnAVD.setColor(new java.awt.Color(144, 224, 239));
        BtnAVD.setColorClick(new java.awt.Color(0, 204, 204));
        BtnAVD.setColorOver(new java.awt.Color(0, 204, 204));
        BtnAVD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnAVD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnAVD.setRadius(50);
        BtnAVD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAVDMouseClicked(evt);
            }
        });
        add(BtnAVD, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 210, 50));

        BtnDieta.setBackground(new java.awt.Color(144, 224, 239));
        BtnDieta.setForeground(new java.awt.Color(83, 83, 83));
        BtnDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check Circle_20px.png"))); // NOI18N
        BtnDieta.setText("Dieta");
        BtnDieta.setToolTipText("");
        BtnDieta.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnDieta.setColor(new java.awt.Color(144, 224, 239));
        BtnDieta.setColorClick(new java.awt.Color(0, 204, 204));
        BtnDieta.setColorOver(new java.awt.Color(0, 204, 204));
        BtnDieta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnDieta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnDieta.setRadius(50);
        BtnDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDietaMouseClicked(evt);
            }
        });
        add(BtnDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 210, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_20px.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 30));

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

        jComboBox4.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 250, -1));

        jComboBox5.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 250, -1));

        jComboBox6.setBackground(new java.awt.Color(236, 245, 250));
        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 250, -1));

        jTextField2.setBackground(new java.awt.Color(236, 245, 250));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 30));

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
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 250, 30));

        jTextField5.setBackground(new java.awt.Color(236, 245, 250));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 250, 30));

        jTextField6.setBackground(new java.awt.Color(236, 245, 250));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIndicacionesMedicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIndicacionesMedicasMouseClicked
        FrmIndicacionesMedicas next = new FrmIndicacionesMedicas();
        next.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIndicacionesMedicasMouseClicked

    private void BtnTallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTallaMouseClicked
        FrmTallasPacientes next = new FrmTallasPacientes();
        next.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTallaMouseClicked

    private void BtnAntecedentesPatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAntecedentesPatoMouseClicked
        // TODO add your handling code here:
        FrmAntePatoPacientes next = new FrmAntePatoPacientes();
        next.setVisible(true);
    }//GEN-LAST:event_BtnAntecedentesPatoMouseClicked

    private void BtnActividadFisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActividadFisicaMouseClicked
        // TODO add your handling code here:
        FrmActFisicaPaciente next = new FrmActFisicaPaciente();
        next.setVisible(true);
    }//GEN-LAST:event_BtnActividadFisicaMouseClicked

    private void BtnAVDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAVDMouseClicked
        FrmAVDpacientes next = new FrmAVDpacientes();
        next.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAVDMouseClicked

    private void BtnDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDietaMouseClicked
        // TODO add your handling code here:
        FrmDietapacientes1 next = new FrmDietapacientes1();
        next.setVisible(true);
    }//GEN-LAST:event_BtnDietaMouseClicked

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnLimpiarCampos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarCampos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarCampos1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Validaciones.BotonRedondo BtnAVD;
    private Validaciones.BotonRedondo BtnActividadFisica;
    private Validaciones.BotonRedondo BtnActualizar;
    private Validaciones.BotonRedondo BtnAgregar;
    private Validaciones.BotonRedondo BtnAntecedentesPato;
    private Validaciones.BotonRedondo BtnDieta;
    private Validaciones.BotonRedondo BtnIndicacionesMedicas;
    private Validaciones.BotonRedondo BtnLimpiarCampos1;
    private Validaciones.BotonRedondo BtnTalla;
    private com.toedter.calendar.JDateChooser DtChNacimiento;
    private javax.swing.JTextArea TxtAreaDireccion;
    private jtextfieldround.JTextFieldRound TxtBuscar;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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