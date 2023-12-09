package janelas.principal.exibir;

import java.sql.Connection;
import constantes.Consts;
import interfaces.Temas;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class exibirPedido extends javax.swing.JFrame implements Temas{
    private final int tema;
    private final Connection conec;

    public exibirPedido(Connection conec, int tema) {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPedido = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        lblLegenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);

        pnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

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

        lblLegenda.setText("P.R.:Produtos Removidos!");

        javax.swing.GroupLayout pnlPedidoLayout = new javax.swing.GroupLayout(pnlPedido);
        pnlPedido.setLayout(pnlPedidoLayout);
        pnlPedidoLayout.setHorizontalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(pnlPedidoLayout.createSequentialGroup()
                        .addComponent(lblLegenda)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPedidoLayout.setVerticalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidoLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLegenda)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void atualizarTabela(){
        DefaultTableModel tabelaPedidos = 
                                      (DefaultTableModel) tblPedidos.getModel();
        
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
        lblLegenda.setBackground(Color.white);
        lblLegenda.setForeground(Color.black);
        pnlPedido.setBackground(Color.white);
        pnlPedido.setForeground(Color.black);
        jScrollPane.setBackground(Color.white);
        jScrollPane.setForeground(Color.black);
        tblPedidos.setBackground(Color.white);
        tblPedidos.setForeground(Color.black);
        pnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setForeground(Color.white);
        lblLegenda.setBackground(Color.darkGray);
        lblLegenda.setForeground(Color.white);
        pnlPedido.setBackground(Color.darkGray);
        pnlPedido.setForeground(Color.white);
        jScrollPane.setBackground(Color.darkGray);
        jScrollPane.setForeground(Color.white);
        tblPedidos.setBackground(Color.darkGray);
        tblPedidos.setForeground(Color.white);
        pnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JPanel pnlPedido;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
