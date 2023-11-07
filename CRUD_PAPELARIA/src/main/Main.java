package main;

import databaseconexao.Conexao;
import janelas.loginbd.JFrameAjuda;
import janelas.loginbd.JFrameConexaoInicial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Dialog;


public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException{
        String[] dados = null;
//        Conexao conec = new Conexao("root", "kissmygrits1234");
//        Connection cnct = conec.estabelecerConexao();
//        
//        ResultSet result = conec.criarStatement(cnct).executeQuery("SELECT * FROM tbProduto");
//        
//        while(result.next()){
//            int codigo = result.getInt("PRO_CODIGO");
//                String nome = result.getString("PRO_NOME");
//                double preco = result.getDouble("PRO_PRECO");
//                int quantidadeEstoque = result.getInt("PRO_QUANTIDADE_ESTOQUE");
//                String categoria = result.getString("PRO_CATEGORIA");
//
//                System.out.println("Código: " + codigo);
//                System.out.println("Nome: " + nome);
//                System.out.println("Preço: " + preco);
//                System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
//                System.out.println("Categoria: " + categoria);
//                System.out.println();
//        }
//        
//        conec.finalizarConexao(cnct);

        JFrameConexaoInicial jfci = new JFrameConexaoInicial();
        
        jfci.wait();
        
        jfci.setVisible(true);
        
        dados = jfci.getDados();
        
        System.out.println(dados[0] + " " + dados[1]);
    }
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
