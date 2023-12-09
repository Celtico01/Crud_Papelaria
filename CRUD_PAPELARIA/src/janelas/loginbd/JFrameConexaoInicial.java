package janelas.loginbd;

import constantes.Consts;
import java.sql.Connection;
import databaseconexao.Conexao;
import interfaces.Temas;
import janelas.principal.JFrameHub;
import java.awt.Color;
import javax.swing.JOptionPane;

public final class JFrameConexaoInicial extends javax.swing.JFrame implements Temas{
    private final int tema;
 
    public JFrameConexaoInicial(int tema) {
        this.tema = tema;
        
        initComponents();
        
        if(this.tema == Consts.TEMA_CLARO){
            temaClaro();
            comboBoxTema.setSelectedIndex(Consts.TEMA_CLARO);
        }
        else if(this.tema == Consts.TEMA_ESCURO){
            temaEscuro();
            comboBoxTema.setSelectedIndex(Consts.TEMA_ESCURO);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        checkBLoginSemSenha = new javax.swing.JCheckBox();
        comboBoxTema = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.black);
        setResizable(false);

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Usuário:");

        txtFUsuario.setText("root");
        txtFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/login_icon.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/limpar_icon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login/ajuda_icon.png"))); // NOI18N
        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        checkBLoginSemSenha.setText("Não uso senha.");
        checkBLoginSemSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBLoginSemSenhaActionPerformed(evt);
            }
        });

        comboBoxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Escuro" }));
        comboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTemaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tema:");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFUsuario))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(checkBLoginSemSenha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBLoginSemSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLimpar)
                    .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnLogin.getAccessibleContext().setAccessibleName("120");
        btnLimpar.getAccessibleContext().setAccessibleName("120");
        btnAjuda.getAccessibleContext().setAccessibleName("120");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtFUsuario.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        new JFrameAjuda(comboBoxTema.getSelectedIndex()).setVisible(true); //substituir por tema depois!
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(criarConexao().verificarDados() == true){
            new JFrameHub(criarConnection(), comboBoxTema.getSelectedIndex()).setVisible(true); //substituir pelo tema depois!
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Tente novamente, dados incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void checkBLoginSemSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBLoginSemSenhaActionPerformed
        if(checkBLoginSemSenha.isSelected()){
            txtPassword.setEditable(false);
            txtPassword.setEnabled(false);
            txtPassword.setText("");
        }
        else{
            txtPassword.setEditable(true);
            txtPassword.setEnabled(true);
        }
    }//GEN-LAST:event_checkBLoginSemSenhaActionPerformed

    private void txtFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFUsuarioActionPerformed
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtFUsuarioActionPerformed

    private void comboBoxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTemaActionPerformed
        if(comboBoxTema.getSelectedIndex() == Consts.TEMA_CLARO){
            temaClaro();
        }
        else if(comboBoxTema.getSelectedIndex() == Consts.TEMA_ESCURO){
            temaEscuro();
        }
    }//GEN-LAST:event_comboBoxTemaActionPerformed
    
    private Connection criarConnection(){
        Conexao conec = criarConexao();
        return conec.estabelecerConexao();
    }
    
    private Conexao criarConexao(){
        if(checkBLoginSemSenha.isSelected())
            return new Conexao(txtFUsuario.getText(), "");
        return new Conexao(txtFUsuario.getText(), String.valueOf(txtPassword.getPassword()));
    }
     
   @Override
    public void temaClaro() {
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().setForeground(Color.black);        
        pnlLogin.setBackground(Color.white);
        pnlLogin.setForeground(Color.black);
        jLabel1.setForeground(Color.black);
        jLabel2.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        txtFUsuario.setBackground(Color.white);
        txtPassword.setBackground(Color.white);
        txtFUsuario.setForeground(Color.black);
        txtPassword.setForeground(Color.black);
        comboBoxTema.setBackground(Color.white);
        comboBoxTema.setForeground(Color.black);
        checkBLoginSemSenha.setBackground(Color.white);
        checkBLoginSemSenha.setForeground(Color.black);
        btnLogin.setBackground(Color.white);
        btnLimpar.setBackground(Color.white);
        btnAjuda.setBackground(Color.white);
        btnLogin.setForeground(Color.black);
        btnLimpar.setForeground(Color.black);
        btnAjuda.setForeground(Color.black);
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(0, 0, 0)));
        comboBoxTema.setFocusable(false);
        
    }
        
    @Override
    public void temaEscuro() {
        this.getContentPane().setBackground(Color.darkGray);
        this.getContentPane().setForeground(Color.white);
        pnlLogin.setBackground(Color.darkGray);
        pnlLogin.setForeground(Color.white);
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        txtFUsuario.setBackground(Color.darkGray);
        txtPassword.setBackground(Color.darkGray);
        txtFUsuario.setForeground(Color.white);
        txtPassword.setForeground(Color.white);
        comboBoxTema.setBackground(Color.darkGray);
        comboBoxTema.setForeground(Color.white);
        checkBLoginSemSenha.setBackground(Color.darkGray);
        checkBLoginSemSenha.setForeground(Color.white);
        btnLogin.setBackground(Color.darkGray);
        btnLimpar.setBackground(Color.darkGray);
        btnAjuda.setBackground(Color.darkGray);
        btnLogin.setForeground(Color.white);
        btnLimpar.setForeground(Color.white);
        btnAjuda.setForeground(Color.white);
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Tahoma", 0, 24), 
                new java.awt.Color(255, 255, 255)));
        comboBoxTema.setFocusable(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBLoginSemSenha;
    private javax.swing.JComboBox<String> comboBoxTema;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtFUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
