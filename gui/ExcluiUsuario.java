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

public class ExcluiUsuario extends JPanel
{
    private JButton jButtonConsultar;
    private JButton jButtonExcluir;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabelId;
    private JLabel jLabelNome;
    private JLabel jLabelRepSenha;
    private JLabel jLabelSenha;
    private JPanel jPanel1;
    private JTextField jTextFieldId;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldRepSenha;
    private JTextField jTextFieldSenha;
    
    public ExcluiUsuario() {
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
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jLabelId = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jButtonExcluir = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Exclus\u00e3o de Usu\u00e1rio", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanel1.setAlignmentX(0.0f);
        this.jPanel1.setAlignmentY(0.0f);
        this.jPanel1.setAutoscrolls(true);
        this.jPanel1.setDoubleBuffered(false);
        this.jPanel1.setFocusCycleRoot(true);
        this.jLabelNome.setText("Nome:");
        this.jLabelSenha.setText("Senha:");
        this.jLabelRepSenha.setText("Repita a Senha:");
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiUsuario.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiUsuario.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jLabelId.setText("Id:");
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jTextFieldId.setText("0");
        this.jButtonExcluir.setText("Excluir");
        this.jButtonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiUsuario.this.jButtonExcluirActionPerformed(evt);
            }
        });
        this.jLabel1.setText("By ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(69, 69, 69).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabelId).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jLabelNome)).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jLabelSenha)).addComponent(this.jLabelRepSenha)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1))).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldNome, -2, 218, -2).addComponent(this.jTextFieldSenha, -2, 218, -2).addComponent(this.jTextFieldRepSenha, -2, 218, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, 32767).addComponent(this.jButtonExcluir)).addComponent(this.jTextFieldId, -2, 87, -2)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelNome)).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelSenha)).addComponent(this.jTextFieldSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelRepSenha)).addComponent(this.jTextFieldRepSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButtonExcluir))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel1))).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(20, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(20, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767)));
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Usuario usu = new Usuario();
        usu.setNome(this.jTextFieldNome.getText());
        usu.setSenha(this.jTextFieldSenha.getText());
        if (this.jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome \npara consultar.");
            this.jTextFieldNome.setText("");
            this.jTextFieldSenha.setText("");
            this.jTextFieldRepSenha.setText("");
        }
        else {
            final Usuario usu2 = new UsuarioDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
            if (usu2 == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos");
            }
            else {
                this.jTextFieldId.setText(Integer.toString(usu2.getId()));
                this.jTextFieldNome.setText(usu2.getNome());
                this.jTextFieldSenha.setText(usu2.getSenha());
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldId.setText("");
        this.jTextFieldNome.setText("");
        this.jTextFieldSenha.setText("");
        this.jTextFieldRepSenha.setText("");
    }
    
    private void jButtonExcluirActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldNome.getText().isEmpty() && this.jTextFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Nome' ou 'Senha' v\u00e1lidos .");
        }
        else {
            final Usuario usu1 = new UsuarioDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
            if (usu1 == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos");
            }
            else {
                JOptionPane.showMessageDialog(null, "Tem certeza que quer excluir todos os dados de\n" + this.jTextFieldNome.getText() + " !");
                final Usuario dao = new UsuarioDAO().exclui(this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
            }
            this.jTextFieldId.setText("");
            this.jTextFieldNome.setText("");
            this.jTextFieldSenha.setText("");
            JOptionPane.showMessageDialog(null, "Usuario " + this.jTextFieldNome.getText() + "\n excluido do banco de dados.");
        }
    }
}
