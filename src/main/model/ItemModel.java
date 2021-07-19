
package main.model;

public class ItemModel {
    private int idItem;
    private int idFornecedor;
    private String description;
    private double unityPrice;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
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
