package janelas.principal.criar;

import constantes.Consts;
import interfaces.Temas;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class criarProduto extends javax.swing.JFrame implements Temas{
    private final int tema;
    private final Connection conec;
    private String nome;
    private String desc;
    private double preco;
    private int qtdeEs;
    
    public criarProduto(Connection conec, int tema) {
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

        pnlCriar = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        txtProNome = new javax.swing.JTextField();
        txtProDesc = new javax.swing.JTextField();
        txtProPreco = new javax.swing.JTextField();
        txtProEstoque = new javax.swing.JTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Produto");
        setResizable(false);

        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar"));

        lblNome.setText("Nome:");

        lblDesc.setText("Descrição:");

        lblPreco.setText("Preço:");

        lblEstoque.setText("Estoque:");

        txtProDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCriarLayout = new javax.swing.GroupLayout(pnlCriar);
        pnlCriar.setLayout(pnlCriarLayout);
        pnlCriarLayout.setHorizontalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProNome, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtProDesc)
                    .addComponent(txtProPreco)
                    .addComponent(txtProEstoque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCriarLayout.setVerticalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtProNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtProDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtProPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstoque)
                    .addComponent(txtProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Botões"));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/salvar_icon.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/limpar_icon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProDescActionPerformed
        //unused
    }//GEN-LAST:event_txtProDescActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        txtProPreco.setText(txtProPreco.getText().replace(',', '.'));
        try{
            if(txtProNome.getText().isBlank()|| //java 11
                txtProDesc.getText().isBlank()|| //java 11
                txtProPreco.getText().isBlank()|| //java 11
                txtProEstoque.getText().isBlank()){ //java 11
                throw new Exception("Preencha todos os campos!");
            }
            if(txtProNome.getText().length() > 255){
                txtProNome.setText("");
                throw new IllegalArgumentException("Nome do produto muito grande!");
            }
            if(txtProDesc.getText().length() > 255){
                txtProDesc.setText("");
                throw new IllegalArgumentException("Descrição do produto muito grande!");
            }
            if(isDouble(txtProNome.getText()) || isInteger(txtProNome.getText())){
                txtProNome.setText("");
                throw new IllegalArgumentException("O nome não pode ser número!");
            }
            if(isDouble(txtProDesc.getText()) || isInteger(txtProDesc.getText())){
                txtProDesc.setText("");
                throw new IllegalArgumentException("A descrição não pode ser número!");
            }
            
            if(!isDouble(txtProPreco.getText()) && !isInteger(txtProPreco.getText())){
                txtProPreco.setText("");
                throw new IllegalArgumentException("Insira um valor válido em preço!");
            }
            if(!isInteger(txtProEstoque.getText())){
                txtProEstoque.setText("");
                throw new IllegalArgumentException("Insira um valor válido em Estoque!");
            }
            
            nome = txtProNome.getText();
            desc = txtProDesc.getText();
            preco = Double.parseDouble(txtProPreco.getText());
            qtdeEs = Integer.parseInt(txtProEstoque.getText());
            
            insertProduto();
            limparCampos();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
   
    private void limparCampos(){
        txtProNome.setText("");
        txtProDesc.setText("");
        txtProPreco.setText("");
        txtProEstoque.setText("");
    }

    private static boolean isDouble(String str){
        try {
            Double.valueOf(str); 
            return true;
        } 
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isInteger(String str){
        try{
            Integer.valueOf(str);
            return true;
        }
        catch(NumberFormatException nfe){
            return false;
        }
    }
    
    private void insertProduto(){
        try{
            PreparedStatement statement = null;
            statement = conec.prepareStatement(Consts.INSERT_TBPRODUTO);
            
            statement.setString(1, nome);
            statement.setString(2, desc);
            statement.setDouble(3, preco);
            statement.setInt(4, qtdeEs);
            
            statement.executeUpdate();
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void temaClaro() {
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().setForeground(Color.black);
        lblNome.setBackground(Color.white);
        lblDesc.setBackground(Color.white);
        lblPreco.setBackground(Color.white);
        lblEstoque.setBackground(Color.white);
        lblNome.setForeground(Color.black);
        lblDesc.setForeground(Color.black);
        lblPreco.setForeground(Color.black);
        lblEstoque.setForeground(Color.black);
        txtProNome.setBackground(Color.white);
        txtProDesc.setBackground(Color.white);
        txtProPreco.setBackground(Color.white);
        txtProEstoque.setBackground(Color.white);
        txtProNome.setForeground(Color.black);
        txtProDesc.setForeground(Color.black);
        txtProPreco.setForeground(Color.black);
        txtProEstoque.setForeground(Color.black);
        btnSalvar.setBackground(Color.white);
        btnLimpar.setBackground(Color.white);
        btnSalvar.setForeground(Color.black);
        btnLimpar.setForeground(Color.black);
        pnlCriar.setBackground(Color.white);
        pnlBotoes.setBackground(Color.white);
        pnlCriar.setForeground(Color.black);
        pnlBotoes.setForeground(Color.black);
        //bordas
        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botões", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setForeground(Color.white);
        lblNome.setBackground(Color.darkGray);
        lblDesc.setBackground(Color.darkGray);
        lblPreco.setBackground(Color.darkGray);
        lblEstoque.setBackground(Color.darkGray);
        lblNome.setForeground(Color.white);
        lblDesc.setForeground(Color.white);
        lblPreco.setForeground(Color.white);
        lblEstoque.setForeground(Color.white);
        txtProNome.setBackground(Color.darkGray);
        txtProDesc.setBackground(Color.darkGray);
        txtProPreco.setBackground(Color.darkGray);
        txtProEstoque.setBackground(Color.darkGray);
        txtProNome.setForeground(Color.white);
        txtProDesc.setForeground(Color.white);
        txtProPreco.setForeground(Color.white);
        txtProEstoque.setForeground(Color.white);
        btnSalvar.setBackground(Color.darkGray);
        btnLimpar.setBackground(Color.darkGray);
        btnSalvar.setForeground(Color.white);
        btnLimpar.setForeground(Color.white);
        pnlCriar.setBackground(Color.darkGray);
        pnlBotoes.setBackground(Color.darkGray);
        pnlCriar.setForeground(Color.white);
        pnlBotoes.setForeground(Color.white);
        //bordas
        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botões", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCriar;
    private javax.swing.JTextField txtProDesc;
    private javax.swing.JTextField txtProEstoque;
    private javax.swing.JTextField txtProNome;
    private javax.swing.JTextField txtProPreco;
    // End of variables declaration//GEN-END:variables
}
