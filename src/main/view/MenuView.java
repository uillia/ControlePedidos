/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import util.FileManager;
import util.ConfigManager;
import main.controller.LoginController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import main.controller.EmployeeController;
import main.model.EmployeeModel;
import util.GraphElementsManipulator.Theme;
import util.GraphElementsManipulator.TitleBar;

public class MenuView extends javax.swing.JFrame {

    LoginController lc = new LoginController();
    FileManager ac = new FileManager();
    ConfigManager conf = new ConfigManager();
    EmployeeController empc = new EmployeeController();
    EmployeeModel userLog= lc.getLoggedData(); // this declaration get data from the logged user in this system 
    String path = "C:\\Users\\"+ System.getProperty("user.name") +"\\Documents\\Controle de Estoque\\preferences\\theme.properties";
    String theme = conf.getValue("theme","light",path);
    
//Para ler o valor que esta em um arquivo é importante mandar seu valor padrão. Caso ele não exista, ele sea craido com este valorrr padrão;
//To read a file value, is important to send the default value. So if the file doesn't exist, it will be created with the this defauld value
    Color btf;
    int xMouse, yMouse;

    public MenuView() {
        initComponents();
        checkTheme();
        checkGroup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBody = new javax.swing.JPanel();
        panelTab = new javax.swing.JPanel();
        spTabProxEnt = new javax.swing.JScrollPane();
        tabProxEntregas = new javax.swing.JTable();
        panelInstructions = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfoMenu = new javax.swing.JTextArea();
        bttPedidos = new javax.swing.JButton();
        bttEmployee = new javax.swing.JButton();
        bttSupplier = new javax.swing.JButton();
        lbTextleft = new javax.swing.JLabel();
        panelTop = new javax.swing.JPanel();
        tgbttTema = new javax.swing.JToggleButton();
        bttLogout = new javax.swing.JButton();
        lbTexttop = new javax.swing.JLabel();
        panelTitleBar = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        bttClose = new javax.swing.JButton();
        panelIconfied = new javax.swing.JPanel();
        bttIconfied = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1089, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        panelTab.setBackground(new java.awt.Color(255, 255, 255));
        panelTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Proximas entregas a chegar"));

        spTabProxEnt.setBackground(new java.awt.Color(255, 255, 255));

        tabProxEntregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descrição", "Fornecedor", "Data Entrega Prevista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProxEntregas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabProxEntregas.setPreferredSize(new java.awt.Dimension(217, 240));
        tabProxEntregas.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tabProxEntregasHierarchyChanged(evt);
            }
        });
        spTabProxEnt.setViewportView(tabProxEntregas);

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(spTabProxEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addComponent(spTabProxEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelInstructions.setBackground(new java.awt.Color(255, 255, 255));
        panelInstructions.setBorder(javax.swing.BorderFactory.createTitledBorder("Instruções"));
        panelInstructions.setToolTipText("");

        txtInfoMenu.setEditable(false);
        txtInfoMenu.setColumns(20);
        txtInfoMenu.setLineWrap(true);
        txtInfoMenu.setRows(5);
        txtInfoMenu.setText("\n   A tabela ao lado informa as entregas que estão mais  \t   proximas da data prevista para entrega\n\n   Para cadastrar um funcionário, clique em funcionário          acima. Apos isso, aparecerá uma nova janela para             cadastra-lo\n\n   Para cadastrar um fornecedor, clique em fornecedor          acima. Após isso, aparrecerá uma nova janela para           cadastra-lo\n\n   Para cadastrar um pedido, clique em pedido, e em              seguida, cadastrar pedido"); // NOI18N
        txtInfoMenu.setWrapStyleWord(true);
        txtInfoMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtInfoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(txtInfoMenu);

        javax.swing.GroupLayout panelInstructionsLayout = new javax.swing.GroupLayout(panelInstructions);
        panelInstructions.setLayout(panelInstructionsLayout);
        panelInstructionsLayout.setHorizontalGroup(
            panelInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInstructionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInstructionsLayout.setVerticalGroup(
            panelInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInstructionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bttPedidos.setBackground(new java.awt.Color(255, 255, 255));
        bttPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/entregaIconLight.png"))); // NOI18N
        bttPedidos.setText("Pedido");
        bttPedidos.setContentAreaFilled(false);
        bttPedidos.setIconTextGap(5);
        bttPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPedidosActionPerformed(evt);
            }
        });

        bttEmployee.setBackground(new java.awt.Color(255, 255, 255));
        bttEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/funcIconLight.png"))); // NOI18N
        bttEmployee.setText("Funcionario");
        bttEmployee.setContentAreaFilled(false);
        bttEmployee.setIconTextGap(5);
        bttEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEmployeeActionPerformed(evt);
            }
        });

        bttSupplier.setBackground(new java.awt.Color(255, 255, 255));
        bttSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconLight.png"))); // NOI18N
        bttSupplier.setText("Fornecedor");
        bttSupplier.setContentAreaFilled(false);
        bttSupplier.setIconTextGap(5);
        bttSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(panelInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(bttSupplier)
                        .addGap(1, 1, 1)
                        .addComponent(bttPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bttEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttEmployee)
                    .addComponent(bttPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbTextleft.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextleft.setForeground(new java.awt.Color(153, 153, 153));
        lbTextleft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextleft.setText("Página Inicial");

        panelTop.setBackground(new java.awt.Color(242, 242, 242));

        tgbttTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/darkIcon.png"))); // NOI18N
        tgbttTema.setText("Tema");
        tgbttTema.setBorderPainted(false);
        tgbttTema.setContentAreaFilled(false);
        tgbttTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbttTemaActionPerformed(evt);
            }
        });

        bttLogout.setBackground(new java.awt.Color(255, 255, 255));
        bttLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttlogoutIconLight.png"))); // NOI18N
        bttLogout.setText("Logout");
        bttLogout.setContentAreaFilled(false);
        bttLogout.setIconTextGap(5);
        bttLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLogoutActionPerformed(evt);
            }
        });

        lbTexttop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTexttop.setForeground(new java.awt.Color(153, 153, 153));
        lbTexttop.setText("Bem Vindo " + userLog.getName()+" !");

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTexttop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tgbttTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttLogout))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tgbttTema)
                        .addComponent(bttLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTexttop, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
        );

        panelTitleBar.setBackground(new java.awt.Color(242, 242, 242));

        bttClose.setBackground(new java.awt.Color(255, 255, 255));
        bttClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/closeIconLight.png"))); // NOI18N
        bttClose.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bttClose.setBorderPainted(false);
        bttClose.setContentAreaFilled(false);
        bttClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bttClose.setFocusPainted(false);
        bttClose.setRequestFocusEnabled(false);
        bttClose.setRolloverEnabled(false);
        bttClose.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelCloseLayout = new javax.swing.GroupLayout(panelClose);
        panelClose.setLayout(panelCloseLayout);
        panelCloseLayout.setHorizontalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bttClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bttIconfied.setBackground(new java.awt.Color(255, 51, 51));
        bttIconfied.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bttIconfied.setText("-");
        bttIconfied.setBorder(null);
        bttIconfied.setBorderPainted(false);
        bttIconfied.setContentAreaFilled(false);
        bttIconfied.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bttIconfied.setDefaultCapable(false);
        bttIconfied.setFocusPainted(false);
        bttIconfied.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttIconfied.setRequestFocusEnabled(false);
        bttIconfied.setRolloverEnabled(false);
        bttIconfied.setVerifyInputWhenFocusTarget(false);
        bttIconfied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIconfiedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIconfiedLayout = new javax.swing.GroupLayout(panelIconfied);
        panelIconfied.setLayout(panelIconfiedLayout);
        panelIconfiedLayout.setHorizontalGroup(
            panelIconfiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIconfiedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIconfiedLayout.setVerticalGroup(
            panelIconfiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIconfiedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelTitleBarLayout = new javax.swing.GroupLayout(panelTitleBar);
        panelTitleBar.setLayout(panelTitleBarLayout);
        panelTitleBarLayout.setHorizontalGroup(
            panelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelTitleBarLayout.setVerticalGroup(
            panelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelTitleBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabProxEntregasHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tabProxEntregasHierarchyChanged

    }//GEN-LAST:event_tabProxEntregasHierarchyChanged

    private void bttEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEmployeeActionPerformed
        dispose();
        RegEmployeeView t = new RegEmployeeView();
        t.setVisible(true);

    }//GEN-LAST:event_bttEmployeeActionPerformed

    private void tgbttTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbttTemaActionPerformed

        if (tgbttTema.isSelected()) {
            theme = "dark";
            attTema();

        } else {
            theme = "light";
            attTema();
        }
          conf.setValue("theme",theme,path); // Escreve no arquivo de configuração os novos valores 
          
//        ac.Write(path, theme);//escreve qual tema foi selecionado e é escrito no arquivo em preferencias/theme
            
    }//GEN-LAST:event_tgbttTemaActionPerformed

    private void bttLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLogoutActionPerformed
        int r = JOptionPane.showConfirmDialog(bttLogout, " Tem certeza que quer deslogar?");
        if (r == JOptionPane.YES_OPTION) {

            dispose();

            LoginController lc = new LoginController();
            lc.logout();

            LoginView t = new LoginView();
            t.setVisible(true);
            conf.setValue("user", "null", "C:\\Users\\"+ System.getProperty("user.name") +"\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\cacheLoguin");
            System.out.println("usuario chache apagado");
        }
    }//GEN-LAST:event_bttLogoutActionPerformed

    private void bttSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSupplierActionPerformed
        dispose();
        RegSupplierView t = new RegSupplierView();
        t.setVisible(true);
    }//GEN-LAST:event_bttSupplierActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_formMouseDragged

    private void bttFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bttFecharMouseClicked

    private void bttFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttFecharMouseEntered
        bttClose.setForeground(Color.red);
    }//GEN-LAST:event_bttFecharMouseEntered

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void bttIconfiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIconfiedActionPerformed
        this.setState(RegSupplierView.ICONIFIED);
    }//GEN-LAST:event_bttIconfiedActionPerformed

    private void bttPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPedidosActionPerformed
      dispose();
        OrderView v = new OrderView();
      v.setVisible(true);
    
    }//GEN-LAST:event_bttPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);

            }
        });

    }

    public void attTema() {
        
        TitleBar tb = new TitleBar();
        tb.configTitleBar(panelClose, panelIconfied, panelTitleBar, bttClose, bttIconfied, theme);

        JButton[] btt = {bttEmployee, bttPedidos, bttSupplier, bttClose, bttLogout};
        JPanel[] panel = {panelTop, panelTab, panelBody, panelInstructions };
        JTable[] tab = {tabProxEntregas};
        Theme t = new Theme();
        t.refreshButtons(btt, theme);
        t.refreshFrame(this, theme);
        t.refreshPanels(panel, theme);
        t.refreshTables(tab, theme);
        
        
        Color a = new Color(50, 50, 50);
        Color b = new Color(255, 255, 255);
        btf = a;

        if (theme.equals("dark")) {

            tgbttTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/lightIcon.png")));
            tgbttTema.setForeground(Color.white);

            for (int i = 0; i < btt.length; i++) {
                btt[i].setForeground(Color.white);
            }

            bttEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/funcIconDark.png")));
            bttPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/entregaIconDark.png")));
            bttLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttlogoutIconDark.png")));
            bttSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconDark.png")));

            lbTextleft.setForeground(new Color (153,153,153));
            lbTexttop.setForeground(new Color (153,153,153));
            panelTop.setBackground(a);
            

        } else {

            Color interBlack = new Color(0, 0, 0);
            Color interWhite = new Color(255, 255, 255);
            a = interWhite; //mudo as cores em variaveis para não ter que reescrever as mudanças desejadas
            b = interBlack;
            

            if (theme.equals("light")) {

                tgbttTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/darkIcon.png")));
                tgbttTema.setForeground(Color.black);

                for (int i = 0; i < btt.length; i++) {
                    btt[i].setForeground(Color.black);
                }

                bttEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/funcIconLight.png")));
                bttPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/entregaIconLight.png")));
                bttLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttlogoutIconLight.png")));
                bttSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconLight.png")));

                lbTextleft.setForeground(Color.lightGray);
                lbTexttop.setForeground(Color.lightGray);
                panelTop.setBackground(new Color(245, 245, 245));

                

            }
        }

        

        txtInfoMenu.setBackground(a);
        txtInfoMenu.setForeground(b);

        TitledBorder ti = BorderFactory.createTitledBorder(null, "Instruções");
        ti.setTitleColor(b);
        panelInstructions.setBackground(a);
        panelInstructions.setBorder(ti);

        TitledBorder tabSup = BorderFactory.createTitledBorder(null, "Próximas entregas a chegar");
        tabSup.setTitleColor(b);
        panelTab.setBorder(tabSup);
        
    }

    public void checkTheme() {
        if (theme.equals("dark")) {
            tgbttTema.setSelected(true);
            attTema();
        } else {
            attTema();
        }
    }
    public void checkGroup(){
        
        String group= userLog.getGroup();
        System.out.println(group);
        if (group.equals("Administrador")||group.equals("Dev")) {
            bttEmployee.setVisible(true);
            
        }else{
            bttEmployee.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttClose;
    private javax.swing.JButton bttEmployee;
    private javax.swing.JButton bttIconfied;
    private javax.swing.JButton bttLogout;
    private javax.swing.JButton bttPedidos;
    private javax.swing.JButton bttSupplier;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JLabel lbTexttop;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelInstructions;
    private javax.swing.JPanel panelTab;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JPanel panelTop;
    private javax.swing.JScrollPane spTabProxEnt;
    private javax.swing.JTable tabProxEntregas;
    private javax.swing.JToggleButton tgbttTema;
    private javax.swing.JTextArea txtInfoMenu;
    // End of variables declaration//GEN-END:variables
}
