
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
            
            String sql="Select * from funcionarios where login ='" +login+ "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();
            
            while (rs.next()) {

                funcLog.setCod(rs.getInt("codFuncionario"));
                funcLog.setName(rs.getString("nome"));
                funcLog.setCpf(rs.getString("cpf"));
                funcLog.setPhone(rs.getString("numtel"));
                funcLog.setBirthDate(rs.getDate("datanasc"));
                funcLog.setEstado(rs.getString("estado"));
                funcLog.setCity(rs.getString("cidade"));
                funcLog.setDistrict(rs.getString("bairro"));
                funcLog.setHouseNumber(rs.getString("numcasa"));
                funcLog.setLogin(rs.getString("login"));
                funcLog.setPassword(rs.getString("senha"));
                funcLog.setGroup(rs.getString("grupo"));
                
                
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
