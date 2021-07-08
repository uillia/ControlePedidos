/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author uillia
 */
public class SupplierPersonModel {
    private int idSupplierPerson;
    private int idCompany;
    private String cpf; 
    private String name;
    private String role;
    private LocalDate registerDate;

    public int getIdSupplierPerson() {
        return idSupplierPerson;
    }

    public void setIdSupplierPerson(int idSupplierPerson) {
        this.idSupplierPerson = idSupplierPerson;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
    
    
}
