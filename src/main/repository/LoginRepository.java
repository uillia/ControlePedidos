package main.repository;
import util.CriptoController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;

public class LoginRepository {
    

    public CriptoController otp = new CriptoController();

    public int authLogin(String user, String password) {
        
        EmployeeModel empLog = new EmployeeModel();
        MySqlConnection c = new MySqlConnection();
        c.Connect();

        try {

            String sql = "Select login, password from employees where login ='" + user + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                empLog.setLogin(rs.getString("login"));
                empLog.setPassword(rs.getString("password"));
            }

            System.out.println("Usuario Encontrado");
            pst.close();
            

        if ((empLog.getLogin() != null && empLog.getLogin().equals(user))) {

            if (empLog.getPassword().equals((password))) {
                System.out.println("as senhas bateram");
                
                
                return 1; // in this case, the protocol to login is 1

            } else {
                return 2;// 2 if the passwords doesn't match
            }

        } else {
            return 0;// 0 if the search doesn't find any user 
        }   
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            return 0;
        }

    }

}
