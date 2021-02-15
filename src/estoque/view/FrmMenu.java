package estoque.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lima
 */
public class FrmMenu extends javax.swing.JFrame {

    public String usuarioLogado;
    
    
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/Fundo.jpeg"));
        Image image = icon.getImage();
        painel_Desktop = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu_posicao = new javax.swing.JMenuItem();
        menu_controleVendas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de PDV");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Usuário Logado: ");

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setForeground(new java.awt.Color(255, 51, 51));
        lblUsuario.setText("Ricardo Milos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addContainerGap(597, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_DesktopLayout = new javax.swing.GroupLayout(painel_Desktop);
        painel_Desktop.setLayout(painel_DesktopLayout);
        painel_DesktopLayout.setHorizontalGroup(
            painel_DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_DesktopLayout.setVerticalGroup(
            painel_DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_DesktopLayout.createSequentialGroup()
                .addGap(0, 376, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painel_Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cliente.png"))); // NOI18N
        jMenu1.setText("Clientes");

        jMenuItem1.setText("Controle de Cliente");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Funcionario.png"))); // NOI18N
        jMenu2.setText("Funcionários");

        jMenuItem2.setText("Controle de Funcionarios");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fornecedores.png"))); // NOI18N
        jMenu3.setText("Fornecedores");

        jMenuItem3.setText("Controle de Fornecedores");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produtos.png"))); // NOI18N
        jMenu6.setText("Produtos");

        jMenuItem4.setText("Controle de Estoque");
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Consultata de Produtos");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Vendas.png"))); // NOI18N
        jMenu4.setText("Vendas");

        jMenuItem6.setText("Abrir PDV");
        jMenu4.add(jMenuItem6);

        menu_posicao.setText("Posição do dia");
        jMenu4.add(menu_posicao);

        menu_controleVendas.setText("Controle de Vendas");
        jMenu4.add(menu_controleVendas);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Configuracao.png"))); // NOI18N
        jMenu5.setText("Configurações");

        jMenuItem9.setText("Trocar de Usuário");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sair.png"))); // NOI18N
        jMenu7.setText("Sair");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_Desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
       // Deixar maximizado a tela inicial 
       this.setExtendedState(this.MAXIMIZED_BOTH);
       lblUsuario.setText(usuarioLogado);
       this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        // Efetuar logout
        FrmLogin telaLogin = new FrmLogin();
        this.dispose();
        telaLogin.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        
        // Saindo do sistema
        int op; 
        op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?");
        
        if (op == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenu7MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JMenuItem menu_controleVendas;
    public javax.swing.JMenuItem menu_posicao;
    private javax.swing.JDesktopPane painel_Desktop;
    // End of variables declaration//GEN-END:variables
}
