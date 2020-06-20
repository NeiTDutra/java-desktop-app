// 
// Decompiled by Procyon v0.5.36
// 

package gui;

import dao.MontadoDAO;
import javax.swing.JOptionPane;
import modelo.Montado;
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

public class ConsultaMontado extends JPanel
{
    private JButton jButtonAnterior;
    private JButton jButtonConsultar;
    private JButton jButtonLimpar;
    private JButton jButtonProximo;
    private JLabel jLabel1;
    private JLabel jLabelCaixaSom;
    private JLabel jLabelCamera;
    private JLabel jLabelFonte;
    private JLabel jLabelGabinete;
    private JLabel jLabelHdssd;
    private JLabel jLabelId;
    private JLabel jLabelMemoria;
    private JLabel jLabelMonitor;
    private JLabel jLabelMouse;
    private JLabel jLabelNome;
    private JLabel jLabelObs;
    private JLabel jLabelPlacaDeVideo;
    private JLabel jLabelPlacaMae;
    private JLabel jLabelProcessador;
    private JLabel jLabelTeclado;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaObs;
    private JTextField jTextFieldCaixaSom;
    private JTextField jTextFieldCamera;
    private JTextField jTextFieldFonte;
    private JTextField jTextFieldGabinete;
    private JTextField jTextFieldHdssd;
    private JTextField jTextFieldId;
    private JTextField jTextFieldMemoria;
    private JTextField jTextFieldMonitor;
    private JTextField jTextFieldMouse;
    private JTextField jTextFieldNome;
    private JTextField jTextFieldPlacaMae;
    private JTextField jTextFieldPlacaVideo;
    private JTextField jTextFieldProcessador;
    private JTextField jTextFieldTeclado;
    
    public ConsultaMontado() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabelId = new JLabel();
        this.jLabelPlacaMae = new JLabel();
        this.jLabelProcessador = new JLabel();
        this.jLabelMemoria = new JLabel();
        this.jLabelFonte = new JLabel();
        this.jLabelHdssd = new JLabel();
        this.jLabelPlacaDeVideo = new JLabel();
        this.jLabelGabinete = new JLabel();
        this.jLabelTeclado = new JLabel();
        this.jLabelMouse = new JLabel();
        this.jLabelCaixaSom = new JLabel();
        this.jLabelMonitor = new JLabel();
        this.jLabelCamera = new JLabel();
        this.jLabelObs = new JLabel();
        this.jTextFieldId = new JTextField();
        this.jTextFieldPlacaMae = new JTextField();
        this.jTextFieldProcessador = new JTextField();
        this.jTextFieldMemoria = new JTextField();
        this.jTextFieldFonte = new JTextField();
        this.jTextFieldHdssd = new JTextField();
        this.jTextFieldPlacaVideo = new JTextField();
        this.jTextFieldGabinete = new JTextField();
        this.jTextFieldTeclado = new JTextField();
        this.jTextFieldMouse = new JTextField();
        this.jTextFieldCaixaSom = new JTextField();
        this.jTextFieldMonitor = new JTextField();
        this.jTextFieldCamera = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTextAreaObs = new JTextArea();
        this.jButtonConsultar = new JButton();
        this.jButtonLimpar = new JButton();
        this.jLabelNome = new JLabel();
        this.jTextFieldNome = new JTextField();
        this.jLabel1 = new JLabel();
        this.jButtonAnterior = new JButton();
        this.jButtonProximo = new JButton();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Consulta de Montagem", 2, 2, new Font("Andale Mono", 1, 18)));
        this.jPanel1.setAutoscrolls(true);
        this.jLabelId.setText("Id:");
        this.jLabelPlacaMae.setText("Placa M\u00e3e:");
        this.jLabelProcessador.setText("Processador:");
        this.jLabelMemoria.setText("Mem\u00f3ria:");
        this.jLabelFonte.setText("Fonte:");
        this.jLabelHdssd.setText("HD/SSD:");
        this.jLabelPlacaDeVideo.setText("Placa de V\u00eddeo:");
        this.jLabelGabinete.setText("Gabinete:");
        this.jLabelTeclado.setText("Teclado:");
        this.jLabelMouse.setText("Mouse:");
        this.jLabelCaixaSom.setText("Caixas de Som:");
        this.jLabelMonitor.setText("Monitor:");
        this.jLabelCamera.setText("C\u00e2mera:");
        this.jLabelObs.setText("Obs:");
        this.jTextFieldId.setEditable(false);
        this.jTextFieldId.setText("**************");
        this.jTextFieldPlacaMae.setEditable(false);
        this.jTextFieldPlacaMae.setText("*******************************************************");
        this.jTextFieldProcessador.setEditable(false);
        this.jTextFieldProcessador.setText("********************************************************");
        this.jTextFieldMemoria.setEditable(false);
        this.jTextFieldMemoria.setText("********************************************************");
        this.jTextFieldFonte.setEditable(false);
        this.jTextFieldFonte.setText("********************************************************");
        this.jTextFieldFonte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaMontado.this.jTextFieldFonteActionPerformed(evt);
            }
        });
        this.jTextFieldHdssd.setEditable(false);
        this.jTextFieldHdssd.setText("*********************************************************");
        this.jTextFieldPlacaVideo.setEditable(false);
        this.jTextFieldPlacaVideo.setText("********************************************************");
        this.jTextFieldGabinete.setEditable(false);
        this.jTextFieldGabinete.setText("********************************************************");
        this.jTextFieldTeclado.setEditable(false);
        this.jTextFieldTeclado.setText("********************************************************");
        this.jTextFieldMouse.setEditable(false);
        this.jTextFieldMouse.setText("********************************************************");
        this.jTextFieldCaixaSom.setEditable(false);
        this.jTextFieldCaixaSom.setText("********************************************************");
        this.jTextFieldMonitor.setEditable(false);
        this.jTextFieldMonitor.setText("********************************************************");
        this.jTextFieldCamera.setEditable(false);
        this.jTextFieldCamera.setText("********************************************************");
        this.jTextAreaObs.setEditable(false);
        this.jTextAreaObs.setColumns(20);
        this.jTextAreaObs.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextAreaObs);
        this.jButtonConsultar.setText("Consultar");
        this.jButtonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaMontado.this.jButtonConsultarActionPerformed(evt);
            }
        });
        this.jButtonLimpar.setText("Limpar");
        this.jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaMontado.this.jButtonLimparActionPerformed(evt);
            }
        });
        this.jLabelNome.setText("Nome:");
        this.jLabel1.setText("By ||=I");
        this.jButtonAnterior.setText("<< Anterior");
        this.jButtonProximo.setText("Pr\u00f3ximo >>");
        this.jButtonProximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                ConsultaMontado.this.jButtonProximoActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(82, 82, 82).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelPlacaDeVideo).addComponent(this.jLabelHdssd).addComponent(this.jLabelFonte).addComponent(this.jLabelMemoria).addComponent(this.jLabelProcessador).addComponent(this.jLabelPlacaMae).addComponent(this.jLabelId).addComponent(this.jLabelGabinete).addComponent(this.jLabelTeclado).addComponent(this.jLabelMouse).addComponent(this.jLabelObs).addComponent(this.jLabelCamera).addComponent(this.jLabelMonitor).addComponent(this.jLabelCaixaSom).addComponent(this.jLabelNome))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldId, -2, 120, -2).addComponent(this.jTextFieldPlacaMae, -1, 460, 32767).addComponent(this.jTextFieldProcessador, -1, 460, 32767).addComponent(this.jTextFieldMemoria, -1, 460, 32767).addComponent(this.jTextFieldFonte, -1, 460, 32767).addComponent(this.jTextFieldHdssd, -1, 460, 32767).addComponent(this.jTextFieldPlacaVideo, -1, 460, 32767).addComponent(this.jTextFieldGabinete, -1, 460, 32767).addComponent(this.jTextFieldTeclado, -1, 460, 32767).addComponent(this.jTextFieldMouse, -1, 460, 32767).addComponent(this.jTextFieldCaixaSom, -1, 460, 32767).addComponent(this.jTextFieldMonitor, -1, 460, 32767).addComponent(this.jTextFieldCamera, -1, 460, 32767).addComponent(this.jScrollPane1, -1, 460, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButtonConsultar).addGap(18, 18, 18).addComponent(this.jButtonLimpar).addGap(18, 18, 18).addComponent(this.jButtonAnterior).addGap(18, 18, 18).addComponent(this.jButtonProximo)).addComponent(this.jTextFieldNome)).addContainerGap(144, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelNome).addComponent(this.jTextFieldNome, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelId).addComponent(this.jTextFieldId, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelPlacaMae).addComponent(this.jTextFieldPlacaMae, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelProcessador).addComponent(this.jTextFieldProcessador, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMemoria).addComponent(this.jTextFieldMemoria, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelFonte).addComponent(this.jTextFieldFonte, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelHdssd).addComponent(this.jTextFieldHdssd, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelPlacaDeVideo).addComponent(this.jTextFieldPlacaVideo, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelGabinete).addComponent(this.jTextFieldGabinete, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelTeclado).addComponent(this.jTextFieldTeclado, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMouse).addComponent(this.jTextFieldMouse, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCaixaSom).addComponent(this.jTextFieldCaixaSom, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelMonitor).addComponent(this.jTextFieldMonitor, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabelCamera).addComponent(this.jTextFieldCamera, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelObs).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButtonConsultar).addComponent(this.jButtonLimpar).addComponent(this.jButtonAnterior).addComponent(this.jButtonProximo))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel1))).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -1, -1, 32767).addContainerGap(-1, 32767)));
    }
    
    private void jTextFieldFonteActionPerformed(final ActionEvent evt) {
    }
    
    private void jButtonConsultarActionPerformed(final ActionEvent evt) {
        final Montado montado = new Montado();
        montado.setNome(this.jTextFieldNome.getText());
        if (this.jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "\u00c9 preciso digitar o 'Nome' para consultar.");
        }
        else {
            final Montado mon = new MontadoDAO().consulta(Integer.parseInt(this.jTextFieldId.getText()), this.jTextFieldNome.getText());
            if (mon == null) {
                JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos");
            }
            else {
                this.jTextFieldId.setText(Integer.toString(mon.getId()));
                this.jTextFieldNome.setText(mon.getNome());
                this.jTextFieldPlacaMae.setText(mon.getPlacaMae());
                this.jTextFieldProcessador.setText(mon.getProcessador());
                this.jTextFieldMemoria.setText(mon.getMemoria());
                this.jTextFieldFonte.setText(mon.getFonte());
                this.jTextFieldHdssd.setText(mon.getHdssd());
                this.jTextFieldTeclado.setText(mon.getTeclado());
                this.jTextFieldMouse.setText(mon.getMouse());
                this.jTextFieldPlacaVideo.setText(mon.getPlacaVideo());
                this.jTextFieldCaixaSom.setText(mon.getCaixaSom());
                this.jTextFieldGabinete.setText(mon.getGabinete());
                this.jTextFieldMonitor.setText(mon.getMonitor());
                this.jTextFieldCamera.setText(mon.getCamera());
                this.jTextAreaObs.setText(mon.getObs());
            }
        }
    }
    
    private void jButtonLimparActionPerformed(final ActionEvent evt) {
        this.jTextFieldNome.setText("");
        this.jTextFieldPlacaMae.setText("");
        this.jTextFieldProcessador.setText("");
        this.jTextFieldMemoria.setText("");
        this.jTextFieldFonte.setText("");
        this.jTextFieldHdssd.setText("");
        this.jTextFieldTeclado.setText("");
        this.jTextFieldMouse.setText("");
        this.jTextFieldPlacaVideo.setText("");
        this.jTextFieldCaixaSom.setText("");
        this.jTextFieldGabinete.setText("");
        this.jTextFieldMonitor.setText("");
        this.jTextFieldCamera.setText("");
        this.jTextAreaObs.setText("");
    }
    
    private void jButtonProximoActionPerformed(final ActionEvent evt) {
        final Montado mon1 = new Montado();
        mon1.setId(Integer.parseInt(this.jTextFieldId.getText()));
        int i = Integer.parseInt(this.jTextFieldId.getText());
        ++i;
        this.jTextFieldId.setText(Integer.toString(i));
        this.jTextFieldNome.setText("");
        final Montado mon2 = new MontadoDAO().consulta(i, this.jTextFieldNome.getText());
        if (mon2 == null) {
            JOptionPane.showMessageDialog(null, "N\u00e3o existe ou dados incorretos", "Erro", 0);
        }
        else {
            this.jTextFieldId.setText(Integer.toString(mon2.getId()));
            this.jTextFieldNome.setText(mon2.getNome());
            this.jTextFieldPlacaMae.setText(mon2.getPlacaMae());
            this.jTextFieldProcessador.setText(mon2.getProcessador());
            this.jTextFieldMemoria.setText(mon2.getMemoria());
            this.jTextFieldFonte.setText(mon2.getFonte());
            this.jTextFieldHdssd.setText(mon2.getHdssd());
            this.jTextFieldTeclado.setText(mon2.getTeclado());
            this.jTextFieldMouse.setText(mon2.getMouse());
            this.jTextFieldPlacaVideo.setText(mon2.getPlacaVideo());
            this.jTextFieldCaixaSom.setText(mon2.getCaixaSom());
            this.jTextFieldGabinete.setText(mon2.getGabinete());
            this.jTextFieldMonitor.setText(mon2.getMonitor());
            this.jTextFieldCamera.setText(mon2.getCamera());
            this.jTextAreaObs.setText(mon2.getObs());
        }
    }
}
