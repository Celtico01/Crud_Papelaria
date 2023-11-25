package entidades;

import java.sql.Date;
import java.util.List;

public class Pedidos {
    private String ped_nome_cliente;
    private Date ped_data_pedido;
    private List<ItemPedido> itens;

    public Pedidos(String ped_nome_cliente, Date ped_data_pedido, List<ItemPedido> itens) {
        this.ped_nome_cliente = ped_nome_cliente;
        this.ped_data_pedido = ped_data_pedido;
        this.itens = itens;
    }

    public String getPed_nome_cliente() {
        return ped_nome_cliente;
    }

    public Date getPed_data_pedido() {
        return ped_data_pedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
    
    
}
