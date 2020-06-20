// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inicial extends JPanel
{
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabelTela;
    private JPanel jPanel1;
    
    public Inicial() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabelTela = new JLabel();
        this.jLabel3 = new JLabel();
        this.setBackground(Color.lightGray);
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "P\u00e1gina Inicial", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanel1.setAutoscrolls(true);
        this.jLabel1.setFont(new Font("Ubuntu", 0, 24));
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/gui/info1.png")));
        this.jLabel1.setText("Inform\u00e1ctica ");
        this.jLabel1.setAutoscrolls(true);
        this.jLabel2.setText("Assist\u00eancia T\u00e9cnica\n");
        this.jLabel2.setAutoscrolls(true);
        this.jLabelTela.setFont(new Font("Ubuntu", 0, 24));
        this.jLabelTela.setHorizontalAlignment(0);
        this.jLabelTela.setIcon(new ImageIcon(this.getClass().getResource("/gui/informactica.png")));
        this.jLabelTela.setAutoscrolls(true);
        this.jLabelTela.setHorizontalTextPosition(0);
        this.jLabel3.setText("by ||=I");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(78, 78, 78).addComponent(this.jLabelTela).addGap(77, 77, 77)).addGroup(jPanel1Layout.createSequentialGroup().addGap(59, 59, 59).addComponent(this.jLabel1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 140, -2).addGap(0, 65, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel3).addContainerGap()))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabelTela).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(10, 10, 10)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel3).addContainerGap()))));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 606, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(18, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(18, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 503, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767))));
    }
}
