package estoque.controller;

import estoque.model.FuncionariosClass;
import estoque.view.FrmLogin;
import estoque.view.FrmMenu;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;

public class funcionario {

    // Conexao
    private Connection connect;
    
    public funcionario() {
         this.connect = new ConnectionFactory().getConnection();
    }
    
    // Metodo Cadastrar Funcionario
    
    public void cadastrarFuncionario(FuncionariosClass obj) {
        
        try {
            
            // Criando o comando sql 
            String sql = "insert into estoVendasJava.tb_funcionarios(nome, rg, cpf, email, senha, cargo, nivel_acesso, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    // Metodo alterar funcionario
    public void alterarFuncionario(FuncionariosClass obj) {
        
        try {
            
            // Criando o comando para alterar no sql 
            String sql = "update estoVendasJava.tb_funcionarios set nome=?, rg=?, cpf=?, email=?, "
                    + "senha=?, cargo=?, nivel_acesso=?, telefone=?, celular=?,"
                    + "cep=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id=?";
            
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());
            
            stmt.setInt(17, obj.getId());
            
            
            // Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error " + erro);
        }
        
    }
    
    // Metodo excluir funcionario
    public void excluirFuncionario(FuncionariosClass obj) {
        
          try {
            
            // Criando o comando para excluir dados no sql 
            String sql = "delete from estoVendasJava.tb_funcionarios where id=?";
            
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
    
    
    // Medoto listar todos os funcionarios
      public List<FuncionariosClass>listarFuuncionarios() {
        
        try {
            
            // Criar a lista
            List<FuncionariosClass> lista = new ArrayList<>();
            
            
            // Criar o sql, organizar e executar 
            String sql = "select * from estoVendasJava.tb_funcionarios";
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                FuncionariosClass obj = new FuncionariosClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                obj.setSenha(resultadoSelect.getString("senha"));
                obj.setCargo(resultadoSelect.getString("cargo"));
                obj.setNivel_acesso(resultadoSelect.getString("nivel_acesso"));
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
      
      
      // Metodo consultar funcionario por Nome
    public FuncionariosClass consultaPorNome(String nome) {
        try {
            
            // Cria o comando, organizar por nome
            String sql = "select * from estoVendasJava.tb_funcionarios where nome = ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet resultadoSelect = stmt.executeQuery();
            
            FuncionariosClass obj = new FuncionariosClass();
            if(resultadoSelect.next()) {
                
                
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                
                obj.setSenha(resultadoSelect.getString("senha"));
                obj.setCargo(resultadoSelect.getString("cargo"));
                obj.setNivel_acesso(resultadoSelect.getString("nivel_acesso"));
                
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
            JOptionPane.showMessageDialog(null, "Funcionario nao encontrado!!");
            return null;
        }
    }
    
    // Medoto Lista funcionario por nome - Retorna uma lista
    public List<FuncionariosClass>listaFuncionarioPorNome(String nome) {
        
        try {
            
            // Criar a lista
            List<FuncionariosClass> lista = new ArrayList<>();
            
            
            // Criar o sql, organizar e executar 
            String sql = "select * from estoVendasJava.tb_funcionarios where nome like ?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet resultadoSelect = stmt.executeQuery();
            
            while(resultadoSelect.next()) {
                
                FuncionariosClass obj = new FuncionariosClass();
                obj.setId(resultadoSelect.getInt("id"));
                obj.setNome(resultadoSelect.getString("nome"));
                obj.setRg(resultadoSelect.getString("rg"));
                obj.setCpf(resultadoSelect.getString("cpf"));
                obj.setEmail(resultadoSelect.getString("email"));
                
                obj.setSenha(resultadoSelect.getString("senha"));
                obj.setCargo(resultadoSelect.getString("cargo"));
                obj.setNivel_acesso(resultadoSelect.getString("nivel_acesso"));
                
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
      
    // Medodo de efetuar login 
    public void efetuaLogin(String email, String senha) {
        
        try {
            
            // Inserir o comando sql 
            String sql = "select * from estoVendasJava.tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet resultadoSelect = stmt.executeQuery();
            
            if (resultadoSelect.next()) { // Usuario conseguiu fazer o login
                
                JOptionPane.showMessageDialog(null, "Ola!, Seja Bem-Vindo.");
                FrmMenu telaMenu = new FrmMenu();
                telaMenu.usuarioLogado = resultadoSelect.getString("nome");
                telaMenu.setVisible(true);
                
            } else { // Dados desconhecidos
                
                JOptionPane.showMessageDialog(null, "Email ou Senha inválidos!");
                new FrmLogin().setVisible(true);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Error: " + erro);
        }
        
    }
}
