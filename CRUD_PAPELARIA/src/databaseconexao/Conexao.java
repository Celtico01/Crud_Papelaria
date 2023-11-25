package databaseconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private final String usuario;
    private final String senha;
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
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Erro: classe não encontrada!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro: " + sqle.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }   
        return null; 
    }
  
    public final boolean verificarDados(){
        Connection conect = null;
        try{
            Class.forName(className);
            conect = DriverManager.getConnection(this.url, usuario, senha);
            conect.close();
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Erro: Classe não encontrada!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException sqle) {
            return false;
        }
        return true;
    }
}