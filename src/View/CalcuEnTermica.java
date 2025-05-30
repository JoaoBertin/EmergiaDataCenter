
package View;

import Calculo.EnergiaTermica;
import ValorGrafico.DadosEmergia;
import javax.swing.JOptionPane;


public class CalcuEnTermica extends javax.swing.JFrame {

    public CalcuEnTermica() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIluminacao = new javax.swing.JTextField();
        txtNumPessoas = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnEnTermica = new javax.swing.JButton();
        btnNextCombus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setText("Calculo de Emergia Térmica ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Iluminação DataCenter: Kw");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Trabalhadores Atuando no Data Center: N°");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        txtIluminacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtIluminacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, 130, -1));

        txtNumPessoas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtNumPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 130, -1));

        txtResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 280, -1));

        btnEnTermica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEnTermica.setText("Calcular Emergia");
        btnEnTermica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnTermicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnTermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        btnNextCombus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNextCombus.setText("Próxima Emergia ");
        btnNextCombus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextCombusActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextCombus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 960, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, -1));

        jMenu1.setText("Menu Principal");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setText("Relatório");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnTermicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnTermicaActionPerformed
       try {
    // Lê o valor da iluminação (em kW) digitado pelo usuário
    double iluminacao = Double.parseDouble(txtIluminacao.getText());

    // Lê o número de pessoas ocupando o ambiente
    int pessoas = Integer.parseInt(txtNumPessoas.getText());

    // Cria o objeto que realiza os cálculos de energia térmica
    EnergiaTermica calculo = new EnergiaTermica(iluminacao, pessoas);

    // Realiza o cálculo da emergia térmica (em seJ)
    double emergia = calculo.calcularEmergiaRefrigeracao();

    // Exibe o resultado formatado na tela
    txtResultado.setText(String.format("Emergia Total: %.2e seJ", emergia));

    // Armazena o resultado na variável global para ser usada em gráficos/relatórios
    DadosEmergia.entermica = emergia;

    // Mensagem de sucesso
    JOptionPane.showMessageDialog(this, "Emergia térmica registrada com sucesso!");

    // Limpa os campos de entrada para uma nova operação
    txtIluminacao.setText("");
    txtNumPessoas.setText("");

} catch (NumberFormatException ex) {
    // Caso o usuário digite algo que não seja número, exibe alerta
    JOptionPane.showMessageDialog(this, "Insira valores numéricos válidos.");
}
    }//GEN-LAST:event_btnEnTermicaActionPerformed

    private void btnNextCombusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCombusActionPerformed
        CalcuCombustivelFossil tela = new CalcuCombustivelFossil(); // Redirecionamento da tela para o próximo calculo
        tela.setVisible(true); // Cria e exibe a tela do calculo
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_btnNextCombusActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuPrincipal tela = new MenuPrincipal(); // Redirecionamento da tela para o menu principal
        tela.setVisible(true); // Cria e exibe a tela do menu principal
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Relatório tela = new Relatório(); // Redirecionamento da tela para o relatório
        tela.setVisible(true); // Cria e exibe a tela do relatório
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(CalcuEnTermica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcuEnTermica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcuEnTermica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcuEnTermica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcuEnTermica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnTermica;
    private javax.swing.JButton btnNextCombus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtIluminacao;
    private javax.swing.JTextField txtNumPessoas;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
