package View;

import Calculo.EnergiaIncorporadaMateriais;
import ValorGrafico.DadosEmergia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CalcuEnergiaIncorporada extends javax.swing.JFrame {
    private List<EnergiaIncorporadaMateriais> listaEnergiaMateriais = new ArrayList<EnergiaIncorporadaMateriais>();
    double emergiaTotalAcumuladaMateriais = 0;

    public CalcuEnergiaIncorporada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboxMateriais = new javax.swing.JComboBox<>();
        txtMassa = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        txtResultadoGeral = new javax.swing.JTextField();
        btnMateriais = new javax.swing.JButton();
        btnNextMãodeObra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setText("Calculo Emergia Incorporada dos Materiais");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Massa: Kg");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        cboxMateriais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboxMateriais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concreto Armado", "Aço Estrutural", "Aço Luminado", "Alumínio", "Cobre", "Plástico", "Silício", "Fibra de Vidro", "Resina", "Vidro Temperado", "Isolamento Térmico", "Aguá Tratada", " ", " " }));
        getContentPane().add(cboxMateriais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        txtMassa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMassaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMassa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 100, -1));

        txtResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 300, -1));

        txtResultadoGeral.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultadoGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 300, -1));

        btnMateriais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMateriais.setText("Calcular Emergia ");
        btnMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaisActionPerformed(evt);
            }
        });
        getContentPane().add(btnMateriais, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        btnNextMãodeObra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNextMãodeObra.setText("Próxima Emergia ");
        btnNextMãodeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextMãodeObraActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextMãodeObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 880, 460));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 1020));

        jMenu1.setText("Menu Principal");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setText("Menu Principal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Relatório");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaisActionPerformed

  try {
    // Captura o tipo de material selecionado no ComboBox
    String tipoMaterial = cboxMateriais.getSelectedItem().toString();

    // Lê o valor da massa informada pelo usuário
    double massa = Double.parseDouble(txtMassa.getText());

    double resultado = 0; // Acumulador do resultado da emergia atual

    // Simula a adição de 24 unidades do material com os mesmos parâmetros
    for (int i = 0; i < 24; i++) {
        EnergiaIncorporadaMateriais energiaM = new EnergiaIncorporadaMateriais(massa, tipoMaterial);
        listaEnergiaMateriais.add(energiaM); // Adiciona à lista para possível relatório ou histórico
        resultado += energiaM.calcularEmergiaIncorporada(); // Soma da emergia
    }

    // Soma o resultado atual à emergia total acumulada dos materiais
    emergiaTotalAcumuladaMateriais += resultado;

    // Exibe o valor do cálculo atual na tela
    txtResultado.setText(String.format("Emergia Material: %.2e seJ", resultado));

    // Exibe o valor acumulado de emergia dos materiais
    txtResultadoGeral.setText(String.format("Emergia Total: %.2e seJ", emergiaTotalAcumuladaMateriais));

    // Salva o valor total para ser usado em gráficos ou relatórios
    DadosEmergia.materiais = emergiaTotalAcumuladaMateriais;

    // Confirmação ao usuário
    JOptionPane.showMessageDialog(this, "Material Registrado com sucesso!");

    // Limpa o campo para nova entrada
    txtMassa.setText("");

} catch (NumberFormatException ex) {
    // Trata erro caso a massa informada não seja um número
    JOptionPane.showMessageDialog(this, "Insira um valor numérico válido para a massa.");

} catch (Exception ex) {
    // Trata qualquer outro erro inesperado
    JOptionPane.showMessageDialog(this, "Erro inesperado: " + ex.getMessage());
}

        
        
    }//GEN-LAST:event_btnMateriaisActionPerformed

    private void btnNextMãodeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextMãodeObraActionPerformed
        CalcuMãoObra tela = new CalcuMãoObra();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNextMãodeObraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Relatório tela = new Relatório();
         tela.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MenuPrincipal tela = new MenuPrincipal();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMassaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMassaActionPerformed

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
            java.util.logging.Logger.getLogger(CalcuEnergiaIncorporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaIncorporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaIncorporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaIncorporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcuEnergiaIncorporada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMateriais;
    private javax.swing.JButton btnNextMãodeObra;
    private javax.swing.JComboBox<String> cboxMateriais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtMassa;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultadoGeral;
    // End of variables declaration//GEN-END:variables
}
