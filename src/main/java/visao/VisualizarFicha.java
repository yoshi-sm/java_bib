/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author xiuki
 */
public class VisualizarFicha extends javax.swing.JFrame {
    boolean temp;
    Usuario currentUser = new Usuario();
    Catalografica a1 = new Catalografica();
    ArrayList<Catalografica> lista = new ArrayList<>();
    ListaCatalogo b1 = new ListaCatalogo(lista);
    /**
     * Creates new form VisualizarFicha
     */
    public VisualizarFicha() {
        initComponents();
    }
    
    public VisualizarFicha(Usuario dados) {
        initComponents();
        txt1.setText("");
        lbtitulo.setText("Digite o Titulo");
        //  Passar dados para o Usuario currentUser
        currentUser.setNome(dados.getNome());
        currentUser.setNome_usuario(dados.getNomeUsuario());
        currentUser.setPermissao(dados.getPermissao());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        assuntos = new javax.swing.JLabel();
        edicao = new javax.swing.JLabel();
        editora = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        paginas = new javax.swing.JLabel();
        cdd = new javax.swing.JLabel();
        cdu = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        txt1 = new java.awt.TextField();
        visualizar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        lbtitulo = new javax.swing.JLabel();

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        titulo.setText("Titulo");

        subtitulo.setText("subtitulo");

        autor.setText("autor");

        isbn.setText("isbn");

        assuntos.setText("assuntos");

        edicao.setText("edicao");

        editora.setText("editora");

        local.setText("local");

        paginas.setText("paginas");

        cdd.setText("cdd");

        cdu.setText("cdu");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdu)
                            .addComponent(cdd))
                        .addGroup(jFrame1Layout.createSequentialGroup()
                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(assuntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jFrame1Layout.createSequentialGroup()
                                            .addComponent(titulo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(subtitulo))
                                        .addComponent(autor))
                                    .addGap(3, 3, 3)))
                            .addGap(30, 30, 30)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editora, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edicao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paginas))))
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(subtitulo))
                .addGap(13, 13, 13)
                .addComponent(autor)
                .addGap(13, 13, 13)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editora)
                    .addComponent(edicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(local)
                    .addComponent(paginas))
                .addGap(18, 18, 18)
                .addComponent(isbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(assuntos)
                .addGap(30, 30, 30)
                .addComponent(cdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cdu)
                .addGap(53, 53, 53)
                .addComponent(jButton3)
                .addGap(7, 7, 7))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        visualizar.setText("Visualizar");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        lbtitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbtitulo.setText("Visualizar Ficha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(visualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(voltar)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbtitulo)
                .addGap(44, 44, 44)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizar)
                    .addComponent(voltar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        temp = b1.visualizar(currentUser.getNomeUsuario(), txt1.getText());
        
        if (temp){
        jFrame1.setVisible(true);
        jFrame1.setBounds(200, 200, 500, 500);
        titulo.setText(b1.getLista().get(0).getTitulo());
        subtitulo.setText(": "+b1.getLista().get(0).getSubtitulo());
        autor.setText(b1.getLista().get(0).getAutor());
        isbn.setText("ISBN "+b1.getLista().get(0).getIsbn());
        assuntos.setText(b1.getLista().get(0).getAssuntos());
        edicao.setText(b1.getLista().get(0).getEdicao());
        editora.setText(b1.getLista().get(0).getEditora()+". - ");
        local.setText(b1.getLista().get(0).getLocal());
        paginas.setText(b1.getLista().get(0).getPaginas()+"p.");
        cdd.setText("CDD "+b1.getLista().get(0).getCdd());
        cdu.setText("CDU "+b1.getLista().get(0).getCdu());
        txt1.setText("");
        }
        else{
        jOptionPane1.showMessageDialog(null, "Não existe uma ficha catalográfica com esse título.");
        txt1.setText("");
        }
    }//GEN-LAST:event_visualizarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
         MenuUsuario menu = new MenuUsuario(currentUser);
        this.setVisible(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        jFrame1.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarFicha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assuntos;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel cdd;
    private javax.swing.JLabel cdu;
    private javax.swing.JLabel edicao;
    private javax.swing.JLabel editora;
    private javax.swing.JLabel isbn;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JLabel local;
    private javax.swing.JLabel paginas;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private java.awt.TextField txt1;
    private javax.swing.JButton visualizar;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
