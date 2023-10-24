package main;

import databaseconexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
        Conexao conec = new Conexao("root", "aluno123");
        Connection cnct = conec.estabelecerConexao();
        
        ResultSet result = conec.criarStatement(cnct).executeQuery("SELECT * FROM tbProduto");
        
        while(result.next()){
            int codigo = result.getInt("PRO_CODIGO");
                String nome = result.getString("PRO_NOME");
                double preco = result.getDouble("PRO_PRECO");
                int quantidadeEstoque = result.getInt("PRO_QUANTIDADE_ESTOQUE");
                String categoria = result.getString("PRO_CATEGORIA");

                System.out.println("Código: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Preço: " + preco);
                System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
                System.out.println("Categoria: " + categoria);
                System.out.println();
        }
        
        conec.finalizarConexao(cnct);
    }
}
