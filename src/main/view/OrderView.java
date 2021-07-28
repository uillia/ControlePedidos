/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import util.GraphElementsManipulator.Theme;
import util.GraphElementsManipulator.TitleBar;
import util.FileManager;
import util.ConfigManager;
import main.controller.EmployeeController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.controller.OrderController;
import main.model.ItemModel;
import main.model.OrderModel;

/**
 *
 * @author uillia
 */
public class OrderView extends javax.swing.JFrame {

    EmployeeController fc = new EmployeeController();
    ConfigManager conf = new ConfigManager();
    FileManager ac = new FileManager();
    String theme = conf.getValue("theme", "light", "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Controle de Estoque\\preferences\\theme.properties");
    Color btf;
    int xMouse, yMouse;
    int z;
    OrderModel om = new OrderModel();
    List<ItemModel> itemArr = new ArrayList<>();

    /**
     * Creates new form TelaCadFunc
     */
    public OrderView() {
        initComponents();
        checkTheme();
        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegEmp = new javax.swing.JPanel();
        txtDescriptionOrder = new javax.swing.JTextField();
        lbDescriptionOrder = new javax.swing.JLabel();
        lbidSupplierPerson = new javax.swing.JLabel();
        lbPrevDays = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtIdSupplier = new javax.swing.JTextField();
        txtPrevDays = new javax.swing.JTextField();
        lbinitialPrice = new javax.swing.JLabel();
        txtInitialPrice = new javax.swing.JTextField();
        lbComments = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaComments = new javax.swing.JTextArea();
        panelItems = new javax.swing.JPanel();
        txtDescriptionItem = new javax.swing.JTextField();
        lbDescriptionItem = new javax.swing.JLabel();
        lbItemPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        lbQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOrderItems = new javax.swing.JTable();
        panelExluirFunc = new javax.swing.JPanel();
        panelTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabOrders = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lbTextleft = new javax.swing.JLabel();
        lbTextMid = new javax.swing.JLabel();
        lbTextTop = new javax.swing.JLabel();
        panelTitleBar = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        panelIconfied = new javax.swing.JPanel();
        btnIconfied = new javax.swing.JButton();
        panelMin = new javax.swing.JPanel();
        bttMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        txtDescriptionOrder.setBorder(null);

        lbDescriptionOrder.setText("Descrição");

        lbidSupplierPerson.setText("IdFornecedor");

        lbPrevDays.setText("Dias para entrega");

        btnRegister.setText("Cadastrar");
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setMaximumSize(new java.awt.Dimension(80, 25));
        btnRegister.setMinimumSize(new java.awt.Dimension(80, 25));
        btnRegister.setPreferredSize(new java.awt.Dimension(80, 25));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtIdSupplier.setBorder(null);

        txtPrevDays.setBorder(null);

        lbinitialPrice.setText("Preco inicial");

        txtInitialPrice.setEditable(false);
        txtInitialPrice.setBorder(null);

        lbComments.setText("Comentários");

        txtAreaComments.setEditable(false);
        txtAreaComments.setColumns(20);
        txtAreaComments.setLineWrap(true);
        txtAreaComments.setRows(5);
        txtAreaComments.setText("Sem comentários.\n"); // NOI18N
        txtAreaComments.setWrapStyleWord(true);
        txtAreaComments.setBorder(null);
        txtAreaComments.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAreaComments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaCommentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaComments);

        txtDescriptionItem.setBorder(null);

        lbDescriptionItem.setText("Descrição");

        lbItemPrice.setText("Preco Unitário     R$");

        txtItemPrice.setBorder(null);

        lbQuantity.setText("Quantidade");

        txtQuantity.setBorder(null);

        btnAddItem.setText("Adicionar");
        btnAddItem.setBorderPainted(false);
        btnAddItem.setContentAreaFilled(false);
        btnAddItem.setMaximumSize(new java.awt.Dimension(80, 25));
        btnAddItem.setMinimumSize(new java.awt.Dimension(80, 25));
        btnAddItem.setPreferredSize(new java.awt.Dimension(80, 25));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemoveItem.setText("Excluir");
        btnRemoveItem.setBorderPainted(false);
        btnRemoveItem.setContentAreaFilled(false);
        btnRemoveItem.setMaximumSize(new java.awt.Dimension(80, 25));
        btnRemoveItem.setMinimumSize(new java.awt.Dimension(80, 25));
        btnRemoveItem.setPreferredSize(new java.awt.Dimension(80, 25));
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelItemsLayout = new javax.swing.GroupLayout(panelItems);
        panelItems.setLayout(panelItemsLayout);
        panelItemsLayout.setHorizontalGroup(
            panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelItemsLayout.createSequentialGroup()
                        .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelItemsLayout.createSequentialGroup()
                                .addComponent(lbDescriptionItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescriptionItem))
                            .addGroup(panelItemsLayout.createSequentialGroup()
                                .addComponent(lbItemPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelItemsLayout.createSequentialGroup()
                        .addComponent(lbQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelItemsLayout.setVerticalGroup(
            panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescriptionItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescriptionItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbItemPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tableOrderItems.setModel(new javax.swing.table.DefaultTableModel(
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
                "Descrição", "Preço unitário", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOrderItems.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOrderItems.setMinimumSize(new java.awt.Dimension(60, 100));
        tableOrderItems.setPreferredSize(new java.awt.Dimension(215, 200));
        jScrollPane3.setViewportView(tableOrderItems);

        javax.swing.GroupLayout panelRegEmpLayout = new javax.swing.GroupLayout(panelRegEmp);
        panelRegEmp.setLayout(panelRegEmpLayout);
        panelRegEmpLayout.setHorizontalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbComments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbidSupplierPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbDescriptionOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescriptionOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbinitialPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInitialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbPrevDays)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrevDays, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegEmpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelRegEmpLayout.setVerticalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescriptionOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescriptionOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbidSupplierPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrevDays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrevDays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbinitialPrice)
                            .addComponent(txtInitialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbComments, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telll", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabOrders.setMinimumSize(new java.awt.Dimension(60, 100));
        tabOrders.setPreferredSize(new java.awt.Dimension(215, 200));
        jScrollPane1.setViewportView(tabOrders);

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttexcluirfuncIconLight.png"))); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtId.setBorder(null);

        lbId.setText("Id");

        javax.swing.GroupLayout panelExluirFuncLayout = new javax.swing.GroupLayout(panelExluirFunc);
        panelExluirFunc.setLayout(panelExluirFuncLayout);
        panelExluirFuncLayout.setHorizontalGroup(
            panelExluirFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExluirFuncLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelExluirFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExluirFuncLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelExluirFuncLayout.setVerticalGroup(
            panelExluirFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExluirFuncLayout.createSequentialGroup()
                .addGroup(panelExluirFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExluirFuncLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panelExluirFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnSearch))
                    .addGroup(panelExluirFuncLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnVoltar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnVoltar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lbTextleft.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextleft.setForeground(new java.awt.Color(153, 153, 153));
        lbTextleft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextleft.setText("Pedidos");

        lbTextMid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextMid.setForeground(new java.awt.Color(153, 153, 153));
        lbTextMid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTextMid.setText("Pesquisar Pedido");

        lbTextTop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextTop.setForeground(new java.awt.Color(153, 153, 153));
        lbTextTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTextTop.setText("Cadastrar Pedido");

        panelTitleBar.setBackground(new java.awt.Color(242, 242, 242));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/closeIconLight.png"))); // NOI18N
        btnClose.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setRequestFocusEnabled(false);
        btnClose.setRolloverEnabled(false);
        btnClose.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelCloseLayout = new javax.swing.GroupLayout(panelClose);
        panelClose.setLayout(panelCloseLayout);
        panelCloseLayout.setHorizontalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnIconfied.setBackground(new java.awt.Color(255, 51, 51));
        btnIconfied.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnIconfied.setText("-");
        btnIconfied.setBorder(null);
        btnIconfied.setBorderPainted(false);
        btnIconfied.setContentAreaFilled(false);
        btnIconfied.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIconfied.setDefaultCapable(false);
        btnIconfied.setFocusPainted(false);
        btnIconfied.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIconfied.setRequestFocusEnabled(false);
        btnIconfied.setRolloverEnabled(false);
        btnIconfied.setVerifyInputWhenFocusTarget(false);
        btnIconfied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconfiedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIconfiedLayout = new javax.swing.GroupLayout(panelIconfied);
        panelIconfied.setLayout(panelIconfiedLayout);
        panelIconfiedLayout.setHorizontalGroup(
            panelIconfiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIconfiedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIconfiedLayout.setVerticalGroup(
            panelIconfiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIconfiedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bttMin.setBackground(new java.awt.Color(255, 51, 51));
        bttMin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bttMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/fullscreenInIconsLight.png"))); // NOI18N
        bttMin.setBorder(null);
        bttMin.setBorderPainted(false);
        bttMin.setContentAreaFilled(false);
        bttMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bttMin.setDefaultCapable(false);
        bttMin.setFocusPainted(false);
        bttMin.setRequestFocusEnabled(false);
        bttMin.setRolloverEnabled(false);
        bttMin.setVerifyInputWhenFocusTarget(false);
        bttMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMinLayout = new javax.swing.GroupLayout(panelMin);
        panelMin.setLayout(panelMinLayout);
        panelMinLayout.setHorizontalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttMin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMinLayout.setVerticalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttMin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelTitleBarLayout = new javax.swing.GroupLayout(panelTitleBar);
        panelTitleBar.setLayout(panelTitleBarLayout);
        panelTitleBarLayout.setHorizontalGroup(
            panelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTitleBarLayout.setVerticalGroup(
            panelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIconfied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelExluirFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTextMid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTextTop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTextTop)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextMid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelExluirFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        MenuView x = new MenuView();
        x.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        om.setDescription(txtDescriptionOrder.getText());
        om.setIdEmployee(Integer.parseInt(txtIdSupplier.getText()));
        om.setPrevDays(Integer.parseInt(txtPrevDays.getText()));
        om.setInitialPrice(Double.parseDouble(txtInitialPrice.getText()));
        om.setItems(itemArr);
        OrderController oc = new OrderController();
        oc.registerOrder(om);
        refreshTable();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        refreshTable();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnIconfiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconfiedActionPerformed
        this.setState(RegSupplierView.ICONIFIED);
    }//GEN-LAST:event_btnIconfiedActionPerformed

    private void bttMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttMinMouseClicked
        if (this.getExtendedState() != RegSupplierView.MAXIMIZED_BOTH) {
            this.setExtendedState(RegSupplierView.MAXIMIZED_BOTH);

        } else {
            this.setExtendedState(RegSupplierView.NORMAL);
        }
    }//GEN-LAST:event_bttMinMouseClicked

    private void txtAreaCommentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaCommentsMouseClicked
        txtAreaComments.setText(null);
    }//GEN-LAST:event_txtAreaCommentsMouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        addItems();
        refreshTableItems();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        int index = tableOrderItems.getSelectedRow();
        om.setInitialPrice(om.getInitialPrice() - (itemArr.get(index).getUnityPrice() * itemArr.get(index).getQuantity()));
        itemArr.remove(index);
        refreshTableItems();
    }//GEN-LAST:event_btnRemoveItemActionPerformed

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
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView().setVisible(true);
            }
        });
    }

    public void refreshTheme() {
        TitleBar tb = new TitleBar();
        Theme t = new Theme();

        //Configuration of title bar
        tb.configTitleBar(panelClose, panelIconfied, panelTitleBar, btnClose, btnIconfied, theme);

        JButton[] btn = {btnRegister, btnVoltar, btnSearch, btnAddItem,btnRemoveItem};
        JTextField[] txt = {txtDescriptionOrder, txtId, txtIdSupplier, txtPrevDays, txtInitialPrice, txtDescriptionItem,
            txtItemPrice, txtQuantity};
        JLabel[] lb = {lbPrevDays, lbId,
            lbDescriptionOrder, lbinitialPrice, lbTextMid, lbTextTop, lbTextleft, lbidSupplierPerson,
            lbDescriptionItem, lbComments, lbItemPrice, lbItemPrice, lbQuantity};
        JPanel[] panel = {panelMin, panelRegEmp, panelExluirFunc, panelClose, panelIconfied,
            panelItems, panelTab, panelTitleBar};
        JTable[] tab = {tabOrders, tableOrderItems};
        JTextArea[] txtArea = {txtAreaComments};
        JLabel[] lbDesign={lbTextMid,lbTextTop,lbTextleft};
        

        t.refreshButtons(btn, theme);
        t.refreshFrame(this, theme);
        t.refreshLabels(lb, theme);
        t.refreshTextFields(txt, theme);
        t.refreshPanels(panel, theme);
        t.refreshTables(tab, theme);
        t.refreshTextArea(txtArea, theme);
        t.refreshDesignLabels(lbDesign, theme);

        if (theme.equals("dark")) {

            btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconDark.png")));
            btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttexcluirfuncIconDark.png")));
            

        } else {

            if (theme.equals("light")) {
                

                btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconLight.png")));
                btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttexcluirfuncIconLight.png")));
            }
        }
    }

    public void checkTheme() {
        if (theme.equals("dark")) {
            refreshTheme();
        } else {
            refreshTheme();
        }
    }

    public void refreshTable() {

        DefaultTableModel tabFmodel = new DefaultTableModel();
        tabFmodel = (DefaultTableModel) tabOrders.getModel();
        tabFmodel.setRowCount(0);
        
    }

    public void addItems() {
        try {
            ItemModel im = new ItemModel();
            im.setDescription(txtDescriptionItem.getText());
            im.setIdFornecedor(Integer.parseInt(txtIdSupplier.getText()));
            im.setUnityPrice(Double.parseDouble(txtItemPrice.getText()));
            im.setQuantity(Integer.parseInt(txtQuantity.getText()));
            om.setInitialPrice(om.getInitialPrice() + (im.getUnityPrice() * im.getQuantity()));
            itemArr.add(im);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Algum campo esta vazio"+ ex.getMessage());
        }
    }

    public void refreshTableItems() {
        DefaultTableModel tableOrderItemsModel = new DefaultTableModel();
        tableOrderItemsModel = (DefaultTableModel) tableOrderItems.getModel();
        tableOrderItemsModel.setRowCount(0);
        txtInitialPrice.setText("R$" + om.getInitialPrice());
        
        for (int i = 0; i < itemArr.size(); i++) {
            tableOrderItemsModel.addRow(new Object[]{
                itemArr.get(i).getDescription(),
                "R$" + itemArr.get(i).getUnityPrice(),
                itemArr.get(i).getQuantity()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnIconfied;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton bttMin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbComments;
    private javax.swing.JLabel lbDescriptionItem;
    private javax.swing.JLabel lbDescriptionOrder;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbItemPrice;
    private javax.swing.JLabel lbPrevDays;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbTextMid;
    private javax.swing.JLabel lbTextTop;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JLabel lbidSupplierPerson;
    private javax.swing.JLabel lbinitialPrice;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelExluirFunc;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelItems;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegEmp;
    private javax.swing.JPanel panelTab;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JTable tabOrders;
    private javax.swing.JTable tableOrderItems;
    private javax.swing.JTextArea txtAreaComments;
    private javax.swing.JTextField txtDescriptionItem;
    private javax.swing.JTextField txtDescriptionOrder;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSupplier;
    private javax.swing.JTextField txtInitialPrice;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtPrevDays;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

}
