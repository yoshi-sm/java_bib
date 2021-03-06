/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import modelo.EspacoEvento;
import modelo.Evento;
import modelo.ListaEspacoEvento;
import modelo.ListaEvento;
import modelo.ListaLivro;
import modelo.ListaUsuario;
import modelo.Livro;
import modelo.Usuario;


public class MenuFuncionario extends javax.swing.JFrame {
    
    Usuario currentUser = new Usuario();
    
    String temp_string;
    ArrayList<Usuario> listaU = new ArrayList<>();
    ListaUsuario listusu = new ListaUsuario(listaU);
    ArrayList<Evento> listaE = new ArrayList<>();    
    ListaEvento a1 = new ListaEvento(listaE);
    ArrayList<EspacoEvento> listaS= new ArrayList<EspacoEvento>();
    ListaEspacoEvento a2 = new ListaEspacoEvento(listaS);
    
    
    
    
    public MenuFuncionario() {
        initComponents();
        
    }
    
    public MenuFuncionario(Usuario dados) {
        initComponents();
        
        lblwelcome.setText("Bem vindo " + dados.getNome());
        lblcargo.setText("Logado como Funcionário");
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

        jPanel1 = new javax.swing.JPanel();
        btcadastrarusuario = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        btcadastrarevento = new javax.swing.JButton();
        btrelatoriolivro = new javax.swing.JButton();
        btcatalografica = new javax.swing.JButton();
        btalugar = new javax.swing.JButton();
        btremoverusuario = new javax.swing.JButton();
        btlogout = new javax.swing.JButton();
        btreservarsala = new javax.swing.JButton();
        btrelatoriousuario = new javax.swing.JButton();
        btAdEspacos = new javax.swing.JButton();
        lblwelcome = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library ");
        setResizable(false);

        btcadastrarusuario.setText("Cadastrar Usuario");
        btcadastrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarusuarioActionPerformed(evt);
            }
        });

        btbuscar.setText("Buscar Livro");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        btcadastrarevento.setText("Cadastrar Eventos");
        btcadastrarevento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrareventoActionPerformed(evt);
            }
        });

        btrelatoriolivro.setText("Gerar Relatórios de Eventos");
        btrelatoriolivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrelatoriolivroActionPerformed(evt);
            }
        });

        btcatalografica.setText("Gerar Ficha Catalografica");
        btcatalografica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcatalograficaActionPerformed(evt);
            }
        });

        btalugar.setText("Alugar Livro");
        btalugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalugarActionPerformed(evt);
            }
        });

        btremoverusuario.setText("Remover Usuário");
        btremoverusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverusuarioActionPerformed(evt);
            }
        });

        btlogout.setText("Logout");
        btlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogoutActionPerformed(evt);
            }
        });

        btreservarsala.setText("Reservar sala de estudo");
        btreservarsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreservarsalaActionPerformed(evt);
            }
        });

        btrelatoriousuario.setText("Gerar Relatório de usuário");
        btrelatoriousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrelatoriousuarioActionPerformed(evt);
            }
        });

        btAdEspacos.setText("Adicionar novos Espaços");
        btAdEspacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdEspacosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btalugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(btrelatoriousuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btrelatoriolivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btreservarsala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btcatalografica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdEspacos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcadastrarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btremoverusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcadastrarevento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btalugar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcadastrarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcatalografica, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btremoverusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btreservarsala, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcadastrarevento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btrelatoriolivro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btrelatoriousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdEspacos, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addComponent(btlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblwelcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblwelcome.setText("Bem vindo ");

        lblcargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcargo.setText("Logado como:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(143, 143, 143))
                    .addComponent(lblcargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblwelcome)
                .addGap(7, 7, 7)
                .addComponent(lblcargo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadastrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarusuarioActionPerformed
       CadastroUsuario cadastrousuario = new CadastroUsuario(currentUser);       
       this.setVisible(false);
       cadastrousuario.setLocationRelativeTo(null);
       cadastrousuario.setVisible(true);
    }//GEN-LAST:event_btcadastrarusuarioActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        BuscarLivro buscarlivro = new BuscarLivro(currentUser);
        this.setVisible(false);
        buscarlivro.setLocationRelativeTo(null);
        buscarlivro.setVisible(true);
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogoutActionPerformed
        this.setVisible(false);
        Login Login = new Login();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }//GEN-LAST:event_btlogoutActionPerformed

    private void btalugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalugarActionPerformed
        AlugarLivro alugarlivro = new AlugarLivro(currentUser);
        this.setVisible(false);
        alugarlivro.setLocationRelativeTo(null);
        alugarlivro.setVisible(true);
    }//GEN-LAST:event_btalugarActionPerformed

    private void btremoverusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverusuarioActionPerformed
        RemoverUsuario removerusuario = new RemoverUsuario(currentUser);
        this.setVisible(false);
        removerusuario.setLocationRelativeTo(null);
        removerusuario.setVisible(true);
    }//GEN-LAST:event_btremoverusuarioActionPerformed
                                                   
    private void btcadastrareventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrareventoActionPerformed
        CadastrarEvento cadastrarevento = new CadastrarEvento(currentUser);
        this.setVisible(false);
        cadastrarevento.setLocationRelativeTo(null);
        cadastrarevento.setVisible(true);

    }//GEN-LAST:event_btcadastrareventoActionPerformed

    private void btreservarsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreservarsalaActionPerformed
        ReservarSala alugarsala = new ReservarSala(currentUser);
        this.setVisible(false);
        alugarsala.setLocationRelativeTo(null);
        alugarsala.setVisible(true);
    }//GEN-LAST:event_btreservarsalaActionPerformed

    private void btcatalograficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcatalograficaActionPerformed
        GerarCatalogo gerarficha = new GerarCatalogo(currentUser);
        this.setVisible(false);
        gerarficha.setLocationRelativeTo(null);
        gerarficha.setVisible(true);
    }//GEN-LAST:event_btcatalograficaActionPerformed

    private void btrelatoriousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrelatoriousuarioActionPerformed
    
        listusu.carregarUsuarios();        
        temp_string = "";        
        for(int i = 0; i < listaU.size(); i++){
                String nome = listaU.get(i).getNome();
                String nomeUsuario = listaU.get(i).getNomeUsuario();
                String senha = listaU.get(i).getSenha();
                char permissao = listaU.get(i).getPermissao();

                temp_string += "------------------------" + "\n" + 
                                "|  Nome: " + nome + "\n" +
                                "|  Nome de Usuário: " + nomeUsuario + "\n" +
                                "|  Senha: " + senha + "\n" +
                                "|  Permissão: " + permissao + "\n" +
                                "------------------------" + "\n";
                             
               try {
               
                FileWriter escritor = new FileWriter("arquivos/Relatorio_de_Usuários.txt");
                escritor.write(temp_string);
                escritor.close();
               } catch (IOException e) {
                    System.out.println("Erro!");
                    e.printStackTrace();
               }catch(Exception e){
                   e.printStackTrace();
            }
        }    
    }//GEN-LAST:event_btrelatoriousuarioActionPerformed

    private void btrelatoriolivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrelatoriolivroActionPerformed
        
        a1.carregarEventos();
        a2.carregarEspacoEventos();
        temp_string = "";
        
        for(int i = 0; i < listaE.size(); i++){
                String nome = listaE.get(i).getNome();
                String nomeEvento = listaS.get(i).getNome();
                String localEvento = listaS.get(i).getLocal();
                String dataEvento = listaE.get(i).getData();
                String assunto = listaE.get(i).getAssunto();                

                temp_string += "------------------------" + "\n" + 
                                "|  Nome: " + nome + "\n" +
                                "|  Nome do Evento: " + nomeEvento + "\n" +
                                "|  Local do Evento: " + localEvento + "\n" +
                                "|  Data do Evento: " + dataEvento + "\n" +
                                "|  Assunto: " + assunto + "\n" +                        
                                "------------------------" + "\n";
                                  
               try {
                FileWriter escritor = new FileWriter("arquivos/Relatório_de_Eventos.txt");
                escritor.write(temp_string);
                escritor.close();
               } catch (IOException e) {
                System.out.println("Erro!");
                e.printStackTrace();
               }
               System.out.println(listaE);
            }
    }//GEN-LAST:event_btrelatoriolivroActionPerformed

    private void btAdEspacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdEspacosActionPerformed
        AdicionarEspacos adicionarEspaco= new AdicionarEspacos(currentUser);
        this.setVisible(false);
        adicionarEspaco.setLocationRelativeTo(null);
        adicionarEspaco.setVisible(true);
    }//GEN-LAST:event_btAdEspacosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdEspacos;
    private javax.swing.JButton btalugar;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btcadastrarevento;
    private javax.swing.JButton btcadastrarusuario;
    private javax.swing.JButton btcatalografica;
    private javax.swing.JButton btlogout;
    private javax.swing.JButton btrelatoriolivro;
    private javax.swing.JButton btrelatoriousuario;
    private javax.swing.JButton btremoverusuario;
    private javax.swing.JButton btreservarsala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblwelcome;
    // End of variables declaration//GEN-END:variables
}
