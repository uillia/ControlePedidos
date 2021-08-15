package main.controller;

import main.model.OrderModel;
import main.repository.OrderRepository;

public class OrderController {

    public void registerOrder(OrderModel om) {
        OrderRepository or =new OrderRepository();
        or.addOrder(om);
    }
    
}
