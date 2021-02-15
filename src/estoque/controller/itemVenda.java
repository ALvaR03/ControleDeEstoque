package estoque.controller;

import java.sql.Connection;
import projeto.jdbc.ConnectionFactory;
import estoque.model.ItemVendasClass;
import estoque.model.ProdutosClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    // Metodos que lista Itens de uma venda por id
    public List<ItemVendasClass> listaItensVenda(int venda_id) {
        
        List<ItemVendasClass> lista = new ArrayList<>();
        
        try {
            
            String query = "select p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i" +
                    " inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id = ?";
            
            PreparedStatement ps = connect.prepareStatement(query);
            ps.setInt(1, venda_id);
            
            ResultSet resultadoSelect = ps.executeQuery();
            
            while (resultadoSelect.next()) {
                ItemVendasClass item = new ItemVendasClass();
                ProdutosClass prod = new ProdutosClass();
                
                prod.setDescricao(resultadoSelect.getString("p.descricao"));
                item.setQtd(resultadoSelect.getInt("i.qtd"));
                prod.setPreco(resultadoSelect.getDouble("p.preco"));
                item.setSubtotal(resultadoSelect.getDouble("i.subtotal"));
                
                item.setProduto(prod);
                
                lista.add(item);
            }
            
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
}
