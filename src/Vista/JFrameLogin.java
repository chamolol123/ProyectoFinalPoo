/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Seguridad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NUBIA PARRA
 */
public class JFrameLogin extends javax.swing.JFrame {

    private static Scanner sc;
    private static int intentos;
    private static String user, pwd;
    private static boolean verificarFrame, encontrado;
    
    public JFrameLogin() {
        initComponents();
        
        setLocationRelativeTo(null);//Centrar en la pantalla el formulario
        rootPane.setDefaultButton(btnEntrar);
    }
    
    public static void setEncontrado(int intentos) {
        JFrameLogin.setIntentos(intentos);
    }
    
    public static void setIntentos(int intentos) {
        JFrameLogin.intentos = intentos;
    }
    
    public static void setVerificarFrame(boolean verificarFrame)
    {
        JFrameLogin.verificarFrame = verificarFrame;
    }
        public static void setEncontrado(boolean encontrado)
    {
        JFrameLogin.encontrado = encontrado;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUniIcon = new javax.swing.JLabel();
        lblSistemas = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        lblCalificaciones = new javax.swing.JLabel();
        lblInicioSes = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 166, 61));

        lblUniIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/EscudoUniversidad(2).png"))); // NOI18N

        lblSistemas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSistemas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemas.setText("SISTEMAS");

        lblDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDe.setText("DE");

        lblCalificaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalificaciones.setText("CALIFICACIONES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUniIcon)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSistemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDe, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUniIcon)
                .addGap(37, 37, 37)
                .addComponent(lblSistemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCalificaciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInicioSes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInicioSes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioSes.setText("Inicio de sesi??n");

        lblPwd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lock.png"))); // NOI18N
        lblPwd.setText("CONTRASE??A");
        lblPwd.setToolTipText("");

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        lblUser.setText("USUARIO");

        txtUser.setToolTipText("Ingrese su nombre de usuario");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 153, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(255, 153, 51));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInicioSes, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(lblPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPwd))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblInicioSes)
                .addGap(18, 18, 18)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPwd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
 
        try {
            int nlineas=0, i=0;
            String [] usuarios;
            String linea;
            sc = new Scanner(new File("usuarios.txt"));
            File archivo = new File("usuarios.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea = br.readLine())!=null)
                {
                    nlineas++;            
                }
            } catch (IOException ex) {
                Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios = new String[nlineas]; //Tama??o del arreglo
            
            while(sc.hasNextLine())
            {
                usuarios[i++] = sc.nextLine(); //Almacenando cada linea en una posicion del arreglo
            }
            
            intentos++;
            
            user = txtUser.getText();
            pwd = txtPwd.getText();
            
            Seguridad s = new Seguridad();
            
            s.validarUsuario(usuarios, user, pwd, intentos, verificarFrame);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         if(encontrado == true)
         {
         if(verificarFrame == true)
         {
             JFrameProfesor profesor = new JFrameProfesor();
             profesor.setVisible(true);
             this.setVisible(false);
             
         }else{
             JFrameEstudiante estudiante = new JFrameEstudiante();
             estudiante.setVisible(true);
             this.setVisible(false);
         }
         }
         
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCalificaciones;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblInicioSes;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblSistemas;
    private javax.swing.JLabel lblUniIcon;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the verificarFrame
     */
    public static boolean isVerificarFrame() {
        return verificarFrame;
    }

    /**
     * @return the encontrado
     */
    public static boolean isEncontrado() {
        return encontrado;
    }

    /**
     * @return the btnEntrar
     */
    public javax.swing.JButton getBtnEntrar() {
        return btnEntrar;
    }

    /**
     * @param btnEntrar the btnEntrar to set
     */
    public void setBtnEntrar(javax.swing.JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    /**
     * @return the btnSalir
     */
    public javax.swing.JButton getBtnSalir() {
        return btnSalir;
    }

    /**
     * @param btnSalir the btnSalir to set
     */
    public void setBtnSalir(javax.swing.JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the lblCalificaciones
     */
    public javax.swing.JLabel getLblCalificaciones() {
        return lblCalificaciones;
    }

    /**
     * @param lblCalificaciones the lblCalificaciones to set
     */
    public void setLblCalificaciones(javax.swing.JLabel lblCalificaciones) {
        this.lblCalificaciones = lblCalificaciones;
    }

    /**
     * @return the lblDe
     */
    public javax.swing.JLabel getLblDe() {
        return lblDe;
    }

    /**
     * @param lblDe the lblDe to set
     */
    public void setLblDe(javax.swing.JLabel lblDe) {
        this.lblDe = lblDe;
    }

    /**
     * @return the lblInicioSes
     */
    public javax.swing.JLabel getLblInicioSes() {
        return lblInicioSes;
    }

    /**
     * @param lblInicioSes the lblInicioSes to set
     */
    public void setLblInicioSes(javax.swing.JLabel lblInicioSes) {
        this.lblInicioSes = lblInicioSes;
    }

    /**
     * @return the lblPwd
     */
    public javax.swing.JLabel getLblPwd() {
        return lblPwd;
    }

    /**
     * @param lblPwd the lblPwd to set
     */
    public void setLblPwd(javax.swing.JLabel lblPwd) {
        this.lblPwd = lblPwd;
    }

    /**
     * @return the lblSistemas
     */
    public javax.swing.JLabel getLblSistemas() {
        return lblSistemas;
    }

    /**
     * @param lblSistemas the lblSistemas to set
     */
    public void setLblSistemas(javax.swing.JLabel lblSistemas) {
        this.lblSistemas = lblSistemas;
    }

    /**
     * @return the lblUniIcon
     */
    public javax.swing.JLabel getLblUniIcon() {
        return lblUniIcon;
    }

    /**
     * @param lblUniIcon the lblUniIcon to set
     */
    public void setLblUniIcon(javax.swing.JLabel lblUniIcon) {
        this.lblUniIcon = lblUniIcon;
    }

    /**
     * @return the lblUser
     */
    public javax.swing.JLabel getLblUser() {
        return lblUser;
    }

    /**
     * @param lblUser the lblUser to set
     */
    public void setLblUser(javax.swing.JLabel lblUser) {
        this.lblUser = lblUser;
    }

    /**
     * @return the txtPwd
     */
    public javax.swing.JPasswordField getTxtPwd() {
        return txtPwd;
    }

    /**
     * @param txtPwd the txtPwd to set
     */
    public void setTxtPwd(javax.swing.JPasswordField txtPwd) {
        this.txtPwd = txtPwd;
    }

    /**
     * @return the txtUser
     */
    public javax.swing.JTextField getTxtUser() {
        return txtUser;
    }

    /**
     * @param txtUser the txtUser to set
     */
    public void setTxtUser(javax.swing.JTextField txtUser) {
        this.txtUser = txtUser;
    }
}
