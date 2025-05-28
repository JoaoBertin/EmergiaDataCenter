
package View;


public class EmergiaEx extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmergiaEx.class.getName());


    public EmergiaEx() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>\n    <body>\n        <h2>O que é emergia e por que ela é importante para Data Centers?</h2>\n        \n        <p>Emergia é um conceito desenvolvido pelo ecologista Howard Odum que mede o valor energético embutido nos recursos, bens e serviços necessários para produzir algo.</p>\n        \n        <p>Diferente da energia convencional, que contabiliza apenas o consumo direto, a emergia considera toda a cadeia de produção envolvida, incluindo:</p>\n        <ul>\n            <li>Matérias-primas</li>\n            <li>Processos industriais</li>\n            <li>Impactos ambientais</li>\n        </ul>\n        \n        <p>Nos data centers, entender a emergia é fundamental para avaliar a sustentabilidade das operações.</p>\n        \n        <p>O consumo energético dessas infraestruturas é elevado e influencia diretamente os custos financeiros e ambientais.</p>\n        \n        <p>Ao aplicar a emergia, é possível determinar com mais precisão o impacto real dos servidores, sistemas de refrigeração e até da construção física do centro de dados.</p>\n        \n        <p>Ao considerar a emergia na gestão de um data center, as empresas podem tomar decisões mais estratégicas, como:</p>\n        <ul>\n            <li>Reduzir desperdícios</li>\n            <li>Adotar fontes de energia renováveis</li>\n            <li>Melhorar a eficiência operacional</li>\n        </ul>\n        \n        <p>Dessa forma, além de otimizar custos, contribuem para um futuro mais sustentável.</p>\n    </body>\n</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, 380));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\n    <body>\n        <h2>O que é um Data Center?</h2>\n        \n        <p>Um Data Center é uma infraestrutura projetada para armazenar, processar e distribuir grandes volumes de dados.</p>\n        \n        <p>Esses centros são fundamentais para empresas, serviços digitais e plataformas que dependem de conectividade \n        e processamento em larga escala.</p>\n        \n        <p>Os principais elementos de um Data Center incluem:</p>\n        <ul>\n            <li>Servidores – responsáveis por armazenar e processar informações.</li>\n            <li>Sistemas de refrigeração – garantem o controle térmico dos equipamentos.</li>\n            <li>Fontes de energia redundantes – asseguram funcionamento ininterrupto.</li>\n            <li>Redes de comunicação – permitem o fluxo eficiente de dados.</li>\n            <li>Protocolos de segurança – protegem contra acessos não autorizados e ciberameaças.</li>\n        </ul>\n        \n        <p>Os Data Centers são essenciais para suportar serviços online, computação em nuvem e operações críticas \n        de diversas organizações.</p>\n        \n        <p>Com a evolução da tecnologia, esses centros continuam a se tornar mais eficientes e seguros, garantindo \n        o alto desempenho dos sistemas digitais.</p>\n    </body>\n</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jMenu2.setText("Calculo");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setText("Calculo");
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuPrincipal tela = new MenuPrincipal(); // Redirecionamento da tela para o menu principal
        tela.setVisible(true); // Cria e exibe a tela de calculo
        this.setVisible(false); // Oculta a tela atual
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CalcuEnergiaIncorporada tela = new CalcuEnergiaIncorporada(); // Redirecionamento da tela para o calculo
        tela.setVisible(true); // Cria e exibe a tela de calculo
        this.setVisible(false); // Oculta a tela atual
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EmergiaEx().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
