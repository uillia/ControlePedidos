
package main.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.model.OrderModel;

public class OrderItemsRepository {
    MySqlConnection c = new MySqlConnection();
    
    public void addOrderItems(OrderModel om) {
        c.Connect();

        try {
            PreparedStatement pstItens = c.con.prepareStatement(
                    "insert into orderitems(idItem, quantity, idOrder, purchasePrice)VALUES(?,?,?,?)");
            ItemRepository ir = new ItemRepository();
//            ir.addItems(om.getItems());//add items if they aren't in the bd 
            for (int i = 0; i < om.getItems().size(); i++) {

                
                pstItens.setInt(1, ir.getItensIDByDescription(om.getItems().get(i).getDescription()));
                System.out.println(om.getItems().get(i).getDescription()+": "+ ir.getItensIDByDescription(om.getDescription()));
                pstItens.setInt(2, om.getItems().get(i).getQuantity());
                System.out.println("id order: "+om.getIdOrder());//
                pstItens.setInt(3, om.getIdOrder());
                pstItens.setDouble(4, om.getItems().get(i).getUnityPrice());
                pstItens.execute();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
        }

        c.close_Connection();
    }

}

