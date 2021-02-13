package estoque.controller;

import estoque.model.VendasClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;

/**
 *
 * @author lima
 */
public class vendas {

    private Connection connect;
    
    public vendas() {
         this.connect = new ConnectionFactory().getConnection();
    }
    
    // Cadastrar Venda
    public void cadastrarVendas(VendasClass obj) {
        try {
            
            String sql = "insert into estoVendasJava.tb_produtos (cliente_id, data_venda, total_venda, observacoes) "
                    + "values (?,?,?,?)";
            
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObs());
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception erro ) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    // Retorna a ultima venda
    
    
    
}
