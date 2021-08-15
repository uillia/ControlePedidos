package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.model.EmployeeModel;

/**
 *
 * @author uillia
 */
public class EmployeeRepository {

    MySqlConnection c = new MySqlConnection();

    public void insertEmployee(EmployeeModel emp) {
        if (verifyEmployeeUserExistency(emp.getLogin()) == false) {
            if (verifyEmployeeCpfExistency(emp.getCpf()) == false) {
                try {

                    c.Connect();
                    PreparedStatement pst = c.con.prepareStatement("insert into employees "
                            + " (name, cpf, birthDate, phone, adress, district, city, state, login, password, role, registerDate) VALUES (?,?,?,?,?,?,?,?,?,MD5(?),?,?)");
                    pst.setString(1, emp.getName());
                    pst.setString(2, emp.getCpf());
                    pst.setDate(3, new java.sql.Date(emp.getBirthDate().getTime()));
                    pst.setString(4, emp.getPhone());
                    pst.setString(5, emp.getAdress());
                    pst.setString(6, emp.getDistrict());
                    pst.setString(7, emp.getCity());
                    pst.setString(8, emp.getState());
                    pst.setString(9, emp.getLogin());
                    pst.setString(10, emp.getPassword());
                    pst.setString(11, emp.getRole());
                    pst.setString(12, emp.getRegisterDate().toString());

                    pst.execute();

                    pst.close();
                    c.close_Connection();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
                }
            } else {
            }
        } else {
        }
    }

    public List<EmployeeModel> getAllEmployeesData() {
        List<EmployeeModel> arrayListEmp = new ArrayList< EmployeeModel>();
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
                emp.setCpf(rs.getString("cpf"));
                emp.setPhone(rs.getString("phone"));
                emp.setBirthDate(rs.getDate("birthDate"));
                emp.setAdress(rs.getString("adress"));
                emp.setDistrict(rs.getString("district"));
                emp.setCity(rs.getString("city"));
                emp.setState(rs.getString("state"));
                
                emp.setRole(rs.getString("role"));
                emp.setRegisterDate(rs.getDate("registerDate").toLocalDate());
                emp.setIdStatus(rs.getInt("idStatus"));
                
                arrayListEmp.add(emp);
            }

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
        return arrayListEmp;
    }

    public void editEmployee(EmployeeModel emp) {
        c.Connect();
        try {
            String sql = "update employees set phone = ?, adress = ?, district = ?, city = ?,"
                    + " state = ?, role = ?, idStatus=? where idEmployee ='" + emp.getIdEmployee() + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.setString(1, emp.getPhone());
            pst.setString(2, emp.getAdress());
            pst.setString(3, emp.getDistrict());
            pst.setString(4, emp.getCity());
            pst.setString(5, emp.getState());
            pst.setString(6, emp.getRole());
            pst.setInt(7, emp.getIdStatus());

            if (verifyEmployeeIdExistency(emp.getIdEmployee())) {
                pst.execute();
            } else {
                Logger.getLogger(EmployeeRepository.class.getName()).log(Level.SEVERE, "ID inválido");
            }

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
                empLog.setRole(rs.getString("role"));
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

    public List<EmployeeModel> getDataEmployeeByName(String name) {

        List<EmployeeModel> empArrList = null;
        c.Connect();

        try {
            String sql = "Select em.*, st.description from employees em join employeestatus st on em.idEmployeeStatus = st.idEmployeeStatus where name ='" + name + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                EmployeeModel emp = new EmployeeModel();
                emp.setIdEmployee(rs.getInt("idEmployee"));
                emp.setName(rs.getString("name"));
                emp.setCpf(rs.getString("cpf"));
                emp.setPhone(rs.getString("phone"));
                emp.setBirthDate(rs.getDate("birthDate"));
                emp.setAdress(rs.getString("adress"));
                emp.setDistrict(rs.getString("district"));
                emp.setCity(rs.getString("city"));
                emp.setState(rs.getString("state"));
                emp.setLogin(rs.getString("login"));
                emp.setPassword(rs.getString("password"));
                emp.setRole(rs.getString("role"));
                emp.setRegisterDate(rs.getDate("registerDate").toLocalDate());
                emp.setIdStatus(rs.getInt("idStatus"));

                if (name.equals(emp.getName())) {
                    empArrList.add(emp);
                }

            }

            pst.close();

        } catch (SQLException e) {
            return null;
        }

        return empArrList;
    }

//Functions to do verifications easly
    public boolean verifyEmployeeCpfExistency(String cpf) {
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
            Logger.getLogger(EmployeeRepository.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
        c.close_Connection();
        return a;
    }

    public boolean verifyEmployeeUserExistency(String user) {
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
            Logger.getLogger(EmployeeRepository.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
        c.close_Connection();
        return a;
    }

    public boolean verifyEmployeeIdExistency(int id) {
        boolean a = false;
        c.Connect();
        try {
            String sql = "Select * from employees where idEmployee ='" + id + "'";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();

            if (pst.getResultSet().next()) {
                a = true;
            } else {
                a = false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeRepository.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
        c.close_Connection();
        return a;
    }

}
