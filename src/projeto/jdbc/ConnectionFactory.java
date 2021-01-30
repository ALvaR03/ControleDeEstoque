package projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection() {
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/estoVendasJava", "usuarioVendasEsto", "123") ;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
    //connect = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=root&password=MSQLpass21!");
    
}
