package databaseconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    private  String usuario;
    private String senha;
    private final String url;
    private final String className;
        

    public Conexao(String usuario, String senha){
        this.url = "jdbc:mysql://localhost:3306/PAPELARIA?useTimezone=true&serverTimezone=UTC";
        this.className = "com.mysql.cj.jdbc.Driver";
        this.usuario = usuario;
        this.senha = senha;
    }
            
    public final Connection estabelecerConexao(){
        try{
            Class.forName(className);
            return DriverManager.getConnection(this.url, usuario, senha);
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "ERRO: classe não encontrada!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "ERRO: " + sqle.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return null; 
    }
    
    public final boolean finalizarConexao(Connection cnct){
        boolean ret = false;
        try{
            if(cnct != null){
                cnct.close();
                ret = true;
            }
            else{
                ret = false;
            }
            
        }
        catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "ERRO: " + sqle.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }
    
    public final Statement criarStatement(Connection cnct){
        try {
            if(cnct != null){
                return cnct.createStatement();
            }
            else{
                throw new NullPointerException("Conexão inválida!");
            }
        } 
        catch (SQLException | NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
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