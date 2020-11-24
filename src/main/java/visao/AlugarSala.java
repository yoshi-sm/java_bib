/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.Usuario;

/**
 *
 * @author nando
 */
public class AlugarSala extends javax.swing.JFrame {

    Usuario currentUser = new Usuario();

    public AlugarSala() {
        initComponents();
        
    }
    
    public AlugarSala(Usuario dados) {
        initComponents();
          
        currentUser.setNome(dados.getNome());
        currentUser.setNome_usuario(dados.getNomeUsuario());
        currentUser.setPermissao(dados.getPermissao());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btsala1 = new javax.swing.JButton();
        btsala2 = new javax.swing.JButton();
        btsala3 = new javax.swing.JButton();
        btsala4 = new javax.swing.JButton();
        lbtitulo = new javax.swing.JLabel();
        lbsala1 = new javax.swing.JLabel();
        lbsala2 = new javax.swing.JLabel();
        lbsala3 = new javax.swing.JLabel();
        lbsala4 = new javax.swing.JLabel();
        btvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library ");

        btsala1.setText("Sala 1");
        btsala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala1ActionPerformed(evt);
            }
        });

        btsala2.setText("Sala 2");
        btsala2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala2ActionPerformed(evt);
            }
        });

        btsala3.setText("Sala 3");
        btsala3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala3ActionPerformed(evt);
            }
        });

        btsala4.setText("Sala 4");
        btsala4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala4ActionPerformed(evt);
            }
        });

        lbtitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbtitulo.setText("Reserva de salas");

        lbsala1.setText("Não Reservado");

        lbsala2.setText("Não Reservado");

        lbsala3.setText("Não Reservado");

        lbsala4.setText("Não Reservado");

        btvoltar.setText("Voltar");
        btvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btsala1)
                    .addComponent(btsala2)
                    .addComponent(btsala3)
                    .addComponent(btsala4))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbsala1)
                    .addComponent(lbsala2)
                    .addComponent(lbsala3)
                    .addComponent(lbsala4))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbtitulo)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btvoltar)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala4))
                .addGap(18, 18, 18)
                .addComponent(btvoltar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsala4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala4ActionPerformed
        if (lbsala4.getText().equals("Não Reservado")){
          lbsala4.setText("Reservado");
        }else{
            lbsala4.setText("Não Reservado");
        }
    }//GEN-LAST:event_btsala4ActionPerformed

    private void btsala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala1ActionPerformed
        if (lbsala1.getText().equals("Não Reservado")){
          lbsala1.setText("Reservado");
        }else{
            lbsala1.setText("Não Reservado");
        }
    }//GEN-LAST:event_btsala1ActionPerformed

    private void btsala2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala2ActionPerformed
        if (lbsala2.getText().equals("Não Reservado")){
          lbsala2.setText("Reservado");
        }else{
            lbsala2.setText("Não Reservado");
        }
    }//GEN-LAST:event_btsala2ActionPerformed

    private void btsala3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala3ActionPerformed
        if (lbsala3.getText().equals("Não Reservado")){
          lbsala3.setText("Reservado");
        }else{
            lbsala3.setText("Não Reservado");
        }
    }//GEN-LAST:event_btsala3ActionPerformed

    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
        
        if (currentUser.getPermissao() == 'f') {
            MenuFuncionario menu = new MenuFuncionario(currentUser);
            this.setVisible(false);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        }
        else {
            MenuUsuario menu = new MenuUsuario(currentUser);
            this.setVisible(false);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        }

    }//GEN-LAST:event_btvoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlugarSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsala1;
    private javax.swing.JButton btsala2;
    private javax.swing.JButton btsala3;
    private javax.swing.JButton btsala4;
    private javax.swing.JButton btvoltar;
    private javax.swing.JLabel lbsala1;
    private javax.swing.JLabel lbsala2;
    private javax.swing.JLabel lbsala3;
    private javax.swing.JLabel lbsala4;
    private javax.swing.JLabel lbtitulo;
    // End of variables declaration//GEN-END:variables
}
