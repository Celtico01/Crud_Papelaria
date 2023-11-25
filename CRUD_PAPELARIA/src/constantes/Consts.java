package constantes;

public final class Consts {
    public static final String TODOS_OS_PRODUTOS = "select * from tbProduto";
    public static final String PRO_CODIGO = "PRO_CODIGO";
    public static final String PRO_NOME = "PRO_NOME";
    public static final String PRO_DESCRICAO = "PRO_DESCRICAO";
    public static final String PRO_PRECO = "PRO_PRECO";
    public static final String PRO_QUANTIDADE_ESTOQUE = "PRO_QUANTIDADE_ESTOQUE";
}



/*ResultSet resultSet = conexao.createStatement().executeQuery("SELECT * FROM tbProduto");
  while (resultSet.next()) {
                int codigo = resultSet.getInt("PRO_CODIGO");
                String nome = resultSet.getString("PRO_NOME");
                double preco = resultSet.getDouble("PRO_PRECO");
                int quantidadeEstoque = resultSet.getInt("PRO_QUANTIDADE_ESTOQUE");
                String categoria = resultSet.getString("PRO_CATEGORIA");

                System.out.println("Código: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Preço: " + preco);
                System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
                System.out.println("Categoria: " + categoria);
                System.out.println();
            }
*/


/*String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";  

        try {  
            PreparedStatement stmt = connection.prepareStatement(sql);  

            stmt.setString(1, usuario.getNome());  
            stmt.setString(2, usuario.getCpf());  
            stmt.setString(3, usuario.getEmail());  
            stmt.setString(4, usuario.getTelefone());  

             stmt.execute();  
            stmt.close(); */



//try {
//                    Connection cnct = jfci.criarConnection();
//                    ResultSet result = cnct.createStatement().executeQuery("select * from tbProduto");
//
//                    while(result.next()){
//                        int codigo = result.getInt("PRO_CODIGO");
//                        String nome = result.getString("PRO_NOME");
//                        double preco = result.getDouble("PRO_PRECO");
//                        int quantidadeEstoque = result.getInt("PRO_QUANTIDADE_ESTOQUE");
//                        String descricao = result.getString("PRO_DESCRICAO");
//
//                        System.out.println("Código: " + codigo);
//                        System.out.println("Nome: " + nome);
//                        System.out.println("Preço: " + preco);
//                        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
//                        System.out.println("Descrição: " + descricao);
//                        System.out.println();
//                    }
//
//                } catch (SQLException ex) {
//                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                }
