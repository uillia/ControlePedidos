package main.controller;

import java.time.LocalDate;
import main.DAO.EmployeeDAO;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.DAO.LoginDAO;
import main.model.EmployeeModel;
import util.ConfigManager;

public class EmployeeController {

    ConfigManager config = new ConfigManager();
    EmployeeDAO empdao = new EmployeeDAO();

    public void registerEmployee(EmployeeModel employee, String password2) {
        if (employee.getPassword().equals(password2)) {
            LocalDate today = LocalDate.now();
            employee.setRegisterDate(today);
            empdao.insertEmployee(employee);
        }

    }

    public void deleteEmployee(int id) {
        try {
            if (id >= 0) {
                empdao.deleteEmployee(id);
            }
        } catch (InputMismatchException ex) {
            JOptionPane.showMessageDialog(null, "Id Invalido");
        }

    }

    public void refreshTable(DefaultTableModel table) {
        empdao.refreshEmployeeTable(table);
    }

    public EmployeeModel getLoggedData() {
        String user = config.getValue("user", null, "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\cacheLoguin");
        EmployeeModel emp = new EmployeeModel();
        emp = empdao.getDataEmployeeByUser(user);
        return emp;
    }

}
