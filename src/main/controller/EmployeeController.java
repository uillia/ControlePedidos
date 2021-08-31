package main.controller;

import main.repository.EmployeeRepository;
import java.util.List;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;
import util.ConfigManager;

public class EmployeeController {

    ConfigManager config = new ConfigManager();
    EmployeeRepository empRep = new EmployeeRepository();

    public void registerEmployee(EmployeeModel employee, String password2) {
        empRep.insertEmployee(employee);
    }

    public void editEmployee(EmployeeModel emp) {
        empRep.updateEmployee(emp);

    }

    public List<EmployeeModel> getAllData() {
        List<EmployeeModel> ListEmp = empRep.getAllEmployeesData();
        return ListEmp;

    }

    public EmployeeModel getLoggedData() {

//        String user = config.getValue("user", null, "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControlePedidos\\dados\\cacheLogin");
        String user = System.getenv().get("user"); // get the user if it is stored in the environment variables
        EmployeeModel emp = new EmployeeModel();
        emp = empRep.getDataEmployeeByUser(user);
        if (emp == null) {
            JOptionPane.showMessageDialog(null, "O sistema nao pode pegar os dados, Entre no sistema novamente");
            System.exit(0);
        }

        return emp;
    }

    public EmployeeModel getDataById(int id) {
        EmployeeModel emp = new EmployeeModel();
       emp=empRep.getDataEmployeeById(id);
       return emp;
    }

    public List<EmployeeModel> getEmployeeByName(String name) {
        List<EmployeeModel> empArrList =empRep.getDataEmployeeByName(name);
       return empArrList;
    }

//    public boolean verifyEmployeeEx() {
//        boolean a = empRep.verifyEmployeeUserExistency("' or '' = '");
//        return a; 
//    }

}
