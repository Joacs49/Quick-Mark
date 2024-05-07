/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;

public class cConexion {

    private static Connection cn;

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "metal0914";
    private static final String url = "jdbc:mysql://localhost:3306/QUICKMARK";

    public Connection conectar() {
        try {
            Class.forName(driver);

            cn = DriverManager.getConnection(url, user, pass);

            if (cn != null) {
                return cn;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cn;
    }

    public void desconectar() {
        try {
            if (cn != null && !cn.isClosed()) {
                System.out.println("Conexion Finalizada");
                cn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
