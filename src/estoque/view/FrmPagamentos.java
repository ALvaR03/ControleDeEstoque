package estoque.view;

import estoque.controller.itemVenda;
import estoque.controller.produto;
import estoque.controller.vendas;
import estoque.model.ClientesClass;
import estoque.model.ItemVendasClass;
import estoque.model.ProdutosClass;
import estoque.model.VendasClass;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lima
 */
public class FrmPagamentos extends javax.swing.JFrame {

    ClientesClass clienteObj = new ClientesClass(); // Obj para todo o codigo
    DefaultTableModel carrinho;
    
    public FrmPagamentos() {
        initComponents();
        
        txtCartao.setText("0");
        txtDinheiro.setText("0");
        txtCheque.setText("0");
        txtTroco.setText("0");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCartao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCheque = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtDinheiro.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setText("DINHEIRO:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel7.setText("CARTÃO:");

        txtCartao.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel8.setText("CHEQUE:");

        txtCheque.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        txtTroco.setEditable(false);
        txtTroco.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel9.setText("TROCO:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel10.setText("TOTAL:");

        btnFinalizar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnFinalizar.setText("Finalizar Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel11.setText("Obs.:");

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        double pCartao, pCheque, pDinheiro, totalPago, totalVenda, troco;
        
        pCartao = Double.parseDouble(txtCartao.getText());
        pCheque = Double.parseDouble(txtCheque.getText());
        pDinheiro = Double.parseDouble(txtDinheiro.getText());
        
        totalVenda = Double.parseDouble(txtTotal.getText());
        
        // Calcular o total e o troco
        totalPago = pCartao + pCheque + pDinheiro;
        troco = totalPago - totalVenda;
        txtTroco.setText(String.valueOf(troco));
        
        
        VendasClass objv = new VendasClass();
        
        //Dados do cliente(cliente_id) 
        objv.setCliente(clienteObj);
        
        // Para pegar a dada da venda atual
        Date agora = new Date();
        SimpleDateFormat dataEmEUA = new SimpleDateFormat("yyyy-MM-dd");
        String dataMysql = dataEmEUA.format(agora);
        
        objv.setData_venda(dataMysql);
        
        // Total da Venda e observacao
        objv.setTotal_venda(totalVenda);
        objv.setObs(txtObs.getText());
        
        vendas vendas_v = new vendas();
        vendas_v.cadastrarVendas(objv);
 
  
        // Retorna o id da ultima venda realizada
        objv.setId(vendas_v.retornaUltimaVenda());
        //System.out.println("Id da ultima venda: " + objv.getId());
        
        // Cadastrando os produtos na tabela item vendas
        for (int i = 0; i < carrinho.getRowCount(); i++) {
            
            int qtd_estoque, qtd_comprada, qtd_atualizada; // Variaveis para dar baixa no estoque
            
            ProdutosClass objp = new ProdutosClass();
            produto controlProd = new produto(); // Instanciar os objetos
            
            ItemVendasClass item = new ItemVendasClass();
            item.setVenda(objv);
            
            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
            
            // Baixa no estoque
            qtd_estoque = controlProd.retornaEstoqueAtual(objp.getId());  
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque - qtd_comprada;
            
            controlProd.baixaEstoque(objp.getId(), qtd_atualizada);
            
            //Arquivo do controler "itemVenda"
            itemVenda controlItem = new itemVenda();
            controlItem.cadastraItem(item);
            
        }
        
        /****/
        JOptionPane.showMessageDialog(null, "Venda Registrada com Sucesso!");

    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextArea txtObs;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
