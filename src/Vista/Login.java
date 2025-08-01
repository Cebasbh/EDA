/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author sebas
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        InputPass.setEchoChar((char) 0); 
        InputUser.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (InputUser.getText().equals("Ingrese su usuario") || InputUser.getText().equals("Algún dato incorrecto")) {
                    InputUser.setText("");
                    InputUser.setForeground(java.awt.Color.BLACK);
                }
            }
        });

        InputUser.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (InputUser.getText().isEmpty()) {
                    InputUser.setForeground(java.awt.Color.GRAY);
                    InputUser.setText("Ingrese su usuario");
                }
            }
        });
        InputPass.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                String texto = String.valueOf(InputPass.getPassword());
                if (texto.equals("Ingrese su contraseña") || texto.equals("Algún dato incorrecto")) {
                InputPass.setText("");
                InputPass.setForeground(java.awt.Color.BLACK);
                InputPass.setEchoChar('*');
            }
            }
        });

        InputPass.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                String texto = String.valueOf(InputPass.getPassword());
                if (texto.isEmpty()) {
                    InputPass.setEchoChar((char) 0);
                    InputPass.setForeground(java.awt.Color.GRAY);
                    InputPass.setText("Ingrese su contraseña");
                }
            }
        });
        addWindowFocusListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                FondoPanel.requestFocusInWindow(); // Cambia FondoPanel por el nombre real del panel
            }
        });
        javax.swing.SwingUtilities.invokeLater(() -> {
            FondoPanel.requestFocusInWindow();
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FondoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InputUser = new javax.swing.JTextField();
        BotonIngreso = new javax.swing.JButton();
        InputPass = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/logoHorizontalOficial.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 235, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 117, 24));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanel.setBackground(new java.awt.Color(0, 0, 0));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><div style='text-align:center; line-height:50%;'>UNIVERSIDAD<br>DE LIMA</div></html>");
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/logoHorizontalOficial.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(226, 226));
        FondoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 10, -1, -1));

        InputUser.setBackground(new java.awt.Color(255, 250, 205));
        InputUser.setForeground(new java.awt.Color(128, 128, 128));
        InputUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputUser.setText("Ingrese su usuario");
        InputUser.setToolTipText("");
        InputUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InputUser.setPreferredSize(new java.awt.Dimension(180, 30));
        InputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUserActionPerformed(evt);
            }
        });
        FondoPanel.add(InputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        BotonIngreso.setBackground(new java.awt.Color(0, 0, 0));
        BotonIngreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonIngreso.setForeground(new java.awt.Color(255, 117, 24));
        BotonIngreso.setText("INGRESAR");
        BotonIngreso.setBorderPainted(false);
        BotonIngreso.setContentAreaFilled(false);
        BotonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngreso.setFocusPainted(false);
        BotonIngreso.setPreferredSize(new java.awt.Dimension(90, 30));
        BotonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoActionPerformed(evt);
            }
        });
        FondoPanel.add(BotonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 390, 90, -1));

        InputPass.setBackground(new java.awt.Color(255, 250, 205));
        InputPass.setForeground(new java.awt.Color(128, 128, 128));
        InputPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputPass.setText("Ingrese su contraseña");
        InputPass.setEchoChar('*');
        InputPass.setPreferredSize(new java.awt.Dimension(180, 30));
        FondoPanel.add(InputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        getContentPane().add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUserActionPerformed

    private void BotonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresoActionPerformed
        // TODO add your handling code here:
        String user = InputUser.getText();
        String pass = String.valueOf(InputPass.getPassword());
        
        if (pass.equals("1234") && user.equals("admin")) {
            Main Main = new Main();
            Main.setVisible(true);
            dispose();
        }
        else {
            InputUser.setForeground(java.awt.Color.RED);
            InputPass.setForeground(java.awt.Color.RED);
            InputUser.setText("Algún dato incorrecto");
            InputPass.setEchoChar((char) 0);
            InputPass.setText("Algún dato incorrecto");
        }
    }//GEN-LAST:event_BotonIngresoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngreso;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPasswordField InputPass;
    private javax.swing.JTextField InputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
