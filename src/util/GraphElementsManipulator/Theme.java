/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.GraphElementsManipulator;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

public class Theme {

    Color backG, foreG, frameColor, backGtxt;

    // backG represents BackGroudCollors and foreG represents the ForeGroundCollors
    // backGtxt represents the background collor of TextFields
    private void getElementsColor(String theme) { //in this function, i change the colors by sended theme

        if (theme.equals("dark")) {
            backG = new Color(50, 50, 50);
            foreG = new Color(255, 255, 255);
            frameColor = new Color(30, 30, 30);
            backGtxt = new Color(60, 60, 60);

        } else {

            Color interBlack = new Color(0, 0, 0);
            Color interWhite = new Color(255, 255, 255);
            backG = interWhite;
            foreG = interBlack;
            frameColor = new Color(240, 240, 240);
            backGtxt = new Color(242, 242, 242);
        }
    }

    public void refreshFrame(JFrame form, String theme) {
        getElementsColor(theme);
        form.getContentPane().setBackground(frameColor);
    }

    public void refreshLabels(JLabel[] lb, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < lb.length; i++) {
            lb[i].setForeground(foreG);
        }
    }

    public void refreshPanels(JPanel[] panels, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < panels.length; i++) {
            panels[i].setBackground(backG);
        }
    }

    public void refreshButtons(JButton[] btt, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < btt.length; i++) {
            btt[i].setForeground(foreG);
        }
    }

    public void refreshTextFields(JTextField[] txt, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < txt.length; i++) {
            txt[i].setBackground(backGtxt);
            txt[i].setForeground(foreG);
            txt[i].setSelectedTextColor(backG);
            txt[i].setSelectionColor(Color.lightGray);
        }
    }

    public void refreshFormatedTextfields(JFormattedTextField[] txtf, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < txtf.length; i++) {
            txtf[i].setBackground(backGtxt);
            txtf[i].setForeground(foreG);
            txtf[i].setSelectedTextColor(backG);
            txtf[i].setSelectionColor(Color.lightGray);
        }
    }

    public void refreshPasswordFields(JPasswordField[] txtp, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < txtp.length; i++) {
            txtp[i].setBackground(backGtxt);
            txtp[i].setForeground(foreG);
            txtp[i].setSelectedTextColor(backG);
            txtp[i].setSelectionColor(Color.lightGray);
        }
    }

    public void refreshTables(JTable[] tables, String theme) {
        getElementsColor(theme);

        for (int i = 0; i < tables.length; i++) {
            tables[i].setBackground(backG);
            tables[i].setForeground(foreG);
            tables[i].setSelectionBackground(Color.gray);
            tables[i].setSelectionForeground(foreG);

            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setBackground(backG);
            headerRenderer.setForeground(foreG);
            for (int x = 0; x < tables[i].getModel().getColumnCount(); x++) {
                tables[i].getColumnModel().getColumn(x).setHeaderRenderer(headerRenderer);

            }
        }
    }

    public void refreshComboBox(JComboBox[] combo, String theme) {
        for (int i = 0; i < combo.length; i++) {
            getElementsColor(theme);
            combo[i].setBackground(backG);
            combo[i].setForeground(foreG);
        }
    }

    public void refreshTextArea(JTextArea[] txtArea, String theme) {
        for (int i = 0; i < txtArea.length; i++) {
            getElementsColor(theme);
            txtArea[i].setBackground(backG);
            txtArea[i].setForeground(foreG);

        }
    }

    public void refreshRadioButton(JRadioButton[] rdbtn, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < rdbtn.length; i++) {
            rdbtn[i].setForeground(foreG);
        }
    }

    public void refreshDesignLabels(JLabel[] lb, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < lb.length; i++) {
            lb[i].setForeground(new Color(153, 153, 153));
            lb[i].setFont(new java.awt.Font("Cambria Math", 0, 24));
        }
    }

    public void refreshTextFieldUnEditable(JTextField[] txtUnEdit, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < txtUnEdit.length; i++) {
            txtUnEdit[i].setBackground(backG);
            txtUnEdit[i].setForeground(foreG);   
        }
    }

    public void refreshFormatedTextfieldsUnEditable(JFormattedTextField[] txtfUnEdit, String theme) {
        getElementsColor(theme);
        for (int i = 0; i < txtfUnEdit.length; i++) {
            txtfUnEdit[i].setBackground(backG);
            txtfUnEdit[i].setForeground(foreG);   
        }
    }

}
