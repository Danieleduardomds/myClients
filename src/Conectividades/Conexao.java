package Conectividades;

import java.sql.*;

public class Conexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://containers-us-west-181.railway.app:7900/meusclientes";
        String user = "root";
        String password = "PaKNIAjg0FJ7Q0T4PN5u";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
