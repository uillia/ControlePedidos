package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.model.ItemModel;

public class ItemRepository {

    MySqlConnection c = new MySqlConnection();

    public void addItems(List<ItemModel> items) {

        for (int i = 0; i < items.size(); i++) {

            if (verifyItemExistence(items.get(i).getDescription()) == false) {
                c.Connect();
                try {
                    String slq = "Insert into items(idSupplierEmployee, description, price) VALUES(?,?,?)";
                    PreparedStatement pst;
                    pst = c.con.prepareStatement(slq);

                    pst.setInt(1, items.get(i).getIdSupplierPerson());
                    pst.setString(2, items.get(i).getDescription());
                    pst.setDouble(3, items.get(i).getUnityPrice());

                    pst.execute();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
                }

            }
        }

    }

    // you must use this method after uses addItem(), because this didn't make validation if the item exist
    //just send the id
    public int getItensIDByDescription(String description) {
        int id = 0;

        c.Connect();
        try {
            String sql = "Select * from items where description ='" + description + "'";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                id = rs.getInt("idItem");
                System.out.println("id do item"+id);
            }
            rs.close();
            pst.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
        }
        c.close_Connection();

        return id;
    }

    public List<ItemModel> getAllItems() {

        List<ItemModel> items = null;

        c.Connect();
        try {
            String sql = "Select * from items order by idItem asc";
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                ItemModel item = new ItemModel();
                item.setIdItem(rs.getInt("idItem"));
                item.setIdSupplierPerson(rs.getInt("idSupplierEmployee"));
                item.setDescription("description");
                item.setUnityPrice(rs.getDouble("price"));
                items.add(item);
            }
            rs.close();
            pst.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
        }
        c.close_Connection();

        return items;
    }

    ;

    public boolean verifyItemExistence(String description) {

        boolean a = false;
        c.Connect();
        try {
            String sql = "Select * from items where description ='" + description + "'";
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

    public void addItemsPlus(ItemModel im) {
       
            if (verifyItemExistence(im.getDescription()) == false) {
                c.Connect();
                try {
                    String slq = "Insert into items(idSupplierEmployee, description, price) VALUES(?,?,?)";
                    PreparedStatement pst;
                    pst = c.con.prepareStatement(slq);

                    pst.setInt(1, im.getIdSupplierPerson());

                    pst.setString(2, im.getDescription());
                    pst.setDouble(3, im.getUnityPrice());

                    pst.execute();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
                }

            }
    }
}
