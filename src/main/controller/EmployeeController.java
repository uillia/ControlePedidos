package main.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import main.repository.EmployeeRepository;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.model.EmployeeModel;
import util.ConfigManager;

public class EmployeeController {
    
    ConfigManager config = new ConfigManager();
    EmployeeRepository empRep = new EmployeeRepository();
    
    public void registerEmployee(EmployeeModel employee, String password2) {
        if (employee.getPassword().equals(password2)) {
            LocalDate today = LocalDate.now();//gets the today date 
            employee.setRegisterDate(today);
            empRep.insertEmployee(employee);
        }
        
    }
    
    public void deleteEmployee(int id) {
        try {
            if (id >= 0) {
                empRep.deleteEmployee(id);
            }
        } catch (InputMismatchException ex) {
            JOptionPane.showMessageDialog(null, "Id Invalido");
        }
        
    }
    
    public void refreshTable(DefaultTableModel table) {
        ArrayList< EmployeeModel> ArrayListEmp = new ArrayList<>();
        ArrayListEmp = empRep.getAllEmployeesData();
        for (int i = 0; i < ArrayListEmp.size(); i++) {
            
            table.addRow(new Object[]{
                ArrayListEmp.get(i).getIdEmployee(),
                ArrayListEmp.get(i).getName(),
                ArrayListEmp.get(i).getPhone(),
                ArrayListEmp.get(i).getGroup(),});
            
        }
        
    }
    
    public EmployeeModel getLoggedData() {
        String user = config.getValue("user", null, "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\cacheLoguin");
        EmployeeModel emp = new EmployeeModel();
        emp = empRep.getDataEmployeeByUser(user);
        return emp;
    }
    
}
