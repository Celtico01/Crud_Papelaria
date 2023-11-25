package entidades;

public class ItemPedido {
    private int ped_codigo;
    private int pro_codigo;
    private int ipe_qtde_produto;
    private int ipe_preco_unitario;

    public ItemPedido(int ped_codigo, int pro_codigo, int ipe_qtde_produto, int ipe_preco_unitario) {
        this.ped_codigo = ped_codigo;
        this.pro_codigo = pro_codigo;
        this.ipe_qtde_produto = ipe_qtde_produto;
        this.ipe_preco_unitario = ipe_preco_unitario;
    }

    public int getPed_codigo() {
        return ped_codigo;
    }

    public int getPro_codigo() {
        return pro_codigo;
    }

    public int getIpe_qtde_produto() {
        return ipe_qtde_produto;
    }

    public int getIpe_preco_unitario() {
        return ipe_preco_unitario;
    }
}
