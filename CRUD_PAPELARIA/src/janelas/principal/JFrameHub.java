package janelas.principal;

import constantes.Consts;
import interfaces.Temas;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import janelas.loginbd.JFrameConexaoInicial;
import janelas.principal.alterar.alterarProduto;
import janelas.principal.criar.criarPedido;
import janelas.principal.criar.criarProduto;
import janelas.principal.deletar.deletarPedido;
import janelas.principal.exibir.exibirProduto;
import janelas.principal.exibir.exibirPedido;
import janelas.principal.deletar.deletarProduto;
import java.awt.Color;
import java.sql.SQLException;


public final class JFrameHub extends javax.swing.JFrame implements Temas{
    private final Connection conec;
    private final int tema;
    
    public JFrameHub(Connection conec, int tema) {
        this.conec = conec;
        this.tema = tema;
        
        initComponents();
        
        if(this.tema == Consts.TEMA_CLARO){
            temaClaro();
        }
        else if(this.tema == Consts.TEMA_ESCURO){
            temaEscuro();
        }
        
        
        txtStatus.setText("Conectado");
        
        //setar uma hora e data inicial. "só fiz isso pq quando a janela abria o campo de texto ficava em branco por 1 segundo."
        SimpleDateFormat horarioForm = new SimpleDateFormat("HH:mm:ss");
        String horarioAtual = horarioForm.format(new Date());
        SimpleDateFormat dataForm = new SimpleDateFormat("dd/MM/yyyy");
        String dataAtual = dataForm.format(new Date());
        
        txtData.setText(dataAtual);
        txtHora.setText(horarioAtual); 
        
        //evento para atualizar o horario e data
        SwingUtilities.invokeLater(() -> { //função lambda
            // cria um evento para iniciar o timer para atualizar o horário e a data a cada segundo
            Timer timer = new Timer(1000, (ActionEvent e) -> {
                atualizarDataHora(txtHora, txtData);
            });
            timer.start();
            
            // criar um evento para parar o timer quando a janela for fechada
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    timer.stop();
                }
            });
        });
        
        //muda o evento de fechamento da janela para voltar pra tela inicial!
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                finalizarConnection(conec);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnlHub = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        pnlDesconectar = new javax.swing.JPanel();
        btnDesconectar = new javax.swing.JButton();
        pnlCriar = new javax.swing.JPanel();
        btnCriarProduto = new javax.swing.JButton();
        btnCriarPedido = new javax.swing.JButton();
        pnlExibir = new javax.swing.JPanel();
        btnExibirProdutos = new javax.swing.JButton();
        btnExibirPedido = new javax.swing.JButton();
        pnlAlterar = new javax.swing.JPanel();
        btnAlterarProduto = new javax.swing.JButton();
        pnlDeletar = new javax.swing.JPanel();
        btnApagarPedido = new javax.swing.JButton();
        btnApagarProduto = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hub");
        setResizable(false);

        pnlHub.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Principal"));

        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        txtHora.setEditable(false);

        lblHora.setText("Hora:");

        lblData.setText("Data:");

        txtData.setEditable(false);

        txtStatus.setEditable(false);

        lblStatus.setText("Status:");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDesconectar.setBorder(javax.swing.BorderFactory.createTitledBorder("Desconectar"));

        btnDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/desconectar_icon.png"))); // NOI18N
        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDesconectarLayout = new javax.swing.GroupLayout(pnlDesconectar);
        pnlDesconectar.setLayout(pnlDesconectarLayout);
        pnlDesconectarLayout.setHorizontalGroup(
            pnlDesconectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesconectarLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnDesconectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDesconectarLayout.setVerticalGroup(
            pnlDesconectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesconectarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar"));

        btnCriarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/criarProduto_icon.png"))); // NOI18N
        btnCriarProduto.setText("Produto");
        btnCriarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarProdutoActionPerformed(evt);
            }
        });

        btnCriarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/criarPedido_icon.png"))); // NOI18N
        btnCriarPedido.setText("Pedido");
        btnCriarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCriarLayout = new javax.swing.GroupLayout(pnlCriar);
        pnlCriar.setLayout(pnlCriarLayout);
        pnlCriarLayout.setHorizontalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCriarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCriarLayout.setVerticalGroup(
            pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlExibir.setBorder(javax.swing.BorderFactory.createTitledBorder("Exibir"));

        btnExibirProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/listar_icon.png"))); // NOI18N
        btnExibirProdutos.setText("Produto");
        btnExibirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirProdutosActionPerformed(evt);
            }
        });

        btnExibirPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/listar_icon.png"))); // NOI18N
        btnExibirPedido.setText("Pedido");
        btnExibirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExibirLayout = new javax.swing.GroupLayout(pnlExibir);
        pnlExibir.setLayout(pnlExibirLayout);
        pnlExibirLayout.setHorizontalGroup(
            pnlExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExibirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExibirProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExibirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlExibirLayout.setVerticalGroup(
            pnlExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExibirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExibirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExibirProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/alterarProduto_icon.png"))); // NOI18N
        btnAlterarProduto.setText("Produto");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlterarLayout = new javax.swing.GroupLayout(pnlAlterar);
        pnlAlterar.setLayout(pnlAlterarLayout);
        pnlAlterarLayout.setHorizontalGroup(
            pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlterarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        pnlAlterarLayout.setVerticalGroup(
            pnlAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder("Apagar"));

        btnApagarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnApagarPedido.setText("Pedido");
        btnApagarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarPedidoActionPerformed(evt);
            }
        });

        btnApagarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hub/apagar_icon.png"))); // NOI18N
        btnApagarProduto.setText("Produto");
        btnApagarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDeletarLayout = new javax.swing.GroupLayout(pnlDeletar);
        pnlDeletar.setLayout(pnlDeletarLayout);
        pnlDeletarLayout.setHorizontalGroup(
            pnlDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnApagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDeletarLayout.setVerticalGroup(
            pnlDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnApagarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHubLayout = new javax.swing.GroupLayout(pnlHub);
        pnlHub.setLayout(pnlHubLayout);
        pnlHubLayout.setHorizontalGroup(
            pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHubLayout.createSequentialGroup()
                .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHubLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlHubLayout.setVerticalGroup(
            pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        finalizarConnection(conec);
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnExibirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirProdutosActionPerformed
        new exibirProduto(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnExibirProdutosActionPerformed

    private void btnExibirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirPedidoActionPerformed
        new exibirPedido(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnExibirPedidoActionPerformed

    private void btnApagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarProdutoActionPerformed
        new deletarProduto(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnApagarProdutoActionPerformed
    
    private void btnApagarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarPedidoActionPerformed
        new deletarPedido(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnApagarPedidoActionPerformed

    private void btnCriarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarProdutoActionPerformed
        new criarProduto(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnCriarProdutoActionPerformed

    private void btnCriarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPedidoActionPerformed
        new criarPedido(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnCriarPedidoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        new alterarProduto(conec, tema).setVisible(true);
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void atualizarDataHora(JTextField txtHorario, JTextField txtData) {
        // Obter o horário atual
        SimpleDateFormat horarioForm = new SimpleDateFormat("HH:mm:ss");
        String horarioAtual = horarioForm.format(new Date());
        SimpleDateFormat dataForm = new SimpleDateFormat("dd/MM/yyyy");
        String dataAtual = dataForm.format(new Date());

        // Atualizar o rótulo na EDT "EDT é uma thread dedicada para manipulação de eventos de interface gráfica em aplicativos Swing."
        SwingUtilities.invokeLater(() -> {
            txtHorario.setText(horarioAtual);
            txtData.setText(dataAtual);
        });
    }
    
    private void finalizarConnection(Connection conec){
       try{
           if(conec != null){
               conec.close();
               dispose();
               new JFrameConexaoInicial(tema).setVisible(true); //volta pra tela inicial!
           }
       }
       catch(SQLException sqlE){
           JOptionPane.showMessageDialog(this, "Erro: " + sqlE.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    @Override
    public void temaClaro() {
        this.getContentPane().setBackground(Color.white);    
        this.getContentPane().setForeground(Color.black);
        lblStatus.setBackground(Color.white);
        lblData.setBackground(Color.white);
        lblHora.setBackground(Color.white);
        lblStatus.setForeground(Color.black);
        lblData.setForeground(Color.black);
        lblHora.setForeground(Color.black);
        txtStatus.setBackground(Color.white);
        txtData.setBackground(Color.white);
        txtHora.setBackground(Color.white);
        txtStatus.setForeground(Color.black);
        txtData.setForeground(Color.black);
        txtHora.setForeground(Color.black);
        btnDesconectar.setBackground(Color.white);
        btnCriarProduto.setBackground(Color.white);
        btnCriarPedido.setBackground(Color.white);
        btnAlterarProduto.setBackground(Color.white);
        btnExibirProdutos.setBackground(Color.white);
        btnExibirPedido.setBackground(Color.white);
        btnApagarProduto.setBackground(Color.white);
        btnApagarPedido.setBackground(Color.white);
        btnDesconectar.setForeground(Color.black);
        btnCriarProduto.setForeground(Color.black);
        btnCriarPedido.setForeground(Color.black);
        btnAlterarProduto.setForeground(Color.black);
        btnExibirProdutos.setForeground(Color.black);
        btnExibirPedido.setForeground(Color.black);
        btnApagarProduto.setForeground(Color.black);
        btnApagarPedido.setForeground(Color.black);
        pnlHub.setBackground(Color.white);
        pnlInfo.setBackground(Color.white);
        pnlDesconectar.setBackground(Color.white);
        pnlCriar.setBackground(Color.white);
        pnlAlterar.setBackground(Color.white);
        pnlExibir.setBackground(Color.white);
        pnlDeletar.setBackground(Color.white);
        pnlHub.setForeground(Color.black);
        pnlInfo.setForeground(Color.black);
        pnlDesconectar.setForeground(Color.black);
        pnlCriar.setForeground(Color.black);
        pnlAlterar.setForeground(Color.black);
        pnlExibir.setForeground(Color.black);
        pnlDeletar.setForeground(Color.black);
        pnlHub.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlDesconectar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desconectar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlExibir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exibir", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        pnlDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deletar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);    
        this.getContentPane().setForeground(Color.white);
        lblStatus.setBackground(Color.darkGray);
        lblData.setBackground(Color.darkGray);
        lblHora.setBackground(Color.darkGray);
        lblStatus.setForeground(Color.white);
        lblData.setForeground(Color.white);
        lblHora.setForeground(Color.white);
        txtStatus.setBackground(Color.darkGray);
        txtData.setBackground(Color.darkGray);
        txtHora.setBackground(Color.darkGray);
        txtStatus.setForeground(Color.white);
        txtData.setForeground(Color.white);
        txtHora.setForeground(Color.white);
        btnDesconectar.setBackground(Color.darkGray);
        btnCriarProduto.setBackground(Color.darkGray);
        btnCriarPedido.setBackground(Color.darkGray);
        btnAlterarProduto.setBackground(Color.darkGray);
        btnExibirProdutos.setBackground(Color.darkGray);
        btnExibirPedido.setBackground(Color.darkGray);
        btnApagarProduto.setBackground(Color.darkGray);
        btnApagarPedido.setBackground(Color.darkGray);
        btnDesconectar.setForeground(Color.white);
        btnCriarProduto.setForeground(Color.white);
        btnCriarPedido.setForeground(Color.white);
        btnAlterarProduto.setForeground(Color.white);
        btnExibirProdutos.setForeground(Color.white);
        btnExibirPedido.setForeground(Color.white);
        btnApagarProduto.setForeground(Color.white);
        btnApagarPedido.setForeground(Color.white);
        pnlHub.setBackground(Color.darkGray);
        pnlInfo.setBackground(Color.darkGray);
        pnlDesconectar.setBackground(Color.darkGray);
        pnlCriar.setBackground(Color.darkGray);
        pnlAlterar.setBackground(Color.darkGray);
        pnlExibir.setBackground(Color.darkGray);
        pnlDeletar.setBackground(Color.darkGray);
        pnlHub.setForeground(Color.white);
        pnlInfo.setForeground(Color.white);
        pnlDesconectar.setForeground(Color.white);
        pnlCriar.setForeground(Color.white);
        pnlAlterar.setForeground(Color.white);
        pnlExibir.setForeground(Color.white);
        pnlDeletar.setForeground(Color.white);
        pnlHub.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlDesconectar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desconectar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255,255, 255)));
        pnlCriar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlExibir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exibir", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        pnlDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deletar", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnApagarPedido;
    private javax.swing.JButton btnApagarProduto;
    private javax.swing.JButton btnCriarPedido;
    private javax.swing.JButton btnCriarProduto;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnExibirPedido;
    private javax.swing.JButton btnExibirProdutos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlAlterar;
    private javax.swing.JPanel pnlCriar;
    private javax.swing.JPanel pnlDeletar;
    private javax.swing.JPanel pnlDesconectar;
    private javax.swing.JPanel pnlExibir;
    private javax.swing.JPanel pnlHub;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
