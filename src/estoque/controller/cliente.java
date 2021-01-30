package estoque.controller;

import estoque.model.ClientesClass;

import projeto.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cliente {

    private Connection connect;
    
    public cliente() {
         this.connect = new ConnectionFactory().getConnection();
    }
    
    //Medodo cadastrarCliente
    public void cadastrarCliente(ClientesClass obj) {
        
        try {
            
            // Criando o comando sql 
            String sql = "insert into tb_clientes(nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    
    //Metodo AlteraClinte
    public void alterarCliente() {
        
    }
    
    
    //Metodo ExcluirCliente
    public void excluirCliente() {
        
    }
    
}
