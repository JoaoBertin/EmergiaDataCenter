
package View;

import Controller.LoginController;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBemVindo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("BEM VINDO NOVAMENTE !!!");
        getContentPane().add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("DIGITE SUA SENHA:\n");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        lblSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("DIGITE SEU EMAIL:\n");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 300, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 300, 40));

        btnLogin2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLogin2.setText("ENTRAR");
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Não tem conta? Crie uma agora");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/DataCenter Login2.jpg"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
 
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        //Validação dos Campos
        if(txtEmail.getText().matches("") || txtSenha.getText().matches("")){
            // Se um dos campos estiver vazio, exibe mensagem de erro
           JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        
        }else{
        
        try {
            // Tentativa de realizar o login do usuário
            LoginController login = new LoginController();
            if(login.verificarLogin(txtEmail.getText(), txtSenha.getText())){
            // Chama o método para registrar o usuário que está tentando acessar
            login.loginUsuario(this);
            // Cria uma nova instância do menu principal, que aparecerá após o login
            MenuPrincipal telaDeMenu = new MenuPrincipal();
            telaDeMenu.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(rootPane, "Logado com sucesso");
            }else{
            JOptionPane.showMessageDialog(rootPane, "Email ou senha inválidos");
            }
        } catch (SQLException ex) {
            // Captura possíveis exceções de banco de dados durante o processo de login
        }
        }
    }//GEN-LAST:event_btnLogin2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro cadastro = new Cadastro(); //Redirecionamte para a tela de cadastro
        cadastro.setVisible(true); // Cria e exibe a tela de cadastro
        this.setVisible(false); // Oculta a tela atual
    }//GEN-LAST:event_jButton1ActionPerformed

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = (JPasswordField) txtSenha;
    }

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
