package main.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import main.model.EmployeeModel;
import main.model.OrderModel;

/**
 *
 * @author uillia
 */
public class OrderRepository {

    MySqlConnection c = new MySqlConnection();
    OrderItemsRepository oir = new OrderItemsRepository();

    public void addOrder(OrderModel om) {

        try {

            c.Connect();
            PreparedStatement pstOrder = c.con.prepareStatement("insert into orders "
                    + " (idOrder, description, registerDate, prevDeliveryDate, initialPrice, finalPrice, comments, idEmployee, prevDays,idSupplierEmployee) VALUES (?,?,?,?,?,?,?,?,?,?)");
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

            pstOrder.execute();
            pstOrder.close();

            c.close_Connection();

            oir.addOrderItems(om);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public void verifyOrderExistence(int idItem) {
    }

}
