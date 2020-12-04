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
public class GerarCatalogo extends javax.swing.JFrame {
    String[] elementos;
    Usuario currentUser = new Usuario();
    Catalografica a1 = new Catalografica();
    ArrayList<Catalografica> lista = new ArrayList<>();
    ListaCatalogo b1 = new ListaCatalogo(lista);/**
     * Creates new form GerarCatalo
     */
    
    public GerarCatalogo() {
        initComponents();
        b1.carregarPedidos();
        elementos = new String[b1.getLista().size()];
        for (int k = 0 ; k < b1.getLista().size(); k++){
            elementos[k] = "Item "+k+1 ;
        }
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return elementos.length; }
            public String getElementAt(int i) { return elementos[i]; }
        });
    }
    
    public GerarCatalogo(Usuario dados) {
        initComponents();
        
        //  Passar dados para o Usuario currentUser
        currentUser.setNome(dados.getNome());
        currentUser.setNome_usuario(dados.getNomeUsuario());
        currentUser.setPermissao(dados.getPermissao());
        b1.carregarPedidos();
        elementos = new String[b1.getLista().size()];
        for (int k = 0 ; k < b1.getLista().size(); k++){
            elementos[k] = "Item "+k+1 ;
        }
        b1.getLista().clear();
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return elementos.length; }
            public String getElementAt(int i) { return elementos[i]; }
        });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        verificarDados = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        gerarFicha = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        verificarDados.setText("Verificar Dados");
        verificarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarDadosActionPerformed(evt);
            }
        });

        gerarFicha.setText("Gerar Ficha");
        gerarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarFichaActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificarDados)
                .addGap(18, 18, 18)
                .addComponent(gerarFicha)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarDados)
                    .addComponent(gerarFicha)
                    .addComponent(botaoVoltar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarDadosActionPerformed
        // TODO add your handling code here:
        b1.carregarPedidos();
        int indice = jList1.getSelectedIndex();
        System.out.print(b1.getLista().size());
        textArea1.setText(b1.getLista().get(indice).toString());
        b1.getLista().clear();
    }//GEN-LAST:event_verificarDadosActionPerformed

    private void gerarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarFichaActionPerformed
        // TODO add your handling code here:
        b1.carregarPedidos();
        b1.gerarFicha(jList1.getSelectedIndex());
        MenuFuncionario menu = new MenuFuncionario(currentUser);
        this.setVisible(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_gerarFichaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        MenuFuncionario menu = new MenuFuncionario(currentUser);
        this.setVisible(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(GerarCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarCatalogo().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton gerarFicha;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextArea textArea1;
    private javax.swing.JButton verificarDados;
    // End of variables declaration//GEN-END:variables
}
