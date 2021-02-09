package estoque.controller;

import estoque.model.ClientesClass;
import estoque.model.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;

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
    public void alterarCliente(ClientesClass obj) {
        
        try {
            
            // Criando o comando para alterar no sql 
            String sql = "update tb_clientes set nome=?, rg=?, cpf=?, email=?, telefone=?, celular=?,"
                    + "cep=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id=?";
            
            
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
            
            stmt.setInt(14, obj.getId());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    
    //Metodo ExcluirCliente
    public void excluirCliente(ClientesClass obj) {
        
          try {
            
            // Criando o comando para excluir dados no sql 
            String sql = "delete from tb_clientes where id=?";
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    public List<ClientesClass>listarClientes() {
        
        try {
            
            // Criar a lista
            List<ClientesClass> lista = new ArrayList<>();
            
            
            // Criar o sql, organizar e executar 
            String sql = "select * from tb_clientes";
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                ClientesClass obj = new ClientesClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                obj.setTelefone(resultadoSelect.getString("telefone"));
                obj.setCelular(resultadoSelect.getString("celular"));
                obj.setCep(resultadoSelect.getString("cep"));
                obj.setEndereco(resultadoSelect.getString("endereco"));
                obj.setNumero(resultadoSelect.getInt("numero"));
                obj.setComplemento(resultadoSelect.getString("complemento"));
                obj.setBairro(resultadoSelect.getString("bairro"));
                obj.setCidade(resultadoSelect.getString("cidade"));
                obj.setUf(resultadoSelect.getString("estado"));
                
                
                lista.add(obj);
                
            }
            
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
            
        }
    }
    
    
    // Metodo consultar cliente por Nome
    public ClientesClass consultaPorNome(String nome) {
        try {
            
            // Cria o comando, organizar por nome
            String sql = "select * from tb_clientes where nome = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet resultadoSelect = stmt.executeQuery();
            
            ClientesClass obj = new ClientesClass();
            if(resultadoSelect.next()) {
                
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                obj.setTelefone(resultadoSelect.getString("telefone"));
                obj.setCelular(resultadoSelect.getString("celular"));
                obj.setCep(resultadoSelect.getString("cep"));
                obj.setEndereco(resultadoSelect.getString("endereco"));
                obj.setNumero(resultadoSelect.getInt("numero"));
                obj.setComplemento(resultadoSelect.getString("complemento"));
                obj.setBairro(resultadoSelect.getString("bairro"));
                obj.setCidade(resultadoSelect.getString("cidade"));
                obj.setUf(resultadoSelect.getString("estado"));    
            }
            
            return obj;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado!!");
            return null;
        }
    }
    
    // Medoto Buscar Cliente por nome - Retorna uma lista
    public List<ClientesClass>buscaClientePorNome(String nome) {
        
        try {
            
            // Criar a lista
            List<ClientesClass> lista = new ArrayList<>();
            
            
            // Criar o sql, organizar e executar 
            String sql = "select * from tb_clientes where nome like ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                ClientesClass obj = new ClientesClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                obj.setTelefone(resultadoSelect.getString("telefone"));
                obj.setCelular(resultadoSelect.getString("celular"));
                obj.setCep(resultadoSelect.getString("cep"));
                obj.setEndereco(resultadoSelect.getString("endereco"));
                obj.setNumero(resultadoSelect.getInt("numero"));
                obj.setComplemento(resultadoSelect.getString("complemento"));
                obj.setBairro(resultadoSelect.getString("bairro"));
                obj.setCidade(resultadoSelect.getString("cidade"));
                obj.setUf(resultadoSelect.getString("estado"));
                
                
                lista.add(obj);
                
            }
            
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            
            return null;
            
        }
    }
    
    // Busca Cep 
     public ClientesClass buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        ClientesClass obj = new ClientesClass();

        if (webServiceCep.wasSuccessful()) {
            obj.setEndereco(webServiceCep.getLogradouroFull());
            obj.setCidade(webServiceCep.getCidade());
            obj.setBairro(webServiceCep.getBairro());
            obj.setUf(webServiceCep.getUf());
            return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
    
    
}