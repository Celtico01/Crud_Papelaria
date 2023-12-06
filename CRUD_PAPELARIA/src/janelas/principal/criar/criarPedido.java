package janelas.principal.criar;

import constantes.Consts;
import interfaces.Temas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class criarPedido extends javax.swing.JFrame implements Temas{
    private Connection conec;
    private int tema;

    public criarPedido(Connection conec, int tema) {
        this.conec = conec;
        this.tema = tema;
        
        initComponents();
        
        if(this.tema == Consts.TEMA_CLARO){
            temaClaro();
        }
        else if(this.tema == Consts.TEMA_ESCURO){
            temaEscuro();
        }
        
        
        //evento para selecionar item na tabela
        tblLista.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                    cmbBox.setSelectedIndex(tblLista.getSelectedRow());
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProduto = new javax.swing.JPanel();
        btnLimparPRO = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtProQuantidade = new javax.swing.JTextField();
        txtProCod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnApagar = new javax.swing.JButton();
        cmbBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimparFINPED = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        txtCliNome = new javax.swing.JTextField();
        txtDataPed = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        btnLimparPRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/limpar_icon.png"))); // NOI18N
        btnLimparPRO.setText("Limpar");
        btnLimparPRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPRObtnLimparPROActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/adicionar_icon.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarbtnAdicionarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código do produto:");

        jLabel9.setText("Quantidade:");

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProCod))
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimparPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createSequentialGroup()
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtProCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtProQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimparPRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Quantidade", "Preço Unitário", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(tblLista);

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnApagar.setText("Apagar");

        jLabel3.setText("Deseja remover qual produto?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar))
                .addGap(54, 54, 54))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Finalizar Pedido"));

        btnLimparFINPED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/limpar_icon.png"))); // NOI18N
        btnLimparFINPED.setText("Limpar");
        btnLimparFINPED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFINPEDActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/finalizar_icon.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");

        txtDataPed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel5.setText("Data do Pedido:");

        jLabel4.setText("Nome do Cliente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(18, 18, 18)
                .addComponent(btnLimparFINPED, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnLimparFINPED, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparPRObtnLimparPROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPRObtnLimparPROActionPerformed
        limparPRO();
    }//GEN-LAST:event_btnLimparPRObtnLimparPROActionPerformed

    private void btnAdicionarbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarbtnAdicionarActionPerformed
        try{
            if(txtProCod.getText().isEmpty() || //java 11
                txtProQuantidade.getText().isEmpty()){ //java 11
                throw new IllegalArgumentException("Preencha todos os campos!");
            }
            if(!isInteger(txtProCod.getText())){
                txtProCod.setText("");
                throw new IllegalArgumentException("Insira um valor númerico para o código do produto!");
            }
            if(!isInteger(txtProQuantidade.getText())){
                txtProQuantidade.setText("");
                throw new IllegalArgumentException("Insira um valor númerico para a quantidade de produtos!");
            }

            double preco = obterPreco();

            double subTotal = Integer.parseInt(txtProQuantidade.getText()) * preco;

            DefaultTableModel tabelaProd =
            (DefaultTableModel) tblLista.getModel();

            Object[] linha = new Object[]{
                txtProCod.getText(),
                txtProQuantidade.getText(),
                preco,
                subTotal
            };

            tabelaProd.addRow(linha);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAdicionarbtnAdicionarActionPerformed

    private void btnLimparFINPEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFINPEDActionPerformed
        limparFINPED();
    }//GEN-LAST:event_btnLimparFINPEDActionPerformed

    @Override
    public void temaClaro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        
    @Override
    public void temaEscuro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void limparPRO(){
        txtProCod.setText("");
        txtProQuantidade.setText("");
    }
    
    private void limparFINPED(){
        txtCliNome.setText("");
        txtDataPed.setText("");
    }
    
    private static boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException nfe){
            return false;
        }
    }
    
    private double obterPreco(){
        double preco = 0d;
        try{
            PreparedStatement statement;
            statement = conec.prepareStatement(Consts.PRECO_PRODUTO);
            statement.setInt(1, Integer.parseInt(txtProCod.getText()));
            
            ResultSet resultado = statement.executeQuery();
            
            preco = resultado.getDouble(Consts.PRO_PRECO);
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return preco;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimparFINPED;
    private javax.swing.JButton btnLimparPRO;
    private javax.swing.JComboBox<String> cmbBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JFormattedTextField txtDataPed;
    private javax.swing.JTextField txtProCod;
    private javax.swing.JTextField txtProQuantidade;
    // End of variables declaration//GEN-END:variables
}
