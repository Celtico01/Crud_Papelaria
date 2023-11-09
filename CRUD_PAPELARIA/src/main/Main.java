package main;

import janelas.loginbd.JFrameAjuda;
import janelas.loginbd.JFrameConexaoInicial;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, InterruptedException {
        JFrameConexaoInicial jfci = new JFrameConexaoInicial();
        jfci.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                  
            }
        });

        jfci.setVisible(true);
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