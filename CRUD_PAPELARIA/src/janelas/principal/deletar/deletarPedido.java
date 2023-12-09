package janelas.principal.deletar;

import constantes.Consts;
import interfaces.Temas;
import java.awt.Color;
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

        pnlApagar = new javax.swing.JPanel();
        cmBoxItens = new javax.swing.JComboBox<>();
        lblEscolha = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        pnlPedidos = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apagar Pedido");
        setResizable(false);

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

        lblEscolha.setText("Selecione o pedido que deseja apagar:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        pnlApagarLayout.setVerticalGroup(
            pnlApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApagarLayout.createSequentialGroup()
                .addGroup(pnlApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEscolha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmBoxItens)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pnlPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

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

        javax.swing.GroupLayout pnlPedidosLayout = new javax.swing.GroupLayout(pnlPedidos);
        pnlPedidos.setLayout(pnlPedidosLayout);
        pnlPedidosLayout.setHorizontalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPedidosLayout.setVerticalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //se for não o programa só volta para a janela anterior!
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
                    consu.getString(Consts.PED_DATA_PEDIDO),
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
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().setForeground(Color.black);
        lblEscolha.setBackground(Color.white);
        btnDeletar.setBackground(Color.white);
        cmBoxItens.setBackground(Color.white);
        jScrollPane.setBackground(Color.white);
        tblPedidos.setBackground(Color.white);
        pnlApagar.setBackground(Color.white);
        pnlPedidos.setBackground(Color.white);
        lblEscolha.setForeground(Color.black);
        btnDeletar.setForeground(Color.black);
        cmBoxItens.setForeground(Color.black);
        jScrollPane.setForeground(Color.black);
        tblPedidos.setForeground(Color.black);
        pnlApagar.setForeground(Color.black);
        pnlPedidos.setForeground(Color.black);
        //bordas panel
        pnlPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", 
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
        tblPedidos.setBackground(Color.darkGray);
        pnlApagar.setBackground(Color.darkGray);
        pnlPedidos.setBackground(Color.darkGray);
        lblEscolha.setForeground(Color.white);
        btnDeletar.setForeground(Color.white);
        cmBoxItens.setForeground(Color.white);
        jScrollPane.setForeground(Color.white);
        tblPedidos.setForeground(Color.white);
        pnlApagar.setForeground(Color.white);
        pnlPedidos.setForeground(Color.white);
        //bordas panel
        pnlPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", 
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
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
