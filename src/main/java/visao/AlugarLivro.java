/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author nando
 */
public class AlugarLivro extends javax.swing.JFrame {
    
    Livro livro;
    ArrayList<Livro> listaL = new ArrayList<>();
    ArrayList<Usuario> listaU = new ArrayList<>();
    ListaLivro obj_livro = new ListaLivro(listaL);
    ListaUsuario obj_usr = new ListaUsuario(listaU);
    /**
     * Creates new form AlugarLivro
     */
    public AlugarLivro() {
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

        jButton2 = new javax.swing.JButton();
        lbalugarlivro = new javax.swing.JLabel();
        lbtitulo = new javax.swing.JLabel();
        lbautor = new javax.swing.JLabel();
        lbano = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        txtautor = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btconfirmar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btvoltar = new javax.swing.JButton();
        txtDevolucao = new javax.swing.JTextField();
        lbano1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbtitulo1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbalugarlivro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbalugarlivro.setText("Alugar Livro");

        lbtitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbtitulo.setText("Título:");

        lbautor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbautor.setText("Autor:");

        lbano.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbano.setText("Usuário:");

        txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloActionPerformed(evt);
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

        lbano1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbano1.setText("Data Devolução:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lbtitulo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbtitulo1.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lbalugarlivro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbano1)
                            .addComponent(lbautor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbano, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtautor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbtitulo1)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbtitulo)
                                .addGap(18, 18, 18)
                                .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbalugarlivro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbautor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbano1)
                    .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmar)
                    .addComponent(btlimpar)
                    .addComponent(btvoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
        MenuFuncionario menufunc = new MenuFuncionario();
        this.setVisible(false);
        menufunc.setLocationRelativeTo(null);
        menufunc.setVisible(true);
    }//GEN-LAST:event_btvoltarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        LimparAlugarLivro();
    }//GEN-LAST:event_btlimparActionPerformed

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmarActionPerformed
        String titulo, autor, usrname, devolucao;
        int id;
        boolean temp;
        obj_usr.carregarUsuarios();
        obj_livro.carregarLivros();
        
        titulo = txttitulo.getText();
        autor = txtautor.getText();
        id = Integer.parseInt(txtId.getText());
        usrname = txtUsuario.getText();
        devolucao = txtDevolucao.getText();
        
        livro = new Livro(titulo, autor);
        livro.setId(id);
        System.out.print(livro);
        // verificando se usuario existe e se livro esta disponivel e alugando
        if(obj_usr.existe(usrname)){
            if(obj_livro.alugar(livro, devolucao, usrname)){
                JOptionPane.showMessageDialog(rootPane,"Aluguel realizado!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Livro não disponível!");
            }
        }   
        else{
            JOptionPane.showMessageDialog(rootPane,"Usuario inexistente!");
        }
        
        obj_usr.getLista().clear();
        obj_livro.salvarLivros();
        LimparAlugarLivro();
    }//GEN-LAST:event_btconfirmarActionPerformed
    private void LimparAlugarLivro(){
        txttitulo.setText("");
        txtautor.setText("");
        txtId.setText("");
        txtUsuario.setText("");
        txtDevolucao.setText("");
        txttitulo.requestFocusInWindow();
    }
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
            java.util.logging.Logger.getLogger(AlugarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlugarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlugarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlugarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlugarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btconfirmar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btvoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbalugarlivro;
    private javax.swing.JLabel lbano;
    private javax.swing.JLabel lbano1;
    private javax.swing.JLabel lbautor;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JLabel lbtitulo1;
    private javax.swing.JTextField txtDevolucao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
