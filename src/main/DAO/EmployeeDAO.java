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
            PreparedStatement pst = c.con.prepareStatement("INSERT INTO funcionarios "
                    + " (nome, cpf, datanasc, numtel, numcasa, rua, bairro, cidade, estado, login, senha, grupo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
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

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso ", "", 1);

            pst.close();
            c.fechar_Conexao();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void attTabelaFuncionarios(DefaultTableModel table) {
        c.Conectar();

        try {

            String sql = "Select codFuncionario, nome, numtel, grupo"
                    + " from Funcionarios Order by codFuncionario asc";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {

                table.addRow(new Object[]{
                    rs.getString("codFuncionario"),
                    rs.getString("nome"),
                    rs.getString("numtel"),
                    rs.getString("grupo")
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
            String sql = "delete from Funcionarios where codFuncionario = " + id + "";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }

    }
}
