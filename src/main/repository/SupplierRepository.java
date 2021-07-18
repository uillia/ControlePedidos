/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                    + " (idhierarchicalType,nameCompany, cnpj, phone,mainActivity, localNum, street, district, city, state, email, site, regDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, comp.getIdHierarchicaltype());
            pst.setString(2, comp.getName());
            pst.setString(3, comp.getCnpj());
            pst.setString(4, comp.getPhone());
            pst.setString(5, comp.getMainActivity());
            pst.setInt(6, comp.getLocalnum());
            pst.setString(7, comp.getStreet());
            pst.setString(8, comp.getDistrict());
            pst.setString(9, comp.getCity());
            pst.setString(10, comp.getState());
            pst.setString(11, comp.getEmail());
            if (comp.getSite() != null) {
                pst.setString(12, comp.getSite());
            } else {
                pst.setString(12, "Não Registrado");
            }
            pst.setString(13, comp.getRegisterDate().toString());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Empresa Cadatrada com sucesso ", "", 1);

            pst.close();
            c.close_Connection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
    }

    public SupplierCompanyModel getDataCompanySuppById(int id) {
        SupplierCompanyModel compInter = new SupplierCompanyModel();
        c.Connect();
        try {
            String sql = "Select sc.*, ht.description from suppliercompany sc "
                    + "INNER JOIN hierarchicaltype ht on sc.idhierarchicalType = ht.idhierarchicalType "
                    + " where idSupplierCompany='" + id + "'";
            PreparedStatement pst = c.con.prepareStatement(sql);
            pst.execute();
            ResultSet rs = pst.getResultSet();

            while (rs.next()) {

                compInter.setIdCompany(rs.getInt("sc.idSupplierCompany"));
                compInter.setName(rs.getString("sc.nameCompany"));
                compInter.setCnpj(rs.getString("sc.cnpj"));
                compInter.setPhone(rs.getString("sc.phone"));
                compInter.setMainActivity(rs.getString("mainActivity"));
                compInter.setHierarchicaltype(rs.getString("ht.description"));
                compInter.setLocalnum(rs.getInt("localNum"));
                compInter.setStreet(rs.getString("street"));
                compInter.setDistrict(rs.getString("district"));
                compInter.setCity(rs.getString("city"));
                compInter.setState(rs.getString("state"));
                compInter.setEmail(rs.getString("email"));
                compInter.setSite(rs.getString("site"));

            }
            pst.close();
            c.close_Connection();
            return compInter;
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
            } catch (SQLException ex) {
                Logger.getLogger(SupplierRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (id > 0) {
                retComp = getDataCompanySuppById(id);
            }

        }
        return retComp;
    }

    public void insertSupplierPerson() {
    }

//    public SupplierPersonModel getDataPersonSupp() {
//    }
}
