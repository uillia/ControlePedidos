package main.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OrderModel {

    private int IdOrder;
    private String description;
    private List<ItemModel> items;
    private LocalDate prevDeliveryDate;
    private int IdEmployee;
    private int IdSupplierCompany;
    private int IdSupplierPerson;
    private double initialPrice;
    private double finalPrice;
    private String comments;
    private int prevDays;
    private LocalDate registerDate;
    private int IdStatus;

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemModel> getItems() {
        return items;
    }

    public void setItems(List<ItemModel> itens) {
        this.items = itens;
    }

    public LocalDate getPrevDeliveryDate() {

        return prevDeliveryDate;
    }

    public void setPrevDeliveryDate(LocalDate prevDeliveryDate) {
        this.prevDeliveryDate = prevDeliveryDate;
    }

    public int getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(int IdEmployee) {
        this.IdEmployee = IdEmployee;
    }

    public int getIdSupplierCompany() {
        return IdSupplierCompany;
    }

    public void setIdSupplierCompany(int IdSupplierCompany) {
        this.IdSupplierCompany = IdSupplierCompany;
    }

    public int getIdSupplierPerson() {
        return IdSupplierPerson;
    }

    public void setIdSupplierPerson(int IdSupplierPerson) {
        this.IdSupplierPerson = IdSupplierPerson;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public int getPrevDays() {
        return prevDays;
    }

    public void setPrevDays(int prevDays) {
        this.prevDays = prevDays;
    }

    public int getIdStatus() {
        return IdStatus;
    }

    public void setIdStatus(int IdStatus) {
        this.IdStatus = IdStatus;
    }

}
