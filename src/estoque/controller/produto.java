package estoque.controller;

import estoque.model.ProdutosClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;
import estoque.model.FornecedoresClass;

/**
 * @author lima
 */
public class produto {

        private Connection connect;
    
    public produto() {
         this.connect = new ConnectionFactory().getConnection();
    }
    
    
    // Medoto Cadastrar Produtos
    public void Cadastrar(ProdutosClass obj) {
        try {
            String sql = "insert into tb_produtos (descricao, preco, qtd_estoque, for_id) "
                    + "values(?,?,?,?)";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedorId().getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "O produto foi cadastrado!!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    // Medoto Alterar Produtos
    public void Alterar(ProdutosClass obj) {
        try {
            String sql = "update estoVendasJava.tb_produtos set descricao=?, preco=?, "
                    + "qtd_estoque=?, for_id=?, where id=?";
            
            // Conectar com banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
 
            stmt.setInt(4, obj.getFornecedorId().getId());
            stmt.setInt(5, obj.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    // Metodo Excluir produtos
    public void Excluir(ProdutosClass obj) {
        try {
            String sql = "delete from estoVendasJava.tb_produtos where id=?";
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produtos excluido com Sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            
        }
    }
    
    
    // Metodo Listar Produtos
    public List<ProdutosClass> listarProdutos() {
        try {
            
            // Criar a lista
            List<ProdutosClass> lista = new ArrayList<>();
            
            // Criar o sql, organizar e executar
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from estoVendasJava.tb_produtos as p " +
                         "inner join estoVendasJava.tb_fornecedores as f on (p.for_id = f.id);";
            
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while (resultadoSelect.next()) {
                ProdutosClass obj = new ProdutosClass();
                FornecedoresClass forne = new FornecedoresClass();
                
                obj.setId(resultadoSelect.getInt("p.id"));
                obj.setDescricao(resultadoSelect.getString("p.descricao"));
                obj.setPreco(resultadoSelect.getDouble("p.preco"));
                obj.setQtd_estoque(resultadoSelect.getInt("p.qtd_estoque"));
                
                forne.setNome(resultadoSelect.getString("f.nome"));
                
                obj.setFornecedorId(forne);
                lista.add(obj);
            }
                
            return lista;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Error: " + erro);
            return null;
        }
    }

    
    // Metodo Listar Produtos por nome 
    public List<ProdutosClass> listarPorNome(String nome) {
        try {
            
            // Criar a lista
            List<ProdutosClass> lista = new ArrayList<>();
            
            // Criar o sql, organizar e executar
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from estoVendasJava.tb_produtos as p " +
                         "inner join estoVendasJava.tb_fornecedores as f on (p.for_id = f.id); where p.descricao like ?";
            
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while (resultadoSelect.next()) {
                ProdutosClass obj = new ProdutosClass();
                FornecedoresClass forne = new FornecedoresClass();
                
                obj.setId(resultadoSelect.getInt("p.id"));
                obj.setDescricao(resultadoSelect.getString("p.descricao"));
                obj.setPreco(resultadoSelect.getDouble("p.preco"));
                obj.setQtd_estoque(resultadoSelect.getInt("p.qtd_estoque"));
                
                forne.setNome(resultadoSelect.getString("f.nome"));
                
                obj.setFornecedorId(forne);
                lista.add(obj);
            }
                
            return lista;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Error: " + erro);
            return null;
        }
        
    }

    
    // Metodo consultarProduto por nome 
    public ProdutosClass consultaPorNome(String nome) {
        try {
            
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from estoVendasJava.tb_produtos as p " +
                         "inner join estoVendasJava.tb_fornecedores as f on (p.for_id = f.id); where p.descricao = ?";
            
            
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet resultadoSelect = stmt.executeQuery();
            ProdutosClass obj = new ProdutosClass();
            FornecedoresClass forne = new FornecedoresClass();
            
            if (resultadoSelect.next()) {
                obj.setId(resultadoSelect.getInt("p.id"));
                obj.setDescricao(resultadoSelect.getString("p.descricao"));
                obj.setPreco(resultadoSelect.getDouble("p.preco"));
                obj.setQtd_estoque(resultadoSelect.getInt("p.qtd_estoque"));
                
                forne.setNome(resultadoSelect.getString("f.nome"));
                
                obj.setFornecedorId(forne);
            }
            
            return obj;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Produtos nao encontrado");
            return null;
        }
    }
    
    
    
}
