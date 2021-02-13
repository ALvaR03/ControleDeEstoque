package estoque.model;
/**
 *
 * @author lima
 */
public class VendasClass {
    
    // Atibutos
    private int id;
    private ClientesClass cliente;
    private String data_venda;
    private double total_venda;
    private String obs;
    
    // Getter e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientesClass getCliente() {
        return cliente;
    }

    public void setCliente(ClientesClass cliente) {
        this.cliente = cliente;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
