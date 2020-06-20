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

public class ConsultaEstoque extends JPanel
{
    private JButton jButtonAnterior;
    private JButton jButtonConsultar;
    private JButton jButtonLimpar;
    private JButton jButtonProximo;
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
    
    public ConsultaEstoque() {
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
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jLabel1 = new JLabel();
        this.jButtonAnterior = new JButton();
        this.jButtonProximo = new JButton();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Consulta de produtos de Estoque", 2, 2, new Font("Andale Mono", 1, 18)));
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
                ConsultaEstoque.this.jTextFieldQuantEstActionPerformed(evt);
            }
        });
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaEstoque.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaEstoque.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jTextAreaObs.setEditable(false);
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setText("\n");
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jLabel1.setText("By ||=I");
        this.jButtonAnterior.setText("<< Anterior");
        this.jButtonAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaEstoque.this.jButtonAnteriorActionPerformed(evt);
            }
        });
        this.jButtonProximo.setText("Pr\u00f3ximo >>");
        this.jButtonProximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaEstoque.this.jButtonProximoActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelTipo)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldTipo, -2, 429, -2).addComponent(this.jTextFieldId, -2, 80, -2))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelQuantEst).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextFieldQuantEst, -2, 115, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelObs).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addGap(18, 18, 18).addComponent(this.jButtonAnterior).addGap(18, 18, 18).addComponent(this.jButtonProximo)).addComponent(this.jScrollPane1, -2, 419, -2))))).addGap(60, 60, 60)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTipo).addComponent(this.jTextFieldTipo, -2, -1, -2)).addGap(49, 49, 49)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelQuantEst).addComponent(this.jTextFieldQuantEst, -2, -1, -2))).addGap(70, 70, 70).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButtonAnterior).addComponent(this.jButtonProximo)).addGap(28, 28, 28).addComponent(this.jLabel1).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 626, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 461, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(19, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(19, 32767))));
    }
    
    private void jTextFieldQuantEstActionPerformed(final ActionEvent evt) {
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Estoque estoque = new Estoque();
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
    }
    
    private void jButtonProximoActionPerformed(final ActionEvent evt) {
        final Estoque est1 = new Estoque();
        est1.setId(Integer.parseInt(this.jTextFieldId.getText()));
        int i = Integer.parseInt(this.jTextFieldId.getText());
        ++i;
        this.jTextFieldId.setText(Integer.toString(i));
        this.jTextFieldTipo.setText("");
        this.jTextFieldQuantEst.setText("");
        final Estoque est2 = new EstoqueDAO().consulta(i, this.jTextFieldTipo.getText());
        if (est2 == null) {
            JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
        }
        else {
            this.jTextFieldId.setText(Integer.toString(est2.getId()));
            this.jTextFieldTipo.setText(est2.getTipo());
            this.jTextFieldQuantEst.setText(est2.getQuantEst());
            this.jTextAreaObs.setText(est2.getObs());
        }
    }
    
    private void jButtonAnteriorActionPerformed(final ActionEvent evt) {
        final Estoque est1 = new Estoque();
        est1.setId(Integer.parseInt(this.jTextFieldId.getText()));
        int i = Integer.parseInt(this.jTextFieldId.getText());
        --i;
        this.jTextFieldId.setText(Integer.toString(i));
        this.jTextFieldTipo.setText("");
        this.jTextFieldQuantEst.setText("");
        final Estoque est2 = new EstoqueDAO().consulta(i, this.jTextFieldTipo.getText());
        if (est2 == null) {
            JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
        }
        else {
            this.jTextFieldId.setText(Integer.toString(est2.getId()));
            this.jTextFieldTipo.setText(est2.getTipo());
            this.jTextFieldQuantEst.setText(est2.getQuantEst());
            this.jTextAreaObs.setText(est2.getObs());
        }
    }
}
