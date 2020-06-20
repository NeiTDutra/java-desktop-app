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

public class AlteraEstoque extends JPanel
{
    private JButton jButtonAlterar;
    private JButton jButtonConsultar;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabelId;
    private JLabel jLabelObs;
    private JLabel jLabelQuantEst;
    private JLabel jLabelQuantSai;
    private JLabel jLabelTipo;
    private JLabel jLabelUltimaEntrada;
    private JLabel jLabelUltimaSaida;
    private JLabel jLabelquantEnt;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaObs;
    private JTextField jTextFieldId;
    private JTextField jTextFieldQuantEnt;
    private JTextField jTextFieldQuantEst;
    private JTextField jTextFieldQuantSai;
    private JTextField jTextFieldTipo;
    private JTextField jTextFieldUltimaEnt;
    private JTextField jTextFieldUltimaSai;
    
    public AlteraEstoque() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelTipo = new JLabel();
        this.jLabelObs = new JLabel();
        this.jLabelquantEnt = new JLabel();
        this.jLabelQuantSai = new JLabel();
        this.jLabelQuantEst = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldTipo = new JTextField();
        this.jTextFieldQuantEnt = new JTextField();
        this.jTextFieldQuantSai = new JTextField();
        this.jTextFieldQuantEst = new JTextField();
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jButtonAlterar = new JButton();
        this.jLabelUltimaEntrada = new JLabel();
        this.jTextFieldUltimaEnt = new JTextField();
        this.jLabelUltimaSaida = new JLabel();
        this.jTextFieldUltimaSai = new JTextField();
        this.jLabel1 = new JLabel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Altera\u00e7\u00e3o de produtos de Estoque", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jLabelId.setText("Id:");
        this.jLabelId.setInheritsPopupMenu(false);
        this.jLabelTipo.setText("Tipo:");
        this.jLabelTipo.setInheritsPopupMenu(false);
        this.jLabelObs.setText("Obs:");
        this.jLabelObs.setInheritsPopupMenu(false);
        this.jLabelquantEnt.setText("Quant. Entrada:");
        this.jLabelquantEnt.setInheritsPopupMenu(false);
        this.jLabelQuantSai.setText("Quant. Sa\u00edda:");
        this.jLabelQuantSai.setInheritsPopupMenu(false);
        this.jLabelQuantEst.setText("Quant. Estoque:");
        this.jLabelQuantEst.setInheritsPopupMenu(false);
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setHorizontalAlignment(0);
        this.jTextFieldId.setText("0");
        this.jTextFieldQuantEnt.setText("*************");
        this.jTextFieldQuantSai.setText("*************");
        this.jTextFieldQuantEst.setEditable(false);
        this.jTextFieldQuantEst.setText("*************");
        this.jTextFieldQuantEst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraEstoque.this.jTextFieldQuantEstActionPerformed(evt);
            }
        });
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraEstoque.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraEstoque.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setText("\n");
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jButtonAlterar.setText("Alterar");
        this.jButtonAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                AlteraEstoque.this.jButtonAlterarActionPerformed(evt);
            }
        });
        this.jLabelUltimaEntrada.setText("\u00daltima Entrada:");
        this.jTextFieldUltimaEnt.setEditable(false);
        this.jLabelUltimaSaida.setText("\u00daltima Sa\u00edda:");
        this.jTextFieldUltimaSai.setEditable(false);
        this.jLabel1.setText("By |=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(7, 7, 7).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabelquantEnt).addGap(18, 18, 18).addComponent(this.jTextFieldQuantEnt, -2, 113, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelUltimaEntrada).addComponent(this.jTextFieldUltimaEnt, -2, 124, -2).addComponent(this.jLabelUltimaSaida).addComponent(this.jTextFieldUltimaSai, -2, 124, -2)).addGap(93, 93, 93)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelQuantEst).addComponent(this.jLabelQuantSai)).addGap(15, 15, 15).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldQuantSai, -1, 115, 32767).addComponent(this.jTextFieldQuantEst))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelTipo)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldTipo, -2, 429, -2).addComponent(this.jTextFieldId, -2, 80, -2)))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabelObs).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButtonAlterar)).addComponent(this.jScrollPane1)))).addGap(76, 76, 76)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTipo).addComponent(this.jTextFieldTipo, -2, -1, -2)).addGap(53, 53, 53).addComponent(this.jLabelUltimaEntrada).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelquantEnt).addComponent(this.jTextFieldQuantEnt, -2, -1, -2).addComponent(this.jTextFieldUltimaEnt, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelQuantSai).addComponent(this.jTextFieldQuantSai, -2, -1, -2).addComponent(this.jLabelUltimaSaida)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextFieldUltimaSai, -2, -1, -2).addGap(33, 33, 33).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelQuantEst).addComponent(this.jTextFieldQuantEst, -2, -1, -2)).addGap(59, 59, 59).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButtonAlterar).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar))).addContainerGap(27, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 730, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(57, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(58, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 598, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767))));
    }
    
    private void jTextFieldQuantEstActionPerformed(final ActionEvent evt) {
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Estoque estoque = new Estoque();
        estoque.setTipo(this.jTextFieldTipo.getText());
        if (this.jTextFieldTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha com 'Tipo' v\u00e1lido para pesquisar.", "Erro", 0);
        }
        else {
            final Estoque est = new EstoqueDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldTipo.getText());
            if (est == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
            }
            else {
                this.jTextFieldId.setText(Integer.toString(est.getId()));
                this.jTextFieldTipo.setText(est.getTipo());
                this.jTextFieldUltimaEnt.setText(est.getQuantEntra());
                this.jTextFieldUltimaSai.setText(est.getQuantSai());
                this.jTextFieldQuantEst.setText(est.getQuantEst());
                this.jTextAreaObs.setText(est.getObs());
                this.jTextFieldQuantEnt.setText("0");
                this.jTextFieldQuantSai.setText("0");
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldTipo.setText("");
        this.jTextAreaObs.setText("");
        this.jTextFieldQuantEnt.setText("0");
        this.jTextFieldQuantSai.setText("0");
        this.jTextFieldQuantEst.setText("0");
        this.jTextFieldUltimaEnt.setText("0");
        this.jTextFieldUltimaSai.setText("0");
        this.jTextFieldId.setText("");
    }
    
    private void jButtonAlterarActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldQuantEnt.getText().isEmpty() && this.jTextFieldQuantSai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para alterar precisa de um valor,\nQuantidade de entrada ou quantidade de sa\u00edda.", "Aviso", 0);
        }
        else {
            final int est1 = Integer.parseInt(this.jTextFieldQuantEst.getText()) + Integer.parseInt(this.jTextFieldQuantEnt.getText());
            final int est2 = est1 - Integer.parseInt(this.jTextFieldQuantSai.getText());
            if (est2 < 0) {
                JOptionPane.showMessageDialog(null, "Resultado negativo,\nquantidade de esotque n\u00e3o pode ser negativo.", "Aviso", 0);
            }
            else {
                new EstoqueDAO().altera(this.jTextFieldTipo.getText(), this.jTextFieldQuantEnt.getText(), this.jTextFieldQuantSai.getText(), Integer.toString(est2), this.jTextAreaObs.getText(), this.jTextFieldId.getText());
                JOptionPane.showMessageDialog(null, "Informa\u00e7\u00f5es de " + this.jTextFieldTipo.getText() + ",\nalteradas no banco de dados", "Aviso", 1);
                final Estoque est3 = new EstoqueDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldTipo.getText());
                if (est3 == null) {
                    JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
                }
                else {
                    this.jTextFieldId.setText(Integer.toString(est3.getId()));
                    this.jTextFieldTipo.setText(est3.getTipo());
                    this.jTextFieldUltimaEnt.setText(est3.getQuantEntra());
                    this.jTextFieldUltimaSai.setText(est3.getQuantSai());
                    this.jTextFieldQuantEst.setText(est3.getQuantEst());
                    this.jTextAreaObs.setText(est3.getObs());
                    this.jTextFieldQuantEnt.setText("0");
                    this.jTextFieldQuantSai.setText("0");
                    if (this.jTextFieldUltimaEnt.getText().isEmpty()) {
                        this.jTextFieldUltimaEnt.setText("0");
                    }
                    if (this.jTextFieldUltimaSai.getText().isEmpty()) {
                        this.jTextFieldUltimaSai.setText("0");
                    }
                }
            }
        }
    }
}
