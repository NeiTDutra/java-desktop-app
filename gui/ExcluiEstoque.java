// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import dao.EstoqueDAO;
import javax.swing.JOptionPane;
import modelo.Estoque;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ExcluiEstoque extends JPanel
{
    private JButton jButtonConsultar;
    private JButton jButtonExclui;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabelId;
    private JLabel jLabelObs;
    private JLabel jLabelQuantEst;
    private JLabel jLabelTipo;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaObs;
    private JTextField jTextFieldId;
    private JTextField jTextFieldQuantEst;
    private JTextField jTextFieldTipo;
    
    public ExcluiEstoque() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelTipo = new JLabel();
        this.jLabelObs = new JLabel();
        this.jLabelQuantEst = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldTipo = new JTextField();
        this.jTextFieldQuantEst = new JTextField();
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jButtonExclui = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Exclus\u00e3o de produtos de Estoque", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jLabelId.setText("Id:");
        this.jLabelId.setInheritsPopupMenu(false);
        this.jLabelTipo.setText("Tipo:");
        this.jLabelTipo.setInheritsPopupMenu(false);
        this.jLabelObs.setText("Obs:");
        this.jLabelObs.setInheritsPopupMenu(false);
        this.jLabelQuantEst.setText("Quant. Estoque:");
        this.jLabelQuantEst.setInheritsPopupMenu(false);
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jTextFieldId.setText("0");
        this.jTextFieldQuantEst.setEditable(false);
        this.jTextFieldQuantEst.setText("*************");
        this.jTextFieldQuantEst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiEstoque.this.jTextFieldQuantEstActionPerformed(evt);
            }
        });
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiEstoque.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiEstoque.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jButtonExclui.setText("Excluir");
        this.jButtonExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ExcluiEstoque.this.jButtonExcluiActionPerformed(evt);
            }
        });
        this.jTextAreaObs.setEditable(false);
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setText("\n");
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jLabel1.setText("By ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(110, 110, 110).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelTipo)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldTipo, -2, 429, -2).addComponent(this.jTextFieldId, -2, 110, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelQuantEst).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextFieldQuantEst, -2, 115, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelObs).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonExclui)).addComponent(this.jScrollPane1))))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1))).addGap(121, 121, 121)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTipo).addComponent(this.jTextFieldTipo, -2, -1, -2)).addGap(59, 59, 59).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelQuantEst).addComponent(this.jTextFieldQuantEst, -2, -1, -2)).addGap(53, 53, 53).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(29, 29, 29).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButtonExclui)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 73, 32767).addComponent(this.jLabel1).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
    }
    
    private void jTextFieldQuantEstActionPerformed(final ActionEvent evt) {
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Estoque estoque = new Estoque();
        estoque.setObs(this.jTextAreaObs.getText());
        estoque.setQuantEst(this.jTextFieldQuantEst.getText());
        estoque.setTipo(this.jTextFieldTipo.getText());
        if (this.jTextFieldTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Tipo' v\u00e1lido para pesquisar.");
        }
        else {
            final Estoque est = new EstoqueDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldTipo.getText());
            if (est == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos");
            }
            else {
                this.jTextFieldId.setText(Integer.toString(est.getId()));
                this.jTextFieldTipo.setText(est.getTipo());
                this.jTextFieldQuantEst.setText(est.getQuantEst());
                this.jTextAreaObs.setText(est.getObs());
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldTipo.setText("");
        this.jTextAreaObs.setText("");
        this.jTextFieldQuantEst.setText("");
        this.jTextFieldId.setText("");
    }
    
    private void jButtonExcluiActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um Tipo para exclus\u00e3o");
        }
        else {
            final Estoque est = new EstoqueDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldTipo.getText());
            if (est == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Tem certeza que quer excluir todos os dados de\n" + this.jTextFieldTipo.getText() + ".");
                new EstoqueDAO().exclui(this.jTextFieldTipo.getText());
            }
            this.jTextAreaObs.setText("");
            this.jTextFieldId.setText("");
            this.jTextFieldTipo.setText("");
            this.jTextFieldQuantEst.setText("");
            JOptionPane.showMessageDialog(null, "Tipo " + this.jTextFieldTipo.getText() + "\n excluido do banco de dados.");
        }
    }
}
