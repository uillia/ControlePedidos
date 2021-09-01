package main.view;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;
import main.controller.EmployeeController;
import main.model.EmployeeModel;
import util.ConfigManager;
import util.GraphElementsManipulator.Theme;

/**
 *
 * @author uillia
 */
public class SplashView extends javax.swing.JFrame {

    ConfigManager conf = new ConfigManager();
    String dir= "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Controle de Estoque";
    String file= "theme.properties";
    String theme = conf.getValue("theme", "light", dir, file);
    private static boolean users = false;

    public SplashView() {
        initComponents();
        attTema();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbProgress = new javax.swing.JProgressBar();
        lbPerc = new javax.swing.JLabel();
        lbLoading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pbProgress.setBackground(new java.awt.Color(255, 255, 255));
        pbProgress.setForeground(new java.awt.Color(102, 102, 102));
        pbProgress.setEnabled(false);
        pbProgress.setFocusable(false);
        pbProgress.setString("");
        pbProgress.setStringPainted(true);

        lbPerc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerc.setText("%");

        lbLoading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbLoading.setForeground(new java.awt.Color(153, 153, 153));
        lbLoading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoading.setText("Loading");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(lbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws UnsupportedLookAndFeelException {

        try {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    System.out.println(info);
                    if ("Windows".equals(info.getName())) {

                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;

                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(SplashView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(SplashView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(SplashView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(SplashView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            SplashView sv = new SplashView();
            sv.setVisible(true);

            Thread verifyUsers = new Thread(new Runnable() {
                @Override
                public void run() {
                    EmployeeController empc = new EmployeeController();
                    if (empc.getAllData().isEmpty()) {
                        users = false;
                    } else {
                        users = true;
                    }

                }
            });

            try {
                verifyUsers.run();
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(10);
                    
                    sv.pbProgress.setValue(i);
                    sv.lbPerc.setText(Integer.toString(i) + "%");
                    
                }
                verifyUsers.interrupt();
            } catch (Exception e) {
                Logger.getLogger(SplashView.class.getName()).log(Level.SEVERE, null, e);

            }
            sv.dispose();

            if (users) {
                LoginView lv = new LoginView();
                lv.setVisible(true);
            } else {
                FirstUserView fuv = new FirstUserView();
                fuv.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println("Erro ao contruir o frame, " + "erro: " + e.getMessage());
        }
    }

    public void attTema() {
        JLabel[] lb = {lbPerc};
        JLabel[] lbd = {lbLoading};
        Theme t = new Theme();
        t.refreshFrame(this, theme);
        t.refreshDesignLabels(lbd, theme);
        t.refreshLabels(lb, theme);
        if (theme.equals("Dark")) {
            pbProgress.setBackground(Color.BLACK);
            pbProgress.setForeground(Color.darkGray);

        } else {
            pbProgress.setBackground(Color.white);
            pbProgress.setForeground(Color.darkGray);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbLoading;
    private javax.swing.JLabel lbPerc;
    private javax.swing.JProgressBar pbProgress;
    // End of variables declaration//GEN-END:variables
}
