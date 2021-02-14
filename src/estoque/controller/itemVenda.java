package estoque.controller;

import java.sql.Connection;
import projeto.jdbc.ConnectionFactory;

/**
 *
 * @author lima
 */
public class itemVenda {
    
    private Connection connect;
    
    
    public itemVenda() {
        this.connect = new ConnectionFactory().getConnection();
    }
    
}
