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
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AlteraCliente extends JPanel
{
    private JButton jButtonAlterar;
    private JButton jButtonConsultar;
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
    
    public AlteraCliente() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelCpf = new JLabel();
        this.jLabelNome = new JLabel();
        this.jLabelTelefone = new JLabel();
        this.jLabelEndereco = new JLabel();
        this.jLabelCidade = new JLabel();
        this.jLabelEmail = new JLabel();
        this.jLabelObs = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldCpf = new JTextField();
        this.jTextFieldNome = new JTextField();
        this.jTextFieldTelefone = new JTextField();
        this.jTextFieldEndereco = new JTextField();
        this.jTextFieldCidade = new JTextField();
        this.jTextFieldEmail = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jButtonAlterar = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Altera\u00e7\u00e3o de dados de Clientes", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jLabelId.setText("Id:");
        this.jLabelCpf.setText("Cpf:");
        this.jLabelNome.setText("Nome:");
        this.jLabelTelefone.setText("Telefone:");
        this.jLabelEndereco.setText("Endere\u00e7o:");
        this.jLabelCidade.setText("Cidade:");
        this.jLabelEmail.setText("E-mail:");
        this.jLabelObs.setText("Obs:");
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jTextFieldId.setText("*****************");
        this.jTextFieldId.setSelectedTextColor(Color.red);
        this.jTextFieldId.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraCliente.this.jTextFieldIdActionPerformed(evt);
            }
        });
        this.jTextFieldTelefone.setText("*******************");
        this.jTextFieldEndereco.setText("*******************************************************");
        this.jTextFieldCidade.setText("********************************");
        this.jTextFieldEmail.setText("***************************");
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setText("******************************************************");
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraCliente.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraCliente.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jButtonAlterar.setText("Alterar");
        this.jButtonAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraCliente.this.jButtonAlterarActionPerformed(evt);
            }
        });
        this.jLabel1.setText("by |=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelCpf).addComponent(this.jLabelNome).addComponent(this.jLabelTelefone).addComponent(this.jLabelEndereco).addComponent(this.jLabelCidade).addComponent(this.jLabelEmail).addComponent(this.jLabelObs).addComponent(this.jLabel1)).addGap(50, 50, 50).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonAlterar)).addComponent(this.jTextFieldCpf, -2, 203, -2).addComponent(this.jTextFieldNome, -2, 393, -2).addComponent(this.jTextFieldTelefone, -2, 165, -2).addComponent(this.jTextFieldEndereco, -1, 456, 32767).addComponent(this.jTextFieldCidade, -2, 265, -2).addComponent(this.jTextFieldEmail, -2, 225, -2).addComponent(this.jScrollPane1).addComponent(this.jTextFieldId, -2, -1, -2)).addContainerGap(47, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -1, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCpf).addComponent(this.jTextFieldCpf, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelNome).addComponent(this.jTextFieldNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTelefone).addComponent(this.jTextFieldTelefone, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelEndereco).addComponent(this.jTextFieldEndereco, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCidade).addComponent(this.jTextFieldCidade, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelEmail).addComponent(this.jTextFieldEmail, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addGroup(jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(this.jScrollPane1, -2, -1, -2))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButtonAlterar).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar))).addContainerGap(27, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel1).addContainerGap()))));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 674, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 560, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(20, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(21, 32767))));
    }
    
    private void jTextFieldIdActionPerformed(final ActionEvent evt) {
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Cliente cliente = new Cliente();
        cliente.setCpf(this.jTextFieldCpf.getText());
        cliente.setNome(this.jTextFieldNome.getText());
        if (this.jTextFieldNome.getText().isEmpty() && this.jTextFieldCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Nome' ou 'CPF' v\u00e1lidos para pesquisar.", "Erro", 0);
        }
        else {
            final Cliente cli = new ClienteDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldCpf.getText(), this.jTextFieldNome.getText());
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
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
    
    private void jButtonAlterarActionPerformed(final ActionEvent evt) {
        new ClienteDAO().altera(this.jTextFieldCpf.getText(), this.jTextFieldNome.getText(), this.jTextFieldTelefone.getText(), this.jTextFieldEndereco.getText(), this.jTextFieldCidade.getText(), this.jTextFieldEmail.getText(), this.jTextAreaObs.getText(), this.jTextFieldId.getText());
        JOptionPane.showMessageDialog(null, "Informa\u00e7\u00f5es de " + this.jTextFieldNome.getText() + ",\nalteradas no banco de dados", "Aviso", 1);
    }
}
