// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import modelo.Usuario;
import javax.swing.JOptionPane;
import dao.UsuarioDAO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import java.awt.LayoutManager;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal extends JFrame
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
    private JMenu jMenuAjuda;
    private JMenu jMenuAlterar;
    private JMenuBar jMenuBar1;
    private JMenu jMenuCadastrar;
    private JMenu jMenuConsultar;
    private JMenu jMenuExcluir;
    private JMenuItem jMenuItemCliente;
    private JMenuItem jMenuItemClienteAltera;
    private JMenuItem jMenuItemClienteCons;
    private JMenuItem jMenuItemClienteExclui;
    private JMenuItem jMenuItemDuvidas;
    private JMenuItem jMenuItemEstoque;
    private JMenuItem jMenuItemEstoqueAltera;
    private JMenuItem jMenuItemEstoqueCons;
    private JMenuItem jMenuItemEstoqueExclui;
    private JMenuItem jMenuItemFechaProgr;
    private JMenuItem jMenuItemFecharJanela;
    private JMenuItem jMenuItemLogOf;
    private JMenuItem jMenuItemMontadoAltera;
    private JMenuItem jMenuItemMontadoCons;
    private JMenuItem jMenuItemMontadoExclui;
    private JMenuItem jMenuItemMontados;
    private JMenuItem jMenuItemUsuario;
    private JMenuItem jMenuItemUsuarioAltera;
    private JMenuItem jMenuItemUsuarioCons;
    private JMenuItem jMenuItemUsuarioExclui;
    private JMenu jMenuSair;
    private JPanel jPanelPaginaInicial;
    private JPasswordField jPasswordFieldSenha;
    private JTextField jTextFieldNome;
    
    public Principal() {
        this.initComponents();
        this.setExtendedState(6);
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
        this.jMenuBar1 = new JMenuBar();
        this.jMenuCadastrar = new JMenu();
        this.jMenuItemCliente = new JMenuItem();
        this.jMenuItemMontados = new JMenuItem();
        this.jMenuItemEstoque = new JMenuItem();
        this.jMenuItemUsuario = new JMenuItem();
        this.jMenuConsultar = new JMenu();
        this.jMenuItemClienteCons = new JMenuItem();
        this.jMenuItemMontadoCons = new JMenuItem();
        this.jMenuItemEstoqueCons = new JMenuItem();
        this.jMenuItemUsuarioCons = new JMenuItem();
        this.jMenuExcluir = new JMenu();
        this.jMenuItemClienteExclui = new JMenuItem();
        this.jMenuItemMontadoExclui = new JMenuItem();
        this.jMenuItemEstoqueExclui = new JMenuItem();
        this.jMenuItemUsuarioExclui = new JMenuItem();
        this.jMenuAlterar = new JMenu();
        this.jMenuItemClienteAltera = new JMenuItem();
        this.jMenuItemMontadoAltera = new JMenuItem();
        this.jMenuItemEstoqueAltera = new JMenuItem();
        this.jMenuItemUsuarioAltera = new JMenuItem();
        this.jMenuAjuda = new JMenu();
        this.jMenuItemDuvidas = new JMenuItem();
        this.jMenuSair = new JMenu();
        this.jMenuItemFecharJanela = new JMenuItem();
        this.jMenuItemFechaProgr = new JMenuItem();
        this.jMenuItemLogOf = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.setTitle("SisInfo - Informactica");
        this.setBackground(Color.gray);
        this.jPanelPaginaInicial.setBorder(BorderFactory.createTitledBorder(null, "Páina Inicial", 2, 2, new Font("Andale Mono", 1, 18)));
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
                Principal.this.jButtonEntrarActionPerformed(evt);
            }
        });
        this.jPanelPaginaInicial.add(this.jButtonEntrar, new AbsoluteConstraints(260, 190, -1, -1));
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.setCursor(new Cursor(12));
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jButtonLimparActionPerformed(evt);
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
        this.jLabel6.setText("by ||=I");
        this.jPanelPaginaInicial.add(this.jLabel6, new AbsoluteConstraints(620, 440, -1, -1));
        this.jMenuCadastrar.setIcon(new ImageIcon(this.getClass().getResource("/gui/cadastro.png")));
        this.jMenuCadastrar.setMnemonic('c');
        this.jMenuCadastrar.setText("Cadastrar");
        this.jMenuCadastrar.setCursor(new Cursor(12));
        this.jMenuItemCliente.setIcon(new ImageIcon(this.getClass().getResource("/gui/cadastroCliente.png")));
        this.jMenuItemCliente.setMnemonic('c');
        this.jMenuItemCliente.setText("Cliente");
        this.jMenuItemCliente.setCursor(new Cursor(12));
        this.jMenuItemCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemClienteActionPerformed(evt);
            }
        });
        this.jMenuCadastrar.add(this.jMenuItemCliente);
        this.jMenuItemMontados.setIcon(new ImageIcon(this.getClass().getResource("/gui/cadastroMontado.png")));
        this.jMenuItemMontados.setMnemonic('m');
        this.jMenuItemMontados.setText("Montados");
        this.jMenuItemMontados.setCursor(new Cursor(12));
        this.jMenuItemMontados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemMontadosActionPerformed(evt);
            }
        });
        this.jMenuCadastrar.add(this.jMenuItemMontados);
        this.jMenuItemEstoque.setIcon(new ImageIcon(this.getClass().getResource("/gui/cadastroEstoque.png")));
        this.jMenuItemEstoque.setMnemonic('e');
        this.jMenuItemEstoque.setText("Estoque");
        this.jMenuItemEstoque.setCursor(new Cursor(12));
        this.jMenuItemEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemEstoqueActionPerformed(evt);
            }
        });
        this.jMenuCadastrar.add(this.jMenuItemEstoque);
        this.jMenuItemUsuario.setIcon(new ImageIcon(this.getClass().getResource("/gui/cadastroUsuario.png")));
        this.jMenuItemUsuario.setMnemonic('u');
        this.jMenuItemUsuario.setText("Usu\u00e1rio");
        this.jMenuItemUsuario.setCursor(new Cursor(12));
        this.jMenuItemUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemUsuarioActionPerformed(evt);
            }
        });
        this.jMenuCadastrar.add(this.jMenuItemUsuario);
        this.jMenuBar1.add(this.jMenuCadastrar);
        this.jMenuConsultar.setIcon(new ImageIcon(this.getClass().getResource("/gui/consulta.png")));
        this.jMenuConsultar.setMnemonic('n');
        this.jMenuConsultar.setText("Consultar");
        this.jMenuConsultar.setCursor(new Cursor(12));
        this.jMenuItemClienteCons.setIcon(new ImageIcon(this.getClass().getResource("/gui/consultaCliente.png")));
        this.jMenuItemClienteCons.setMnemonic('c');
        this.jMenuItemClienteCons.setText("Cliente");
        this.jMenuItemClienteCons.setCursor(new Cursor(12));
        this.jMenuItemClienteCons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemClienteConsActionPerformed(evt);
            }
        });
        this.jMenuConsultar.add(this.jMenuItemClienteCons);
        this.jMenuItemMontadoCons.setIcon(new ImageIcon(this.getClass().getResource("/gui/consultarMontado.png")));
        this.jMenuItemMontadoCons.setMnemonic('m');
        this.jMenuItemMontadoCons.setText("Montado");
        this.jMenuItemMontadoCons.setCursor(new Cursor(12));
        this.jMenuItemMontadoCons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemMontadoConsActionPerformed(evt);
            }
        });
        this.jMenuConsultar.add(this.jMenuItemMontadoCons);
        this.jMenuItemEstoqueCons.setIcon(new ImageIcon(this.getClass().getResource("/gui/consultaEstoque.png")));
        this.jMenuItemEstoqueCons.setMnemonic('e');
        this.jMenuItemEstoqueCons.setText("Estoque");
        this.jMenuItemEstoqueCons.setCursor(new Cursor(12));
        this.jMenuItemEstoqueCons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemEstoqueConsActionPerformed(evt);
            }
        });
        this.jMenuConsultar.add(this.jMenuItemEstoqueCons);
        this.jMenuItemUsuarioCons.setIcon(new ImageIcon(this.getClass().getResource("/gui/consultaUsuario.png")));
        this.jMenuItemUsuarioCons.setMnemonic('u');
        this.jMenuItemUsuarioCons.setText("Usu\u00e1rio");
        this.jMenuItemUsuarioCons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemUsuarioConsActionPerformed(evt);
            }
        });
        this.jMenuConsultar.add(this.jMenuItemUsuarioCons);
        this.jMenuBar1.add(this.jMenuConsultar);
        this.jMenuExcluir.setIcon(new ImageIcon(this.getClass().getResource("/gui/exclusao.png")));
        this.jMenuExcluir.setMnemonic('e');
        this.jMenuExcluir.setText("Excluir");
        this.jMenuItemClienteExclui.setIcon(new ImageIcon(this.getClass().getResource("/gui/excluirCliente.png")));
        this.jMenuItemClienteExclui.setMnemonic('c');
        this.jMenuItemClienteExclui.setText("Cliente");
        this.jMenuItemClienteExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemClienteExcluiActionPerformed(evt);
            }
        });
        this.jMenuExcluir.add(this.jMenuItemClienteExclui);
        this.jMenuItemMontadoExclui.setIcon(new ImageIcon(this.getClass().getResource("/gui/excluirMontado.png")));
        this.jMenuItemMontadoExclui.setMnemonic('m');
        this.jMenuItemMontadoExclui.setText("Montados");
        this.jMenuItemMontadoExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemMontadoExcluiActionPerformed(evt);
            }
        });
        this.jMenuExcluir.add(this.jMenuItemMontadoExclui);
        this.jMenuItemEstoqueExclui.setIcon(new ImageIcon(this.getClass().getResource("/gui/excluirEstoque.png")));
        this.jMenuItemEstoqueExclui.setMnemonic('e');
        this.jMenuItemEstoqueExclui.setText("Estoque");
        this.jMenuItemEstoqueExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemEstoqueExcluiActionPerformed(evt);
            }
        });
        this.jMenuExcluir.add(this.jMenuItemEstoqueExclui);
        this.jMenuItemUsuarioExclui.setIcon(new ImageIcon(this.getClass().getResource("/gui/excluirUsuario.png")));
        this.jMenuItemUsuarioExclui.setMnemonic('u');
        this.jMenuItemUsuarioExclui.setText("Usu\u00e1rio");
        this.jMenuItemUsuarioExclui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemUsuarioExcluiActionPerformed(evt);
            }
        });
        this.jMenuExcluir.add(this.jMenuItemUsuarioExclui);
        this.jMenuBar1.add(this.jMenuExcluir);
        this.jMenuAlterar.setIcon(new ImageIcon(this.getClass().getResource("/gui/alterar.png")));
        this.jMenuAlterar.setMnemonic('t');
        this.jMenuAlterar.setText("Alterar");
        this.jMenuItemClienteAltera.setIcon(new ImageIcon(this.getClass().getResource("/gui/alteraCliente.png")));
        this.jMenuItemClienteAltera.setMnemonic('c');
        this.jMenuItemClienteAltera.setText("Cliente");
        this.jMenuItemClienteAltera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemClienteAlteraActionPerformed(evt);
            }
        });
        this.jMenuAlterar.add(this.jMenuItemClienteAltera);
        this.jMenuItemMontadoAltera.setIcon(new ImageIcon(this.getClass().getResource("/gui/alterarMontado.png")));
        this.jMenuItemMontadoAltera.setMnemonic('m');
        this.jMenuItemMontadoAltera.setText("Montado");
        this.jMenuItemMontadoAltera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemMontadoAlteraActionPerformed(evt);
            }
        });
        this.jMenuAlterar.add(this.jMenuItemMontadoAltera);
        this.jMenuItemEstoqueAltera.setIcon(new ImageIcon(this.getClass().getResource("/gui/alteraEstoque.png")));
        this.jMenuItemEstoqueAltera.setMnemonic('e');
        this.jMenuItemEstoqueAltera.setText("Estoque");
        this.jMenuItemEstoqueAltera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemEstoqueAlteraActionPerformed(evt);
            }
        });
        this.jMenuAlterar.add(this.jMenuItemEstoqueAltera);
        this.jMenuItemUsuarioAltera.setIcon(new ImageIcon(this.getClass().getResource("/gui/alteraUsuario.png")));
        this.jMenuItemUsuarioAltera.setMnemonic('u');
        this.jMenuItemUsuarioAltera.setText("Usu\u00e1rio");
        this.jMenuItemUsuarioAltera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemUsuarioAlteraActionPerformed(evt);
            }
        });
        this.jMenuAlterar.add(this.jMenuItemUsuarioAltera);
        this.jMenuBar1.add(this.jMenuAlterar);
        this.jMenuAjuda.setIcon(new ImageIcon(this.getClass().getResource("/gui/ajuda.png")));
        this.jMenuAjuda.setMnemonic('a');
        this.jMenuAjuda.setText("Ajuda");
        this.jMenuAjuda.setCursor(new Cursor(12));
        this.jMenuItemDuvidas.setIcon(new ImageIcon(this.getClass().getResource("/gui/duvidas.png")));
        this.jMenuItemDuvidas.setMnemonic('d');
        this.jMenuItemDuvidas.setText("Duvidas");
        this.jMenuItemDuvidas.setCursor(new Cursor(12));
        this.jMenuAjuda.add(this.jMenuItemDuvidas);
        this.jMenuBar1.add(this.jMenuAjuda);
        this.jMenuSair.setIcon(new ImageIcon(this.getClass().getResource("/gui/sair.png")));
        this.jMenuSair.setMnemonic('s');
        this.jMenuSair.setText("Sair");
        this.jMenuSair.setCursor(new Cursor(12));
        this.jMenuItemFecharJanela.setIcon(new ImageIcon(this.getClass().getResource("/gui/fechaProgrm.png")));
        this.jMenuItemFecharJanela.setMnemonic('f');
        this.jMenuItemFecharJanela.setText("Fechar Janela");
        this.jMenuItemFecharJanela.setCursor(new Cursor(12));
        this.jMenuItemFecharJanela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemFecharJanelaActionPerformed(evt);
            }
        });
        this.jMenuSair.add(this.jMenuItemFecharJanela);
        this.jMenuItemFechaProgr.setIcon(new ImageIcon(this.getClass().getResource("/gui/fechaJanela.png")));
        this.jMenuItemFechaProgr.setMnemonic('p');
        this.jMenuItemFechaProgr.setText("Fechar Programa");
        this.jMenuItemFechaProgr.setCursor(new Cursor(12));
        this.jMenuItemFechaProgr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemFechaProgrActionPerformed(evt);
            }
        });
        this.jMenuSair.add(this.jMenuItemFechaProgr);
        this.jMenuItemLogOf.setIcon(new ImageIcon(this.getClass().getResource("/gui/logOf.png")));
        this.jMenuItemLogOf.setMnemonic('l');
        this.jMenuItemLogOf.setText("LogOff/Trocar Usuário");
        this.jMenuItemLogOf.setCursor(new Cursor(12));
        this.jMenuItemLogOf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Principal.this.jMenuItemLogOfActionPerformed(evt);
            }
        });
        this.jMenuSair.add(this.jMenuItemLogOf);
        this.jMenuBar1.add(this.jMenuSair);
        this.setJMenuBar(this.jMenuBar1);
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanelPaginaInicial, -2, 685, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(24, 32767).addComponent(this.jPanelPaginaInicial, -2, 469, -2).addContainerGap(24, 32767)));
        this.pack();
    }
    
    private void jMenuItemEstoqueActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final CadastroEstoque cadEst = new CadastroEstoque();
            this.setContentPane(cadEst);
            this.pack();
        }
    }
    
    private void jMenuItemClienteActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final CadastroCliente cadCli = new CadastroCliente();
            this.setContentPane(cadCli);
            this.pack();
        }
    }
    
    private void jMenuItemFecharJanelaActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final Inicial inic = new Inicial();
            this.setContentPane(inic);
            this.pack();
        }
    }
    
    private void jMenuItemMontadosActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final CadastroMontado cadMon = new CadastroMontado();
            this.setContentPane(cadMon);
            this.pack();
        }
    }
    
    private void jMenuItemFechaProgrActionPerformed(final ActionEvent evt) {
        System.exit(0);
    }
    
    private void jMenuItemClienteConsActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ConsultaCliente cliente = new ConsultaCliente();
            this.setContentPane(cliente);
            this.pack();
        }
    }
    
    private void jMenuItemUsuarioActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final CadastroUsuario cad = new CadastroUsuario();
            this.setContentPane(cad);
            this.pack();
        }
    }
    
    private void jMenuItemLogOfActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        if (usuario != null) {
            this.jTextFieldNome.setText("");
            this.jPasswordFieldSenha.setText("");
            this.setContentPane(this.jPanelPaginaInicial);
            this.pack();
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldNome.setText("");
        this.jPasswordFieldSenha.setText("");
    }
    
    private void jButtonEntrarActionPerformed(final ActionEvent evt) {
        if (this.jTextFieldNome.getText().isEmpty() || new String(this.jPasswordFieldSenha.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "É preciso digitar um 'Nome' e uma 'Senha'.", "Aviso", 1);
            this.jTextFieldNome.setText("");
            this.jPasswordFieldSenha.setText("");
        }
        else {
            final int i = 0;
            final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "Não existe ou dados incorretos", "Erro", 0);
            }
            else {
                final Inicial ini = new Inicial();
                this.setContentPane(ini);
                this.pack();
            }
        }
    }
    
    private void jMenuItemEstoqueConsActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ConsultaEstoque con = new ConsultaEstoque();
            this.setContentPane(con);
            this.pack();
        }
    }
    
    private void jMenuItemUsuarioConsActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ConsultaUsuario con = new ConsultaUsuario();
            this.setContentPane(con);
            this.pack();
        }
    }
    
    private void jMenuItemMontadoConsActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ConsultaMontado con = new ConsultaMontado();
            this.setContentPane(con);
            this.pack();
        }
    }
    
    private void jMenuItemClienteExcluiActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ExcluiCliente exc = new ExcluiCliente();
            this.setContentPane(exc);
            this.pack();
        }
    }
    
    private void jMenuItemUsuarioExcluiActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ExcluiUsuario exc = new ExcluiUsuario();
            this.setContentPane(exc);
            this.pack();
        }
    }
    
    private void jMenuItemMontadoExcluiActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ExcluiMontado exc = new ExcluiMontado();
            this.setContentPane(exc);
            this.pack();
        }
    }
    
    private void jMenuItemEstoqueExcluiActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final ExcluiEstoque exc = new ExcluiEstoque();
            this.setContentPane(exc);
            this.pack();
        }
    }
    
    private void jMenuItemClienteAlteraActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usuário logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final AlteraCliente alt = new AlteraCliente();
            this.setContentPane(alt);
            this.pack();
        }
    }
    
    private void jMenuItemMontadoAlteraActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "É preciso ser usu\u00e1rio logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final AlteraMontado alt = new AlteraMontado();
            this.setContentPane(alt);
            this.pack();
        }
    }
    
    private void jMenuItemEstoqueAlteraActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usu\u00e1rio logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final AlteraEstoque alt = new AlteraEstoque();
            this.setContentPane(alt);
            this.pack();
        }
    }
    
    private void jMenuItemUsuarioAlteraActionPerformed(final ActionEvent evt) {
        final int i = 0;
        final Usuario usuario = new UsuarioDAO().consulta(i, this.jTextFieldNome.getText(), new String(this.jPasswordFieldSenha.getPassword()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso ser usu\u00e1rio logado \n para acessar o sistema.", "Aviso", 1);
        }
        else {
            final AlteraUsuario alt = new AlteraUsuario();
            this.setContentPane(alt);
            this.pack();
        }
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}
