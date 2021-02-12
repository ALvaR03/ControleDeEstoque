package estoque.model;

/**
 * @author lima
 */
public class ProdutosClass {

    // Atributos 
    private int id, qtd_estoque;
    private String descricao;
    private double preco;
    
    private FornecedoresClass fornecedorId; // FK do banco

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public FornecedoresClass getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(FornecedoresClass fornecedorId) {
        this.fornecedorId = fornecedorId;
    }
    
    
    
    
}
