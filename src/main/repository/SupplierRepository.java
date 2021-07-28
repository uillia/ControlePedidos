/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.model.SupplierCompanyModel;
import main.model.SupplierPersonModel;

public class SupplierRepository {

    SupplierCompanyModel compInter = new SupplierCompanyModel();
    SupplierPersonModel personInter = new SupplierPersonModel();
    MySqlConnection c = new MySqlConnection();

    public void insertSupplierCompany(SupplierCompanyModel comp) {

        try {

            c.Connect();
            PreparedStatement pst = c.con.prepareStatement("insert into suppliercompany "
                    + " (idhierarchicalType,nameCompany, cnpj, phone,mainActivity, adress, district, city, state, email, site, regDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, comp.getIdHierarchicaltype());
            pst.setString(2, comp.getName());
            pst.setString(3, comp.getCnpj());
            pst.setString(4, comp.getPhone());
            pst.setString(5, comp.getMainActivity());
            pst.setString(6, comp.getAdress());
            pst.setString(7, comp.getDistrict());
            pst.setString(8, comp.getCity());
            pst.setString(9, comp.getState());
            pst.setString(10, comp.getEmail());
            if (comp.getSite() != null) {
                pst.setString(11, comp.getSite());
            } else {
                pst.setString(11, "Não Registrado");
            }
            pst.setString(12, comp.getRegisterDate().toString());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Empresa Cadatrada com sucesso ", "", 1);

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public SupplierCompanyModel getDataCompanySuppById(int id) {
        SupplierCompanyModel company = new SupplierCompanyModel();
        c.Connect();
        try {
            String sql = "Select sc.*, ht.description from suppliercompany sc "
                    + "INNER JOIN hierarchicaltype ht on sc.idhierarchicalType = ht.idhierarchicalType "
                    + " where idSupplierCompany='" + id + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();

            while (rs.next()) {

                company.setIdCompany(rs.getInt("sc.idSupplierCompany"));
                company.setName(rs.getString("sc.nameCompany"));
                company.setCnpj(rs.getString("sc.cnpj"));
                company.setPhone(rs.getString("sc.phone"));
                company.setMainActivity(rs.getString("mainActivity"));
                company.setHierarchicaltype(rs.getString("ht.description"));
                company.setAdress(rs.getString("adress"));
                company.setDistrict(rs.getString("district"));
                company.setCity(rs.getString("city"));
                company.setState(rs.getString("state"));
                company.setEmail(rs.getString("email"));
                company.setSite(rs.getString("site"));

            }
            pst.close();
            c.close_Connection();

            if (company.getIdCompany() == id) {
                return company;
            } else {
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
            return null;
        }
    }

    public SupplierCompanyModel getDataCompanySuppByCnpj(String cnpj) {
        SupplierCompanyModel retComp = new SupplierCompanyModel();
        int id = -1;
        if (cnpj.length() != 18) {
        } else {
            try {
                c.Connect();
                String sql = "Select idSupplierCompany from suppliercompany where cnpj='" + cnpj + "'";
                PreparedStatement pst;

                pst = c.con.prepareStatement(sql);

                pst.execute();
                ResultSet rs = pst.getResultSet();
                while (rs.next()) {
                    id = rs.getInt("idSupplierCompany");
                }
                pst.close();
                c.close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(SupplierRepository.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (getDataCompanySuppById(id).getCnpj().equals(cnpj)) {
                retComp = getDataCompanySuppById(id);
            } else {
                retComp = null;
                System.out.println("Cnpj invalidado");
            }
        }
        return retComp;
    }

    public void insertSupplierPerson() {
    }

    public SupplierPersonModel getDataPersonSupp() {
        return null;
    }

    public ArrayList<SupplierCompanyModel> getAllDataCompany() {
        ArrayList<SupplierCompanyModel> companyArrayList = new ArrayList<>();

        c.Connect();

        try {
            String sql = "Select sc.*, ht.description from suppliercompany sc "
                    + "INNER JOIN hierarchicaltype ht on sc.idhierarchicalType = ht.idhierarchicalType "
                    + " order by idSupplierCompany asc";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();
            while (rs.next()) {
                SupplierCompanyModel company = new SupplierCompanyModel();
                company.setIdCompany(rs.getInt("sc.idSupplierCompany"));
                company.setName(rs.getString("sc.nameCompany"));
                company.setCnpj(rs.getString("sc.cnpj"));
                company.setPhone(rs.getString("sc.phone"));
                company.setMainActivity(rs.getString("mainActivity"));
                company.setHierarchicaltype(rs.getString("ht.description"));
                company.setAdress(rs.getString("adress"));
                company.setDistrict(rs.getString("district"));
                company.setCity(rs.getString("city"));
                company.setState(rs.getString("state"));
                company.setEmail(rs.getString("email"));
                company.setSite(rs.getString("site"));
                companyArrayList.add(company);
            }
            pst.close();
            c.close_Connection();

        } catch (SQLException ex) {
            Logger.getLogger(SupplierRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return companyArrayList;
    }
}
