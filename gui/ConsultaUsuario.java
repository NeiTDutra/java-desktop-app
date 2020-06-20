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

public class ConsultaUsuario extends JPanel
{
    private JButton jButtonAnterior;
    private JButton jButtonConsultar;
    private JButton jButtonLimpar;
    private JButton jButtonProximo;
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
    
    public ConsultaUsuario() {
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
        this.jLabel1 = new JLabel();
        this.jButtonAnterior = new JButton();
        this.jButtonProximo = new JButton();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Consulta de Usu\u00e1rio", 2, 2, new Font("Andale Mono", 1, 18)));
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
                ConsultaUsuario.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaUsuario.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jLabelId.setText("Id:");
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jLabel1.setText("By ||=I");
        this.jButtonAnterior.setText("<< Anterior");
        this.jButtonAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaUsuario.this.jButtonAnteriorActionPerformed(evt);
            }
        });
        this.jButtonProximo.setText("Pr\u00f3ximo >>");
        this.jButtonProximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaUsuario.this.jButtonProximoActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGap(69, 69, 69).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabelId).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jLabelNome)).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jLabelSenha)).addComponent(this.jLabelRepSenha)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonConsultar))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldNome, -2, 218, -2).addComponent(this.jTextFieldSenha, -2, 218, -2).addComponent(this.jTextFieldRepSenha, -2, 218, -2).addComponent(this.jTextFieldId, -2, 87, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButtonAnterior).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButtonProximo))).addContainerGap(63, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelNome)).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelSenha)).addComponent(this.jTextFieldSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelRepSenha)).addComponent(this.jTextFieldRepSenha, -2, -1, -2)).addGap(47, 47, 47)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 194, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButtonAnterior).addComponent(this.jButtonProximo)))).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
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
    
    private void jButtonProximoActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldId.getText().isEmpty()) {
            this.jTextFieldId.setText("0");
        }
        final Usuario usu1 = new Usuario();
        usu1.setId(Integer.parseInt(this.jTextFieldId.getText()));
        int i = Integer.parseInt(this.jTextFieldId.getText());
        ++i;
        this.jTextFieldId.setText(Integer.toString(i));
        this.jTextFieldNome.setText("");
        this.jTextFieldSenha.setText("");
        final Usuario est = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
        if (est == null) {
            JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
        }
        else {
            this.jTextFieldId.setText(Integer.toString(est.getId()));
            this.jTextFieldNome.setText(est.getNome());
            this.jTextFieldSenha.setText(est.getSenha());
        }
    }
    
    private void jButtonAnteriorActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldId.getText().isEmpty()) {
            this.jTextFieldId.setText("0");
        }
        final Usuario usu1 = new Usuario();
        usu1.setId(Integer.parseInt(this.jTextFieldId.getText()));
        int i = Integer.parseInt(this.jTextFieldId.getText());
        --i;
        this.jTextFieldId.setText(Integer.toString(i));
        this.jTextFieldNome.setText("");
        this.jTextFieldSenha.setText("");
        final Usuario est = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
        if (est == null) {
            JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
        }
        else {
            this.jTextFieldId.setText(Integer.toString(est.getId()));
            this.jTextFieldNome.setText(est.getNome());
            this.jTextFieldSenha.setText(est.getSenha());
        }
    }
}
