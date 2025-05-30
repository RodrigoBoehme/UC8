/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacegrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author RodrigoBoehme
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(0, 204, 204));

        LabelNome.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        LabelNome.setForeground(new java.awt.Color(0, 0, 204));
        LabelNome.setText("Nome");

        CampoNome.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CampoNome.setText("Insira seu nome Completo");
        CampoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNomeFocusLost(evt);
            }
        });
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        CampoEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        CampoEmail.setText("Insira seu Email");
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });

        LabelEmail.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(0, 0, 204));
        LabelEmail.setText("Email");

        btnEntrar.setBackground(new java.awt.Color(51, 51, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoEmail)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(LabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(175, 175, 175))
                    .addComponent(CampoNome)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(LabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(175, 175, 175))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(81, 81, 81)))
                .addGap(83, 83, 83))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bem Vindo(a) " + CampoNome.getText() + "!");

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void CampoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusGained
        // TODO add your handling code here
        if (CampoNome.getText().equals("Insira seu nome Completo")) {
            CampoNome.setText("");
        }
    }//GEN-LAST:event_CampoNomeFocusGained

    private void CampoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusLost
        // TODO add your handling code here:
        if(CampoNome.getText().equals("Insira seu nome Completo")||CampoNome.getText().equals(""))
        CampoNome.setText("Insira seu nome Completo");
    }//GEN-LAST:event_CampoNomeFocusLost

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JButton btnEntrar;
    // End of variables declaration//GEN-END:variables
}
