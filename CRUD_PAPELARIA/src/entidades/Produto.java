package entidades;

public class Produto {
    private String pro_nome;
    private String pro_categoria;
    private double pro_preco;
    private int pro_qtde_estoque;

    public Produto(String pro_nome, String pro_categoria, double pro_preco, int pro_qtde_estoque) {
        this.pro_nome = pro_nome;
        this.pro_categoria = pro_categoria;
        this.pro_preco = pro_preco;
        this.pro_qtde_estoque = pro_qtde_estoque;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public String getPro_categoria() {
        return pro_categoria;
    }

    public double getPro_preco() {
        return pro_preco;
    }

    public int getPro_qtde_estoque() {
        return pro_qtde_estoque;
    }
}
