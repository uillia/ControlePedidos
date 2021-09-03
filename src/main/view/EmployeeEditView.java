package main.view;

import util.GraphElementsManipulator.Theme;
import util.GraphElementsManipulator.TitleBar;
import util.FileManager;
import util.ConfigManager;
import main.controller.EmployeeController;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.model.EmployeeModel;
import util.CriptoController;

/**
 *
 * @author uillia
 */
public class EmployeeEditView extends javax.swing.JFrame {

    EmployeeController empc = new EmployeeController();
    int id;

    ConfigManager conf = new ConfigManager();
    FileManager ac = new FileManager();
    String dir= "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Controle de Estoque";
    String file= "theme.properties";
    String theme = conf.getValue("theme", "light", dir, file);
    Color btf;
    List<EmployeeModel> AllemployeeArr;

    int xMouse, yMouse;

    EmployeeModel employeeEdit = new EmployeeModel();//get the data

    /**
     * Creates new form TelaCadFunc
     */
    public EmployeeEditView() {
        
        initComponents();
        checkTheme();
        getAllDataEmp();
        refreshTable("");

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
        txtAdress = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        lbDistrict = new javax.swing.JLabel();
        lbAdress = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbRegisterDate = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        comboStatus = new javax.swing.JComboBox<>();
        lbStatus = new javax.swing.JLabel();
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
        txtNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

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

        txtAdress.setBorder(null);

        txtDistrict.setBorder(null);

        txtCity.setBorder(null);

        txtState.setBorder(null);

        lbState.setText("Estado");

        lbCity.setText("Cidade");

        lbDistrict.setText("Bairro");

        lbAdress.setText("Endereço");

        javax.swing.GroupLayout panelAdressLayout = new javax.swing.GroupLayout(panelAdress);
        panelAdress.setLayout(panelAdressLayout);
        panelAdressLayout.setHorizontalGroup(
            panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDistrict, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbState))
                .addGap(13, 13, 13)
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdressLayout.createSequentialGroup()
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addComponent(txtCity)
                    .addComponent(txtAdress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelAdressLayout.setVerticalGroup(
            panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(29, Short.MAX_VALUE))
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

        lbRole.setText("Cargo");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Funcionário" }));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empregado", "Desempregado" }));

        lbStatus.setText("Status");

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
                            .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegEmpLayout.createSequentialGroup()
                                    .addComponent(lbBirthdate)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegEmpLayout.createSequentialGroup()
                                    .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbRole)
                                        .addComponent(lbStatus))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addComponent(lbRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRegEmpLayout.setVerticalGroup(
            panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegEmpLayout.createSequentialGroup()
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegEmpLayout.createSequentialGroup()
                        .addContainerGap()
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
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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
            .addComponent(bttClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                "Id", "Nome", "Telll", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        txtNameSearch.setBorder(null);

        btnSearch.setText("Pesquisar");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTableLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelTableLayout.createSequentialGroup()
                        .addComponent(txtNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRegEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTextTop, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTextTop)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbTextleft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
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
        if (employeeEdit == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Funcionário");

        } else {
            EmployeeModel employee = new EmployeeModel();
            employee.setIdEmployee(employeeEdit.getIdEmployee());
            System.out.println("ID: " + employeeEdit.getIdEmployee());
            employee.setPhone(txtPhone.getText());
            employee.setAdress(txtAdress.getText());
            employee.setDistrict(txtDistrict.getText());
            employee.setCity(txtCity.getText());
            employee.setState(txtState.getText());
            employee.setRole(comboRole.getSelectedItem().toString());
            employee.setIdStatus(comboStatus.getSelectedIndex());

            EmployeeController fc = new EmployeeController();
            fc.editEmployee(employee);
            JOptionPane.showMessageDialog(this, "Funcionário editado com sucesso");
            getAllDataEmp();
            refreshTable("");
        }

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
        if (this.getExtendedState() != RegSupplierView.MAXIMIZED_BOTH) {
            this.setExtendedState(RegSupplierView.MAXIMIZED_BOTH);

        } else {
            this.setExtendedState(RegSupplierView.NORMAL);
        }
    }//GEN-LAST:event_bttMinMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        refreshTable(txtNameSearch.getText());

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tabOrderEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderEditMouseClicked
        try {
            putData();
        } catch (ArrayIndexOutOfBoundsException ax) {
            System.out.println("Erro:"+ ax.getMessage());
        }
    }//GEN-LAST:event_tabOrderEditMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeEditView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new EmployeeEditView().setVisible(true);
            }
        });
    }

    public void refreshTheme() {
        TitleBar tb = new TitleBar();
        Theme t = new Theme();

        //Configuration of title bar
        tb.configTitleBar(panelClose, panelIconfied, panelTitleBar, bttClose, bttIconfied, theme);

        JButton[] btt = {btnSearch,btnUpdate, btnVoltar};
        JTextField[] txt = {txtNameSearch,txtAdress, txtDistrict, txtCity,
            txtState,};
        JFormattedTextField[] txtf = {txtPhone};

        JLabel[] lb = {lbRole,lbStatus,lbDistrict, lbCity, lbBirthdate, lbState, lbRole,
            lbName, lbPhone, lbAdress, lbTextTop, lbTextleft, lbcpf, lbRegisterDate};
        JPanel[] panel = {panelTable,panelMin, panelRegEmp, panelAdress, panelClose, panelIconfied,
            panelTitleBar};
        JLabel[] lbDesign = {lbTextTop, lbTextleft};
        JTextField[] txtUnEdit = {txtName};
        JFormattedTextField[] txtfUnEdit = {txtCpf, txtBirthdate};
        JTable[] jtabel = {tabOrderEdit};

        t.refreshButtons(btt, theme);
        t.refreshFrame(this, theme);
        t.refreshLabels(lb, theme);
        t.refreshTextFields(txt, theme);
        t.refreshFormatedTextfields(txtf, theme);
        t.refreshPanels(panel, theme);
        t.refreshDesignLabels(lbDesign, theme);
        t.refreshTextFieldUnEditable(txtUnEdit, theme);
        t.refreshFormatedTextfieldsUnEditable(txtfUnEdit, theme);
        t.refreshTables(jtabel, theme);

        if (theme.equals("dark")) {

            btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/addfuncIconDark.png")));

        } else {

            if (theme.equals("light")) {

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
    public void getAllDataEmp(){
        AllemployeeArr = empc.getAllData();
    }

    public void putData() {
        try {
            Object idO = tabOrderEdit.getValueAt(tabOrderEdit.getSelectedRow(), 0); //i get the real id of the employee when i clicled in the table
            String id = idO.toString();

            int idEmp = Integer.parseInt(id);
            int indexArr = 0;

            for (int i = 0; i < AllemployeeArr.size(); i++) {
                if (AllemployeeArr.get(i).getIdEmployee() == idEmp) { 
                    indexArr = i;
                    //get the index of the order that is selected in the table to search and get the data that is in the list AllemployeeArr
                }

            }

            employeeEdit = AllemployeeArr.get(indexArr); // The global EmployeeEdit get the data in array

            txtName.setText(employeeEdit.getName());
            txtCpf.setText(employeeEdit.getCpf());
            txtPhone.setText(employeeEdit.getPhone());
            txtAdress.setText(employeeEdit.getAdress());
            txtDistrict.setText(employeeEdit.getDistrict());
            try {
                txtBirthdate.setText(employeeEdit.getBirthDate().toLocaleString());
            } catch (NullPointerException e) {
                txtBirthdate.setText(null);
            }
            txtCity.setText(employeeEdit.getCity());
            txtState.setText(employeeEdit.getState());
            comboStatus.setSelectedIndex(employeeEdit.getIdStatus());
            comboRole.setSelectedItem(employeeEdit.getRole());
            lbRegisterDate.setText("Registrado desde: " +employeeEdit.getRegisterDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

//        lbRegisterDate.setText("Registrado desde: " + emp.getRegisterDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Nome não encotrado, Erro: " + np.getMessage());
        }
    }

    public void refreshTable(String name) { //envia a tabela para ser carregada

        DefaultTableModel tabFmodel = new DefaultTableModel();
        tabFmodel = (DefaultTableModel) tabOrderEdit.getModel();
        tabFmodel.setRowCount(0);

        for (int i = 0; i < AllemployeeArr.size(); i++) {
            if (AllemployeeArr.get(i).getName().startsWith(name)) {

                tabFmodel.addRow(new Object[]{
                    AllemployeeArr.get(i).getIdEmployee(),
                    AllemployeeArr.get(i).getName(),
                    AllemployeeArr.get(i).getPhone(),
                    AllemployeeArr.get(i).getRole(),});

            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton bttClose;
    private javax.swing.JButton bttIconfied;
    private javax.swing.JButton bttMin;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbAdress;
    private javax.swing.JLabel lbBirthdate;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbDistrict;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRegisterDate;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTextTop;
    private javax.swing.JLabel lbTextleft;
    private javax.swing.JLabel lbcpf;
    private javax.swing.JPanel panelAdress;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelIconfied;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegEmp;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel panelTitleBar;
    private javax.swing.JTable tabOrderEdit;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JFormattedTextField txtBirthdate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameSearch;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables

}
