package main.controller;

import main.DAO.EmployeeDAO;
import util.FileManager;
import main.DAO.LoginDAO;
import main.model.EmployeeModel;
import util.ConfigManager;

public class LoginController {

    ConfigManager config = new ConfigManager();
    LoginDAO ld = new LoginDAO();
    EmployeeDAO empdao = new EmployeeDAO();
    
    LoginDAO logDao = new LoginDAO();

    public int login(String user, String password) {
        EmployeeModel interEmp = new EmployeeModel();

        if ((logDao.authLogin(user) != null)) {

            interEmp = logDao.authLogin(user); //the randon instace get the data became the MySql BD in this line 

            if (interEmp.getPassword().equals(password)) {
                System.out.println("as senhas bateram");
                return 1; // in this case, the protocol to login is 1

            } else {
                return 2;// 2 if the passwords doesn't match
            }

        } else {
            return 0;// 0 if the search doesn't find any user 
        }

    }

    public void saveLogin(String user, String password) {
        FileManager fm = new FileManager();
        String path = "C:\\Users\\uillia\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\usuario.txt";
        fm.Write(path, "" + user + "");
        path = "C:\\Users\\uillia\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\senha.txt";
        fm.Write(path, "" + password + "");
    }

    public void logout() {

        FileManager fm = new FileManager();
        String path = "C:\\Users\\uillia\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\usuario.txt";
        fm.Write(path, "null");
        path = "C:\\Users\\uillia\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\senha.txt";
        fm.Write(path, "null");

    }

    public EmployeeModel getLoggedData() {
        String user = config.getValue("user", null, "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\cacheLoguin");
        EmployeeModel emp = new EmployeeModel();
        emp = ld.authLogin(user);
        

        return emp;
    }

}
