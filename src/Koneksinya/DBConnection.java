/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksinya;

import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class DBConnection {

    public static Connection connection() {
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver:root;databaseName=DBUMKM;userName=root;password=null";
            conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Oops! Having some problem in connecting with MS SQL Server");
        }
        
        return null;
    }

}
