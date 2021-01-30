package projeto.jdbc;

import javax.swing.JOptionPane;

public class TestaConexao {
    
    public static void main(String[] args) {
        
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Connectado com sucesso!");
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Ops aconteceu o erro: " + erro);
            
        }
        
    }
    
}
