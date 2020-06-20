// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import dao.ClienteDAO;
import javax.swing.JOptionPane;
import modelo.Cliente;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ExcluiCliente extends JPanel
{
    private JButton jButtonConsultar;
    private JButton jButtonExclui;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabelCidade;
    private JLabel jLabelCpf;
    private JLabel jLabelEmail;
    private JLabel jLabelEndereco;
    private JLabel jLabelId;
    private JLabel jLabelNome;
    private JLabel jLabelObs;
    private JLabel jLabelTelefone;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaObs;
    private JTextField jTextFieldCidade;
    private JTextField jTextFieldCpf;
    private JTextField jTextFieldEmail;
    private JTextField jTextFieldEndereco;
    private JTextField jTextFieldId;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldTelefone;
    
    public ExcluiCliente() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelNome = new JLabel();
        this.jLabelTelefone = new JLabel();
        this.jLabelEndereco = new JLabel();
        this.jLabelCidade = new JLabel();
        this.jLabelObs = new JLabel();
        this.jLabelCpf = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldCpf = new JTextField();
        this.jTextFieldNome = new JTextField();
        this.jTextFieldTelefone = new JTextField();
        this.jTextFieldEndereco = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jLabelEmail = new JLabel();
        this.jTextFieldEmail = new JTextField();
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jTextFieldCidade = new JTextField();
        this.jButtonExclui = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Exclus\u00e3o de Cliente", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanel1.setAutoscrolls(true);
        this.jPanel1.setFocusCycleRoot(true);
        this.jPanel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(final ComponentEvent evt) {
                ExcluiCliente.this.jPanel1formComponentResized(evt);
            }
        });
        this.jLabelId.setText("Id:");
        this.jLabelNome.setText("Nome:");
        this.jLabelTelefone.setText("Telefone:");
        this.jLabelEndereco.setText("Endere\u00e7o:");
        this.jLabelCidade.setText("Cidade:");
        this.jLabelObs.setText("Obs:");
        this.jLabelCpf.setText("Cpf:");
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setText("***************");
        this.jTextFieldCpf.setFocusCycleRoot(true);
        this.jTextFieldCpf.setVerifyInputWhenFocusTarget(false);
        this.jTextFieldTelefone.setEditable(false);
        this.jTextFieldTelefone.setText("*********************");
        this.jTextFieldEndereco.setEditable(false);
        this.jTextFieldEndereco.setText("************************************************************");
        this.jTextAreaObs.setEditable(false);
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jLabelEmail.setText("E-mail:");
        this.jTextFieldEmail.setEditable(false);
        this.jTextFieldEmail.setText("*****************************");
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiCliente.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiCliente.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jTextFieldCidade.setEditable(false);
        this.jTextFieldCidade.setText("******************************");
        this.jButtonExclui.setText("Excluir");
        this.jButtonExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiCliente.this.jButtonExcluiActionPerformed(evt);
            }
        });
        this.jLabel1.setText("By ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelCpf).addComponent(this.jLabelNome).addComponent(this.jLabelTelefone).addComponent(this.jLabelEndereco).addComponent(this.jLabelObs).addComponent(this.jLabelEmail).addComponent(this.jLabelCidade)).addGap(7, 7, 7)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldId, -2, 100, -2).addComponent(this.jTextFieldCpf, -2, 179, -2).addComponent(this.jTextFieldNome, -2, 490, -2).addComponent(this.jTextFieldTelefone, -2, 181, -2).addComponent(this.jTextFieldEndereco, -2, 490, -2).addComponent(this.jTextFieldCidade, -2, 242, -2).addComponent(this.jTextFieldEmail, -2, 242, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonExclui)).addComponent(this.jScrollPane1, -2, 480, -2))).addGap(46, 46, 46)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCpf).addComponent(this.jTextFieldCpf, -2, -1, -2)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelNome).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTelefone).addComponent(this.jTextFieldTelefone, -2, -1, -2)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelEndereco).addComponent(this.jTextFieldEndereco, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCidade).addComponent(this.jTextFieldCidade, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelEmail).addComponent(this.jTextFieldEmail, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(this.jLabelObs, -2, 30, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, -1, -2))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButtonExclui).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar))).addContainerGap(24, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel1).addContainerGap()))));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 700, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 511, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767))));
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Cliente cliente = new Cliente();
        cliente.setCpf(this.jTextFieldCpf.getText());
        cliente.setNome(this.jTextFieldNome.getText());
        this.jTextFieldId.setText("0");
        if (this.jTextFieldNome.getText().isEmpty() && this.jTextFieldCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Nome' ou 'CPF' v\u00e1lidos para pesquisar.");
        }
        else {
            final Cliente cli = new ClienteDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldCpf.getText(), this.jTextFieldNome.getText());
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos");
            }
            else {
                this.jTextFieldId.setText(Integer.toString(cli.getId()));
                this.jTextFieldCpf.setText(cli.getCpf());
                this.jTextFieldNome.setText(cli.getNome());
                this.jTextFieldEndereco.setText(cli.getEndereco());
                this.jTextFieldCidade.setText(cli.getCidade());
                this.jTextFieldTelefone.setText(cli.getTelefone());
                this.jTextFieldEmail.setText(cli.getEmail());
                this.jTextAreaObs.setText(cli.getObs());
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldId.setText("");
        this.jTextFieldNome.setText("");
        this.jTextFieldCpf.setText("");
        this.jTextFieldEndereco.setText("");
        this.jTextFieldCidade.setText("");
        this.jTextFieldTelefone.setText("");
        this.jTextFieldEmail.setText("");
        this.jTextAreaObs.setText("");
    }
    
    private void jPanel1formComponentResized(final ComponentEvent evt) {
    }
    
    private void jButtonExcluiActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldNome.getText().isEmpty() && this.jTextFieldCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Nome' ou 'CPF' v\u00e1lidos .", "Erro", 0);
        }
        else {
            final Cliente cli = new ClienteDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldCpf.getText(), this.jTextFieldNome.getText());
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
            }
            else {
                final int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir todos os dados de\n" + this.jTextFieldNome.getText() + " ?", "Aviso", 0);
                if (resp == 0) {
                    new ClienteDAO().exclui(this.jTextFieldCpf.getText(), this.jTextFieldNome.getText());
                    this.jTextFieldId.setText("");
                    this.jTextFieldNome.setText("");
                    this.jTextFieldCpf.setText("");
                    this.jTextFieldEndereco.setText("");
                    this.jTextFieldCidade.setText("");
                    this.jTextFieldTelefone.setText("");
                    this.jTextFieldEmail.setText("");
                    this.jTextAreaObs.setText("");
                    JOptionPane.showMessageDialog(null, "Cliente " + this.jTextFieldNome.getText() + " excluido do banco de dados.");
                }
                else {
                    this.jTextFieldId.setText(Integer.toString(cli.getId()));
                    this.jTextFieldCpf.setText(cli.getCpf());
                    this.jTextFieldNome.setText(cli.getNome());
                    this.jTextFieldEndereco.setText(cli.getEndereco());
                    this.jTextFieldCidade.setText(cli.getCidade());
                    this.jTextFieldTelefone.setText(cli.getTelefone());
                    this.jTextFieldEmail.setText(cli.getEmail());
                    this.jTextAreaObs.setText(cli.getObs());
                }
            }
        }
    }
}
