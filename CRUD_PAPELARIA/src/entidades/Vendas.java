package entidades;

import java.sql.Date;

public class Vendas {
    private final Date ven_data_venda;
    private final int ven_qtde_prod;
    private final String ven_nome_cliente;
    private final int pro_codigo;

    public Vendas(Date ven_data_venda, int ven_qtde_prod, String ven_nome_cliente, int pro_codigo) {
        this.ven_data_venda = ven_data_venda;
        this.ven_qtde_prod = ven_qtde_prod;
        this.ven_nome_cliente = ven_nome_cliente;
        this.pro_codigo = pro_codigo;
    }

    public Date getVen_data_venda() {
        return ven_data_venda;
    }

    public int getVen_qtde_prod() {
        return ven_qtde_prod;
    }

    public String getVen_nome_cliente() {
        return ven_nome_cliente;
    }

    public int getPro_codigo() {
        return pro_codigo;
    }
}
