
package View;

import Calculo.EnergiaMaoDeObra;
import ValorGrafico.DadosEmergia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CalcuMãoObra extends javax.swing.JFrame {

 private List<EnergiaMaoDeObra> listaMaoDeObra = new ArrayList<EnergiaMaoDeObra>();
    double emergiaTotalAcomuladaMãoObra;
    public CalcuMãoObra() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxMãodeObra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHrsDia = new javax.swing.JTextField();
        txtDiasOp = new javax.swing.JTextField();
        txtTrabalhadores = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        txtResultadoTotal = new javax.swing.JTextField();
        btnEnMaoObra = new javax.swing.JButton();
        btnNextElétrica = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblParede = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxMãodeObra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboxMãodeObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Técnico em Redes", "Técnico de TI", "Eng. Elétrico / Téc. Eletrotécnico", "Analista de Cibersegurança", " " }));
        getContentPane().add(cboxMãodeObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Calculo de Emergia de Mão de Obra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("N° de Trabalhadores:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Quantas Horas de Trabalho por dia:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Quantos dias de Operação:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        txtHrsDia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtHrsDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 100, -1));

        txtDiasOp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDiasOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 100, -1));

        txtTrabalhadores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtTrabalhadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 100, 30));

        txtResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 300, -1));

        txtResultadoTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultadoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 300, 30));

        btnEnMaoObra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEnMaoObra.setText("Confirmar Energia ");
        btnEnMaoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnMaoObraActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnMaoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        btnNextElétrica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNextElétrica.setText("Próxima Emergia ");
        btnNextElétrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextElétricaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextElétrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 890, 460));

        lblParede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(lblParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 1090));

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

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

    private void btnEnMaoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnMaoObraActionPerformed
       try {
    // Pega o tipo de trabalho selecionado no ComboBox (ex: Técnico de TI, etc.)
    String trabalho = cboxMãodeObra.getSelectedItem().toString();

    // Lê a quantidade de horas trabalhadas por dia
    int horasPorDia = Integer.parseInt(txtHrsDia.getText());

    // Lê o número de dias de operação
    int diasOperacao = Integer.parseInt(txtDiasOp.getText());

    // Lê a quantidade de trabalhadores
    int numTrabalhadores = Integer.parseInt(txtTrabalhadores.getText());

    // Inicializa a variável para somar o total de emergia
    double resultadoTotalMaodeObra = 0;

    // Repete 8 vezes o processo de criação e cálculo da emergia para o trabalhador
    for (int i = 0; i < 8; i++) {
        EnergiaMaoDeObra maoObra = new EnergiaMaoDeObra(trabalho, numTrabalhadores, horasPorDia, diasOperacao);
        listaMaoDeObra.add(maoObra); // Adiciona o objeto à lista para histórico ou relatório
        resultadoTotalMaodeObra += maoObra.calcularEmergiaTotal(); // Soma o resultado
    }

    // Acumula a emergia total da mão de obra
    emergiaTotalAcomuladaMãoObra += resultadoTotalMaodeObra;

    // Mostra o resultado da emergia do cálculo atual
    txtResultado.setText(String.format("Emergia do trabalho: %.2e sej", resultadoTotalMaodeObra));

    // Mostra o total acumulado até agora
    txtResultadoTotal.setText(String.format("Emergia Total: %.2e sej", emergiaTotalAcomuladaMãoObra));

    // Atualiza o valor global na classe DadosEmergia para uso em gráficos e relatórios
    DadosEmergia.maoDeObra = emergiaTotalAcomuladaMãoObra;

    // Mensagem de sucesso
    JOptionPane.showMessageDialog(this, "Trabalho adicionado com sucesso!");

} catch (NumberFormatException ex) {
    // Caso algum campo não seja numérico, exibe mensagem de erro
    JOptionPane.showMessageDialog(this, "Insira apenas números válidos nos campos.");
}
    }//GEN-LAST:event_btnEnMaoObraActionPerformed

    private void btnNextElétricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextElétricaActionPerformed
        CalcuEnergiaEletrica tela = new CalcuEnergiaEletrica(); // Redirecionamento da tela para o próximo calculo
        tela.setVisible(true); // Cria e exibe a tela de calculo
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNextElétricaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          MenuPrincipal tela = new MenuPrincipal(); // Redirecionamento da tela para o menu principal
          tela.setVisible(true); // Cria e exibe a tela do menu principal
          this.setVisible(false); // Oculta a tela atual
          tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Relatório tela = new Relatório(); // Redirecionamento da tela para o relatório
        tela.setVisible(true); // Cria e exibe a tela de relatório
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(CalcuMãoObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcuMãoObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcuMãoObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcuMãoObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcuMãoObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnMaoObra;
    private javax.swing.JButton btnNextElétrica;
    private javax.swing.JComboBox<String> cboxMãodeObra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblParede;
    private javax.swing.JTextField txtDiasOp;
    private javax.swing.JTextField txtHrsDia;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultadoTotal;
    private javax.swing.JTextField txtTrabalhadores;
    // End of variables declaration//GEN-END:variables
}
