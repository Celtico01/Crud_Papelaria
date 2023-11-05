package entidades;

public class Produto {
    private final String pro_nome;
    private final double pro_preco;
    private final int pro_qtde_estoque;
    private final String pro_categoria;

    public Produto(String pro_nome, double pro_preco, int pro_qtde_estoque, String pro_categoria) {
        this.pro_nome = pro_nome;
        this.pro_preco = pro_preco;
        this.pro_qtde_estoque = pro_qtde_estoque;
        this.pro_categoria = pro_categoria;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public double getPro_preco() {
        return pro_preco;
    }

    public int getPro_qtde_estoque() {
        return pro_qtde_estoque;
    }

    public String getPro_categoria() {
        return pro_categoria;
    }
}
