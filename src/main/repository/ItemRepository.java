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
                    String slq = "Insert into items(idSupplierEmployee, description, price, storage) VALUES(?,?,?,?)";
                    PreparedStatement pst;
                    pst = c.con.prepareStatement(slq);

                    pst.setInt(1, items.get(i).getIdSupplierPerson());

                    pst.setString(2, items.get(i).getDescription());
                    pst.setDouble(3, items.get(i).getUnityPrice());
                    pst.setInt(4, items.get(i).getQuantity());
                    pst.execute();
                    c.close_Connection();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
                }

            } else {
                
                ItemModel item = items.get(i);
                updateItemsBydescription(item);
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
                System.out.println("id do item" + id);
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

//    public void addItemsPlus(ItemModel im) {
//
//        if (verifyItemExistence(im.getDescription()) == false) {
//            c.Connect();
//            try {
//                String sql = "Insert into items(idSupplierEmployee, description, price) VALUES(?,?,?)";
//                PreparedStatement pst;
//                pst = c.con.prepareStatement(sql);
//
//                pst.setInt(1, im.getIdSupplierPerson());
//
//                pst.setString(2, im.getDescription());
//                pst.setDouble(3, im.getUnityPrice());
//
//                pst.execute();
//
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
//            }
//
//        }
//    }

    public int getStorage(String desc) {
        int total = 0;
        c.Connect();
        if (verifyItemExistence(desc) == true) {
            try {
                String sql = "Select storage where description ='" + desc + "'";
                PreparedStatement pst;
                pst = c.con.prepareStatement(sql);
                pst.execute();
                ResultSet rs = pst.getResultSet();
                while (rs.next()) {
                    rs.getInt(total);
                }

            } catch (SQLException ex) {
            }

        }
        return total;
    }

    public List<ItemModel> getItensByIdOrder(int idOrder) {
        
         List<ItemModel> items = new ArrayList<>();
        c.Connect();
        
        try {
            String sql = "Select it.description, oi.quantity, oi.purchasePrice, it.storage from orderitems oi join items it on oi.idItem = it.idItem where idOrder ='" + idOrder + "'";
            
            PreparedStatement pst;
            pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();
            
            while (rs.next()) {
                
                 
                ItemModel item = new ItemModel();
                item.setDescription(rs.getString("description"));
                item.setQuantity(rs.getInt("quantity"));
                item.setUnityPrice(rs.getDouble("purchasePrice"));
                
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

    public void updateItemsBydescription(ItemModel item) {
        c.Connect();
                try {
                    
                    String slq = "Update items set price = ?, storage = storage + ? where description ='" + item.getDescription() + "'";
                    PreparedStatement pst;
                    pst = c.con.prepareStatement(slq);

                    pst.setDouble(1, item.getUnityPrice());

                    pst.setInt(2, item.getQuantity());

                    pst.execute();
                    c.close_Connection();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
                }
    }

    public void updateItemsRetireStorage(ItemModel item) {
            c.Connect();
                try {
                    
                    String slq = "Update items set  storage = storage - ? where description ='" + item.getDescription() + "'";
                    PreparedStatement pst;
                    pst = c.con.prepareStatement(slq);

                    pst.setDouble(1, item.getQuantity());

                    pst.execute();
                    c.close_Connection();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Alerta", 2);
                }
    }
}
