package janelas.principal.exibir;

import java.sql.Connection;
import constantes.Consts;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class exibirPedido extends javax.swing.JFrame {
    private final Connection conec;

    public exibirPedido(Connection conec) {
        initComponents();
        this.conec = conec;
        
        DefaultTableModel tabelaPedidos = 
                                      (DefaultTableModel) tblPedidos.getModel();
        
        ResultSet consu1 = null, consu2 = null;
        
        try{
            consu1 = conec.createStatement().executeQuery(Consts.TODOS_OS_PEDIDOS);
            consu2 = conec.createStatement().executeQuery(Consts.SUBTOTAL_CLIENTE);
            
            while(consu1.next() && consu2.next()){
                Object[] pedidos = new Object[]{
                    consu1.getInt(Consts.PED_CODIGO),
                    consu1.getString(Consts.PED_NOME_CLIENTE),
                    consu1.getDate(Consts.PED_DATA_PEDIDO),
                    consu2.getString(Consts.PRODUTOS),
                    consu2.getString(Consts.QUANTIDADES),
                    consu2.getDouble(Consts.SUBTOTAL)
                };
                tabelaPedidos.addRow(pedidos);
            }
        }
        catch(SQLException sqlE){
            JOptionPane.showMessageDialog(null, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);

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

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
