/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.chamados.view;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Jonas C. Rosa
 */
public class JFDefault extends javax.swing.JFrame {

    /**
     * Creates new form JFSetor
     */
    public JFDefault() {
        initComponents();
        Icon deletar = new ImageIcon( "./imagens/deletar.png" );
        Icon inserir = new ImageIcon( "./imagens/inserir.png" );
        Icon alterar = new ImageIcon( "./imagens/alterar.png" );
        Icon pesquisar = new ImageIcon( "./imagens/pesquisar.png" );
        Icon salvar = new ImageIcon( "./imagens/salvar.png" );
        Icon vapara = new ImageIcon( "./imagens/vapara.png" );
        jbDeletar.setIcon(deletar);
        jbInserir.setIcon(inserir);
        jbAlterar.setIcon(alterar);
        jbPesquisar.setIcon(pesquisar);
        jbVaPara.setIcon(vapara);
        this.setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPHead = new javax.swing.JPanel();
        jbVaPara = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVaPara.setText("Vá para");

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbInserir.setText("Inserir");

        jbAlterar.setText("Alterar");

        jbDeletar.setText("Deletar");

        javax.swing.GroupLayout jPHeadLayout = new javax.swing.GroupLayout(jPHead);
        jPHead.setLayout(jPHeadLayout);
        jPHeadLayout.setHorizontalGroup(
            jPHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeadLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jbVaPara)
                .addGap(14, 14, 14)
                .addComponent(jbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDeletar)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPHeadLayout.setVerticalGroup(
            jPHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeadLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbDeletar)
                    .addComponent(jbAlterar)
                    .addComponent(jbInserir)
                    .addComponent(jbPesquisar)
                    .addComponent(jbVaPara))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 535, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDefault().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPHead;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVaPara;
    // End of variables declaration//GEN-END:variables
}
