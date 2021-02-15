package estoque.controller;

import estoque.model.ClientesClass;
import estoque.model.VendasClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            
            String sql = "insert into tb_vendas (cliente_id, data_venda, total_venda, observacoes) "
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
    public int retornaUltimaVenda() {
        try {
            
            int idVenda = 0;
            
            String query = "select max(id) id from tb_vendas";
            PreparedStatement ps = connect.prepareStatement(query);
            
            ResultSet resultadoSelect = ps.executeQuery();
                
            if (resultadoSelect.next()) {
                VendasClass p = new VendasClass();
                p.setId(resultadoSelect.getInt("id"));
                idVenda = p.getId();
            }
         
            return idVenda;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    
    // Metodo que filtra Vendas por Datas - usado no historico de vendas
    public List<VendasClass> listarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_fim) {
        try {
            
            // Criar a lista
            List<VendasClass> lista = new ArrayList<>();
            
            // Criar o sql, organizar e executar
            String sql = "select v.id, date_format(v.data_venda, '%d/%m/%y') as data_formatada, "
                    + "c.nome, v.total_venda, v.observacoes from tb_vendas as v"
                    + " inner join tb_clientes as c on(v.cliente_id = c.id) where v.data_venda between ? and ?";
            
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());
            
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while (resultadoSelect.next()) {
                VendasClass obj = new VendasClass();
                ClientesClass cli = new ClientesClass(); 
                
                obj.setId(resultadoSelect.getInt("v.id"));
                obj.setData_venda(resultadoSelect.getString("data_formatada"));
                cli.setNome(resultadoSelect.getString("c.nome"));
                obj.setTotal_venda(resultadoSelect.getDouble("v.total_venda"));
                obj.setObs(resultadoSelect.getString("v.observacoes"));
                
                obj.setCliente(cli);
                
                lista.add(obj);
            }
                
            return lista;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Error: " + erro);
            return null;
        }
    }
    
    
    // Metodo que calcula total da venda data
    public double retornaTotalVendaPorData(LocalDate data_venda) {
        try {
            
            double totalVenda = 0;
            
            String query = "select sum(total_venda) as total from tb_vendas where data_venda = ?";
            PreparedStatement ps = connect.prepareStatement(query);
            ps.setString((1), data_venda.toString());
            
            ResultSet resultadoSelect = ps.executeQuery();
                
            if (resultadoSelect.next()) {
                totalVenda = resultadoSelect.getDouble("total");
            }
         
            return totalVenda;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
}
