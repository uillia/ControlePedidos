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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.model.EmployeeModel;

/**
 *
 * @author uillia
 */
public class ProfileEditView extends javax.swing.JFrame {

    
    EmployeeController empc = new EmployeeController();
    ConfigManager conf = new ConfigManager();
    FileManager ac = new FileManager();
    String theme = conf.getValue("theme", "light", "C:\\Users\\"+System.getProperty("user.name") +"\\Documents\\Controle de Estoque\\preferences\\theme.properties");
    Color btf;
    int xMouse, yMouse;
    EmployeeModel emp =  empc.getLoggedData(); 
    

    /**
     * Creates new form TelaCadFunc
     */
    public ProfileEditView() {
        initComponents();
        checkTheme();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegEmp = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbcpf = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        lbBirthdate = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        panelAdress = new javax.swing.JPanel();
        txtHomeNum = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        lbDistrict = new javax.swing.JLabel();
        lbStreet = new javax.swing.JLabel();
        lbHomeNum = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        panelSis = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        lbLogin = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtPasswordConf = new javax.swing.JPasswordField();
        lbPasswordConf = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
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

        txtName.setEditable(false);
        txtName.setBorder(null);

        lbName.setText("Nome");

        lbcpf.setText("CPF");

        lbPhone.setText("Número");

        txtPhone.setBorder(null);
        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbBirthdate.setText("Data de nacimento");

        txtBirthdate.setEditable(false);
        txtBirthdate.setBorder(null);
        try {
            txtBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCpf.setEditable(false);
        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        panelAdress.setToolTipText("");

        txtHomeNum.setBorder(null);

        txtStreet.setBorder(null);

        txtDistrict.setBorder(null);

        txtCity.setBorder(null);

        txtState.setBorder(null);

        lbState.setText("Estado");

        lbCity.setText("Cidade");

        lbDistrict.setText("Bairro");

        lbStreet.setText("Rua");

        lbHomeNum.setText("N°");

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
                        .addComponent(lbHomeNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbState))
                .addGap(13, 13, 13)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdressLayout.createSequentialGroup()
                        .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        panelAdressLayout.setVerticalGroup(
            panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdressLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbHomeNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHomeNum, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
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
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lbCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconLight.png"))); // NOI18N
        btnUpdate.setText("Atualizar");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setMaximumSize(new java.awt.Dimension(80, 25));
        btnUpdate.setMinimumSize(new java.awt.Dimension(80, 25));
        btnUpdate.setPreferredSize(new java.awt.Dimension(80, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtPassword.setBorder(null);

        txtLogin.setBorder(null);

        lbLogin.setText("Login");

        lbPassword.setText("Senha");

        txtPasswordConf.setBorder(null);

        lbPasswordConf.setText("Repetir Senha");

        lbRole.setText("Cargo");

        txtRole.setBorder(null);

        javax.swing.GroupLayout panelSisLayout = new javax.swing.GroupLayout(panelSis);
        panelSis.setLayout(panelSisLayout);
        panelSisLayout.setHorizontalGroup(
            panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSisLayout.createSequentialGroup()
                        .addComponent(lbLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSisLayout.createSequentialGroup()
                        .addComponent(lbPasswordConf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPasswordConf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSisLayout.createSequentialGroup()
                        .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPassword)
                            .addComponent(lbRole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelSisLayout.setVerticalGroup(
            panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSisLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordConf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPasswordConf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

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
                                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addComponent(lbBirthdate)
                                .addGap(4, 4, 4)
                                .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(panelSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(panelAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        panelRegEmpLayout.setVerticalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegEmpLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelSis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        lbTextleft.setText(emp.getName());

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTextTop, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTextTop)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        MenuView x = new MenuView();
        x.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String passwordRep= null;
        EmployeeModel func = new EmployeeModel();
        func.setName(txtName.getText());
        func.setCpf(txtCpf.getText());
        func.setPhone(txtPhone.getText());
        func.setHouseNumber(txtHomeNum.getText());
        func.setStreet(txtStreet.getText());
        func.setDistrict(txtDistrict.getText());
        func.setCity(txtCity.getText());
        func.setState(txtState.getText());
        func.setLogin(txtLogin.getText());
        func.setPassword(txtPassword.getText());
        passwordRep = txtPasswordConf.getText();

        try {
            func.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(txtBirthdate.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(ProfileEditView.class.getName()).log(Level.SEVERE, null, ex);
        }
        EmployeeController fc = new EmployeeController();
        fc.registerEmployee(func, passwordRep);
        

    }//GEN-LAST:event_btnUpdateActionPerformed

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
        if (this.getExtendedState()!= RegSupplierView.MAXIMIZED_BOTH) {
            this.setExtendedState(RegSupplierView.MAXIMIZED_BOTH);

        }else{
            this.setExtendedState(RegSupplierView.NORMAL);}
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
            java.util.logging.Logger.getLogger(ProfileEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProfileEditView().setVisible(true);
            }
        });
    }

    public void refreshTheme() {
        TitleBar tb = new TitleBar();
        Theme t = new Theme();
        
        //Configuration of title bar
        tb.configTitleBar(panelClose,panelIconfied, panelTitleBar,bttClose, bttIconfied, theme);
        
        JButton[] btt = {btnUpdate, btnVoltar};
        JTextField[] txt = {txtRole,txtName, txtHomeNum, txtDistrict, txtStreet, txtCity,
        txtState, txtLogin, };
        JFormattedTextField[] txtf = {txtCpf, txtPhone, txtBirthdate};
        JPasswordField[] txtp = {txtPassword, txtPasswordConf};
        JLabel[] lb = {lbDistrict,lbCity,lbBirthdate,lbState,lbRole,lbLogin,
        lbName,lbHomeNum,lbPhone,lbStreet,lbTextTop,lbTextleft,lbcpf,lbPassword,lbPasswordConf};     
        JPanel[] panel = {panelMin,panelRegEmp,panelAdress,panelClose,panelIconfied,
        panelSis,panelTitleBar};
        
        
        t.refreshButtons(btt, theme);
        t.refreshFrame(this, theme);
        t.refreshLabels(lb, theme);
        t.refreshTextFields(txt, theme);
        t.refreshPasswordFields(txtp, theme);
        t.refreshFormatedTextfields(txtf, theme);
        t.refreshPanels(panel, theme);
        
        if (theme.equals("dark")) {
            
            btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconDark.png")));
            
            
            lbTextleft.setForeground(new Color (153,153,153));
            lbTextTop.setForeground(new Color (153,153,153));
           
            
            
        } else {

            

            if (theme.equals("light")) {
                lbTextleft.setForeground(Color.lightGray);
                lbTextTop.setForeground(Color.lightGray);
               
                
                btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconLight.png")));
               
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton bttClose;
    private javax.swing.JButton bttIconfied;
    private javax.swing.JButton bttMin;
    private javax.swing.JLabel lbBirthdate;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbDistrict;
    private javax.swing.JLabel lbHomeNum;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPasswordConf;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbStreet;
    private javax.swing.JLabel lbTextTop;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JLabel lbcpf;
    private javax.swing.JPanel panelAdress;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegEmp;
    private javax.swing.JPanel panelSis;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JFormattedTextField txtBirthdate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtHomeNum;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConf;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
