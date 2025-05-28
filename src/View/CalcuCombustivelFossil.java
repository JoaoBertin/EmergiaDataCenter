
package View;

import Calculo.EnergiaCombustivelFossil;
import ValorGrafico.DadosEmergia;
import javax.swing.JOptionPane;


public class CalcuCombustivelFossil extends javax.swing.JFrame {

 
    public CalcuCombustivelFossil() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cboxCombustivel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnRegistroCombus = new javax.swing.JButton();
        btnTelaRelatorio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Cálculo de Emergia Combústivel Fóssil ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        cboxCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gás Natural", "Diesel", "HVO", " ", " ", " ", " ", " " }));
        cboxCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(cboxCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Volume: L");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        txtVolume.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 110, -1));

        txtResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 270, 30));

        btnRegistroCombus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistroCombus.setText("Calcular Emergia");
        btnRegistroCombus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCombusActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroCombus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, -1));

        btnTelaRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTelaRelatorio.setText("Relatório");
        btnTelaRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnTelaRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 900, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -70, -1, 1160));

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

        btnRelatorio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jMenu2.add(btnRelatorio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCombustivelActionPerformed

    private void btnRegistroCombusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCombusActionPerformed

 try {
    // Lê o valor informado pelo usuário no campo txtVolume e converte para double
    double volume = Double.parseDouble(txtVolume.getText());

    // Obtém o tipo de combustível selecionado na ComboBox
    String tipoCombustivel = cboxCombustivel.getSelectedItem().toString();

    // Cria um objeto da classe EnergiaCombustivelFossil com os dados informados
    EnergiaCombustivelFossil combustivel = new EnergiaCombustivelFossil(volume, tipoCombustivel);

    // Calcula a emergia total com base no volume e tipo de combustível
    double emergiaCombustivel = combustivel.calcularEmergiaTotal();

    // Exibe o resultado formatado no campo de texto
    txtResultado.setText(String.format("Emergia Fóssil: %.2e sej", emergiaCombustivel));

    // Armazena esse valor na classe DadosEmergia para uso em gráficos ou relatórios
    DadosEmergia.combustivel = emergiaCombustivel;

    // Mensagem de sucesso ao usuário
    JOptionPane.showMessageDialog(this, "Emergia do combustível registrada com sucesso!");

    // Limpa o campo para nova entrada
    txtVolume.setText("");

} catch (NumberFormatException ex) {
    // Trata erro caso o usuário digite texto ou valor inválido
    JOptionPane.showMessageDialog(this, "Por favor, insira um número válido para o volume.");

} catch (Exception ex) {
    // Captura qualquer outro erro inesperado e exibe a mensagem
    JOptionPane.showMessageDialog(this, "Erro inesperado: " + ex.getMessage());
}
    }//GEN-LAST:event_btnRegistroCombusActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuPrincipal tela = new MenuPrincipal(); // Redirecionamento da tela para o menu principal
        tela.setVisible(true); // Cria e exibe a tela do menu principal
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatório tela = new Relatório(); // Redirecionamento da tela para o relatório
        tela.setVisible(true); // Cria e exibe a tela do relatório
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnTelaRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaRelatorioActionPerformed
        Relatório tela = new Relatório(); // Redirecionamento da tela para o relatório
        tela.setVisible(true); // Cria e exibe a tela do relatório
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_btnTelaRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(CalcuCombustivelFossil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcuCombustivelFossil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcuCombustivelFossil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcuCombustivelFossil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcuCombustivelFossil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroCombus;
    private javax.swing.JMenuItem btnRelatorio;
    private javax.swing.JButton btnTelaRelatorio;
    private javax.swing.JComboBox<String> cboxCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
