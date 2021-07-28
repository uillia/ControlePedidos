package main.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import main.repository.EmployeeRepository;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;
import util.ConfigManager;

public class EmployeeController {

    ConfigManager config = new ConfigManager();
    EmployeeRepository empRep = new EmployeeRepository();

    public void registerEmployee(EmployeeModel employee, String password2) {
        if (employee.getPassword().equals(password2)) {
            if (empRep.verifyUserExistency(employee.getLogin()) == false) {
                if (empRep.verifyCpfExistency(employee.getCpf()) == false) {
                    LocalDate today = LocalDate.now();//gets the today date 
                    employee.setRegisterDate(today);
                    empRep.insertEmployee(employee);
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Cpf ja registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ja registrado");;
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas não se coencidem");
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

    public ArrayList< EmployeeModel> refreshTable() {
        ArrayList< EmployeeModel> ArrayListEmp = new ArrayList<>();
        ArrayListEmp = empRep.getAllEmployeesData();
        return ArrayListEmp;

    }

    public EmployeeModel getLoggedData() {

        String user = config.getValue("user", null, "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControlePedidos\\dados\\cacheLogin");
        EmployeeModel emp = new EmployeeModel();
        emp = empRep.getDataEmployeeByUser(user);
        if (emp == null) {
            JOptionPane.showMessageDialog(null, "O sistema nao pode pegar os dados, Entre no sistema novamente");
            System.exit(0);
        }

        return emp;
    }

}
