/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.controller;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.repository.SupplierRepository;
import main.model.SupplierCompanyModel;

/**
 *
 * @author uillia
 */
public class SupplierController {

    SupplierRepository suppRep = new SupplierRepository();

    public void registerCompany(SupplierCompanyModel suppCompReg) {

        if (suppCompReg.getCnpj().equals(suppRep.getDataCompanySuppByCnpj(suppCompReg.getCnpj()).getCnpj())) {

            JOptionPane.showMessageDialog(null, this, "Empresa ja cadastrada", 0);
        } else {
            suppCompReg.setRegisterDate(LocalDate.now());
            suppRep.insertSupplierCompany(suppCompReg);
        }
    }

    public void CadastrarFpessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void attTabela(DefaultTableModel tabFmodel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
