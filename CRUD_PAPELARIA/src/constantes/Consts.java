package constantes;

public final class Consts {
    //tema
    /**
     *Tema Claro.
     */
    public static final int TEMA_CLARO = 0;

    /**
     *Tema Escuro.
     */
    public static final int TEMA_ESCURO = 1;
    
    //consts produtos

    /**
     *Atributo CODIGO da tabela produto.
     */
    public static final String PRO_CODIGO = "PRO_CODIGO";

    /**
     *Atributo NOME da tabela produto.
     */
    public static final String PRO_NOME = "PRO_NOME";

    /**
     *Atributo DESCRIÇÃO da tabela produto.
     */
    public static final String PRO_DESCRICAO = "PRO_DESCRICAO";

    /**
     *Atributo PRECO da tabela produto.
     */
    public static final String PRO_PRECO = "PRO_PRECO";

    /**
     *Atributo QUANTIDADE_ESTOQUE da tabela produto.
     */
    public static final String PRO_QUANTIDADE_ESTOQUE = "PRO_QUANTIDADE_ESTOQUE";

    /**
     *Consulta para obter todos os dados da tabela produto.
     */
    public static final String TODOS_OS_PRODUTOS = "select * from tbProduto";

    /**
     *Consulta para obter a quantidade de produtos
     */
    public static final String QUANTIDADE_PRODUTOS = "select count(*) QTDE from tbProduto";

    /**
     *Script para apagar produto.
     */
    public static final String APAGAR_PRODUTO = "delete from tbProduto where PRO_CODIGO = ?";

    /**
     *Consulta para obter o maior codigo de produto
     */
    public static final String MAIOR_COD_PRODUTO = "select max(PRO_CODIGO) from tbProdudo";
    
    /**
     *Inserir dados na tabela produto
     */
    public static final String INSERT_TBPRODUTO = "insert into tbProduto (PRO_NOME, PRO_DESCRICAO, PRO_PRECO, PRO_QUANTIDADE_ESTOQUE) values (?,?,?,?)";
    
    /**
     *Pegar o preço do produto.
     */
    public static final String PRECO_PRODUTO = "select PRO_PRECO from tbProduto where PRO_CODIGO = ?";
    
    //consts pedidos

    /**
     *Atributo CODIGO da tabela Pedido.
     */
    public static final String PED_CODIGO = "PED_CODIGO";

    /**
     *Atributo NOME_CLIENTE da tabela Pedido.
     */
    public static final String PED_NOME_CLIENTE = "PED_NOME_CLIENTE";

    /**
     *Atributo DATA_PEDIDO da tabela Pedido.
     */
    public static final String PED_DATA_PEDIDO = "PED_DATA_PEDIDO";
    
    /*
    *Consulta para apagar pedido.
    */
    public static final String APAGAR_PEDIDO = "delete from tbPedido where PED_CODIGO = ?";
    
    //consts ItemPedido

    /**
     *Atributo CODIGO da tabela ItemPedido.
     */
    public static final String IPE_CODIGO = "IPE_CODIGO";

    /**
     *Atributo QUANTIDADE da tabela ItemPedido.
     */
    public static final String IPE_QUANTIDADE = "IPE_QUANTIDADE";

    /**
     *Atributo PRECO_UNITARIO da tabela ItemPedido.
     */
    public static final String IPE_PRECO_UNITARIO = "IPE_PRECO_UNITARIO";
    
    //consultas extras
    //subTotal do pedido

    /**
     *Consulta de todos os atributos dos pedidos.
     */
    public static final String SUBTOTAL_CLIENTE =   "select PED.PED_CODIGO,\n" +
                                                    "PED.PED_NOME_CLIENTE,\n" +
                                                    "PED.PED_DATA_PEDIDO, \n" +
                                                    "sum(IPE_PRECO_UNITARIO * IPE_QUANTIDADE) SUBTOTAL, \n" +
                                                    "group_concat(IP.PRO_CODIGO separator ',') PRODUTOS,\n" +
                                                    "group_concat(IP.IPE_QUANTIDADE separator ',') QUANTIDADES\n" +
                                                    "from tbItemPedido IP, tbPedido PED\n" +
                                                    "where IP.PED_CODIGO = PED.PED_CODIGO\n" +
                                                    "group by PED.PED_CODIGO, PED.PED_NOME_CLIENTE, PED.PED_DATA_PEDIDO;";

    /**
     *atributo subtotal da consulta SUBTOTAL_CLIENTE.
     */
    public static final String SUBTOTAL = "SUBTOTAL";

    /**
     *atributo produto da consulta SUBTOTAL_CLIENTE.
     */
    public static final String PRODUTOS = "PRODUTOS";

    /**
     *atributo Quantidades da consulta SUBTOTAL_CLIENTE.
     */
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