package com.mycompany.geradordesenhas;

/**
 *
 * @author Fabrício
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        jTextField1 = new javax.swing.JTextField();
        CopiarBtn = new javax.swing.JButton();
        GerarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        LimparBtn = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        CopiarBtn.setText("Copiar");
        CopiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarBtnActionPerformed(evt);
            }
        });

        GerarBtn.setText("Gerar");
        GerarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha Gerada");

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox1.setText("letrasMaiusculas");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        LimparBtn.setText("Limpar");
        LimparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparBtnActionPerformed(evt);
            }
        });

        jCheckBox2.setText("numeros");

        jCheckBox3.setText("letrasMinusculas");

        jCheckBox4.setText("especiais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GerarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CopiarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GerarBtn)
                    .addComponent(CopiarBtn)
                    .addComponent(LimparBtn))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CopiarBtn, GerarBtn, LimparBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void GerarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarBtnActionPerformed
         String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiais = "!@#$%^&*()-_=+<>?";
        StringBuilder conjuntoCaracteres = new StringBuilder();

        if (jCheckBox1.isSelected()) {
    conjuntoCaracteres.append(letrasMaiusculas);
    }
        if (jCheckBox2.isSelected()) { // Aqui você verifica o jCheckBox2 para números
    conjuntoCaracteres.append(numeros);
    }
        if (jCheckBox3.isSelected()) {
    conjuntoCaracteres.append(letrasMinusculas);
    }
        if (jCheckBox4.isSelected()) {
    conjuntoCaracteres.append(especiais);
    }


        int comprimento = Integer.parseInt(jTextField1.getText());

        if (conjuntoCaracteres.length() > 0 && comprimento > 0) {
            Random random = new Random();
            StringBuilder senha = new StringBuilder();

            for (int i = 0; i < comprimento; i++) {
                int index = random.nextInt(conjuntoCaracteres.length());
                senha.append(conjuntoCaracteres.charAt(index));
            }

            jLabel2.setText(senha.toString());
        } else {
            jLabel2.setText("Selecione caracteres e tamanho.");
        }
    }//GEN-LAST:event_GerarBtnActionPerformed

    private void CopiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarBtnActionPerformed
        // Copia a senha gerada para a área de transferência
        String senha = jLabel2.getText();
        StringSelection stringSelection = new StringSelection(senha);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "Senha copiada para a área de transferência!");
    }//GEN-LAST:event_CopiarBtnActionPerformed

    private void LimparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBtnActionPerformed
         // Limpar os campos
        jTextField1.setText("");
        jLabel2.setText("");
    }//GEN-LAST:event_LimparBtnActionPerformed

     // Método para gerar a senha
    private String gerarSenha(int length, boolean includeUppercase) {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            if (includeUppercase && random.nextBoolean()) {
                senha.append(upper.charAt(random.nextInt(upper.length())));
            } else {
                senha.append(letras.charAt(random.nextInt(letras.length())));
            }
        }
        return senha.toString();
    }
    
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CopiarBtn;
    private javax.swing.JButton GerarBtn;
    private javax.swing.JButton LimparBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
