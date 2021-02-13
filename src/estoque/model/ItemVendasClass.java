package estoque.model;

/**
 *
 * @author lima
 */
public class ItemVendasClass {
    
    // Atributos
    private int id;
    private VendasClass venda;
    private ProdutosClass produto;
    private int qtd;
    private double subtotal;
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VendasClass getVenda() {
        return venda;
    }

    public void setVenda(VendasClass venda) {
        this.venda = venda;
    }

    public ProdutosClass getProduto() {
        return produto;
    }

    public void setProduto(ProdutosClass produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
