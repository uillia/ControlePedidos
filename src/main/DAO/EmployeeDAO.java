package main.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import main.model.EmployeeModel;

/**
 *
 * @author uillia
 */
public class EmployeeDAO {

    MySqlConnection c = new MySqlConnection();

    public void insertEmployee(EmployeeModel emp) {
        try {

            c.Connect();
            PreparedStatement pst = c.con.prepareStatement("insert into employees "
                    + " (name, cpf, birthDate, phone, houseNum, street, district, city, state, login, password, role, registerDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, emp.getName());
            pst.setString(2, emp.getCpf());
            pst.setDate(3, new java.sql.Date(emp.getBirthDate().getTime()));
            pst.setString(4, emp.getPhone());
            pst.setString(5, emp.getHouseNumber());
            pst.setString(6, emp.getStreet());
            pst.setString(7, emp.getDistrict());
            pst.setString(8, emp.getCity());
            pst.setString(9, emp.getState());
            pst.setString(10, emp.getLogin());
            pst.setString(11, emp.getPassword());
            pst.setString(12, emp.getGroup());
            pst.setString(13, emp.getRegisterDate().toString());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso ", "", 1);

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void refreshEmployeeTable(DefaultTableModel table) {
        c.Connect();

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
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void deleteEmployee(int id) {
        c.Connect();
        try {
            String sql = "delete from employees where idEmployee = " + id + "";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
        c.close_Connection();

    }

    public EmployeeModel getDataEmployee(String field, String value) {
        EmployeeModel empLog = new EmployeeModel();
        c.Connect();

        try {

            String sql = "Select * from employees where " + field + " ='" + value + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {

                empLog.setIdEmployee(rs.getInt("idEmployee"));
                empLog.setName(rs.getString("name"));
                empLog.setCpf(rs.getString("cpf"));
                empLog.setPhone(rs.getString("phone"));
                empLog.setBirthDate(rs.getDate("birthDate"));
                empLog.setState(rs.getString("state"));
                empLog.setCity(rs.getString("city"));
                empLog.setDistrict(rs.getString("district"));
                empLog.setHouseNumber(rs.getString("houseNum"));
                empLog.setLogin(rs.getString("login"));
                empLog.setPassword(rs.getString("password"));
                empLog.setGroup(rs.getString("role"));
                empLog.setRegisterDate(rs.getDate("registerDate").toLocalDate());

            }

            System.out.println("Usuario Encontrado");
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            return null;
        }
        c.close_Connection();
        return empLog;
    }

}
