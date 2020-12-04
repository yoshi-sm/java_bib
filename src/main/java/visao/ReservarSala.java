/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author nando
 */
public class ReservarSala extends javax.swing.JFrame {

    Usuario currentUser = new Usuario();

    public ReservarSala() {
        initComponents();
        
    }
    
    public ReservarSala(Usuario dados) {
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
        btvoltar = new javax.swing.JButton();
        lbsala2 = new javax.swing.JLabel();
        lbsala3 = new javax.swing.JLabel();
        lbsala4 = new javax.swing.JLabel();
        cbmanha1 = new javax.swing.JCheckBox();
        cbtarde1 = new javax.swing.JCheckBox();
        cbnoite1 = new javax.swing.JCheckBox();
        lbdata1 = new javax.swing.JLabel();
        txtdata1 = new javax.swing.JTextField();
        cbmanha2 = new javax.swing.JCheckBox();
        cbtarde2 = new javax.swing.JCheckBox();
        cbnoite2 = new javax.swing.JCheckBox();
        lbdata2 = new javax.swing.JLabel();
        txtdata2 = new javax.swing.JTextField();
        lbdata3 = new javax.swing.JLabel();
        txtdata3 = new javax.swing.JTextField();
        cbtarde3 = new javax.swing.JCheckBox();
        cbmanha3 = new javax.swing.JCheckBox();
        cbnoite3 = new javax.swing.JCheckBox();
        lbdata4 = new javax.swing.JLabel();
        txtdata4 = new javax.swing.JTextField();
        cbtarde4 = new javax.swing.JCheckBox();
        cbmanha4 = new javax.swing.JCheckBox();
        cbnoite4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library ");

        btsala1.setText("Reservar");
        btsala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala1ActionPerformed(evt);
            }
        });

        btsala2.setText("Reservar");
        btsala2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala2ActionPerformed(evt);
            }
        });

        btsala3.setText("Reservar");
        btsala3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala3ActionPerformed(evt);
            }
        });

        btsala4.setText("Reservar");
        btsala4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsala4ActionPerformed(evt);
            }
        });

        lbtitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbtitulo.setText("Reserva de salas");

        lbsala1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbsala1.setText("Sala 1");

        btvoltar.setText("Voltar");
        btvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarActionPerformed(evt);
            }
        });

        lbsala2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbsala2.setText("Sala 2");

        lbsala3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbsala3.setText("Sala 3");

        lbsala4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbsala4.setText("Sala 4");

        cbmanha1.setText("Manha");

        cbtarde1.setText("Tarde");

        cbnoite1.setText("Noite");

        lbdata1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbdata1.setText("Data:");

        cbmanha2.setText("Manha");

        cbtarde2.setText("Tarde");

        cbnoite2.setText("Noite");

        lbdata2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbdata2.setText("Data:");

        lbdata3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbdata3.setText("Data:");

        cbtarde3.setText("Tarde");

        cbmanha3.setText("Manha");

        cbnoite3.setText("Noite");

        lbdata4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbdata4.setText("Data:");

        cbtarde4.setText("Tarde");

        cbmanha4.setText("Manha");

        cbnoite4.setText("Noite");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbsala1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbmanha1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(cbtarde1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnoite1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btsala1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbsala4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbmanha4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(cbtarde4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnoite4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbdata1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdata1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbdata4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdata4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbdata2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdata2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbdata3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdata3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btsala4))
                                    .addComponent(btvoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbsala2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbmanha2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(cbtarde2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnoite2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btsala2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbsala3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbmanha3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(cbtarde3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnoite3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btsala3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lbtitulo)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala1)
                    .addComponent(cbmanha1)
                    .addComponent(cbtarde1)
                    .addComponent(cbnoite1)
                    .addComponent(lbdata1)
                    .addComponent(txtdata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala2)
                    .addComponent(cbmanha2)
                    .addComponent(cbtarde2)
                    .addComponent(cbnoite2)
                    .addComponent(lbdata2)
                    .addComponent(txtdata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala3)
                    .addComponent(cbmanha3)
                    .addComponent(cbtarde3)
                    .addComponent(cbnoite3)
                    .addComponent(lbdata3)
                    .addComponent(txtdata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsala4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsala4)
                    .addComponent(cbmanha4)
                    .addComponent(cbtarde4)
                    .addComponent(cbnoite4)
                    .addComponent(lbdata4)
                    .addComponent(txtdata4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsala4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala4ActionPerformed
        JOptionPane.showMessageDialog(null,"Sala 4 Reservada com sucesso!");
    }//GEN-LAST:event_btsala4ActionPerformed

    private void btsala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala1ActionPerformed
        JOptionPane.showMessageDialog(null,"Sala 1 Reservada com sucesso!");
    }//GEN-LAST:event_btsala1ActionPerformed

    private void btsala2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala2ActionPerformed
        JOptionPane.showMessageDialog(null,"Sala 2 Reservada com sucesso!");
    }//GEN-LAST:event_btsala2ActionPerformed

    private void btsala3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsala3ActionPerformed
       JOptionPane.showMessageDialog(null,"Sala 3 Reservada com sucesso!");
    }//GEN-LAST:event_btsala3ActionPerformed

    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
        if (currentUser.getPermissao() == 'f') {
            MenuFuncionario menu = new MenuFuncionario(currentUser);
            this.setVisible(false);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        } else {
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
                new ReservarSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsala1;
    private javax.swing.JButton btsala2;
    private javax.swing.JButton btsala3;
    private javax.swing.JButton btsala4;
    private javax.swing.JButton btvoltar;
    private javax.swing.JCheckBox cbmanha1;
    private javax.swing.JCheckBox cbmanha2;
    private javax.swing.JCheckBox cbmanha3;
    private javax.swing.JCheckBox cbmanha4;
    private javax.swing.JCheckBox cbnoite1;
    private javax.swing.JCheckBox cbnoite2;
    private javax.swing.JCheckBox cbnoite3;
    private javax.swing.JCheckBox cbnoite4;
    private javax.swing.JCheckBox cbtarde1;
    private javax.swing.JCheckBox cbtarde2;
    private javax.swing.JCheckBox cbtarde3;
    private javax.swing.JCheckBox cbtarde4;
    private javax.swing.JLabel lbdata1;
    private javax.swing.JLabel lbdata2;
    private javax.swing.JLabel lbdata3;
    private javax.swing.JLabel lbdata4;
    private javax.swing.JLabel lbsala1;
    private javax.swing.JLabel lbsala2;
    private javax.swing.JLabel lbsala3;
    private javax.swing.JLabel lbsala4;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JTextField txtdata1;
    private javax.swing.JTextField txtdata2;
    private javax.swing.JTextField txtdata3;
    private javax.swing.JTextField txtdata4;
    // End of variables declaration//GEN-END:variables
}
