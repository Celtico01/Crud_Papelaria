package constantes;

public final class Consts {
    //outras
    public static final int TEMA_CLARO = 1;
    public static final int TEMA_ESCURO = 2;
    
    //consts produtos
    public static final String PRO_CODIGO = "PRO_CODIGO";
    public static final String PRO_NOME = "PRO_NOME";
    public static final String PRO_DESCRICAO = "PRO_DESCRICAO";
    public static final String PRO_PRECO = "PRO_PRECO";
    public static final String PRO_QUANTIDADE_ESTOQUE = "PRO_QUANTIDADE_ESTOQUE";
    public static final String TODOS_OS_PRODUTOS = "select * from tbProduto";
    public static final String QUANTIDADE_PRODUTOS = "select count(*) QTDE from tbProduto";
    public static final String APAGAR_PRODUTO = "delete from tbProduto where PRO_CODIGO = ?;";
    
    //consts pedidos
    public static final String PED_CODIGO = "PED_CODIGO";
    public static final String PED_NOME_CLIENTE = "PED_NOME_CLIENTE";
    public static final String PED_DATA_PEDIDO = "PED_DATA_PEDIDO";
    public static final String TODOS_OS_PEDIDOS = "select * from tbPedido";
    
    //consts ItemPedido
    public static final String IPE_CODIGO = "IPE_CODIGO";
    public static final String PED_CODIGO_FK = "PED_CODIGO";
    public static final String PRO_CODIGO_FK = "PRO_CODIGO";
    public static final String IPE_QUANTIDADE = "IPE_QUANTIDADE";
    public static final String IPE_PRECO_UNITARIO = "IPE_PRECO_UNITARIO";
    public static final String TODOS_ITEM_PEDIDO = "select * from tbItemPedido";
    
    //consultas extras
    //subTotal do pedido
    public static final String SUBTOTAL_CLIENTE = "select sum(IPE_PRECO_UNITARIO * IPE_QUANTIDADE) SUBTOTAL, \n" +
                                                                                "group_concat(IP.PRO_CODIGO separator ',') PRODUTOS,\n" +
                                                                                "group_concat(IP.IPE_QUANTIDADE separator ',') QUANTIDADES\n" +
                                                                                "from tbItemPedido IP join tbPedido PED\n" +
                                                                                "   on IP.PED_CODIGO = PED.PED_CODIGO\n" +
                                                                                "group by PED.PED_CODIGO";
    public static final String SUBTOTAL = "SUBTOTAL";
    public static final String PRODUTOS = "PRODUTOS";
    public static final String QUANTIDADES = "QUANTIDADES";
    //
    
    //
}
/*String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";  

        try {  
            PreparedStatement stmt = connection.prepareStatement(sql);  

            stmt.setString(1, usuario.getNome());  
            stmt.setString(2, usuario.getCpf());  
            stmt.setString(3, usuario.getEmail());  
            stmt.setString(4, usuario.getTelefone());  

             stmt.execute();  
            stmt.close(); */