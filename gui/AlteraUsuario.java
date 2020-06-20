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

public class AlteraUsuario extends JPanel
{
    private JButton jButton1;
    private JButton jButtonConsultar;
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
    
    public AlteraUsuario() {
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
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Altera\u00e7\u00e3o de Usu\u00e1rio", 2, 2, new Font("Andale Mono", 1, 18)));
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
                AlteraUsuario.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraUsuario.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jLabelId.setText("Id:");
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jTextFieldId.setText("0");
        this.jButton1.setText("Alterar");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraUsuario.this.jButton1ActionPerformed(evt);
            }
        });
        this.jLabel1.setText("By ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(69, 69, 69).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabelId).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jLabelNome)).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jLabelSenha)).addComponent(this.jLabelRepSenha)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1))).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldNome, -2, 218, -2).addComponent(this.jTextFieldSenha, -2, 218, -2).addComponent(this.jTextFieldRepSenha, -2, 218, -2)).addComponent(this.jTextFieldId, -2, 87, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1))).addContainerGap(92, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelNome)).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelSenha)).addComponent(this.jTextFieldSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabelRepSenha)).addComponent(this.jTextFieldRepSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButton1))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel1))).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(18, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(19, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767)));
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Usuario usu = new Usuario();
        usu.setNome(this.jTextFieldNome.getText());
        usu.setSenha(this.jTextFieldSenha.getText());
        if (this.jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Nome' v\u00e1lidos para pesquisar.", "Erro", 0);
            this.jTextFieldNome.setText("");
            this.jTextFieldSenha.setText("");
            this.jTextFieldRepSenha.setText("");
        }
        else {
            final Usuario usu2 = new UsuarioDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldNome.getText(), this.jTextFieldSenha.getText());
            if (usu2 == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
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
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        new UsuarioDAO().altera(this.jTextFieldNome.getText(), this.jTextFieldSenha.getText(), this.jTextFieldId.getText());
        JOptionPane.showMessageDialog(null, "Informa\u00e7\u00f5es de " + this.jTextFieldNome.getText() + ",\nalteradas no banco de dados", "Aviso", 1);
    }
}
