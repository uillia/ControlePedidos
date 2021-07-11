/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import util.FileManager;
import util.ConfigManager;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import main.controller.SupplierController;
import main.model.SupplierPersonModel;
import main.model.SupplierCompanyModel;
import util.GraphElementsManipulator.Theme;
import util.GraphElementsManipulator.TitleBar;

/**
 *
 * @author uillia
 */
public class RegSupplierView extends javax.swing.JFrame {

    SupplierController sc = new SupplierController();
    ConfigManager conf = new ConfigManager();
    FileManager fm = new FileManager();
    String theme = conf.getValue("theme", "light", "C:\\Users\\"+System.getProperty("user.name") +"\\Documents\\Controle de Estoque\\preferences\\theme.properties");
    Color btf;
    int xMouse, yMouse;

    /**
     * Creates new form TelaCadFunc
     */
    public RegSupplierView() {
        initComponents();
        checkTheme();
        refreshTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegSuppComp = new javax.swing.JPanel();
        bttRegisterSuppCompany = new javax.swing.JButton();
        panelBaseInfo = new javax.swing.JPanel();
        txtNameCompany = new javax.swing.JTextField();
        lbNameCompany = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtPhone = new javax.swing.JFormattedTextField();
        lbCnpj = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        panelAdress = new javax.swing.JPanel();
        txtLocalNum = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        lbDistrict = new javax.swing.JLabel();
        lbStreet = new javax.swing.JLabel();
        lbLocalNum = new javax.swing.JLabel();
        txtMainActivity = new javax.swing.JTextField();
        lbMainActivity = new javax.swing.JLabel();
        lbHierarchicaltype = new javax.swing.JLabel();
        comboHierarchicaltype = new javax.swing.JComboBox<>();
        panelInfoAdc = new javax.swing.JPanel();
        txtSite = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbSite = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        panelRegSuppPerson = new javax.swing.JPanel();
        panelTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEmpresasForn = new javax.swing.JTable();
        txtNamePerson = new javax.swing.JTextField();
        lbNamePerson = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lbCpf = new javax.swing.JLabel();
        txtIdCompany = new javax.swing.JTextField();
        lbIdCompany = new javax.swing.JLabel();
        bttRegisterSuppPerson = new javax.swing.JButton();
        txtRole = new javax.swing.JTextField();
        lbRole = new javax.swing.JLabel();
        lbTextleft = new javax.swing.JLabel();
        lbTextMid = new javax.swing.JLabel();
        lbTextTop = new javax.swing.JLabel();
        panelTitleBar = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        bttClose = new javax.swing.JButton();
        panelIconfied = new javax.swing.JPanel();
        bttIconfied = new javax.swing.JButton();
        panelMin = new javax.swing.JPanel();
        bttMin = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        bttRegisterSuppCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconLight.png"))); // NOI18N
        bttRegisterSuppCompany.setText("Cadastrar");
        bttRegisterSuppCompany.setBorderPainted(false);
        bttRegisterSuppCompany.setContentAreaFilled(false);
        bttRegisterSuppCompany.setMaximumSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppCompany.setMinimumSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppCompany.setPreferredSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegisterSuppCompanyActionPerformed(evt);
            }
        });

        txtNameCompany.setBorder(null);

        lbNameCompany.setText("Nome");

        txtCnpj.setBorder(null);
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPhone.setBorder(null);
        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCnpj.setText("Cnpj");

        lbPhone.setText("Número");

        panelAdress.setToolTipText("");

        txtLocalNum.setBorder(null);

        txtStreet.setBorder(null);

        txtDistrict.setBorder(null);

        txtCity.setBorder(null);

        txtState.setBorder(null);

        lbState.setText("Estado");

        lbCity.setText("Cidade");

        lbDistrict.setText("Bairro");

        lbStreet.setText("Rua");

        lbLocalNum.setText("N°");

        javax.swing.GroupLayout panelAdressLayout = new javax.swing.GroupLayout(panelAdress);
        panelAdress.setLayout(panelAdressLayout);
        panelAdressLayout.setHorizontalGroup(
            panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbStreet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDistrict, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLocalNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbState))
                .addGap(13, 13, 13)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity)
                    .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdressLayout.createSequentialGroup()
                        .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocalNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAdressLayout.setVerticalGroup(
            panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdressLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLocalNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocalNum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdressLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCity)
                    .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtMainActivity.setBorder(null);

        lbMainActivity.setText("Ramo");

        lbHierarchicaltype.setText("Hierarquia");

        comboHierarchicaltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matriz", "Filial" }));
        comboHierarchicaltype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboHierarchicaltype.setFocusable(false);
        comboHierarchicaltype.setKeySelectionManager(null);
        comboHierarchicaltype.setLightWeightPopupEnabled(false);
        comboHierarchicaltype.setOpaque(false);
        comboHierarchicaltype.setRequestFocusEnabled(false);
        comboHierarchicaltype.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelBaseInfoLayout = new javax.swing.GroupLayout(panelBaseInfo);
        panelBaseInfo.setLayout(panelBaseInfoLayout);
        panelBaseInfoLayout.setHorizontalGroup(
            panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseInfoLayout.createSequentialGroup()
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseInfoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMainActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBaseInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbHierarchicaltype)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMainActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHierarchicaltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(panelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBaseInfoLayout.setVerticalGroup(
            panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBaseInfoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMainActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMainActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBaseInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHierarchicaltype)
                    .addComponent(comboHierarchicaltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSite.setBorder(null);

        txtEmail.setBorder(null);

        lbSite.setText("Site");

        lbEmail.setText("Email");

        javax.swing.GroupLayout panelInfoAdcLayout = new javax.swing.GroupLayout(panelInfoAdc);
        panelInfoAdc.setLayout(panelInfoAdcLayout);
        panelInfoAdcLayout.setHorizontalGroup(
            panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoAdcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSite, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(37, 37, 37))
        );
        panelInfoAdcLayout.setVerticalGroup(
            panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoAdcLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRegSuppCompLayout = new javax.swing.GroupLayout(panelRegSuppComp);
        panelRegSuppComp.setLayout(panelRegSuppCompLayout);
        panelRegSuppCompLayout.setHorizontalGroup(
            panelRegSuppCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegSuppCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegSuppCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegSuppCompLayout.createSequentialGroup()
                        .addComponent(panelBaseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelInfoAdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegSuppCompLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttRegisterSuppCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRegSuppCompLayout.setVerticalGroup(
            panelRegSuppCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegSuppCompLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegSuppCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBaseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInfoAdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttRegisterSuppCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabEmpresasForn.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nome", "Telefone", "Ramo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabEmpresasForn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabEmpresasForn.setMinimumSize(new java.awt.Dimension(60, 100));
        tabEmpresasForn.setPreferredSize(new java.awt.Dimension(217, 200));
        jScrollPane1.setViewportView(tabEmpresasForn);

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNamePerson.setBorder(null);

        lbNamePerson.setText("Nome");

        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCpf.setText("Cpf");

        txtIdCompany.setBorder(null);

        lbIdCompany.setText("Código Empresa");

        bttRegisterSuppPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconLight.png"))); // NOI18N
        bttRegisterSuppPerson.setText("Cadastrar");
        bttRegisterSuppPerson.setBorderPainted(false);
        bttRegisterSuppPerson.setContentAreaFilled(false);
        bttRegisterSuppPerson.setMaximumSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppPerson.setMinimumSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppPerson.setPreferredSize(new java.awt.Dimension(80, 25));
        bttRegisterSuppPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegisterSuppPersonActionPerformed(evt);
            }
        });

        txtRole.setBorder(null);

        lbRole.setText("Cargo");

        javax.swing.GroupLayout panelRegSuppPersonLayout = new javax.swing.GroupLayout(panelRegSuppPerson);
        panelRegSuppPerson.setLayout(panelRegSuppPersonLayout);
        panelRegSuppPersonLayout.setHorizontalGroup(
            panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                                    .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegSuppPersonLayout.createSequentialGroup()
                                    .addComponent(lbIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                                .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRole)))
                        .addGap(75, 75, 75)
                        .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegSuppPersonLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttRegisterSuppPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRegSuppPersonLayout.setVerticalGroup(
            panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegSuppPersonLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegSuppPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegSuppPersonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(bttRegisterSuppPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbTextleft.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextleft.setForeground(new java.awt.Color(153, 153, 153));
        lbTextleft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextleft.setText(" Fornecedores");

        lbTextMid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextMid.setForeground(new java.awt.Color(153, 153, 153));
        lbTextMid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTextMid.setText("Cadastrar Pessoa");
        lbTextMid.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbTextMid.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lbTextTop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextTop.setForeground(new java.awt.Color(153, 153, 153));
        lbTextTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTextTop.setText("Cadastrar Empresa");
        lbTextTop.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbTextTop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        bttVoltar.setText("Voltar");
        bttVoltar.setBorderPainted(false);
        bttVoltar.setContentAreaFilled(false);
        bttVoltar.setMaximumSize(new java.awt.Dimension(80, 25));
        bttVoltar.setMinimumSize(new java.awt.Dimension(80, 25));
        bttVoltar.setPreferredSize(new java.awt.Dimension(80, 25));
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTextMid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTextTop, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelRegSuppPerson, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRegSuppComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTextTop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRegSuppComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextMid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegSuppPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        dispose();
        MenuView x = new MenuView();
        x.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void bttRegisterSuppCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRegisterSuppCompanyActionPerformed
        
        SupplierCompanyModel suppCompany = new SupplierCompanyModel();

        suppCompany.setCnpj(txtCnpj.getText());
        suppCompany.setName(txtNameCompany.getText());
        suppCompany.setPhone(txtPhone.getText());
        suppCompany.setMainActivity(txtMainActivity.getText());
        suppCompany.setHierarchicaltype(comboHierarchicaltype.getSelectedItem().toString());

        
        suppCompany.setEmail(txtEmail.getText());
        suppCompany.setSite(txtSite.getText());

        suppCompany.setLocalnum(txtLocalNum.getText());
        suppCompany.setStreet(txtStreet.getText());
        suppCompany.setDistrict(txtDistrict.getText());
        suppCompany.setCity(txtCity.getText());
        suppCompany.setEstado(txtState.getText());
        sc.cadastrarEmpresa();

        refreshTable();

    }//GEN-LAST:event_bttRegisterSuppCompanyActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void bttRegisterSuppPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRegisterSuppPersonActionPerformed
        SupplierPersonModel fp = new SupplierPersonModel();
        fp.setName(txtNamePerson.getText());
        fp.setCpf(txtCpf.getText());
        fp.setIdCompany(Integer.parseInt(txtIdCompany.getText()));
        sc.CadastrarFpessoa();

    }//GEN-LAST:event_bttRegisterSuppPersonActionPerformed

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
            java.util.logging.Logger.getLogger(RegSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegSupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RegSupplierView().setVisible(true);
            }
        });
    }

    public void attTema() {
        Theme t = new Theme();
        TitleBar tb = new TitleBar();
        tb.configTitleBar(panelClose, panelIconfied, panelTitleBar, bttClose, bttIconfied, theme);

        Color a = new Color(50, 50, 50);
        Color b = new Color(255, 255, 255);
        btf = a;

        JButton[] btt = {bttRegisterSuppCompany, bttRegisterSuppPerson, bttVoltar};

        JTextField[] txt = {txtNameCompany, txtLocalNum, txtDistrict, txtStreet, txtCity,
            txtState, txtNamePerson, txtIdCompany, txtSite, txtEmail, txtMainActivity, txtRole};

        JFormattedTextField[] txtf = {txtCnpj, txtPhone, txtCpf};

        JLabel[] lb = {lbNameCompany, lbNamePerson, lbCnpj, lbCpf, lbPhone, lbIdCompany, lbRole, lbMainActivity,
            lbCity, lbLocalNum, lbStreet, lbDistrict, lbState, lbEmail, lbSite,lbHierarchicaltype};

        JPanel[] panel = {panelAdress,
            panelBaseInfo, panelClose, panelIconfied, panelInfoAdc, panelMin,
            panelRegSuppComp, panelRegSuppPerson, panelTab, panelTitleBar};
        JTable[] tab = {tabEmpresasForn};
        
//        JComboBox[] combo = {comboHierarchicaltype};
        
        t.refreshButtons(btt, theme);
        t.refreshFormatedTextfields(txtf, theme);
        t.refreshTextFields(txt, theme);
        t.refreshFrame(this, theme);
        t.refreshPanels(panel, theme);
        t.refreshLabels(lb, theme);
        t.refreshTables(tab, theme);
//        t.refreshComboBox(combo, theme);
        
        

        if (theme.equals("dark")) {

            bttRegisterSuppCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconDark.png")));
            bttRegisterSuppPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconDark.png")));
            lbTextleft.setForeground(new Color (153,153,153));
            lbTextTop.setForeground(new Color (153,153,153));
            lbTextMid.setForeground(new Color (153,153,153));
            TitledBorder f = BorderFactory.createTitledBorder(null, "Tabela Fornecedores");
            f.setTitleColor(a);
            tabEmpresasForn.setBorder(f);

        } else {

            if (theme.equals("light")) {

                bttRegisterSuppCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconLight.png")));
                bttRegisterSuppPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bttfornIconLight.png")));
                lbTextleft.setForeground(Color.lightGray);
                lbTextTop.setForeground(Color.lightGray);
                lbTextMid.setForeground(Color.lightGray);

                //painel da tabela
                TitledBorder f = BorderFactory.createTitledBorder(null, "Tabela Fornecedores");
                f.setTitleColor(b);
                tabEmpresasForn.setBorder(f);
                

            }
        }
    }

    public void checkTheme() {
        if (theme.equals("dark")) {
            attTema();
        } else {
            attTema();
        }
    }

    public void refreshTable() { //envia a tabela para ser carregada
        SupplierCompanyModel forn = new SupplierCompanyModel();
        DefaultTableModel tabFmodel = new DefaultTableModel();
        tabFmodel = (DefaultTableModel) tabEmpresasForn.getModel();
        tabFmodel.setRowCount(0);
//        sc.refreshTable(tabFmodel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttClose;
    private javax.swing.JButton bttIconfied;
    private javax.swing.JButton bttMin;
    private javax.swing.JButton bttRegisterSuppCompany;
    private javax.swing.JButton bttRegisterSuppPerson;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JComboBox<String> comboHierarchicaltype;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDistrict;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHierarchicaltype;
    private javax.swing.JLabel lbIdCompany;
    private javax.swing.JLabel lbLocalNum;
    private javax.swing.JLabel lbMainActivity;
    private javax.swing.JLabel lbNameCompany;
    private javax.swing.JLabel lbNamePerson;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbSite;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbStreet;
    private javax.swing.JLabel lbTextMid;
    private javax.swing.JLabel lbTextTop;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JPanel panelAdress;
    private javax.swing.JPanel panelBaseInfo;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelInfoAdc;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegSuppComp;
    private javax.swing.JPanel panelRegSuppPerson;
    private javax.swing.JPanel panelTab;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JTable tabEmpresasForn;
    private javax.swing.JTextField txtCity;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdCompany;
    private javax.swing.JTextField txtLocalNum;
    private javax.swing.JTextField txtMainActivity;
    private javax.swing.JTextField txtNameCompany;
    private javax.swing.JTextField txtNamePerson;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
