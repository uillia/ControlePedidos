package main.repository;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySqlConnection {

    public Connection con;

    public MySqlConnection() {
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Conectado");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado?serverTimezone=UTC", "root", "160600");
            System.out.println("Conexão Realizada");
            
            
        } catch (ClassNotFoundException exc) {
            System.out.println("Erro no driver " + exc.getMessage());
        } catch (SQLException exc) {
            System.out.println("Erro de conexao = " + exc.getMessage());
            JOptionPane.showMessageDialog(null, "O sistema não pode se conectar com o servidor");
        }

    }
     public  void close_Connection()  {
       try{
           con.close(); 
       } catch(SQLException exc) {
           System.out.println(exc.getMessage());
       }
   }
}