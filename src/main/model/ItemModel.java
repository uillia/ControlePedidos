package main.model;

public class ItemModel extends OrderModel {

    private int idItem;
    private int idOrderItems;
    private String description;
    private double unityPrice;
    private int quantity;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdOrderItems() {
        return idOrderItems;
    }

    public void setIdOrderItems(int idOrderItems) {
        this.idOrderItems = idOrderItems;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }

}
