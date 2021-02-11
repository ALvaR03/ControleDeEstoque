package estoque.model;
/**
 * @author lima
 */
public class FornecedoresClass extends ClientesClass {
    
    // Atibutos
    private String cnpj;
    
    // getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
   
    @Override
    public String toString() {
        return this.getNome();
    }
}
