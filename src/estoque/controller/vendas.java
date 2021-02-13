package estoque.controller;

import java.sql.Connection;
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
    
    
    
    
}
