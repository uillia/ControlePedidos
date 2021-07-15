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
public class SupplierCompanyModel extends HierarchicalTypeModel {

    private int idCompany;
    private String name;
    private String cnpj;
    private String mainActivity;
    private String hierarchicaltype;
    private String phone;
    private int Localnum;
    private String street;
    private String district;
    private String city;
    private String state;
    private String email;
    private String site;
    private LocalDate registerDate;

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
    
     public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
    public String getHierarchicaltype() {
        return hierarchicaltype;
    }

    public void setHierarchicaltype(String hierarchicaltype) {
        this.hierarchicaltype = hierarchicaltype;
    }

    public int getLocalnum() {
        return Localnum;
    }

    public void setLocalnum(int Localnum) {
        this.Localnum = Localnum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
