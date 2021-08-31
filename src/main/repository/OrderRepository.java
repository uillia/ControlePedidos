package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;
import main.model.ItemModel;
import main.model.OrderModel;

/**
 *
 * @author uillia
 */
public class OrderRepository {

    MySqlConnection c = new MySqlConnection();
    OrderItemsRepository oir = new OrderItemsRepository();
    SupplierRepository sr = new SupplierRepository();

    public void addOrder(OrderModel om) {
        if (sr.verifySupplierExistenceById(om.getIdSupplierPerson())) {

            try {

                c.Connect();
                PreparedStatement pstOrder = c.con.prepareStatement("insert into orders "
                        + " (idOrder, description, registerDate, prevDeliveryDate, initialPrice, finalPrice, comments, idEmployee, prevDays,idSupplierEmployee,idStatusOrder) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
                pstOrder.setInt(1, om.getIdOrder());
                pstOrder.setString(2, om.getDescription());
                pstOrder.setString(3, LocalDate.now().toString());
                pstOrder.setString(4, om.getPrevDeliveryDate().toString());
                pstOrder.setDouble(5, om.getInitialPrice());
                pstOrder.setDouble(6, om.getFinalPrice());
                pstOrder.setString(7, om.getComments());
                pstOrder.setInt(8, om.getIdEmployee());
                pstOrder.setInt(9, om.getPrevDays());
                pstOrder.setInt(10, om.getIdSupplierPerson());
                pstOrder.setInt(11, om.getIdStatus());

                pstOrder.execute();
                pstOrder.close();

                c.close_Connection();

                oir.addOrderItems(om);
                JOptionPane.showMessageDialog(null,"Pedido cadastrado! ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            }
        }else{
        JOptionPane.showMessageDialog(null, "Erro: Fornecedor não encontrado" );}
    }

    public boolean verifyOrderExistence(int idOrder) {
        boolean a = false;
        c.Connect();
        try {
            String sql = "Select * from orders where idOrder ='" + idOrder + "'";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();

            if (pst.getResultSet().next()) {
                a = true;
            } else {
                a = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
        }
        c.close_Connection();
        return a;

    }

    public void updateOrder(OrderModel order) {
        c.Connect();
        try {
            String sql = "update orders set comments = ? where idOrder ='" + order.getIdOrder() + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.setString(1, order.getComments());

            if (verifyOrderExistence(order.getIdOrder()) == true) {
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

    public List<OrderModel> getAll() {

        List<OrderModel> orders = new ArrayList<>();

        c.Connect();

        try {
            String sql = "Select * from orders order by prevDeliveryDate asc";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                OrderModel order = new OrderModel();

                order.setIdOrder(rs.getInt("idOrder"));
                order.setDescription(rs.getString("description"));
                order.setRegisterDate(rs.getDate("registerDate").toLocalDate());
                order.setPrevDeliveryDate(rs.getDate("prevDeliveryDate").toLocalDate());
                order.setInitialPrice(rs.getDouble("initialPrice"));
                order.setFinalPrice(rs.getDouble("finalPrice"));
                order.setComments(rs.getString("comments"));
                order.setIdEmployee(rs.getInt("idEmployee"));
                order.setPrevDays(rs.getInt("prevDays"));
                order.setIdSupplierPerson(rs.getInt("idSupplierEmployee"));
                order.setIdStatus(rs.getInt("idStatusOrder"));
                orders.add(order);
            }
            rs.close();
            pst.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
        } catch (NullPointerException npex) {
            JOptionPane.showMessageDialog(null, "Erro: " + npex.getMessage(), "Alerta", 2);
        }
        c.close_Connection();

        return orders;
    }

    public void finalizeOrder(OrderModel order) {
        c.Connect();
        try {
            String sql = "update orders set finalPrice = ?, idStatusOrder = ? where idOrder ='" + order.getIdOrder() + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            System.out.println(order.getIdOrder());
            pst.setDouble(1, order.getFinalPrice());
            pst.setInt(2, order.getIdStatus());

            if (verifyOrderExistence(order.getIdOrder()) == true) {
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

}
