/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author davic
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
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

        lblTitulo = new javax.swing.JLabel();
        btnEnEletrica = new javax.swing.JButton();
        btnFóssil = new javax.swing.JButton();
        btnEnTermica = new javax.swing.JButton();
        btnMãoObra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Escolha qual Energia a Cálcular ");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 530, 60));

        btnEnEletrica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnEletrica.setText("Energia Elétrica");
        btnEnEletrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnEletricaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnEletrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 150, 40));

        btnFóssil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFóssil.setText("Combústivel Fóssil");
        btnFóssil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFóssilActionPerformed(evt);
            }
        });
        getContentPane().add(btnFóssil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 150, 40));

        btnEnTermica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnTermica.setText("Energia Térmica");
        btnEnTermica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnTermicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnTermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 150, 40));

        btnMãoObra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMãoObra.setText("Mão de Obra ");
        btnMãoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMãoObraActionPerformed(evt);
            }
        });
        getContentPane().add(btnMãoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Consulta.png"))); // NOI18N
        jLabel1.setText("\n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jMenu1.setText("Menu Principal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFóssilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFóssilActionPerformed
        CalcuCombustivelFossil fossil = new CalcuCombustivelFossil();
        fossil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFóssilActionPerformed

    private void btnEnTermicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnTermicaActionPerformed
        CalcuEnTermica termica = new CalcuEnTermica();
        termica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnTermicaActionPerformed

    private void btnEnEletricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnEletricaActionPerformed
        CalcuEnergiaEletrica eletrica = new CalcuEnergiaEletrica();
        eletrica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnEletricaActionPerformed

    private void btnMãoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMãoObraActionPerformed
        CalcuMãoObra obra = new CalcuMãoObra();
        obra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMãoObraActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnEletrica;
    private javax.swing.JButton btnEnTermica;
    private javax.swing.JButton btnFóssil;
    private javax.swing.JButton btnMãoObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
