// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;
import java.awt.Component;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import java.awt.LayoutManager;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LogIn extends JPanel
{
    private JButton jButtonEntrar;
    private JButton jButtonLimpar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabelTela;
    private JPanel jPanelPaginaInicial;
    private JPasswordField jPasswordFieldSenha;
    private JTextField jTextFieldNome;
    
    public LogIn() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanelPaginaInicial = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jTextFieldNome = new JTextField();
        this.jPasswordFieldSenha = new JPasswordField();
        this.jLabel4 = new JLabel();
        this.jButtonEntrar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jLabelTela = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel6 = new JLabel();
        this.setBackground(Color.gray);
        this.jPanelPaginaInicial.setBorder(BorderFactory.createTitledBorder(null, "Página Inicial", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanelPaginaInicial.setAutoscrolls(true);
        this.jPanelPaginaInicial.setLayout((LayoutManager)new AbsoluteLayout());
        this.jLabel5.setFont(new Font("Ubuntu", 0, 24));
        this.jLabel5.setForeground(new Color(243, 229, 229));
        this.jLabel5.setText("LogIn");
        this.jPanelPaginaInicial.add(this.jLabel5, new AbsoluteConstraints(300, 60, -1, -1));
        this.jLabel3.setFont(new Font("Ubuntu", 0, 18));
        this.jLabel3.setForeground(new Color(245, 231, 231));
        this.jLabel3.setText("Nome:");
        this.jPanelPaginaInicial.add(this.jLabel3, new AbsoluteConstraints(190, 110, -1, -1));
        this.jTextFieldNome.setFocusCycleRoot(true);
        this.jPanelPaginaInicial.add(this.jTextFieldNome, new AbsoluteConstraints(260, 110, 220, -1));
        this.jPanelPaginaInicial.add(this.jPasswordFieldSenha, new AbsoluteConstraints(260, 150, 220, -1));
        this.jLabel4.setFont(new Font("Ubuntu", 0, 18));
        this.jLabel4.setForeground(new Color(246, 234, 234));
        this.jLabel4.setText("Senha:");
        this.jPanelPaginaInicial.add(this.jLabel4, new AbsoluteConstraints(190, 150, -1, -1));
        this.jButtonEntrar.setText("Entrar");
        this.jButtonEntrar.setCursor(new Cursor(12));
        this.jButtonEntrar.setSelected(true);
        this.jButtonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                LogIn.this.jButtonEntrarActionPerformed(evt);
            }
        });
        this.jPanelPaginaInicial.add(this.jButtonEntrar, new AbsoluteConstraints(260, 190, -1, -1));
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.setCursor(new Cursor(12));
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                LogIn.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jPanelPaginaInicial.add(this.jButtonLimpar, new AbsoluteConstraints(340, 190, -1, -1));
        this.jLabelTela.setFont(new Font("Ubuntu", 0, 24));
        this.jLabelTela.setHorizontalAlignment(0);
        this.jLabelTela.setIcon(new ImageIcon(this.getClass().getResource("/gui/informactica.png")));
        this.jLabelTela.setAlignmentX(0.5f);
        this.jLabelTela.setAutoscrolls(true);
        this.jLabelTela.setFocusable(false);
        this.jLabelTela.setInheritsPopupMenu(false);
        this.jLabelTela.setRequestFocusEnabled(false);
        this.jLabelTela.setVerifyInputWhenFocusTarget(false);
        this.jPanelPaginaInicial.add(this.jLabelTela, new AbsoluteConstraints(130, 40, 410, -1));
        this.jLabel1.setFont(new Font("Ubuntu", 0, 24));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/gui/info1.png")));
        this.jLabel1.setText("Inform\u00e1ctica\n");
        this.jLabel1.setAutoscrolls(true);
        this.jPanelPaginaInicial.add(this.jLabel1, new AbsoluteConstraints(170, 340, 300, 120));
        this.jLabel2.setText("Assist\u00eancia T\u00e9cnica\n");
        this.jLabel2.setAutoscrolls(true);
        this.jPanelPaginaInicial.add(this.jLabel2, new AbsoluteConstraints(310, 410, 140, -1));
        this.jLabel6.setText("By ||=I");
        this.jPanelPaginaInicial.add(this.jLabel6, new AbsoluteConstraints(610, 430, -1, -1));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanelPaginaInicial, -2, 685, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanelPaginaInicial, -2, 469, -2).addContainerGap(-1, 32767)));
    }
    
    private void jButtonEntrarActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldNome.getText().isEmpty() || new String(this.jPasswordFieldSenha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "É preciso digitar um 'Nome' e uma 'Senha'.");
            this.jTextFieldNome.setText("");
            this.jPasswordFieldSenha.setText("");
        }
        else {
            final int i = 0;
            final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "Não existe ou dados incorretos");
            }
            else {
                final Inicial ini = new Inicial();
                this.validate();
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldNome.setText("");
        this.jPasswordFieldSenha.setText("");
    }
}
