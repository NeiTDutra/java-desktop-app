// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CadastroUsuario extends JPanel
{
    private JButton jButtonCadastrar;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabelNome;
    private JLabel jLabelRepSenha;
    private JLabel jLabelSenha;
    private JPanel jPanel1;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldRepSenha;
    private JTextField jTextFieldSenha;
    
    public CadastroUsuario() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelNome = new JLabel();
        this.jLabelSenha = new JLabel();
        this.jLabelRepSenha = new JLabel();
        this.jTextFieldNome = new JTextField();
        this.jTextFieldSenha = new JTextField();
        this.jTextFieldRepSenha = new JTextField();
        this.jButtonCadastrar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Cadastro de Usu\u00e1rio", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanel1.setAlignmentX(0.0f);
        this.jPanel1.setAlignmentY(0.0f);
        this.jPanel1.setAutoscrolls(true);
        this.jPanel1.setDoubleBuffered(false);
        this.jPanel1.setFocusCycleRoot(true);
        this.jLabelNome.setText("Nome:");
        this.jLabelSenha.setText("Senha:");
        this.jLabelRepSenha.setText("Repita a Senha:");
        this.jButtonCadastrar.setText("Cadastrar");
        this.jButtonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                CadastroUsuario.this.jButtonCadastrarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                CadastroUsuario.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jLabel1.setText("By ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(70, 70, 70).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jLabelNome)).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jLabelSenha)).addComponent(this.jLabelRepSenha)).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jButtonCadastrar).addGap(18, 18, 18).addComponent(this.jButtonLimpar)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldNome, -2, 218, -2).addComponent(this.jTextFieldSenha, -2, 218, -2).addComponent(this.jTextFieldRepSenha, -2, 218, -2)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1))).addGap(104, 104, 104)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelNome)).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelSenha)).addComponent(this.jTextFieldSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelRepSenha)).addComponent(this.jTextFieldRepSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonCadastrar).addComponent(this.jButtonLimpar)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, 32767).addComponent(this.jLabel1).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767)));
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldNome.setText("");
        this.jTextFieldSenha.setText("");
        this.jTextFieldRepSenha.setText("");
    }
    
    private void jButtonCadastrarActionPerformed(final ActionEvent evt) {
        final Usuario usu = new Usuario();
        usu.setNome(this.jTextFieldNome.getText());
        usu.setSenha(this.jTextFieldSenha.getText());
        if (!this.jTextFieldSenha.getText().equals(this.jTextFieldRepSenha.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas est\u00e3o diferentes !", "Erro", 0);
        }
        else {
            if (this.jTextFieldNome.getText().isEmpty() || this.jTextFieldSenha.getText().isEmpty() || this.jTextFieldRepSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro", 0);
                this.jTextFieldNome.setText("");
                this.jTextFieldSenha.setText("");
                this.jTextFieldRepSenha.setText("");
            }
            else {
                final UsuarioDAO dao = new UsuarioDAO();
                dao.add(usu);
                JOptionPane.showMessageDialog(null, "Usu\u00e1rio " + this.jTextFieldNome.getText() + " inserido com sucesso! ", "Informa", 1);
            }
            this.jTextFieldNome.setText("");
            this.jTextFieldSenha.setText("");
            this.jTextFieldRepSenha.setText("");
        }
    }
}
