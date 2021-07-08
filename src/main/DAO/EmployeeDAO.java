package main.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.model.EmployeeModel;

/**
 *
 * @author uillia
 */
public class EmployeeDAO {

    MySqlConnection c = new MySqlConnection();

    public void insertEmployee(EmployeeModel func) {
        try {

            c.Conectar();
            PreparedStatement pst = c.con.prepareStatement("insert into employees "
                    + " (name, cpf, birthDate, phone, houseNum, street, district, city, state, login, password, role, registerDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, func.getName());
            pst.setString(2, func.getCpf());
            pst.setDate(3, new java.sql.Date(func.getBirthDate().getTime()));
            pst.setString(4, func.getPhone());
            pst.setString(5, func.getHouseNumber());
            pst.setString(6, func.getStreet());
            pst.setString(7, func.getDistrict());
            pst.setString(8, func.getCity());
            pst.setString(9, func.getEstado());
            pst.setString(10, func.getLogin());
            pst.setString(11, func.getPassword());
            pst.setString(12, func.getGroup());
            pst.setString(13, func.getRegisterDate().toString());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso ", "", 1);

            pst.close();
            c.fechar_Conexao();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void refreshEmployeeTable(DefaultTableModel table) {
        c.Conectar();

        try {

            String sql = "Select idEmployee, name, phone, role from employees Order by idEmployee asc";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {

                table.addRow(new Object[]{
                    rs.getString("idEmployee"),
                    rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("role")
                });
            }

            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void deleteEmployee(int id) {
        c.Conectar();
        try {
            String sql = "delete from employees where idEmployee = " + id + "";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }

    }
    public EmployeeModel getDataEmployeeByUser(String login) {
        EmployeeModel funcLog = new EmployeeModel();    
        MySqlConnection c = new MySqlConnection();
        c.Conectar();
        
        
        try {
            
            String sql="Select * from employees where login ='" +login+ "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();
            
            while (rs.next()) {

                funcLog.setIdEmployee(rs.getInt("idEmployee"));
                funcLog.setName(rs.getString("name"));
                funcLog.setCpf(rs.getString("cpf"));
                funcLog.setPhone(rs.getString("phone"));
                funcLog.setBirthDate(rs.getDate("birthDate"));
                funcLog.setEstado(rs.getString("state"));
                funcLog.setCity(rs.getString("city"));
                funcLog.setDistrict(rs.getString("district"));
                funcLog.setHouseNumber(rs.getString("houseNum"));
                funcLog.setLogin(rs.getString("login"));
                funcLog.setPassword(rs.getString("password"));
                funcLog.setGroup(rs.getString("role"));
                funcLog.setRegisterDate(rs.getDate("registerDate").toLocalDate());
                
                
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
