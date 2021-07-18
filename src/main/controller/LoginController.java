package main.controller;

import main.repository.EmployeeRepository;
import util.FileManager;
import main.repository.LoginRepository;
import util.ConfigManager;

public class LoginController {

    ConfigManager config = new ConfigManager();
    LoginRepository ld = new LoginRepository();
    EmployeeRepository empRep = new EmployeeRepository();
    String cachePath = "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControleEstoque\\dados\\cacheLoguin";
    LoginRepository logRep = new LoginRepository();

    public int login(String user, String password) {
        int protLog = logRep.authLogin(user, password);
        return protLog;
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

    public void saveLogcache(String user) {

        config.setValue("user", user, cachePath);
        System.out.println("loguinCache salvo com sucesso"); // the login cashe is a temp file with the user of the employee that logged in this aplication

    }

    public void delLogcache() {

        config.setValue("user", "null", cachePath);
        System.out.println("usuario chache apagado");
    }

}
