package estoque.controller;

import estoque.model.FornecedoresClass;
import estoque.model.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;

public class fornecedor {
    
private Connection connect;
    
    public fornecedor() {
         this.connect = new ConnectionFactory().getConnection();
    }
    
    
        //Medodo Cadastrar Fornecedores
    public void cadastrarFornecedores(FornecedoresClass obj) {
        
        try {
            
            // Criando o comando sql 
            String sql = "insert into estoVendasJava.tb_fornecedores(nome, cnpj, email, telefone, celular,"
                    + " cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCelular());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getUf());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }

    
    // Metodo excluir 
    public void excluirFornecedor(FornecedoresClass obj) {
        
          try {
            
            // Criando o comando para excluir dados no sql 
            String sql = "delete from estoVendasJava.tb_fornecedores where id=?";
            
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
    
    //Metodo alterar fornecedor
    public void alterarFornecedor(FornecedoresClass obj) {
        
        try {
            
            // Criando o comando para alterar no sql 
            String sql = "update estoVendasJava.tb_fornecedores set nome=?, cnpj, email=?, telefone=?, celular=?,"
                    + "cep=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id=?";
            
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCelular());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getUf());
            
            stmt.setInt(13, obj.getId());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    // Metodo Listar Fornecedores
    public List<FornecedoresClass> listarFornecedores() {
        
        try {
            
            // Criar a lista
            List<FornecedoresClass> lista = new ArrayList<>();
            
            // Criar o sql, organizar e executar 
            String sql = "select * from estoVendasJava.tb_fornecedores";
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                FornecedoresClass obj = new FornecedoresClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setCnpj(resultadoSelect.getString("cnpj"));
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
    
    // Metodo listar fornecedores por nome 
    public List<FornecedoresClass> listarFornecedoresPorNome(String nome) {
        
        try {
            
            // Criar a lista
            List<FornecedoresClass> lista = new ArrayList<>();
            
            // Criar o sql, organizar e executar 
            String sql = "select * from estoVendasJava.tb_fornecedores where nome like ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                FornecedoresClass obj = new FornecedoresClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setCnpj(resultadoSelect.getString("cnpj"));
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
    
    // Medoto consulta fornecedores por nome com base em uma pesquisa
    public FornecedoresClass consultaPorNome(String nome) {
        try {
            
            // Cria o comando, organizar por nome
            String sql = "select * from estoVendasJava.tb_fornecedores where nome = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet resultadoSelect = stmt.executeQuery();
            
            FornecedoresClass obj = new FornecedoresClass();
            if(resultadoSelect.next()) {
                
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setCnpj(resultadoSelect.getString("cnpj"));
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

    public FornecedoresClass buscaCep(String cep) {
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        FornecedoresClass obj = new FornecedoresClass();

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
    
    
    

