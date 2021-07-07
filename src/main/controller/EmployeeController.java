package main.controller;

import main.DAO.EmployeeDAO;
import main.controller.LoginController;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.DAO.LoginDAO;
import main.model.EmployeeModel;
import util.ConfigManager;

public class EmployeeController {
    
    
    ConfigManager config = new ConfigManager();
    LoginDAO ld = new LoginDAO();
    EmployeeDAO empdao = new EmployeeDAO();

    public void registerEmployee(EmployeeModel func, String senhaRep) {
        if (func.getPassword().equals(senhaRep)) {
            empdao.insertEmployee(func);
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
        EmployeeModel f = new EmployeeModel();
        empdao.attTabelaFuncionarios(table);
    }


}
