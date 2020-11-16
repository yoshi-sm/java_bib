/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author nando
 */
public class CadastroUsuario extends javax.swing.JFrame {
    
    String nome, nomeUsuario, senha;
    char permissao;
    //apagar
    ArrayList<Usuario> listaU = new ArrayList<>();
    ListaUsuario a1 = new ListaUsuario(listaU);
    
    
    public void LimparCadastroUsuario(){
           txtnome.setText("");
           txtlogin.setText("");
           txtsenha.setText("");           
           cbprofessor.setSelected(false);
           cbaluno.setSelected(false);
           cbvisitante.setSelected(false);
           txtnome.requestFocusInWindow();
    }
    
    public void ConfirmaCamposObrigatorios(){
        if(txtnome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo Nome Obrigatório","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }if( txtlogin.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo Login Obrigatório","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }if(txtsenha.getPassword().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo Senha Obrigatório","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
    }
    
    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        cbvisitante = new javax.swing.JCheckBox();
        cbaluno = new javax.swing.JCheckBox();
        cbprofessor = new javax.swing.JCheckBox();
        lbpermissao = new javax.swing.JLabel();
        lbnome = new javax.swing.JLabel();
        lbtitulo = new javax.swing.JLabel();
        lblogin = new javax.swing.JLabel();
        lbsenha = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        txtlogin = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        btconfirmar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbvisitante.setText("Visitante");

        cbaluno.setText("Aluno");

        cbprofessor.setText("Professor");
        cbprofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprofessorActionPerformed(evt);
            }
        });

        lbpermissao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbpermissao.setText("Permissão:");

        lbnome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbnome.setText("Nome:");

        lbtitulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbtitulo.setText("Cadastro de usuário");

        lblogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblogin.setText("Login:");

        lbsenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbsenha.setText("Senha:");

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });

        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        btconfirmar.setText("Confirmar");
        btconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmarActionPerformed(evt);
            }
        });

        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btvoltar.setText("Voltar");
        btvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbtitulo)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbsenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbpermissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbprofessor)
                        .addGap(46, 46, 46)
                        .addComponent(cbaluno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(cbvisitante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbnome)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitulo)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbnome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbsenha)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbvisitante)
                    .addComponent(cbaluno)
                    .addComponent(cbprofessor)
                    .addComponent(lbpermissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmar)
                    .addComponent(btlimpar)
                    .addComponent(btvoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprofessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbprofessorActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
           LimparCadastroUsuario();
    }//GEN-LAST:event_btlimparActionPerformed

    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
       MenuFuncionario menufunc = new MenuFuncionario();
       this.setVisible(false);
       menufunc.setLocationRelativeTo(null);
       menufunc.setVisible(true);
    }//GEN-LAST:event_btvoltarActionPerformed

    private void btconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmarActionPerformed
       nome = this.txtnome.getText();
       nomeUsuario = this.txtlogin.getText();
       senha = String.valueOf(this.txtsenha.getPassword());
       if (this.cbprofessor.isSelected()){
           permissao = 'p';
       }
       else if(this.cbaluno.isSelected()){
           permissao = 'a';
       }
       else if(this.cbvisitante.isSelected()){
           permissao = 'v';
       }
       a1.cadastrar(new Usuario(nome, nomeUsuario, senha, permissao));
       ConfirmaCamposObrigatorios();       
       LimparCadastroUsuario();
       System.out.println(a1);
       
    }//GEN-LAST:event_btconfirmarActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed
    
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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btconfirmar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btvoltar;
    private javax.swing.JCheckBox cbaluno;
    private javax.swing.JCheckBox cbprofessor;
    private javax.swing.JCheckBox cbvisitante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbpermissao;
    private javax.swing.JLabel lbsenha;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
