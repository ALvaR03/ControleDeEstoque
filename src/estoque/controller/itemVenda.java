package estoque.controller;

import java.sql.Connection;
import projeto.jdbc.ConnectionFactory;
import estoque.model.ItemVendasClass;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author lima
 */
public class itemVenda {
    
    private Connection connect;
    
    
    public itemVenda() {
        this.connect = new ConnectionFactory().getConnection();
    }
    
    // Metodo que cadastra Itens
    public void cadastraItem(ItemVendasClass obj) {
        try {
            
            String sql = "insert into tb_itensvendas (venda_id, produto_id, qtd, subtotal) "
                    + "values(?,?,?,?)";
            // Peparar para conectar o banco e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            
            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setDouble(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
}
