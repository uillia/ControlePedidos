package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.model.EmployeeModel;
import util.CriptoController;

/**
 *
 * @author uillia
 */
public class EmployeeRepository {

    CriptoController cc = new CriptoController();

    MySqlConnection c = new MySqlConnection();

    public void insertEmployee(EmployeeModel emp) {

        try {

            c.Connect();
            PreparedStatement pst = c.con.prepareStatement("insert into employees "
                    + " (name, cpf, birthDate, phone, adress, district, city, state, login, password, role, registerDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, emp.getName());
            pst.setString(2, emp.getCpf());
            pst.setDate(3, new java.sql.Date(emp.getBirthDate().getTime()));
            pst.setString(4, emp.getPhone());
            pst.setString(5, emp.getAdress());
            pst.setString(6, emp.getDistrict());
            pst.setString(7, emp.getCity());
            pst.setString(8, emp.getState());
            pst.setString(9, emp.getLogin());
            pst.setString(10, cc.encryptBase64encoder(emp.getPassword()));
            pst.setString(11, emp.getGroup());
            pst.setString(12, emp.getRegisterDate().toString());

            pst.execute();

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public ArrayList<EmployeeModel> getAllEmployeesData() {
        ArrayList<EmployeeModel> arrayListEmp = new ArrayList< EmployeeModel>();
        c.Connect();
        try {

            String sql = "Select * from employees Order by idEmployee asc";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                EmployeeModel emp = new EmployeeModel();
                emp.setIdEmployee(rs.getInt("idEmployee"));
                emp.setName(rs.getString("name"));
                emp.setPhone(rs.getString("phone"));
                emp.setGroup(rs.getString("role"));
                arrayListEmp.add(emp);
            }

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
        return arrayListEmp;
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

    //Methods to get Data
    public EmployeeModel getDataEmployeeById(int id) {
        EmployeeModel empLog = new EmployeeModel();
        c.Connect();

        try {

            String sql = "Select * from employees where idEmployee ='" + id + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                empLog.setIdEmployee(rs.getInt("idEmployee"));
                empLog.setName(rs.getString("name"));
                empLog.setCpf(rs.getString("cpf"));
                empLog.setPhone(rs.getString("phone"));
                empLog.setBirthDate(rs.getDate("birthDate"));
                empLog.setAdress(rs.getString("adress"));
                empLog.setDistrict(rs.getString("district"));
                empLog.setCity(rs.getString("city"));
                empLog.setState(rs.getString("state"));
                empLog.setLogin(rs.getString("login"));
                empLog.setPassword(rs.getString("password"));
                empLog.setGroup(rs.getString("role"));
                empLog.setRegisterDate(rs.getDate("registerDate").toLocalDate());
            }
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            return null;
        }
        c.close_Connection();
        if (empLog.getIdEmployee() == id) {
            return empLog;
        }
        return null;

    }

    public EmployeeModel getDataEmployeeByUser(String user) {
        EmployeeModel empLog = new EmployeeModel();
        c.Connect();
        int id = 0;
        try {
            String sql = "Select * from employees where login ='" + user + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();
            while (rs.next()) {
                id = rs.getInt("idEmployee");
            }
            System.out.println(id);
            pst.close();

        } catch (SQLException e) {
            return null;
        }
        empLog = getDataEmployeeById(id);
        if (empLog.getLogin().equals(user)) {
            return empLog;
        } else {
            return null;
        }
    }

    public EmployeeModel getDataEmployeeByCpf(String cpf) {
        EmployeeModel empLog = new EmployeeModel();
        c.Connect();
        int id = 0;
        try {
            String sql = "Select * from employees where cpf ='" + cpf + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();
            while (rs.next()) {
                id = rs.getInt("idEmployee");
            }
            System.out.println(id);

            pst.close();

        } catch (SQLException e) {
            return null;
        }
        empLog = getDataEmployeeById(id);
        if (empLog.getCpf().equals(cpf)) {
            return empLog;
        } else {
            return null;
        }
    }

    //Methods to do verifications easly
    public boolean verifyCpfExistency(String cpf) {
        boolean a = false;
        c.Connect();
        try {
            String sql = "Select * from employees where cpf ='" + cpf + "'";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();

            if (pst.getResultSet().next()) {
                a = true;
            } else {
                a = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepository.class.getName()).log(Level.SEVERE, null, ex);

        }
        c.close_Connection();
        return a;
    }

    public boolean verifyUserExistency(String user) {
        boolean a = false;
        c.Connect();
        try {
            String sql = "Select * from employees where login ='" + user + "'";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();
            if (pst.getResultSet().next()) {
                a = true;
            } else {
                a = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepository.class.getName()).log(Level.SEVERE, null, ex);

        }
        c.close_Connection();
        return a;
    }
}
