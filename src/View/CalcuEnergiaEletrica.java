
package View;

import Calculo.EnergiaEletrica;
import ValorGrafico.DadosEmergia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CalcuEnergiaEletrica extends javax.swing.JFrame {
       private List<EnergiaEletrica> listaEnergiaEletrica = new ArrayList<EnergiaEletrica>();
       private double emergiaTotalAcumuladaEletrica = 0;
  
    public CalcuEnergiaEletrica() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDias = new javax.swing.JLabel();
        cboxDisp = new javax.swing.JComboBox<>();
        txtQtdDispositivo = new javax.swing.JTextField();
        txtPtDispositivo = new javax.swing.JTextField();
        txtHrsUso = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        txtResultadoTotal = new javax.swing.JTextField();
        btnAd = new javax.swing.JButton();
        btnNextTermica = new javax.swing.JButton();
        lblPtDispositivo = new javax.swing.JLabel();
        lblHrsUso = new javax.swing.JLabel();
        lblqtdDispositivo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblQuadroBranco = new javax.swing.JLabel();
        lblPlanoFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDias.setText("Quantos dias operados no mês:");
        getContentPane().add(lblDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        cboxDisp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboxDisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servidores", "Switches", "Roteadores", "Firewalls", "Access Points (APs) ", "Fontes de Alimentação (UPS)", "Sistema de Monitoramento", "Ar condicionado", "Sistema de Resfriamento Líquido", "Sistema Incêndio", " ", " ", " ", " ", " " }));
        getContentPane().add(cboxDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        txtQtdDispositivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtQtdDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 150, -1));

        txtPtDispositivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtPtDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 150, -1));

        txtHrsUso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHrsUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrsUsoActionPerformed(evt);
            }
        });
        getContentPane().add(txtHrsUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 150, 30));

        txtDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 150, 30));

        txtResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 330, -1));

        txtResultadoTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtResultadoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 330, 30));

        btnAd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAd.setText("Confirmar Dispositivo");
        btnAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdActionPerformed(evt);
            }
        });
        getContentPane().add(btnAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        btnNextTermica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNextTermica.setText("Próxima Emergia ");
        btnNextTermica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTermicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextTermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, -1, -1));

        lblPtDispositivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPtDispositivo.setText("Potência de cada dispositivo: KWH");
        getContentPane().add(lblPtDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        lblHrsUso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHrsUso.setText("Tempo médio em horas do dispositivo em uso: p\\dia");
        getContentPane().add(lblHrsUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        lblqtdDispositivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblqtdDispositivo.setText("Quantidade do dispositivo:");
        getContentPane().add(lblqtdDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 220, 20));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setText("Cálculo de Emergia Elétrica");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        lblQuadroBranco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblQuadroBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Painel Branco.jpg"))); // NOI18N
        lblQuadroBranco.setText("jLabel3");
        getContentPane().add(lblQuadroBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 890, 410));

        lblPlanoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(lblPlanoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1640, 1170));

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

        jMenu2.setText("Relatório ");
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

    private void txtHrsUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrsUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrsUsoActionPerformed

    private void btnAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdActionPerformed
      try {
       
      // Captura os dados informados pelo usuário na interface gráfica
    String tipoDispositivo = cboxDisp.getSelectedItem().toString(); // Dispositivo selecionado
    int quantidade = Integer.parseInt(txtQtdDispositivo.getText()); // Quantidade de dispositivos
    double potencia = Double.parseDouble(txtPtDispositivo.getText()); // Potência do dispositivo em kWh
    double horas = Double.parseDouble(txtHrsUso.getText()); // Horas de uso por dia
    int dias = Integer.parseInt(txtDias.getText()); // Dias de operação

    double resultadoTotal = 0; // Acumulador para a emergia total desse cálculo

    // Loop que simula a adição de múltiplos dispositivos (até 20 no exemplo)
    for (int i = 0; i < 20; i++) {
        EnergiaEletrica energia = new EnergiaEletrica(tipoDispositivo, potencia, horas, dias);
        listaEnergiaEletrica.add(energia); // Adiciona à lista para fins de histórico ou relatório
        resultadoTotal += energia.calcularEmergiaTotal(); // Soma da emergia de cada dispositivo
    }

    // Acumula com o total geral da energia elétrica
    emergiaTotalAcumuladaEletrica += resultadoTotal;

    // Mostra o resultado da emergia do cálculo atual
    txtResultado.setText(String.format("Emergia Dispositivo: %.2e seJ", resultadoTotal));

    // Mostra o resultado acumulado da emergia elétrica
    txtResultadoTotal.setText(String.format("Emergia Total: %.2e seJ", emergiaTotalAcumuladaEletrica));

    // Armazena o valor total em uma variável pública usada por gráficos/relatórios
    DadosEmergia.eletrica = emergiaTotalAcumuladaEletrica;

    // Confirmação ao usuário
    JOptionPane.showMessageDialog(this, "Dispositivo(s) adicionados com sucesso!");


    } catch (NumberFormatException ex) {
        // Caso o usuário digite algo que não seja número, exibe alerta
        JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos.");
    }//GEN-LAST:event_btnAdActionPerformed
    }
    
    
    private void btnNextTermicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTermicaActionPerformed
        CalcuEnTermica tela = new CalcuEnTermica(); // Redirecionamento da tela para o próximo calculo
        tela.setVisible(true); // Cria e exibe a tela do calculo
        this.setVisible(false); // Oculta a tela atual
        tela.setLocationRelativeTo(null); // Centraliza a tela
    }//GEN-LAST:event_btnNextTermicaActionPerformed

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
            java.util.logging.Logger.getLogger(CalcuEnergiaEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcuEnergiaEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcuEnergiaEletrica().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAd;
    private javax.swing.JButton btnNextTermica;
    private javax.swing.JComboBox<String> cboxDisp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHrsUso;
    private javax.swing.JLabel lblPlanoFundo;
    private javax.swing.JLabel lblPtDispositivo;
    private javax.swing.JLabel lblQuadroBranco;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblqtdDispositivo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHrsUso;
    private javax.swing.JTextField txtPtDispositivo;
    private javax.swing.JTextField txtQtdDispositivo;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultadoTotal;
    // End of variables declaration//GEN-END:variables
}
