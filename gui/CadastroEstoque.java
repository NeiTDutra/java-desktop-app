// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import dao.EstoqueDAO;
import javax.swing.JOptionPane;
import modelo.Estoque;
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

public class CadastroEstoque extends JPanel
{
    private JButton jButtonCadastrar;
    private JButton jButtonLimpar;
    private JLabel jLabelId;
    private JLabel jLabelObs;
    private JLabel jLabelTipo;
    private JLabel jLabelquantEnt;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaObs;
    private JTextField jTextFieldId;
    private JTextField jTextFieldQuantEnt;
    private JTextField jTextFieldTipo;
    
    public CadastroEstoque() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelTipo = new JLabel();
        this.jLabelObs = new JLabel();
        this.jLabelquantEnt = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldTipo = new JTextField();
        this.jTextFieldQuantEnt = new JTextField();
        this.jButtonCadastrar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Cadastro de produtos de Estoque", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jLabelId.setText("Id:");
        this.jLabelId.setInheritsPopupMenu(false);
        this.jLabelTipo.setText("Tipo:");
        this.jLabelTipo.setInheritsPopupMenu(false);
        this.jLabelObs.setText("Obs:");
        this.jLabelObs.setInheritsPopupMenu(false);
        this.jLabelquantEnt.setText("Quant. Entrada:");
        this.jLabelquantEnt.setInheritsPopupMenu(false);
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setText("*************");
        this.jButtonCadastrar.setText("Cadastrar");
        this.jButtonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                CadastroEstoque.this.jButtonCadastrarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                CadastroEstoque.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jTextAreaObs.setText("\n");
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(110, 110, 110).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelquantEnt).addGap(18, 18, 18).addComponent(this.jTextFieldQuantEnt, -2, 113, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelId).addComponent(this.jLabelTipo)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextFieldTipo, -2, 429, -2).addComponent(this.jTextFieldId, -2, 110, -2)))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabelObs).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonCadastrar).addGap(18, 18, 18).addComponent(this.jButtonLimpar)).addComponent(this.jScrollPane1, -2, 419, -2)).addGap(0, 0, 32767))).addContainerGap(129, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTipo).addComponent(this.jTextFieldTipo, -2, -1, -2)).addGap(34, 34, 34).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelquantEnt).addComponent(this.jTextFieldQuantEnt, -2, -1, -2)).addGap(149, 149, 149).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonCadastrar).addComponent(this.jButtonLimpar)).addGap(27, 27, 27)));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 745, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, -2).addContainerGap(-1, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 550, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(33, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(33, 32767))));
    }
    
    private void jButtonCadastrarActionPerformed(final ActionEvent evt) {
        final Estoque estoque = new Estoque();
        estoque.setObs(this.jTextAreaObs.getText());
        estoque.setQuantEntra(this.jTextFieldQuantEnt.getText());
        estoque.setQuantEst(this.jTextFieldQuantEnt.getText());
        estoque.setTipo(this.jTextFieldTipo.getText());
        if (this.jTextFieldTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Tipo'  n\u00e3o podem retornar vazios!", "Aviso", 2);
        }
        else {
            final EstoqueDAO dao = new EstoqueDAO();
            dao.add(estoque);
            JOptionPane.showMessageDialog(null, "Tipo: " + this.jTextFieldTipo.getText() + " inserido com sucesso! ", "Inserido", 1);
        }
        this.jTextFieldTipo.setText("");
        this.jTextAreaObs.setText("");
        this.jTextFieldQuantEnt.setText("");
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldTipo.setText("");
        this.jTextAreaObs.setText("");
        this.jTextFieldQuantEnt.setText("");
    }
}
