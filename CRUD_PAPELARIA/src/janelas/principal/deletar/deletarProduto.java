package janelas.principal.deletar;

import java.sql.Connection;
import constantes.Consts;
import interfaces.Temas;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public final class deletarProduto extends javax.swing.JFrame implements Temas{
    private final int tema;
    private final Connection conec;
    
    public deletarProduto(Connection conec, int tema) {
        this.conec = conec;
        this.tema = tema;
        
        initComponents();
        
        if(this.tema == Consts.TEMA_CLARO){
            temaClaro();
        }
        else if(this.tema == Consts.TEMA_ESCURO){
            temaEscuro();
        }
        
        atualizarTabela();
        
        //evento para selecionar item na tabela
        tblProdutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                cmBoxItens.setSelectedIndex(tblProdutos.getSelectedRow());
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProdutos = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        pnlApagar = new javax.swing.JPanel();
        cmBoxItens = new javax.swing.JComboBox<>();
        lblEscolha = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Produto");
        setResizable(false);

        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Preço", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblProdutos);

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlApagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Apagar"));

        cmBoxItens.setFocusable(false);
        cmBoxItens.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmBoxItensItemStateChanged(evt);
            }
        });
        cmBoxItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBoxItensActionPerformed(evt);
            }
        });

        lblEscolha.setText("Selecione o Produto que deseja apagar:");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnDeletar.setText("Apagar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlApagarLayout = new javax.swing.GroupLayout(pnlApagar);
        pnlApagar.setLayout(pnlApagarLayout);
        pnlApagarLayout.setHorizontalGroup(
            pnlApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        pnlApagarLayout.setVerticalGroup(
            pnlApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApagarLayout.createSequentialGroup()
                .addGroup(pnlApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmBoxItens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblEscolha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       int escolha = JOptionPane.showConfirmDialog(this, "Deseja apagar mesmo?", "Confirmar", JOptionPane.YES_NO_OPTION);
       if(escolha == JOptionPane.YES_OPTION){
           //execute query
           try{
               PreparedStatement statement;
               statement = conec.prepareStatement(Consts.APAGAR_PRODUTO);
               
               statement.setString(1, cmBoxItens.getSelectedItem().toString());
               statement.executeUpdate();
               
               atualizarTabela();
               
           }
           catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
           
       }
       //se for não o programa não faz nada!
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void cmBoxItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxItensActionPerformed
        //unused
    }//GEN-LAST:event_cmBoxItensActionPerformed

    private void cmBoxItensItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmBoxItensItemStateChanged
        tblProdutos.getSelectionModel().setSelectionInterval(cmBoxItens.getSelectedIndex(), cmBoxItens.getSelectedIndex());
    }//GEN-LAST:event_cmBoxItensItemStateChanged

    private void atualizarTabela(){
        DefaultTableModel tabelaProdutos = 
                                      (DefaultTableModel) tblProdutos.getModel();
        
        tabelaProdutos.setNumRows(0);
        cmBoxItens.removeAllItems();
        
        ResultSet consu = null;
        
        //consu
        try{
            consu = conec.createStatement().executeQuery(Consts.TODOS_OS_PRODUTOS);
            while(consu.next()){
                Object[] produtos = new Object[]{
                    consu.getInt(Consts.PRO_CODIGO),
                    consu.getString(Consts.PRO_NOME),
                    consu.getString(Consts.PRO_DESCRICAO),
                    consu.getDouble(Consts.PRO_PRECO),
                    consu.getInt(Consts.PRO_QUANTIDADE_ESTOQUE)
                };
                cmBoxItens.addItem(consu.getString(Consts.PRO_CODIGO));
                tabelaProdutos.addRow(produtos);
            }
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void temaClaro() {
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().setForeground(Color.black);
        lblEscolha.setBackground(Color.white);
        btnDeletar.setBackground(Color.white);
        cmBoxItens.setBackground(Color.white);
        jScrollPane.setBackground(Color.white);
        tblProdutos.setBackground(Color.white);
        pnlApagar.setBackground(Color.white);
        pnlProdutos.setBackground(Color.white);
        lblEscolha.setForeground(Color.black);
        btnDeletar.setForeground(Color.black);
        cmBoxItens.setForeground(Color.black);
        jScrollPane.setForeground(Color.black);
        tblProdutos.setForeground(Color.black);
        pnlApagar.setForeground(Color.black);
        pnlProdutos.setForeground(Color.black);
        //bordas panel
        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlApagar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apagar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setForeground(Color.white);
        lblEscolha.setBackground(Color.darkGray);
        btnDeletar.setBackground(Color.darkGray);
        cmBoxItens.setBackground(Color.darkGray);
        jScrollPane.setBackground(Color.darkGray);
        tblProdutos.setBackground(Color.darkGray);
        pnlApagar.setBackground(Color.darkGray);
        pnlProdutos.setBackground(Color.darkGray);
        lblEscolha.setForeground(Color.white);
        btnDeletar.setForeground(Color.white);
        cmBoxItens.setForeground(Color.white);
        jScrollPane.setForeground(Color.white);
        tblProdutos.setForeground(Color.white);
        pnlApagar.setForeground(Color.white);
        pnlProdutos.setForeground(Color.white);
        //bordas panel
        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlApagar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apagar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> cmBoxItens;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JPanel pnlApagar;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}