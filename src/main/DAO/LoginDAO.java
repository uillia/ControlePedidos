package main.DAO;

import util.CriptoController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;

public class LoginDAO {

    public CriptoController otp = new CriptoController();

    public EmployeeModel authLogin(String login) {
        EmployeeModel funcLog = new EmployeeModel();
        MySqlConnection c = new MySqlConnection();
        c.Conectar();

        try {

            String sql = "Select * from employees where login ='" + login + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                funcLog.setLogin(rs.getString("login"));
                funcLog.setPassword(rs.getString("password"));
            }

            System.out.println("Usuario Encontrado");
            pst.close();
            return funcLog;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            return null;
        }

    }

}
