package main.controller;

import java.util.ArrayList;
import java.util.List;
import main.model.EmployeeModel;
import main.model.ItemModel;
import main.model.OrderModel;
import main.repository.OrderRepository;

public class OrderController {
    OrderRepository or =new OrderRepository();
    ItemController ic = new ItemController();

    public void registerOrder(OrderModel om) {
        
        or.addOrder(om);
    }

    public void editOrder(OrderModel order) {
        or.updateOrder(order);
        
    }

    public List<OrderModel> getAllData() {
        List<OrderModel> alldata = or.getAll(); 
    return alldata; //To change body of generated methods, choose Tools | Templates.
    }

    public void finalizeOrder(OrderModel order) {
        or.finalizeOrder(order);
    }

    public void cancelOrder(OrderModel orderEdit, ItemModel item) {
        ic.retireStorage(item);
    }

   

    
    
}
