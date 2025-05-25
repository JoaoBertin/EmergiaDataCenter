
package View;

import ValorGrafico.DadosEmergia;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Relatório extends javax.swing.JFrame {

 
    public Relatório() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmergiaGeral = new javax.swing.JButton();
        btnEmergiaPizza = new javax.swing.JButton();
        btnEmergiaLinha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmMaterial = new javax.swing.JTextField();
        txtEmMaoObra = new javax.swing.JTextField();
        txtEmEletrica = new javax.swing.JTextField();
        txtEmtermica = new javax.swing.JTextField();
        txtEmFossil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmergiaGeral.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEmergiaGeral.setText("Gráfico Geral das Emergias Barra");
        btnEmergiaGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergiaGeralActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmergiaGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 340, 40));

        btnEmergiaPizza.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEmergiaPizza.setText("Gráfico Geral das Emergia Pizza");
        btnEmergiaPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergiaPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmergiaPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 340, 40));

        btnEmergiaLinha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEmergiaLinha.setText("Gráfico Geral das Emergias Linha");
        btnEmergiaLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergiaLinhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmergiaLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 340, 40));

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Valores das Emergias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 700, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Gráficos/Relatório");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 490, 300));

        txtEmMaterial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtEmMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 280, -1));

        txtEmMaoObra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtEmMaoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 280, -1));

        txtEmEletrica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmEletrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmEletricaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmEletrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 280, -1));

        txtEmtermica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(txtEmtermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 280, -1));

        txtEmFossil.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmFossil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmFossilActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmFossil, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 1010));

        jMenu1.setText("Menu Principal");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cálculo");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setText("Cálculo");
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

    private void btnEmergiaGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergiaGeralActionPerformed
   // Imprimir os dados no console para debug
System.out.println("Materiais: " + DadosEmergia.materiais);
System.out.println("Mão de Obra: " + DadosEmergia.maoDeObra);
System.out.println("Elétrica: " + DadosEmergia.eletrica);
System.out.println("Térmica: " + DadosEmergia.entermica);
System.out.println("Combustível Fóssil: " + DadosEmergia.combustivel);

// Criação do gráfico
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
dataset.setValue(DadosEmergia.materiais, "Emergia", "Materiais");
dataset.setValue(DadosEmergia.maoDeObra, "Emergia", "Mão de Obra");
dataset.setValue(DadosEmergia.eletrica, "Emergia", "Energia Elétrica");
dataset.setValue(DadosEmergia.entermica, "Emergia", "Térmica");

// Se combustivel for 0.0, o JFreeChart pode "ignorar" a barra.
// Para forçar exibição, use Math.max()
dataset.setValue(Math.max(DadosEmergia.combustivel, 1e3), "Emergia", "Combustível Fóssil");

JFreeChart grafico = ChartFactory.createBarChart(
    "Emergia Total por Categoria",
    "Categoria",
    "Emergia (seJ)",
    dataset,
    PlotOrientation.VERTICAL,
    false, true, false
);

// Estilo das cores das barras
CategoryPlot plot = grafico.getCategoryPlot();
BarRenderer renderer = (BarRenderer) plot.getRenderer();
renderer.setSeriesPaint(0, new Color(70, 130, 180)); // Materiais - Azul
renderer.setSeriesPaint(1, new Color(34, 139, 34));  // Mão de Obra - Verde escuro
renderer.setSeriesPaint(2, new Color(255, 140, 0));  // Eletrica - Laranja
renderer.setSeriesPaint(3, new Color(128, 0, 128));  // Térmica - Roxo
renderer.setSeriesPaint(4, new Color(40, 0, 100));   // Combustível Fóssil - Azul escuro

// Painel com o gráfico
ChartPanel painelGrafico = new ChartPanel(grafico);
JPanel painelCompleto = new JPanel(new BorderLayout());
painelCompleto.add(painelGrafico, BorderLayout.CENTER);

// Janela
JFrame telaGrafico = new JFrame("Gráfico de Energias");
telaGrafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
telaGrafico.setSize(800, 600);
telaGrafico.setLocationRelativeTo(null);
telaGrafico.setContentPane(painelCompleto);
telaGrafico.setVisible(true);
    }//GEN-LAST:event_btnEmergiaGeralActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuPrincipal con = new MenuPrincipal();
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CalcuEnergiaIncorporada con = new CalcuEnergiaIncorporada();
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnEmergiaPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergiaPizzaActionPerformed
        // Cria o dataset para o gráfico de pizza
DefaultPieDataset dataset = new DefaultPieDataset();
dataset.setValue("Materiais", DadosEmergia.materiais);
dataset.setValue("Mão de Obra", DadosEmergia.maoDeObra);
dataset.setValue("Energia Elétrica", DadosEmergia.eletrica);
dataset.setValue("Térmica", DadosEmergia.entermica);
dataset.setValue("Combustível Fóssil", DadosEmergia.combustivel);

// Cria o gráfico de pizza
JFreeChart graficoPizza = ChartFactory.createPieChart(
    "Distribuição da Emergia Total",
    dataset,
    true, // legenda
    true, // tooltips
    false // URLs
);

// Personalização opcional de cores (via PiePlot)
PiePlot plot = (PiePlot) graficoPizza.getPlot();
plot.setSectionPaint("Materiais", new Color(70, 130, 180));       // Azul
plot.setSectionPaint("Mão de Obra", new Color(34, 139, 34));       // Verde escuro
plot.setSectionPaint("Energia Elétrica", new Color(255, 140, 0));  // Laranja
plot.setSectionPaint("Térmica", new Color(128, 0, 128));           // Roxo
plot.setSectionPaint("Combustível Fóssil", new Color(40, 0, 100)); // Azul escuro

// Criação do painel
ChartPanel painelGrafico = new ChartPanel(graficoPizza);

JPanel painelCompleto = new JPanel(new BorderLayout());
painelCompleto.add(painelGrafico, BorderLayout.CENTER);

// Criação da janela
JFrame telaGrafico = new JFrame("Gráfico de Emergia - Pizza");
telaGrafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
telaGrafico.setSize(800, 600);
telaGrafico.setLocationRelativeTo(null);
telaGrafico.setContentPane(painelCompleto);
telaGrafico.setVisible(true);
    }//GEN-LAST:event_btnEmergiaPizzaActionPerformed

    private void btnEmergiaLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergiaLinhaActionPerformed
        // Dataset do gráfico de linha
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
dataset.setValue(DadosEmergia.materiais, "Emergia", "Materiais");
dataset.setValue(DadosEmergia.maoDeObra, "Emergia", "Mão de Obra");
dataset.setValue(DadosEmergia.eletrica, "Emergia", "Energia Elétrica");
dataset.setValue(DadosEmergia.entermica, "Emergia", "Térmica");
dataset.setValue(DadosEmergia.combustivel, "Emergia", "Combustível Fóssil");

// Cria o gráfico de linha
JFreeChart graficoLinha = ChartFactory.createLineChart(
    "Emergia Total por Categoria",
    "Categoria",
    "Emergia (seJ)",
    dataset,
    PlotOrientation.VERTICAL,
    true, true, false
);

// Personalização opcional
CategoryPlot plot = graficoLinha.getCategoryPlot();
plot.setBackgroundPaint(Color.WHITE);
plot.setRangeGridlinePaint(Color.GRAY);

// Cor da linha
LineAndShapeRenderer renderer = new LineAndShapeRenderer();
renderer.setSeriesPaint(0, new Color(70, 130, 180)); // Azul
renderer.setSeriesStroke(0, new BasicStroke(2.0f));  // Espessura da linha
plot.setRenderer(renderer);

// Cria o painel do gráfico
ChartPanel painelGrafico = new ChartPanel(graficoLinha);
painelGrafico.setPreferredSize(new Dimension(800, 600));

// Cria a janela (JFrame)
JFrame telaGrafico = new JFrame("Gráfico de Linha - Emergia");
telaGrafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
telaGrafico.setContentPane(painelGrafico);
telaGrafico.pack();
telaGrafico.setLocationRelativeTo(null);
telaGrafico.setVisible(true);

    }//GEN-LAST:event_btnEmergiaLinhaActionPerformed

    private void txtEmEletricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmEletricaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmEletricaActionPerformed

    private void txtEmFossilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmFossilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmFossilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        txtEmMaterial.setText(String.format("Emergia Materiais: %.2e seJ", DadosEmergia.materiais));
        txtEmMaoObra.setText(String.format("Emergia Mão de Obra: %.2e seJ", DadosEmergia.maoDeObra));
        txtEmEletrica.setText(String.format("Emergia Elétrica: %.2e seJ", DadosEmergia.eletrica));
        txtEmtermica.setText(String.format("Emergia Térmica: %.2e seJ", DadosEmergia.entermica));
        txtEmFossil.setText(String.format("Emergia Fóssil: %.2e seJ", DadosEmergia.combustivel));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar valores de emergia: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatório().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmergiaGeral;
    private javax.swing.JButton btnEmergiaLinha;
    private javax.swing.JButton btnEmergiaPizza;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtEmEletrica;
    private javax.swing.JTextField txtEmFossil;
    private javax.swing.JTextField txtEmMaoObra;
    private javax.swing.JTextField txtEmMaterial;
    private javax.swing.JTextField txtEmtermica;
    // End of variables declaration//GEN-END:variables
}
