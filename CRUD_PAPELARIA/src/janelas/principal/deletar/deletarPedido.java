package janelas.principal.deletar;

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

public final class deletarPedido extends javax.swing.JFrame implements Temas{
    private final int tema;
    private final Connection conec;
    
    public deletarPedido(Connection conec, int tema) {
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
        tblPedidos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e){
                    cmBoxItens.setSelectedIndex(tblPedidos.getSelectedRow());
                }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmBoxItens = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Pedido");
        setResizable(false);

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

        jLabel1.setText("Selecione o pedido que deseja apagar:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmBoxItens)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Data", "Produtos", "Quantidades", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblPedidos);

        jLabel2.setText("P.R.:Produtos Removidos!");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmBoxItensItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmBoxItensItemStateChanged
        tblPedidos.getSelectionModel().setSelectionInterval(cmBoxItens.getSelectedIndex(), cmBoxItens.getSelectedIndex());
    }//GEN-LAST:event_cmBoxItensItemStateChanged

    private void cmBoxItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxItensActionPerformed
        //unused
    }//GEN-LAST:event_cmBoxItensActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int escolha = JOptionPane.showConfirmDialog(this, "Deseja apagar mesmo?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(escolha == JOptionPane.YES_OPTION){
            //execute query
            try{
                PreparedStatement statement;
                statement = conec.prepareStatement(Consts.APAGAR_PEDIDO);

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

    private void atualizarTabela(){
        DefaultTableModel tabelaPedidos = 
                                      (DefaultTableModel) tblPedidos.getModel();
        
        tabelaPedidos.setNumRows(0);
        cmBoxItens.removeAllItems();
        
        ResultSet consu = null;
        
        try{
            consu = conec.createStatement().executeQuery(Consts.SUBTOTAL_CLIENTE);
            
            while(consu.next()){
                Object[] pedidos = new Object[]{
                    consu.getInt(Consts.PED_CODIGO),
                    consu.getString(Consts.PED_NOME_CLIENTE),
                    consu.getDate(Consts.PED_DATA_PEDIDO),
                    null,
                    null,
                    consu.getDouble(Consts.SUBTOTAL)
                };
                if(consu.getString(Consts.PRODUTOS) == null ||
                        consu.getString(Consts.QUANTIDADES).length() > consu.getString(Consts.PRODUTOS).length()){
                    pedidos[3] = "P.R.";
                    pedidos[4] = "P.R.";
                }
                else{
                    pedidos[3] = consu.getString(Consts.PRODUTOS);
                    pedidos[4] = consu.getString(Consts.QUANTIDADES);
                }
                cmBoxItens.addItem(consu.getString(Consts.PED_CODIGO));
                tabelaPedidos.addRow(pedidos);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
