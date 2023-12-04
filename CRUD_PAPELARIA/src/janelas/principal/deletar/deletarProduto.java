package janelas.principal.deletar;

import java.sql.Connection;
import constantes.Consts;
import interfaces.Temas;
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

        jPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmBoxItens = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Produto");
        setResizable(false);

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

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

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apagar"));

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

        jLabel1.setText("Selecione o Produto que deseja apagar:");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnDeletar.setText("Apagar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmBoxItens, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
        
    @Override
    public void temaEscuro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> cmBoxItens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}