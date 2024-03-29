/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.RegistroFerramentasController;
import java.math.BigDecimal;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NEX
 */
public class RegistroFerramentas extends javax.swing.JFrame {

    private final RegistroFerramentasController controller;

    /**
     * Creates new form RegistroFerramenta
     */
    public RegistroFerramentas() {
        initComponents();
        controller = new RegistroFerramentasController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Fundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        updateFerramenta = new javax.swing.JButton();
        jBotaoCadastroFerramenta = new javax.swing.JButton();
        jDeleteFerramenta = new javax.swing.JButton();
        b_voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtnomeFerramenta = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        labelFone = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        JP_Fundo.setBackground(new java.awt.Color(255, 255, 255));
        JP_Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(8, 119, 197));
        jPanel2.setPreferredSize(new java.awt.Dimension(335, 39));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateFerramenta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        updateFerramenta.setText("Atualizar");
        updateFerramenta.setVisible(false);
        updateFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFerramentaActionPerformed(evt);
            }
        });
        jPanel2.add(updateFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        jBotaoCadastroFerramenta.setVisible(false);
        jBotaoCadastroFerramenta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBotaoCadastroFerramenta.setText("Cadastrar");
        jBotaoCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCadastroFerramentaActionPerformed(evt);
            }
        });
        jPanel2.add(jBotaoCadastroFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        setVisible(false);
        jDeleteFerramenta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jDeleteFerramenta.setText("Delete");
        jDeleteFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteFerramentaActionPerformed(evt);
            }
        });
        jPanel2.add(jDeleteFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

        b_voltar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        b_voltar.setText("Voltar");
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });
        jPanel2.add(b_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, -1));

        JP_Fundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 440, 47));

        jPanel1.setBackground(new java.awt.Color(235, 120, 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(469, 177));

        labelNome.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelNome.setText("Nome");

        txtnomeFerramenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnomeFerramentaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeFerramentaFocusLost(evt);
            }
        });
        txtnomeFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeFerramentaActionPerformed(evt);
            }
        });
        txtnomeFerramenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeFerramentaKeyPressed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        labelFone.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelFone.setText("Preço");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoKeyReleased(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelEmail.setText("Marca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelFone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtnomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFone)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        JP_Fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 440, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 382));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 10));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 10, 380));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 890, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ferramentas");
        JP_Fundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 440, 50));

        txtId.setVisible(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        JP_Fundo.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void jBotaoCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCadastroFerramentaActionPerformed
        controller.registrarFerramenta();
    }//GEN-LAST:event_jBotaoCadastroFerramentaActionPerformed

    private void updateFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFerramentaActionPerformed
        String textoFerramenta = txtnomeFerramenta.getText();
        boolean numero = Util.Util.verficarNumnoTexto(textoFerramenta);

        if (numero) {
            controller.updateFerramenta();
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Campo nome não recebe números");
        }


    }//GEN-LAST:event_updateFerramentaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jDeleteFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteFerramentaActionPerformed
        controller.deleteFerramenta();
        JOptionPane.showMessageDialog(null, "Ferramenta deletada com sucesso!");
        dispose();
    }//GEN-LAST:event_jDeleteFerramentaActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_b_voltarActionPerformed

    private void txtnomeFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeFerramentaActionPerformed

    private void txtnomeFerramentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeFerramentaKeyPressed

    }//GEN-LAST:event_txtnomeFerramentaKeyPressed

    private void txtnomeFerramentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFerramentaFocusLost
        validarCampos();
    }//GEN-LAST:event_txtnomeFerramentaFocusLost

    private void txtnomeFerramentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFerramentaFocusGained

    }//GEN-LAST:event_txtnomeFerramentaFocusGained

    private void txtPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyReleased
        String input = txtPreco.getText();
        if (!input.isEmpty()) {
            try {
                BigDecimal preco = new BigDecimal(input);
                String precoFormatado= Util.Util.converterPreco(preco);
                txtPreco.setText(precoFormatado);
            } catch (NumberFormatException ex) {
                // Caso o valor não possa ser convertido para BigDecimal, não faz nada
            }
        }
    }//GEN-LAST:event_txtPrecoKeyReleased

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
            java.util.logging.Logger.getLogger(RegistroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Fundo;
    private javax.swing.JButton b_voltar;
    private javax.swing.JButton jBotaoCadastroFerramenta;
    private javax.swing.JButton jDeleteFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFone;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtnomeFerramenta;
    private javax.swing.JButton updateFerramenta;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(JTextField txtPreco) {
        this.txtPreco = txtPreco;
    }

    public JTextField getTxtnomeFerramenta() {
        return txtnomeFerramenta;
    }

    public void setTxtnomeFerramenta(JTextField txtnomeFerramenta) {
        this.txtnomeFerramenta = txtnomeFerramenta;
    }

    public JButton getjBotaoCadastroFerramenta() {
        return jBotaoCadastroFerramenta;
    }

    public void setjBotaoCadastroFerramenta(JButton jBotaoCadastroFerramenta) {
        this.jBotaoCadastroFerramenta = jBotaoCadastroFerramenta;
    }

    public JButton getjDeleteFerramenta() {
        return jDeleteFerramenta;
    }

    public void setjDeleteFerramenta(JButton jDeleteFerramenta) {
        this.jDeleteFerramenta = jDeleteFerramenta;
    }

    public JButton getUpdateFerramenta() {
        return updateFerramenta;
    }

    public void setUpdateFerramenta(JButton updateFerramenta) {
        this.updateFerramenta = updateFerramenta;
    }

    public void validarCampos() {
        String textoFerramenta = txtnomeFerramenta.getText();
        boolean numero = Util.Util.verficarNumnoTexto(textoFerramenta);
        updateFerramenta.setEnabled(numero);
        jBotaoCadastroFerramenta.setEnabled(numero);
        if (!numero) {

            JOptionPane.showMessageDialog(null, "Este campo não números");

        }

    }
}
