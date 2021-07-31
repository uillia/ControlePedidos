package main.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.repository.EmployeeRepository;
import util.FileManager;
import main.repository.LoginRepository;
import util.ConfigManager;
import util.CriptoController;
import util.EnvMap;

public class LoginController {

    ConfigManager config = new ConfigManager();
    LoginRepository ld = new LoginRepository();
    EmployeeRepository empRep = new EmployeeRepository();
    String cachePath = "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\NetBeansProjects\\ControlePedidos\\dados\\cacheLogin";
    LoginRepository logRep = new LoginRepository();
    CriptoController cript= new CriptoController();
    String fileUser = "user";
    String filePassWord = "password";
    String dir = "C:\\Users\\uillia\\Documents\\NetBeansProjects\\ControlePedidos\\dados";

    public int login(String user, String password) {
        EnvMap em = new EnvMap();
        int protLog = logRep.authLogin(user, password);

        Map<String, String> var = null;
        var = new HashMap<>();
        var.put("user", user);
        var.put("password", password);
        try {
            em.set(var);
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(System.getenv().get("user"));
//        System.out.println(System.getenv());
        return protLog;
    }

    public void saveLogin(String user, String password) {

        FileManager fm = new FileManager();
        fm.Write(dir, cript.encryptBase64encoder(user), cript.encryptBase64encoder(fileUser));
        fm.Write(dir, cript.encryptBase64encoder(password), cript.encryptBase64encoder(filePassWord));

    }

    public void logout() {

        FileManager fm = new FileManager();
        fm.Write(dir, "null", cript.encryptBase64encoder(fileUser));
        fm.Write(dir, "null", cript.encryptBase64encoder(filePassWord));

    }

    public void saveLogcache(String user) {

//        config.setValue("user", user, cachePath);
//        System.out.println("loguinCache salvo com sucesso"); // the login cashe is a temp file with the user of the employee that logged in this aplication

    }

//    public void delLogcache() {
//
//        config.setValue("user", "null", cachePath);
//        System.out.println("usuario chache apagado");
//    }

}
