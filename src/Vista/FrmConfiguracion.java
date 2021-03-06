/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ContConfiguracion;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author pc
 */
public class FrmConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form FrmConfiguracion
     */
    public FrmConfiguracion() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGuardar = new Validaciones.BotonRedondo();
        TxtIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        User = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGuardar.setText("botonRedondo1");
        BtnGuardar.setBorderColor(new java.awt.Color(255, 255, 255));
        BtnGuardar.setRadius(50);
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 50));

        TxtIp.setBackground(new java.awt.Color(236, 245, 250));
        TxtIp.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtIp.setForeground(new java.awt.Color(0, 0, 0));
        TxtIp.setText("localhost");
        getContentPane().add(TxtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("IP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TxtClave.setBackground(new java.awt.Color(236, 245, 250));
        TxtClave.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtClave.setForeground(new java.awt.Color(0, 0, 0));
        TxtClave.setText("pika-chu2005");
        getContentPane().add(TxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 250, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contrase??a");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        TxtBD.setBackground(new java.awt.Color(236, 245, 250));
        TxtBD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtBD.setForeground(new java.awt.Color(0, 0, 0));
        TxtBD.setText("Servicios_Enfermeria");
        getContentPane().add(TxtBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data Base");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TxtPort.setBackground(new java.awt.Color(236, 245, 250));
        TxtPort.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtPort.setForeground(new java.awt.Color(0, 0, 0));
        TxtPort.setText("1433");
        getContentPane().add(TxtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Port");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        TxtUser.setBackground(new java.awt.Color(236, 245, 250));
        TxtUser.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(0, 0, 0));
        TxtUser.setText("sa");
        getContentPane().add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));

        User.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setText("User");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 void ocultarArchivo(){
        try{
            Path path = Paths.get("C://Users/pc/OneDrive/Documentos/NetBeansProjects/Expo_2022/Cuidados_Medicos/dist/lib", "sysconfig.txt");
            Boolean hidden = (Boolean) Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            if (hidden != null && !hidden) {
                Files.setAttribute(path, "dos:hidden", Boolean.TRUE, LinkOption.NOFOLLOW_LINKS);
                System.out.println("File is now hidden!");
                
            }
        }catch(IOException ex)
        {
            System.err.println("Things went wrong: "+ ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }
    
    void crear(){
        try
        {
            PrintWriter writer = new PrintWriter("C://Users/pc/OneDrive/Documentos/NetBeansProjects/Expo_2022/Cuidados_Medicos/dist/lib/sysconfig.txt","UTF-8");
            writer.println(TxtIp.getText());
            writer.println(TxtPort.getText());
            writer.println(TxtBD.getText());
            writer.println(TxtUser.getText());
            writer.println(TxtClave.getText());
            ocultarArchivo();
            writer.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
if (TxtIp.getText().trim()!= "" && TxtPort.getText().trim() != "" && TxtUser.getText().trim() != ""
                && TxtBD.getText().trim() != ""&& TxtClave.getText().trim() != ""){
                ContConfiguracion.IP = TxtIp.getText();
                ContConfiguracion.Port = TxtPort.getText();
                ContConfiguracion.Database = TxtBD.getText();
                ContConfiguracion.User= TxtUser.getText();
                ContConfiguracion.Password = TxtClave.getText();
                JOptionPane.showMessageDialog(null, "Datos Guardados");
                crear();
        }else{
                JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
FlatLightLaf.setup();
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
                new FrmConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Validaciones.BotonRedondo BtnGuardar;
    private javax.swing.JTextField TxtBD;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtIp;
    private javax.swing.JTextField TxtPort;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
