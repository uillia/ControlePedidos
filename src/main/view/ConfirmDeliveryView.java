package main.view;

import util.GraphElementsManipulator.Theme;
import util.GraphElementsManipulator.TitleBar;
import util.FileManager;
import util.ConfigManager;
import main.controller.EmployeeController;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.controller.ItemController;
import main.controller.OrderController;
import main.model.EmployeeModel;
import main.model.ItemModel;
import main.model.OrderModel;

/**
 *
 * @author uillia
 */
public class ConfirmDeliveryView extends javax.swing.JFrame {

    OrderController oc = new OrderController();
    int id;
    ItemController ic = new ItemController();
    ConfigManager conf = new ConfigManager();
    FileManager ac = new FileManager();
    String theme = conf.getValue("theme", "light", "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Controle de Estoque\\preferences\\theme.properties");
    Color btf;
    List<OrderModel> AllordersArr;

    int xMouse, yMouse;

    OrderModel orderEdit = new OrderModel();//get the data

    /**
     * Creates new form TelaCadFunc
     */
    public ConfirmDeliveryView() {

        initComponents();
        checkTheme();
        getAllDataEmp();
        refreshOrderTable("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegEmp = new javax.swing.JPanel();
        txtDescription = new javax.swing.JTextField();
        lbDescription = new javax.swing.JLabel();
        lbRegDate = new javax.swing.JLabel();
        btnUpdateOrder = new javax.swing.JButton();
        lbPrevDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBoxObservations = new javax.swing.JTextArea();
        lbObservations = new javax.swing.JLabel();
        txtPrevDate = new javax.swing.JTextField();
        lbStatus = new javax.swing.JLabel();
        lbSituation = new javax.swing.JLabel();
        btnFinalizeOrder = new javax.swing.JButton();
        txtEmployee = new javax.swing.JTextField();
        lbIdEmployee = new javax.swing.JLabel();
        lbIdSupplierEmp = new javax.swing.JLabel();
        txtSupplierPerson = new javax.swing.JTextField();
        btnCancelOrder = new javax.swing.JButton();
        txtRegDate = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        lbTextleft = new javax.swing.JLabel();
        lbTextTop = new javax.swing.JLabel();
        panelTitleBar = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        bttClose = new javax.swing.JButton();
        panelIconfied = new javax.swing.JPanel();
        bttIconfied = new javax.swing.JButton();
        panelMin = new javax.swing.JPanel();
        bttMin = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabOrderEdit = new javax.swing.JTable();
        txtDescritionSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableOrderItems = new javax.swing.JTable();
        lbItems = new javax.swing.JLabel();
        lbOrders = new javax.swing.JLabel();

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

        txtDescription.setEditable(false);
        txtDescription.setBorder(null);

        lbDescription.setText("Descrição");

        lbRegDate.setText("Data de registro");

        btnUpdateOrder.setText("Atualizar Pedido");
        btnUpdateOrder.setBorderPainted(false);
        btnUpdateOrder.setContentAreaFilled(false);
        btnUpdateOrder.setMaximumSize(new java.awt.Dimension(80, 25));
        btnUpdateOrder.setMinimumSize(new java.awt.Dimension(80, 25));
        btnUpdateOrder.setPreferredSize(new java.awt.Dimension(80, 25));
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        lbPrevDate.setText("Data Prev. para entrega");

        txtBoxObservations.setColumns(20);
        txtBoxObservations.setRows(5);
        txtBoxObservations.setBorder(null);
        jScrollPane1.setViewportView(txtBoxObservations);

        lbObservations.setText("Observações");

        txtPrevDate.setEditable(false);
        txtPrevDate.setBorder(null);

        btnFinalizeOrder.setText("Finalizar Pedido");
        btnFinalizeOrder.setBorderPainted(false);
        btnFinalizeOrder.setContentAreaFilled(false);
        btnFinalizeOrder.setMaximumSize(new java.awt.Dimension(80, 25));
        btnFinalizeOrder.setMinimumSize(new java.awt.Dimension(80, 25));
        btnFinalizeOrder.setPreferredSize(new java.awt.Dimension(80, 25));
        btnFinalizeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizeOrderActionPerformed(evt);
            }
        });

        txtEmployee.setEditable(false);
        txtEmployee.setBorder(null);

        lbIdEmployee.setText("Cod. Funcionário que cadastrou");

        lbIdSupplierEmp.setText("Cod. Fornecedor (Pessoa)");

        txtSupplierPerson.setEditable(false);
        txtSupplierPerson.setBorder(null);

        btnCancelOrder.setText("Cancelar Pedido");
        btnCancelOrder.setBorderPainted(false);
        btnCancelOrder.setContentAreaFilled(false);
        btnCancelOrder.setMaximumSize(new java.awt.Dimension(80, 25));
        btnCancelOrder.setMinimumSize(new java.awt.Dimension(80, 25));
        btnCancelOrder.setPreferredSize(new java.awt.Dimension(80, 25));
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        txtRegDate.setEditable(false);
        txtRegDate.setBorder(null);

        javax.swing.GroupLayout panelRegEmpLayout = new javax.swing.GroupLayout(panelRegEmp);
        panelRegEmp.setLayout(panelRegEmpLayout);
        panelRegEmpLayout.setHorizontalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbPrevDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrevDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbRegDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFinalizeOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegEmpLayout.createSequentialGroup()
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbObservations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbIdSupplierEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSupplierPerson))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbIdEmployee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmployee)))
                        .addGap(114, 114, 114))))
        );
        panelRegEmpLayout.setVerticalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegEmpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPrevDate, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(txtPrevDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIdEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIdSupplierEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSupplierPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegEmpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        btnVoltar.setText("Menu");
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
        lbTextleft.setText("Editar");

        lbTextTop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextTop.setForeground(new java.awt.Color(153, 153, 153));
        lbTextTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTextTop.setText("Atualizar Dados");

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

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tabOrderEdit.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id", "Descrição", "Data Entrega", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabOrderEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabOrderEdit.setMinimumSize(new java.awt.Dimension(60, 100));
        tabOrderEdit.setPreferredSize(new java.awt.Dimension(215, 200));
        tabOrderEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabOrderEditMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabOrderEdit);

        txtDescritionSearch.setBorder(null);

        btnSearch.setText("Pesquisar por descrição");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane4.setViewportView(tableOrderItems);

        lbItems.setText("Itens");

        lbOrders.setText("Pedidos");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTableLayout.createSequentialGroup()
                        .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTableLayout.createSequentialGroup()
                                .addComponent(txtDescritionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addComponent(lbItems)
                            .addComponent(lbOrders))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(txtDescritionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbItems, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(lbTextTop, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRegEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTextTop)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        if (orderEdit == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Pedido");

        } else {
            if (orderEdit.getIdStatus() == 0) {
                updateOrder();
            } else {
                JOptionPane.showMessageDialog(this, "Esse Pedido ja foi finalizado");
            }

        }

    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void bttIconfiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIconfiedActionPerformed
        this.setState(RegSupplierView.ICONIFIED);
    }//GEN-LAST:event_bttIconfiedActionPerformed

    private void bttMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttMinMouseClicked
        if (this.getExtendedState() != RegSupplierView.MAXIMIZED_BOTH) {
            this.setExtendedState(RegSupplierView.MAXIMIZED_BOTH);

        } else {
            this.setExtendedState(RegSupplierView.NORMAL);
        }
    }//GEN-LAST:event_bttMinMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        refreshOrderTable(txtDescritionSearch.getText());

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tabOrderEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderEditMouseClicked
        try {
            putData();
        } catch (ArrayIndexOutOfBoundsException ax) {
            System.out.println("Erro:" + ax.getMessage());
        }
    }//GEN-LAST:event_tabOrderEditMouseClicked

    private void btnFinalizeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizeOrderActionPerformed
        if (orderEdit == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Pedido");

        } else {
            if (orderEdit.getIdStatus() == 0) {
                confirmOrder();
            } else {
                JOptionPane.showMessageDialog(this, "Esse Pedido ja foi finalizado ou foi cancelado");
            }
        }
    }//GEN-LAST:event_btnFinalizeOrderActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        cancelOrder();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmDeliveryView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeliveryView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeliveryView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeliveryView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ConfirmDeliveryView().setVisible(true);
            }
        });
    }

    public void refreshTheme() {
        TitleBar tb = new TitleBar();
        Theme t = new Theme();

        //Configuration of title bar
        tb.configTitleBar(panelClose, panelIconfied, panelTitleBar, bttClose, bttIconfied, theme);

        JButton[] btt = {btnSearch, btnUpdateOrder, btnVoltar, btnUpdateOrder, btnFinalizeOrder, btnCancelOrder};
        JTextField[] txt = {txtDescritionSearch
        };

        JLabel[] lb = {lbRegDate,
            lbDescription, lbTextTop, lbTextleft, lbPrevDate, lbRegDate, lbObservations, lbIdEmployee, lbIdSupplierEmp, lbSituation, lbStatus};
        JPanel[] panel = {panelTable, panelMin, panelRegEmp, panelClose, panelIconfied,
            panelTitleBar};
        JLabel[] lbDesign = {lbTextTop, lbTextleft, lbItems, lbOrders};
        JTextField[] txtUnEdit = {txtDescription, txtRegDate, txtPrevDate, txtEmployee, txtSupplierPerson};

        JTable[] jtabel = {tabOrderEdit, tableOrderItems};
        JTextArea[] jtxtArea = {txtBoxObservations};

        t.refreshButtons(btt, theme);
        t.refreshFrame(this, theme);
        t.refreshLabels(lb, theme);
        t.refreshTextFields(txt, theme);
        t.refreshTextArea(jtxtArea, theme);
        t.refreshPanels(panel, theme);
        t.refreshDesignLabels(lbDesign, theme);
        t.refreshTextFieldUnEditable(txtUnEdit, theme);

        t.refreshTables(jtabel, theme);

    }

    public void checkTheme() {
        if (theme.equals("dark")) {
            refreshTheme();
        } else {
            refreshTheme();
        }
    }

    public void getAllDataEmp() {
        AllordersArr = oc.getAllData();
    }

    public void putData() {
        try {
            Object idO = tabOrderEdit.getValueAt(tabOrderEdit.getSelectedRow(), 0); //i get the real id of the employee when i clicled in the table
            String id = idO.toString();

            int idOrder = Integer.parseInt(id);
            int indexArr = 0;

            for (int i = 0; i < AllordersArr.size(); i++) {
                if (AllordersArr.get(i).getIdOrder() == idOrder) {
                    indexArr = i;
                    //get the index of the order that is selected in the table to search and get the data that is in the list AllemployeeArr
                }

            }

            orderEdit = AllordersArr.get(indexArr); // The global EmployeeEdit get the data in array

            txtDescription.setText(orderEdit.getDescription());
            txtRegDate.setText(orderEdit.getRegisterDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
            txtPrevDate.setText(orderEdit.getPrevDeliveryDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
            txtBoxObservations.setText(orderEdit.getComments());
            
            switch (orderEdit.getIdStatus()) {
                case 0:
                    lbStatus.setText("Ativo");
                    break;
                case 1:
                    lbStatus.setText("Finalizado");
                    break;
                case 2:
                    lbStatus.setText("Cancelado");
                    break;
            }

            if (orderEdit.getPrevDeliveryDate().isBefore(LocalDate.now())) {
                lbSituation.setText("Pedido em Atraso!");
                lbSituation.setForeground(Color.red);
            } else {
                lbSituation.setText("Pedido dentro do Prazo!");
                lbSituation.setForeground(Color.green);
            }

            txtEmployee.setText("" + orderEdit.getIdEmployee());
            txtSupplierPerson.setText("" + orderEdit.getIdSupplierPerson());
            List<ItemModel> itemsArr = ic.getItemsByIdOrder(orderEdit.getIdOrder());
            refreshItemsTable(itemsArr);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void refreshOrderTable(String name) {

        DefaultTableModel tabFmodel = new DefaultTableModel();
        tabFmodel = (DefaultTableModel) tabOrderEdit.getModel();
        tabFmodel.setRowCount(0);
        try {
            for (int i = 0; i < AllordersArr.size(); i++) {
                if (AllordersArr.get(i).getDescription().startsWith(name)) {

                    tabFmodel.addRow(new Object[]{
                        AllordersArr.get(i).getIdOrder(),
                        AllordersArr.get(i).getDescription(),
                        AllordersArr.get(i).getPrevDeliveryDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),
                        AllordersArr.get(i).getInitialPrice()});

                }

            }
        } catch (NullPointerException ne) {
            System.out.println("Não foi possivel preencher a tabela; Erro: " + ne.getMessage());
        }
    }

    public void refreshItemsTable(List<ItemModel> itemsArr) {

        DefaultTableModel tabFmodel = new DefaultTableModel();
        tabFmodel = (DefaultTableModel) tableOrderItems.getModel();
        tabFmodel.setRowCount(0);

        try {
            for (int i = 0; i < itemsArr.size(); i++) {

                tabFmodel.addRow(new Object[]{
                    itemsArr.get(i).getDescription(),
                    itemsArr.get(i).getUnityPrice(),
                    itemsArr.get(i).getQuantity()
                });

            }
        } catch (NullPointerException ne) {
            System.out.println("Não foi possivel preencher a tabela; Erro: " + ne.getMessage());
        }
    }

    public void updateOrder() {
        OrderModel order = new OrderModel();
        order.setIdOrder(orderEdit.getIdOrder());
        order.setIdEmployee(orderEdit.getIdEmployee());
        order.setComments(txtBoxObservations.getText());
        System.out.println("ID: " + orderEdit.getIdEmployee());

        oc.editOrder(order);
        JOptionPane.showMessageDialog(this, "Ordem editada com sucesso");
        getAllDataEmp();
        refreshOrderTable("");
    }

    public void confirmOrder() {
        int incremments = 0;
        OrderModel order = new OrderModel();
        order.setIdOrder(orderEdit.getIdOrder());
        order.setIdEmployee(orderEdit.getIdEmployee());
        orderEdit.setFinalPrice(orderEdit.getInitialPrice() + incremments);
        order.setFinalPrice(orderEdit.getFinalPrice());
        order.setIdStatus(1);

        oc.finalizeOrder(order);
        JOptionPane.showMessageDialog(this, "Ordem finalizada com sucesso");
        getAllDataEmp();
        refreshOrderTable("");
    }

    public void cancelOrder() {
        int incremments = 0;
        OrderModel order = new OrderModel();
        order.setIdOrder(orderEdit.getIdOrder());
        order.setIdEmployee(orderEdit.getIdEmployee());
        orderEdit.setFinalPrice(orderEdit.getInitialPrice() + incremments);
        order.setFinalPrice(orderEdit.getFinalPrice());
        order.setIdStatus(2);

        oc.finalizeOrder(order);
        JOptionPane.showMessageDialog(this, "Ordem finalizada com sucesso");
        getAllDataEmp();
        refreshOrderTable("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnFinalizeOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton bttClose;
    private javax.swing.JButton bttIconfied;
    private javax.swing.JButton bttMin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbIdEmployee;
    private javax.swing.JLabel lbIdSupplierEmp;
    private javax.swing.JLabel lbItems;
    private javax.swing.JLabel lbObservations;
    private javax.swing.JLabel lbOrders;
    private javax.swing.JLabel lbPrevDate;
    private javax.swing.JLabel lbRegDate;
    private javax.swing.JLabel lbSituation;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTextTop;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegEmp;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JTable tabOrderEdit;
    private javax.swing.JTable tableOrderItems;
    private javax.swing.JTextArea txtBoxObservations;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDescritionSearch;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtPrevDate;
    private javax.swing.JTextField txtRegDate;
    private javax.swing.JTextField txtSupplierPerson;
    // End of variables declaration//GEN-END:variables

}
