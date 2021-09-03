package main.controller;

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
import org.apache.commons.codec.digest.DigestUtils;

public class LoginController {

    ConfigManager config = new ConfigManager();
    LoginRepository ld = new LoginRepository();
    EmployeeRepository empRep = new EmployeeRepository();
    
    LoginRepository logRep = new LoginRepository();
    CriptoController cript = new CriptoController();
    String fileUser = "user";
    String dir = "C:\\ProgramData\\Controle de Estoque";

    public int login(String user, String password) {
        EnvMap em = new EnvMap();
        
        int protLog = logRep.authLogin(user, DigestUtils.md5Hex(password).toLowerCase()); // here send convert the password to MD5 hash to compare in database

        Map<String, String> var = null;
        var = new HashMap<>();
        var.put("user", user);
//        var.put("password", password);

        try {
            em.set(var);
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(System.getenv().get("user"));

        return protLog;
    }

    public void saveLogin(String user, String password) {

        FileManager fm = new FileManager();
        fm.Write(dir, cript.encryptBase64encoder(user), cript.encryptBase64encoder(fileUser));

    }

    public void logout() {

        FileManager fm = new FileManager();
        fm.Write(dir, "null", cript.encryptBase64encoder(fileUser));

    }
}
