/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.GraphElementsManipulator;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author uillia
 */
public class TitleBar {

    public void configTitleBar(JPanel panelClose, JPanel panelIconfied, JPanel Titlebar, JButton btnClose, JButton btnIconfied, String theme) {

        Color a;
        if (theme.equals("dark")) {
            a = new Color(50, 50, 50);

        } else {
            a = new Color(255, 255, 255);
        }

        Titlebar.setBackground(a);
        panelClose.setBackground(a);
        panelIconfied.setBackground(a);

        btnClose.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                panelClose.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                panelClose.setBackground(a);
            }

        });
        btnIconfied.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                panelIconfied.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                panelIconfied.setBackground(a);
            }

        });
    }
}
