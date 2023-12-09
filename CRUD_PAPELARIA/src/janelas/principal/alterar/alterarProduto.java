package janelas.principal.alterar;

import constantes.Consts;
import interfaces.Temas;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class alterarProduto extends javax.swing.JFrame implements Temas{
    private final int tema;
    private final Connection conec;
    
    public alterarProduto(Connection conec, int tema) {
        this.conec = conec;
        this.tema = tema;
        
        initComponents();
        
        if(this.tema == Consts.TEMA_CLARO){
            temaClaro();
        }
        else if(this.tema == Consts.TEMA_ESCURO){
            temaEscuro();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProduto = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnLimparPRO = new javax.swing.JButton();
        pnlAlterar = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblQtde = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtde = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnLimparALT = new javax.swing.JButton();
        btnSalvarALT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produto");
        setResizable(false);

        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        lblCodigo.setText("Código:");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/alterarProduto_icon.png"))); // NOI18N
        btnAlterar.setText("Selecionar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimparPRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnLimparPRO.setText("Limpar");
        btnLimparPRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPROActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(2, 2, 2)
                        .addComponent(txtCodigoPro))
                    .addComponent(btnLimparPRO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimparPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));

        lblNome.setText("Nome:");

        lblDesc.setText("Descrição:");

        lblPreco.setText("Preço:");

        lblQtde.setText("Quantidade:");

        txtDesc.setEditable(false);
        txtDesc.setEnabled(false);

        txtPreco.setEditable(false);
        txtPreco.setEnabled(false);

        txtQtde.setEditable(false);
        txtQtde.setEnabled(false);

        txtNome.setEditable(false);
        txtNome.setEnabled(false);

        btnLimparALT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnLimparALT.setText("Limpar");
        btnLimparALT.setEnabled(false);
        btnLimparALT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparALTActionPerformed(evt);
            }
        });

        btnSalvarALT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/salvar_icon.png"))); // NOI18N
        btnSalvarALT.setText("Salvar");
        btnSalvarALT.setEnabled(false);
        btnSalvarALT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarALTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlterarLayout = new javax.swing.GroupLayout(pnlAlterar);
        pnlAlterar.setLayout(pnlAlterarLayout);
        pnlAlterarLayout.setHorizontalGroup(
            pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlterarLayout.createSequentialGroup()
                        .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblDesc)
                            .addComponent(lblPreco)
                            .addComponent(lblQtde))
                        .addGap(4, 4, 4)
                        .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc)
                            .addComponent(txtPreco)
                            .addComponent(txtQtde)
                            .addComponent(txtNome)))
                    .addGroup(pnlAlterarLayout.createSequentialGroup()
                        .addComponent(btnSalvarALT, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparALT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlAlterarLayout.setVerticalGroup(
            pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtde)
                    .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarALT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLimparALT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparALTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparALTActionPerformed
        limparALT();
    }//GEN-LAST:event_btnLimparALTActionPerformed

    private void btnLimparPROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPROActionPerformed
        limparPRO();
    }//GEN-LAST:event_btnLimparPROActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            if(txtCodigoPro.getText().isBlank()){
                throw new Exception("Preencha o campo!");
            }
            if(!isInteger(txtCodigoPro.getText())){
                btnLimparPROActionPerformed(evt);
                throw new Exception("Insira um valor válido! (Ex: 123)");
            }
            
            obterProduto();
            
            if(txtNome.getText().isBlank() ||
               txtDesc.getText().isBlank() ||
               txtPreco.getText().isBlank() ||
               txtQtde.getText().isBlank()){
                txtCodigoPro.setText("");
                throw new Exception("Produto inexistente, insira um código válido!");
            }
            
            //ativa a parte de alterar!
            txtNome.setEditable(true);
            txtNome.setEnabled(true);
            txtDesc.setEditable(true);
            txtDesc.setEnabled(true);
            txtPreco.setEditable(true);
            txtPreco.setEnabled(true);
            txtQtde.setEditable(true);
            txtQtde.setEnabled(true);
            btnSalvarALT.setEnabled(true);
            btnLimparALT.setEnabled(true);
            //desativa a parte de produto!
            txtCodigoPro.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnLimparPRO.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarALTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarALTActionPerformed
        try{
            if(txtNome.getText().isBlank() ||
               txtDesc.getText().isBlank() ||
               txtPreco.getText().isBlank() ||
               txtQtde.getText().isBlank()){
                throw new Exception("Preencha todos os campos!");
            }
            
            txtPreco.setText(txtPreco.getText().replace(',', '.'));
            
            if(isDouble(txtNome.getText())){
                txtNome.setText("");
                throw new Exception("Insira um nome válido! (Ex:Caneta)");
            }
            if(isDouble(txtDesc.getText())){
                txtDesc.setText("");
                throw new Exception("Insira uma descrição válida!");
            }
            if(!isDouble(txtPreco.getText())){
                txtPreco.setText("");
                throw new Exception("Insira um preço válido! (Ex:1,50)");
            }
            if(!isInteger(txtQtde.getText())){
                txtQtde.setText("");
                throw new Exception("Insira uma quantidade válida! (Ex: 20)");
            }
            
            alterarProduto();
            JOptionPane.showMessageDialog(this, "Produto Alterado!", "Alterar!", JOptionPane.INFORMATION_MESSAGE);
            btnLimparALTActionPerformed(evt);
            btnLimparPROActionPerformed(evt);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_btnSalvarALTActionPerformed
    
    private void limparPRO(){
        txtCodigoPro.setText("");
    }
    
    private void limparALT(){
        txtNome.setText("");
        txtDesc.setText("");
        txtPreco.setText("");
        txtQtde.setText("");
        txtCodigoPro.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnLimparPRO.setEnabled(true);
        txtNome.setEditable(false);
        txtNome.setEnabled(false);
        txtDesc.setEditable(false);
        txtDesc.setEnabled(false);
        txtPreco.setEditable(false);
        txtPreco.setEnabled(false);
        txtQtde.setEditable(false);
        txtQtde.setEnabled(false);
        btnSalvarALT.setEnabled(false);
        btnLimparALT.setEnabled(false);
    }
    
    private void obterProduto(){
        try{
            PreparedStatement statement = conec.prepareStatement(Consts.OBTER_PRODUTO);
            statement.setString(1, txtCodigoPro.getText());
            
            ResultSet resultado = statement.executeQuery();
            
            while(resultado.next()){
                txtNome.setText(resultado.getString(Consts.PRO_NOME));
                txtDesc.setText(resultado.getString(Consts.PRO_DESCRICAO));
                txtPreco.setText(String.valueOf(resultado.getDouble(Consts.PRO_PRECO)));
                txtQtde.setText(resultado.getString(Consts.PRO_QUANTIDADE_ESTOQUE));
            }
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    private void alterarProduto(){
        try{
            PreparedStatement statement = conec.prepareStatement(Consts.ALTERAR_PRODUTO);
            
            statement.setString(1, txtNome.getText());
            statement.setString(2, txtDesc.getText());
            statement.setDouble(3, Double.parseDouble(String.format("%.2f", Double.valueOf(txtPreco.getText())).replace(',', '.')));
            statement.setInt(4, Integer.parseInt(txtQtde.getText()));
            statement.setInt(5, Integer.parseInt(txtCodigoPro.getText()));
            
            statement.executeUpdate();
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    private static boolean isDouble(String str){
        try {
            Double.parseDouble(str); 
            return true;
        } 
        catch (NumberFormatException nfe) {
            return false;
        }
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
    
    @Override
    public void temaClaro() {
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().setForeground(Color.black);
        lblCodigo.setBackground(Color.white);
        lblDesc.setBackground(Color.white);
        lblNome.setBackground(Color.white);
        lblPreco.setBackground(Color.white);
        lblQtde.setBackground(Color.white);
        lblCodigo.setForeground(Color.black);
        lblDesc.setForeground(Color.black);
        lblNome.setForeground(Color.black);
        lblPreco.setForeground(Color.black);
        lblQtde.setForeground(Color.black);
        txtCodigoPro.setBackground(Color.white);
        txtDesc.setBackground(Color.white);
        txtNome.setBackground(Color.white);
        txtPreco.setBackground(Color.white);
        txtQtde.setBackground(Color.white);
        txtCodigoPro.setForeground(Color.black);
        txtDesc.setForeground(Color.black);
        txtNome.setForeground(Color.black);
        txtPreco.setForeground(Color.black);
        txtQtde.setForeground(Color.black);
        btnAlterar.setBackground(Color.white);
        btnLimparALT.setBackground(Color.white);
        btnLimparPRO.setBackground(Color.white);
        btnSalvarALT.setBackground(Color.white);
        btnAlterar.setForeground(Color.black);
        btnLimparALT.setForeground(Color.black);
        btnLimparPRO.setForeground(Color.black);
        btnSalvarALT.setForeground(Color.black);
        pnlAlterar.setBackground(Color.white);
        pnlProduto.setBackground(Color.white);
        pnlAlterar.setForeground(Color.black);
        pnlProduto.setForeground(Color.black);
        //bordas panel
        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setForeground(Color.white);
        lblCodigo.setBackground(Color.darkGray);
        lblDesc.setBackground(Color.darkGray);
        lblNome.setBackground(Color.darkGray);
        lblPreco.setBackground(Color.darkGray);
        lblQtde.setBackground(Color.darkGray);
        lblCodigo.setForeground(Color.white);
        lblDesc.setForeground(Color.white);
        lblNome.setForeground(Color.white);
        lblPreco.setForeground(Color.white);
        lblQtde.setForeground(Color.white);
        txtCodigoPro.setBackground(Color.darkGray);
        txtDesc.setBackground(Color.darkGray);
        txtNome.setBackground(Color.darkGray);
        txtPreco.setBackground(Color.darkGray);
        txtQtde.setBackground(Color.darkGray);
        txtCodigoPro.setForeground(Color.white);
        txtDesc.setForeground(Color.white);
        txtNome.setForeground(Color.white);
        txtPreco.setForeground(Color.white);
        txtQtde.setForeground(Color.white);
        btnAlterar.setBackground(Color.darkGray);
        btnLimparALT.setBackground(Color.darkGray);
        btnLimparPRO.setBackground(Color.darkGray);
        btnSalvarALT.setBackground(Color.darkGray);
        btnAlterar.setForeground(Color.white);
        btnLimparALT.setForeground(Color.white);
        btnLimparPRO.setForeground(Color.white);
        btnSalvarALT.setForeground(Color.white);
        pnlAlterar.setBackground(Color.darkGray);
        pnlProduto.setBackground(Color.darkGray);
        pnlAlterar.setForeground(Color.white);
        pnlProduto.setForeground(Color.white);
        //bordas panel
        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimparALT;
    private javax.swing.JButton btnLimparPRO;
    private javax.swing.JButton btnSalvarALT;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JPanel pnlAlterar;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtde;
    // End of variables declaration//GEN-END:variables
}
